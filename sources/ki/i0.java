package ki;
public final class i0 {
    public static final i0 f13741a;
    public static final i0 f13742b;
    public static final i0[] f13743c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f13741a = r02;
        ?? r12 = new Enum("BACK", 1);
        f13742b = r12;
        f13743c = new i0[]{r02, r12};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f13743c.clone();
    }
}
