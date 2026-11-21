package c8;
public final class v {
    public static final v f5039a;
    public static final v[] f5040b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f5039a = r02;
        f5040b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f5040b.clone();
    }
}
