package c8;
public final class v {
    public static final v f5010a;
    public static final v[] f5011b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f5010a = r02;
        f5011b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f5011b.clone();
    }
}
