package bb;
public final class d {
    public static final d f4240a;
    public static final d f4241b;
    public static final d[] f4242c;

    static {
        ?? r02 = new Enum("CRASHLYTICS", 0);
        f4240a = r02;
        ?? r12 = new Enum("PERFORMANCE", 1);
        f4241b = r12;
        f4242c = new d[]{r02, r12, new Enum("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f4242c.clone();
    }
}
