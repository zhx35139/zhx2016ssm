package controll;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mapper.UserMapper;


@Controller
@RequestMapping("/login")
public class UserLogin {
	@Resource
	private UserMapper userMapper;
	
	@RequestMapping("/init")
	public ModelAndView login(){
		ModelAndView mod = new ModelAndView();
		userMapper.select();
		mod.setViewName("/jsp/login");
		return mod;
	}
}
