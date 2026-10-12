package li;
public final class n0 {
    public static final n0 f14909a;
    public static final n0 f14910b;
    public static final n0[] f14911c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f14909a = r02;
        ?? r12 = new Enum("BACK", 1);
        f14910b = r12;
        f14911c = new n0[]{r02, r12};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f14911c.clone();
    }
}
