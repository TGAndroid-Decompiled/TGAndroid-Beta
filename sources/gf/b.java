package gf;
public final class b {
    public static final b f7749a;
    public static final b f7750b;
    public static final b[] f7751c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f7749a = r02;
        ?? r12 = new Enum("TON", 1);
        f7750b = r12;
        f7751c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f7751c.clone();
    }
}
