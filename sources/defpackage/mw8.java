package defpackage;
public final class mw8 {
    public static final mw8 a;
    public static final mw8[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new mw8[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static mw8 valueOf(String str) {
        return (mw8) Enum.valueOf(mw8.class, str);
    }

    public static mw8[] values() {
        return (mw8[]) b.clone();
    }
}
