package defpackage;
public final class y6d {
    public static final y6d a;
    public static final y6d[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new y6d[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static y6d[] values() {
        return (y6d[]) b.clone();
    }
}
