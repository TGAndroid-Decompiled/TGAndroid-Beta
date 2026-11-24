package defpackage;
public final class tja {
    public static final tja a;
    public static final tja b;
    public static final tja[] c;

    static {
        ?? r0 = new Enum("GLASS", 0);
        a = r0;
        ?? r1 = new Enum("ACCENT", 1);
        b = r1;
        c = new tja[]{r0, r1};
    }

    public static tja valueOf(String str) {
        return (tja) Enum.valueOf(tja.class, str);
    }

    public static tja[] values() {
        return (tja[]) c.clone();
    }
}
