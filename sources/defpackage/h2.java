package defpackage;
public final class h2 {
    public static final h2 c;
    public static final h2 d;
    public final boolean a;
    public final RuntimeException b;

    static {
        if (t2.d) {
            d = null;
            c = null;
            return;
        }
        d = new h2(false, null);
        c = new h2(true, null);
    }

    public h2(boolean z, RuntimeException runtimeException) {
        this.a = z;
        this.b = runtimeException;
    }
}
