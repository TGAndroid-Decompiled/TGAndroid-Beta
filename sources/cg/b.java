package cg;
public final class b {
    public static final b f6160a;
    public static final b f6161b;
    public static final b[] f6162c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f6160a = r02;
        ?? r12 = new Enum("TON", 1);
        f6161b = r12;
        f6162c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f6162c.clone();
    }
}
