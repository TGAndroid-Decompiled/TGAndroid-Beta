package bb;
public final class d {
    public static final d f4241a;
    public static final d f4242b;
    public static final d[] f4243c;

    static {
        ?? r02 = new Enum("CRASHLYTICS", 0);
        f4241a = r02;
        ?? r12 = new Enum("PERFORMANCE", 1);
        f4242b = r12;
        f4243c = new d[]{r02, r12, new Enum("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f4243c.clone();
    }
}
