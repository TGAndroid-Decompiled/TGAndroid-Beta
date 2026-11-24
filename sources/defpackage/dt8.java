package defpackage;
public final class dt8 {
    public static final dt8 a;
    public static final dt8[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new dt8[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static dt8 valueOf(String str) {
        return (dt8) Enum.valueOf(dt8.class, str);
    }

    public static dt8[] values() {
        return (dt8[]) b.clone();
    }
}
