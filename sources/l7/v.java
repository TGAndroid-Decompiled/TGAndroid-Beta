package l7;
public final class v {
    public static final v f14978a;
    public static final v[] f14979b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f14978a = r02;
        f14979b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f14979b.clone();
    }
}
