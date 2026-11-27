package defpackage;
public final class wu9 {
    public static final wu9 a;
    public static final wu9 b;
    public static final wu9[] c;

    static {
        ?? r0 = new Enum("LINE", 0);
        a = r0;
        ?? r1 = new Enum("TAB", 1);
        b = r1;
        c = new wu9[]{r0, r1};
    }

    public static wu9 valueOf(String str) {
        return (wu9) Enum.valueOf(wu9.class, str);
    }

    public static wu9[] values() {
        return (wu9[]) c.clone();
    }
}
