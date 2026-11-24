package defpackage;
public final class bj2 {
    public static final bj2 a;
    public static final bj2[] b;
    bj2 EF0;

    static {
        Enum r0 = new Enum("NONE", 0);
        Enum r1 = new Enum("ALL_JSON_OBJECTS", 1);
        ?? r3 = new Enum("POLYMORPHIC", 2);
        a = r3;
        b = new bj2[]{r0, r1, r3};
    }

    public static bj2 valueOf(String str) {
        return (bj2) Enum.valueOf(bj2.class, str);
    }

    public static bj2[] values() {
        return (bj2[]) b.clone();
    }
}
