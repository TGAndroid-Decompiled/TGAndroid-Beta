package i7;

public final class g0 {

    public static final g0 f10644a;

    public static final g0[] f10645b;

    static {
        g0 g0Var = new g0("DEFAULT", 0);
        f10644a = g0Var;
        f10645b = new g0[]{g0Var, new g0("SIGNED", 1), new g0("FIXED", 2)};
    }

    public static g0[] values() {
        return (g0[]) f10645b.clone();
    }
}
