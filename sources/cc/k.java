package cc;

import n6.l;
public class k extends Exception {
    public k(String str) {
        super(str);
        l.g(str, "Detail message must not be empty");
    }
}
