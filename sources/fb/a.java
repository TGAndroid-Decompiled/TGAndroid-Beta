package fb;

import n6.l;
public final class a extends Exception {
    public final int f6972a;

    public a(String str, int i10) {
        super(str);
        l.f(str, "Provided message must not be empty.");
        this.f6972a = i10;
    }

    public a(String str, Throwable th2) {
        super(str, th2);
        l.f(str, "Provided message must not be empty.");
        this.f6972a = 13;
    }
}
