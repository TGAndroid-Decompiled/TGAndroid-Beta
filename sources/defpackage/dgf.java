package defpackage;
public final class dgf {
    public static final dgf c;
    public static final dgf d;
    public final boolean a;
    public final RuntimeException b;

    static {
        if (lgf.d) {
            d = null;
            c = null;
            return;
        }
        d = new dgf(false, null);
        c = new dgf(true, null);
    }

    public dgf(boolean z, RuntimeException runtimeException) {
        this.a = z;
        this.b = runtimeException;
    }
}
