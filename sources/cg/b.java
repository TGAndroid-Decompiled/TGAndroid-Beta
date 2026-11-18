package cg;
public final class b {
    public static final b f5273a;
    public static final b f5274b;
    public static final b[] f5275c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f5273a = r02;
        ?? r12 = new Enum("TON", 1);
        f5274b = r12;
        f5275c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f5275c.clone();
    }
}
