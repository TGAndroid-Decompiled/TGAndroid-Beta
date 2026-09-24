package ki;
public final class k0 {
    public static final k0 f13778a;
    public static final k0 f13779b;
    public static final k0[] f13780c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f13778a = r02;
        ?? r12 = new Enum("BACK", 1);
        f13779b = r12;
        f13780c = new k0[]{r02, r12};
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) f13780c.clone();
    }
}
