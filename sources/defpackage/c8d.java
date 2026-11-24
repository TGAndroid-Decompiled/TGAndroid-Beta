package defpackage;
public final class c8d {
    public static final c8d a;
    public static final c8d[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new c8d[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c8d[] values() {
        return (c8d[]) b.clone();
    }
}
