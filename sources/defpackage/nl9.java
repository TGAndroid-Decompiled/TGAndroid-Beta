package defpackage;
public final class nl9 {
    public static final nl9 a;
    public static final nl9 b;
    public static final nl9[] c;

    static {
        ?? r0 = new Enum("FRONT", 0);
        a = r0;
        ?? r1 = new Enum("BACK", 1);
        b = r1;
        c = new nl9[]{r0, r1};
    }

    public static nl9 valueOf(String str) {
        return (nl9) Enum.valueOf(nl9.class, str);
    }

    public static nl9[] values() {
        return (nl9[]) c.clone();
    }
}
