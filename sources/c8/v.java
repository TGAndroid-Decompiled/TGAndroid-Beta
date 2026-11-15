package c8;
public final class v {
    public static final v f4724a;
    public static final v[] f4725b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f4724a = r02;
        f4725b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f4725b.clone();
    }
}
