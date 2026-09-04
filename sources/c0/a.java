package c0;
public final class a {
    public static final a f4100c;
    public static final a d;
    public final boolean f4101a;
    public final Throwable f4102b;

    static {
        if (h.d) {
            d = null;
            f4100c = null;
            return;
        }
        d = new a(null, false);
        f4100c = new a(null, true);
    }

    public a(Throwable th2, boolean z10) {
        this.f4101a = z10;
        this.f4102b = th2;
    }
}
