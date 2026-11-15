package cg;
public final class b {
    public static final b f4990a;
    public static final b f4991b;
    public static final b[] f4992c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f4990a = r02;
        ?? r12 = new Enum("TON", 1);
        f4991b = r12;
        f4992c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4992c.clone();
    }
}
