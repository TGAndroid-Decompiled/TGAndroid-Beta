package j7;
public final class v {
    public static final v f14119a;
    public static final v[] f14120b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f14119a = r02;
        f14120b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f14120b.clone();
    }
}
