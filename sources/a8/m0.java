package a8;
public final class m0 {
    public static final m0 f532a;
    public static final m0[] f533b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f532a = r02;
        f533b = new m0[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static m0[] values() {
        return (m0[]) f533b.clone();
    }
}
