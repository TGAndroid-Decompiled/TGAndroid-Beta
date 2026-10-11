package mb;

import n6.m;
public final class a extends Exception {
    public final int f16312a;

    public a(String str, int i10) {
        super(str);
        m.g(str, "Provided message must not be empty.");
        this.f16312a = i10;
    }

    public a(String str, Throwable th2) {
        super(str, th2);
        m.g(str, "Provided message must not be empty.");
        this.f16312a = 13;
    }
}
