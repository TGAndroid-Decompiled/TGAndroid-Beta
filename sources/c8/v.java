package c8;
public final class v {
    public static final v f5007a;
    public static final v[] f5008b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f5007a = r02;
        f5008b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f5008b.clone();
    }
}
