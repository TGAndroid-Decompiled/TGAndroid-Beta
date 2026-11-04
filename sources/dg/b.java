package dg;
public final class b {
    public static final b f8925a;
    public static final b f8926b;
    public static final b[] f8927c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f8925a = r02;
        ?? r12 = new Enum("TON", 1);
        f8926b = r12;
        f8927c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f8927c.clone();
    }
}
