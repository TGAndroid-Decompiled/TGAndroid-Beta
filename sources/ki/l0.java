package ki;
public final class l0 {
    public static final l0 f13784a;
    public static final l0 f13785b;
    public static final l0[] f13786c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f13784a = r02;
        ?? r12 = new Enum("BACK", 1);
        f13785b = r12;
        f13786c = new l0[]{r02, r12};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f13786c.clone();
    }
}
