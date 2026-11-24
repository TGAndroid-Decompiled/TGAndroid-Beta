package defpackage;
public final class nh2 {
    public static final nh2 a;
    public static final nh2[] b;
    nh2 EF0;

    static {
        Enum r0 = new Enum("NONE", 0);
        Enum r1 = new Enum("ALL_JSON_OBJECTS", 1);
        ?? r3 = new Enum("POLYMORPHIC", 2);
        a = r3;
        b = new nh2[]{r0, r1, r3};
    }

    public static nh2 valueOf(String str) {
        return (nh2) Enum.valueOf(nh2.class, str);
    }

    public static nh2[] values() {
        return (nh2[]) b.clone();
    }
}
