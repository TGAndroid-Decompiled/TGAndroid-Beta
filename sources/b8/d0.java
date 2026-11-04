package b8;
public final class d0 {
    public static final d0 f2532a;
    public static final d0[] f2533b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f2532a = r02;
        f2533b = new d0[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d0[] values() {
        return (d0[]) f2533b.clone();
    }
}
