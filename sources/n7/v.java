package n7;
public final class v {
    public static final v f14735a;
    public static final v[] f14736b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f14735a = r02;
        f14736b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f14736b.clone();
    }
}
