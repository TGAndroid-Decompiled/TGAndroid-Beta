package defpackage;
public final class dx2 {
    public static final dx2 a;
    public static final dx2 b;
    public static final dx2[] c;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        Enum r1 = new Enum("LAZY", 1);
        ?? r3 = new Enum("ATOMIC", 2);
        b = r3;
        c = new dx2[]{r0, r1, r3, new Enum("UNDISPATCHED", 3)};
    }

    public static dx2 valueOf(String str) {
        return (dx2) Enum.valueOf(dx2.class, str);
    }

    public static dx2[] values() {
        return (dx2[]) c.clone();
    }
}
