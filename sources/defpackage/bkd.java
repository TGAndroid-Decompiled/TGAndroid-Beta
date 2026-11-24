package defpackage;
public final class bkd {
    public static final bkd a;
    public static final bkd[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new bkd[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static bkd[] values() {
        return (bkd[]) b.clone();
    }
}
