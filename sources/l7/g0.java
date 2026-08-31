package l7;
public final class g0 {
    public static final g0 f11853a;
    public static final g0[] f11854b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f11853a = r02;
        f11854b = new g0[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g0[] values() {
        return (g0[]) f11854b.clone();
    }
}
