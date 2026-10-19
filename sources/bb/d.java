package bb;
public final class d {
    public static final d f4238a;
    public static final d f4239b;
    public static final d[] f4240c;

    static {
        ?? r02 = new Enum("CRASHLYTICS", 0);
        f4238a = r02;
        ?? r12 = new Enum("PERFORMANCE", 1);
        f4239b = r12;
        f4240c = new d[]{r02, r12, new Enum("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f4240c.clone();
    }
}
