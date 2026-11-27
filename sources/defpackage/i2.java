package defpackage;
public final class i2 {
    public static final i2 c;
    public static final i2 d;
    public final boolean a;
    public final RuntimeException b;

    static {
        if (u2.d) {
            d = null;
            c = null;
            return;
        }
        d = new i2(false, null);
        c = new i2(true, null);
    }

    public i2(boolean z, RuntimeException runtimeException) {
        this.a = z;
        this.b = runtimeException;
    }
}
