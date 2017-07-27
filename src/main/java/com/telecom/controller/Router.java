package com.telecom.controller;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Created by chenhui on 17/5/17.
 */
@Controller
public class Router {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }
}

