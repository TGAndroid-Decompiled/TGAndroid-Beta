package lb;

import q6.m;
public final class a extends Exception {
    public final int f19704a;

    public a(String str, int i7) {
        super(str);
        m.g(str, "Provided message must not be empty.");
        this.f19704a = i7;
    }

    public a(String str, Throwable th2) {
        super(str, th2);
        m.g(str, "Provided message must not be empty.");
        this.f19704a = 13;
    }
}
