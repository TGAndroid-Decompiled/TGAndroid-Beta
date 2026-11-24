package defpackage;
public final class ft9 {
    public static final ft9 a;
    public static final ft9 b;
    public static final ft9[] c;

    static {
        ?? r0 = new Enum("LINE", 0);
        a = r0;
        ?? r1 = new Enum("TAB", 1);
        b = r1;
        c = new ft9[]{r0, r1};
    }

    public static ft9 valueOf(String str) {
        return (ft9) Enum.valueOf(ft9.class, str);
    }

    public static ft9[] values() {
        return (ft9[]) c.clone();
    }
}
