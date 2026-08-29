package j7;
public final class g0 {
    public static final g0 f11012a;
    public static final g0[] f11013b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f11012a = r02;
        f11013b = new g0[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g0[] values() {
        return (g0[]) f11013b.clone();
    }
}
