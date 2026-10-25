package a8;
public final class d0 {
    public static final d0 f398a;
    public static final d0[] f399b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f398a = r02;
        f399b = new d0[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d0[] values() {
        return (d0[]) f399b.clone();
    }
}
