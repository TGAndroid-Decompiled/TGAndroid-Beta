package c0;
public final class a {
    public static final a f2052c;
    public static final a d;
    public final boolean f2053a;
    public final Throwable f2054b;

    static {
        if (h.d) {
            d = null;
            f2052c = null;
            return;
        }
        d = new a(null, false);
        f2052c = new a(null, true);
    }

    public a(Throwable th, boolean z10) {
        this.f2053a = z10;
        this.f2054b = th;
    }
}
