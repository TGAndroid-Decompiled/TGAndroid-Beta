package mf;
public final class b {
    public static final b f13651a;
    public static final b f13652b;
    public static final b[] f13653c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f13651a = r02;
        ?? r12 = new Enum("TON", 1);
        f13652b = r12;
        f13653c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13653c.clone();
    }
}
