package defpackage;
public final class cga {
    public static final cga a;
    public static final cga b;
    public static final cga[] c;

    static {
        ?? r0 = new Enum("GENERAL", 0);
        a = r0;
        ?? r1 = new Enum("FALLBACK", 1);
        b = r1;
        c = new cga[]{r0, r1};
    }

    public static cga valueOf(String str) {
        return (cga) Enum.valueOf(cga.class, str);
    }

    public static cga[] values() {
        return (cga[]) c.clone();
    }
}
