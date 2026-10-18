package j9;
public final class a {
    public static final a f14323c;
    public static final a d;
    public final boolean f14324a;
    public final Throwable f14325b;

    static {
        if (o.d) {
            d = null;
            f14323c = null;
            return;
        }
        d = new a(null, false);
        f14323c = new a(null, true);
    }

    public a(Throwable th2, boolean z10) {
        this.f14324a = z10;
        this.f14325b = th2;
    }
}
