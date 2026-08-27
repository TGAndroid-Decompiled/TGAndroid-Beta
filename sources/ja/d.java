package ja;

public final class d {

    public static final d f12876a;

    public static final d f12877b;

    public static final d[] f12878c;

    static {
        d dVar = new d("CRASHLYTICS", 0);
        f12876a = dVar;
        d dVar2 = new d("PERFORMANCE", 1);
        f12877b = dVar2;
        f12878c = new d[]{dVar, dVar2, new d("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f12878c.clone();
    }
}
