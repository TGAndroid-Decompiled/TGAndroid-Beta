package defpackage;
public final class pi5 {
    public static final pi5 a;
    public static final pi5 b;
    public static final pi5[] c;

    static {
        ?? r0 = new Enum("BACK", 0);
        a = r0;
        ?? r1 = new Enum("MENU", 1);
        b = r1;
        c = new pi5[]{r0, r1};
    }

    public static pi5 valueOf(String str) {
        return (pi5) Enum.valueOf(pi5.class, str);
    }

    public static pi5[] values() {
        return (pi5[]) c.clone();
    }
}
