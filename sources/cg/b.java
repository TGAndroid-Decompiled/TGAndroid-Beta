package cg;
public final class b {
    public static final b f5268a;
    public static final b f5269b;
    public static final b[] f5270c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f5268a = r02;
        ?? r12 = new Enum("TON", 1);
        f5269b = r12;
        f5270c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f5270c.clone();
    }
}
