package cg;
public final class b {
    public static final b f5276a;
    public static final b f5277b;
    public static final b[] f5278c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f5276a = r02;
        ?? r12 = new Enum("TON", 1);
        f5277b = r12;
        f5278c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f5278c.clone();
    }
}
