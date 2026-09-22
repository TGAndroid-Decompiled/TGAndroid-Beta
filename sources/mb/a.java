package mb;

import n6.l;
public final class a extends Exception {
    public final int f14988a;

    public a(String str, int i10) {
        super(str);
        l.g(str, "Provided message must not be empty.");
        this.f14988a = i10;
    }

    public a(String str, Throwable th2) {
        super(str, th2);
        l.g(str, "Provided message must not be empty.");
        this.f14988a = 13;
    }
}
