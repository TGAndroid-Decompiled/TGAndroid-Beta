package ob;

import o6.l;
public final class a extends Exception {
    public final int f19276a;

    public a(String str, int i10) {
        super(str);
        l.g(str, "Provided message must not be empty.");
        this.f19276a = i10;
    }

    public a(String str, Throwable th2) {
        super(str, th2);
        l.g(str, "Provided message must not be empty.");
        this.f19276a = 13;
    }
}
