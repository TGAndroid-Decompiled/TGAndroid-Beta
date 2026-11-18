package c8;
public final class v {
    public static final v f5013a;
    public static final v[] f5014b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f5013a = r02;
        f5014b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f5014b.clone();
    }
}
