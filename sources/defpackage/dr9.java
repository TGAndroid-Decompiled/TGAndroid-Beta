package defpackage;
public final class dr9 {
    public static final dr9 a;
    public static final dr9 b;
    public static final dr9[] c;

    static {
        ?? r0 = new Enum("LINE", 0);
        a = r0;
        ?? r1 = new Enum("TAB", 1);
        b = r1;
        c = new dr9[]{r0, r1};
    }

    public static dr9 valueOf(String str) {
        return (dr9) Enum.valueOf(dr9.class, str);
    }

    public static dr9[] values() {
        return (dr9[]) c.clone();
    }
}
