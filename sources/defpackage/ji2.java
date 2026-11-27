package defpackage;
public final class ji2 {
    public static final ji2 a;
    public static final ji2[] b;
    ji2 EF0;

    static {
        Enum r0 = new Enum("NONE", 0);
        Enum r1 = new Enum("ALL_JSON_OBJECTS", 1);
        ?? r3 = new Enum("POLYMORPHIC", 2);
        a = r3;
        b = new ji2[]{r0, r1, r3};
    }

    public static ji2 valueOf(String str) {
        return (ji2) Enum.valueOf(ji2.class, str);
    }

    public static ji2[] values() {
        return (ji2[]) b.clone();
    }
}
