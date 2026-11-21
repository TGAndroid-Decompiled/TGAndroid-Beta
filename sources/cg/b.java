package cg;
public final class b {
    public static final b f5302a;
    public static final b f5303b;
    public static final b[] f5304c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f5302a = r02;
        ?? r12 = new Enum("TON", 1);
        f5303b = r12;
        f5304c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f5304c.clone();
    }
}
