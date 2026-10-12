package bb;
public final class d {
    public static final d f2625a;
    public static final d f2626b;
    public static final d[] f2627c;

    static {
        ?? r02 = new Enum("CRASHLYTICS", 0);
        f2625a = r02;
        ?? r12 = new Enum("PERFORMANCE", 1);
        f2626b = r12;
        f2627c = new d[]{r02, r12, new Enum("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f2627c.clone();
    }
}
