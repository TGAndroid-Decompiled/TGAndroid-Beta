package defpackage;
public final class leb {
    public static final leb a;
    public static final leb b;
    public static final leb c;
    public static final leb[] d;

    static {
        ?? r0 = new Enum("LEFT", 0);
        a = r0;
        ?? r1 = new Enum("CENTER", 1);
        b = r1;
        ?? r3 = new Enum("RIGHT", 2);
        c = r3;
        d = new leb[]{r0, r1, r3};
    }

    public static leb valueOf(String str) {
        return (leb) Enum.valueOf(leb.class, str);
    }

    public static leb[] values() {
        return (leb[]) d.clone();
    }
}
