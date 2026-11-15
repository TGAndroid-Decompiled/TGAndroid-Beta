package c8;
public final class v {
    public static final v f4727a;
    public static final v[] f4728b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f4727a = r02;
        f4728b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f4728b.clone();
    }
}
