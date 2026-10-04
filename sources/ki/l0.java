package ki;
public final class l0 {
    public static final l0 f14983a;
    public static final l0 f14984b;
    public static final l0[] f14985c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f14983a = r02;
        ?? r12 = new Enum("BACK", 1);
        f14984b = r12;
        f14985c = new l0[]{r02, r12};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f14985c.clone();
    }
}
