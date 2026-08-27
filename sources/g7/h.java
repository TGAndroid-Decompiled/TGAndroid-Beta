package g7;

public final class h {

    public static final h f6491a;

    public static final h[] f6492b;

    static {
        h hVar = new h("DEFAULT", 0);
        f6491a = hVar;
        f6492b = new h[]{hVar, new h("SIGNED", 1), new h("FIXED", 2)};
    }

    public static h[] values() {
        return (h[]) f6492b.clone();
    }
}
