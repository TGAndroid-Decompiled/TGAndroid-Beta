package fb;

import n6.l;
public final class a extends Exception {
    public final int f6971a;

    public a(String str, int i10) {
        super(str);
        l.f(str, "Provided message must not be empty.");
        this.f6971a = i10;
    }

    public a(String str, Throwable th2) {
        super(str, th2);
        l.f(str, "Provided message must not be empty.");
        this.f6971a = 13;
    }
}
