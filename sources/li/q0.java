package li;
public final class q0 {
    public static final q0 f12229a;
    public static final q0 f12230b;
    public static final q0[] f12231c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f12229a = r02;
        ?? r12 = new Enum("BACK", 1);
        f12230b = r12;
        f12231c = new q0[]{r02, r12};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f12231c.clone();
    }
}
