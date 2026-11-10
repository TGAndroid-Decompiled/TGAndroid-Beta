package c8;
public final class v {
    public static final v f5903a;
    public static final v[] f5904b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f5903a = r02;
        f5904b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f5904b.clone();
    }
}
