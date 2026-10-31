package cb;
public final class d {
    public static final d f4097a;
    public static final d f4098b;
    public static final d[] f4099c;

    static {
        ?? r02 = new Enum("CRASHLYTICS", 0);
        f4097a = r02;
        ?? r12 = new Enum("PERFORMANCE", 1);
        f4098b = r12;
        f4099c = new d[]{r02, r12, new Enum("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f4099c.clone();
    }
}
