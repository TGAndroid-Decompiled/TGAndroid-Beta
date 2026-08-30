package n7;
public final class v {
    public static final v f14750a;
    public static final v[] f14751b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f14750a = r02;
        f14751b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f14751b.clone();
    }
}
