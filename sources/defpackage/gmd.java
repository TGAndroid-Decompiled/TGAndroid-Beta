package defpackage;
public final class gmd {
    public static final gmd a;
    public static final gmd[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new gmd[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static gmd[] values() {
        return (gmd[]) b.clone();
    }
}
