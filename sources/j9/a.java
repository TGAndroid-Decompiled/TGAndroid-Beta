package j9;
public final class a {
    public static final a f14316c;
    public static final a d;
    public final boolean f14317a;
    public final Throwable f14318b;

    static {
        if (o.d) {
            d = null;
            f14316c = null;
            return;
        }
        d = new a(null, false);
        f14316c = new a(null, true);
    }

    public a(Throwable th2, boolean z10) {
        this.f14317a = z10;
        this.f14318b = th2;
    }
}
