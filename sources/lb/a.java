package lb;

import q6.m;
public final class a extends Exception {
    public final int f18207a;

    public a(String str, int i7) {
        super(str);
        m.f(str, "Provided message must not be empty.");
        this.f18207a = i7;
    }

    public a(String str, Throwable th2) {
        super(str, th2);
        m.f(str, "Provided message must not be empty.");
        this.f18207a = 13;
    }
}
