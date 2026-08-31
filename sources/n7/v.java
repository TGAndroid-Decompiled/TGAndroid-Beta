package n7;
public final class v {
    public static final v f15750a;
    public static final v[] f15751b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f15750a = r02;
        f15751b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f15751b.clone();
    }
}
