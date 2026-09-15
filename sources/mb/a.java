package mb;

import n6.l;
public final class a extends Exception {
    public final int f14752a;

    public a(String str, int i10) {
        super(str);
        l.g(str, "Provided message must not be empty.");
        this.f14752a = i10;
    }

    public a(String str, Throwable th2) {
        super(str, th2);
        l.g(str, "Provided message must not be empty.");
        this.f14752a = 13;
    }
}
