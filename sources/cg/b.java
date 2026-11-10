package cg;
public final class b {
    public static final b f6165a;
    public static final b f6166b;
    public static final b[] f6167c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f6165a = r02;
        ?? r12 = new Enum("TON", 1);
        f6166b = r12;
        f6167c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f6167c.clone();
    }
}
