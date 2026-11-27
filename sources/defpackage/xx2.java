package defpackage;
public final class xx2 {
    public static final xx2 a;
    public static final xx2 b;
    public static final xx2[] c;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        Enum r1 = new Enum("LAZY", 1);
        ?? r3 = new Enum("ATOMIC", 2);
        b = r3;
        c = new xx2[]{r0, r1, r3, new Enum("UNDISPATCHED", 3)};
    }

    public static xx2 valueOf(String str) {
        return (xx2) Enum.valueOf(xx2.class, str);
    }

    public static xx2[] values() {
        return (xx2[]) c.clone();
    }
}
