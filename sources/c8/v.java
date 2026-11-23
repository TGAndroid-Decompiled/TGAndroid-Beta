package c8;
public final class v {
    public static final v f5042a;
    public static final v[] f5043b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f5042a = r02;
        f5043b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f5043b.clone();
    }
}
