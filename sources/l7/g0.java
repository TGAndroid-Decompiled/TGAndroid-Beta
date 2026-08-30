package l7;
public final class g0 {
    public static final g0 f11468a;
    public static final g0[] f11469b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f11468a = r02;
        f11469b = new g0[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g0[] values() {
        return (g0[]) f11469b.clone();
    }
}
