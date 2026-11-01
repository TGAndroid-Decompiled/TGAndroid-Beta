package li;
public final class q0 {
    public static final q0 f12230a;
    public static final q0 f12231b;
    public static final q0[] f12232c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f12230a = r02;
        ?? r12 = new Enum("BACK", 1);
        f12231b = r12;
        f12232c = new q0[]{r02, r12};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f12232c.clone();
    }
}
