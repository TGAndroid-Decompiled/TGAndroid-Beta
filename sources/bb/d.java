package bb;
public final class d {
    public static final d f2629a;
    public static final d f2630b;
    public static final d[] f2631c;

    static {
        ?? r02 = new Enum("CRASHLYTICS", 0);
        f2629a = r02;
        ?? r12 = new Enum("PERFORMANCE", 1);
        f2630b = r12;
        f2631c = new d[]{r02, r12, new Enum("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f2631c.clone();
    }
}
