package defpackage;
public final class a9d {
    public static final a9d a;
    public static final a9d[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new a9d[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static a9d[] values() {
        return (a9d[]) b.clone();
    }
}
