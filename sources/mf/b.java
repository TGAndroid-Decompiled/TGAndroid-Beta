package mf;
public final class b {
    public static final b f13653a;
    public static final b f13654b;
    public static final b[] f13655c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f13653a = r02;
        ?? r12 = new Enum("TON", 1);
        f13654b = r12;
        f13655c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13655c.clone();
    }
}
