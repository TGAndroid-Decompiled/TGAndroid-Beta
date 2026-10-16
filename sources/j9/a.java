package j9;
public final class a {
    public static final a f12909c;
    public static final a d;
    public final boolean f12910a;
    public final Throwable f12911b;

    static {
        if (o.d) {
            d = null;
            f12909c = null;
            return;
        }
        d = new a(null, false);
        f12909c = new a(null, true);
    }

    public a(Throwable th2, boolean z10) {
        this.f12910a = z10;
        this.f12911b = th2;
    }
}
