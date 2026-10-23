package bb;
public final class d {
    public static final d f4245a;
    public static final d f4246b;
    public static final d[] f4247c;

    static {
        ?? r02 = new Enum("CRASHLYTICS", 0);
        f4245a = r02;
        ?? r12 = new Enum("PERFORMANCE", 1);
        f4246b = r12;
        f4247c = new d[]{r02, r12, new Enum("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f4247c.clone();
    }
}
