package defpackage;
public final class ekd {
    public static final ekd a;
    public static final ekd[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new ekd[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static ekd[] values() {
        return (ekd[]) b.clone();
    }
}
