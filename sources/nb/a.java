package nb;

import n6.l;
public final class a extends Exception {
    public final int f16243a;

    public a(String str, int i10) {
        super(str);
        l.g(str, "Provided message must not be empty.");
        this.f16243a = i10;
    }

    public a(String str, Throwable th2) {
        super(str, th2);
        l.g(str, "Provided message must not be empty.");
        this.f16243a = 13;
    }
}
