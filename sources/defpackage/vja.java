package defpackage;
public final class vja {
    public static final vja a;
    public static final vja b;
    public static final vja[] c;

    static {
        ?? r0 = new Enum("GENERAL", 0);
        a = r0;
        ?? r1 = new Enum("FALLBACK", 1);
        b = r1;
        c = new vja[]{r0, r1};
    }

    public static vja valueOf(String str) {
        return (vja) Enum.valueOf(vja.class, str);
    }

    public static vja[] values() {
        return (vja[]) c.clone();
    }
}
