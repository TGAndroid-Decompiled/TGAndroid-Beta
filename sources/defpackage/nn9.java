package defpackage;
public final class nn9 {
    public static final nn9 a;
    public static final nn9 b;
    public static final nn9[] c;

    static {
        ?? r0 = new Enum("FRONT", 0);
        a = r0;
        ?? r1 = new Enum("BACK", 1);
        b = r1;
        c = new nn9[]{r0, r1};
    }

    public static nn9 valueOf(String str) {
        return (nn9) Enum.valueOf(nn9.class, str);
    }

    public static nn9[] values() {
        return (nn9[]) c.clone();
    }
}
