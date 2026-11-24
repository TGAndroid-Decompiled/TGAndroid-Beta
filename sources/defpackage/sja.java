package defpackage;
public final class sja {
    public static final sja a;
    public static final sja b;
    public static final sja[] c;

    static {
        ?? r0 = new Enum("ICON", 0);
        a = r0;
        ?? r1 = new Enum("TEXT", 1);
        b = r1;
        c = new sja[]{r0, r1};
    }

    public static sja valueOf(String str) {
        return (sja) Enum.valueOf(sja.class, str);
    }

    public static sja[] values() {
        return (sja[]) c.clone();
    }
}
