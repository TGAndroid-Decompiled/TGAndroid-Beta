package n7;
public final class v {
    public static final v f15752a;
    public static final v[] f15753b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f15752a = r02;
        f15753b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f15753b.clone();
    }
}
