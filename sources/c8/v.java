package c8;
public final class v {
    public static final v f5900a;
    public static final v[] f5901b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f5900a = r02;
        f5901b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f5901b.clone();
    }
}
