package bg;
public final class b {
    public static final b f3980a;
    public static final b f3981b;
    public static final b[] f3982c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f3980a = r02;
        ?? r12 = new Enum("TON", 1);
        f3981b = r12;
        f3982c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3982c.clone();
    }
}
