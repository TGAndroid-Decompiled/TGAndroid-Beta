package defpackage;
public final class mla {
    public static final mla a;
    public static final mla b;
    public static final mla[] c;

    static {
        ?? r0 = new Enum("GLASS", 0);
        a = r0;
        ?? r1 = new Enum("ACCENT", 1);
        b = r1;
        c = new mla[]{r0, r1};
    }

    public static mla valueOf(String str) {
        return (mla) Enum.valueOf(mla.class, str);
    }

    public static mla[] values() {
        return (mla[]) c.clone();
    }
}
