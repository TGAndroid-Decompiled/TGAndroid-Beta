package c8;
public final class v {
    public static final v f5898a;
    public static final v[] f5899b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f5898a = r02;
        f5899b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f5899b.clone();
    }
}
