package cc;

import n6.m;
public class k extends Exception {
    public k(String str) {
        super(str);
        m.g(str, "Detail message must not be empty");
    }
}
