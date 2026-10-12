package li;
public final class o0 {
    public static final o0 f14934a;
    public static final o0 f14935b;
    public static final o0 f14936c;
    public static final o0[] d;

    static {
        ?? r02 = new Enum("HIGH", 0);
        f14934a = r02;
        ?? r12 = new Enum("MEDIUM", 1);
        f14935b = r12;
        ?? r32 = new Enum("LOW", 2);
        f14936c = r32;
        d = new o0[]{r02, r12, r32};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) d.clone();
    }
}
