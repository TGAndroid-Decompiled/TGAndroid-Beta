package defpackage;
public final class nbf {
    public static final nbf c;
    public static final nbf d;
    public final boolean a;
    public final RuntimeException b;

    static {
        if (vbf.d) {
            d = null;
            c = null;
            return;
        }
        d = new nbf(false, null);
        c = new nbf(true, null);
    }

    public nbf(boolean z, RuntimeException runtimeException) {
        this.a = z;
        this.b = runtimeException;
    }
}
