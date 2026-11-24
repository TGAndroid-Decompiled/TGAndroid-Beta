package defpackage;
public final class ev8 {
    public static final ev8 a;
    public static final ev8[] b;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new ev8[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static ev8 valueOf(String str) {
        return (ev8) Enum.valueOf(ev8.class, str);
    }

    public static ev8[] values() {
        return (ev8[]) b.clone();
    }
}
