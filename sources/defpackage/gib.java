package defpackage;
public final class gib {
    public static final gib a;
    public static final gib b;
    public static final gib c;
    public static final gib[] d;

    static {
        ?? r0 = new Enum("LEFT", 0);
        a = r0;
        ?? r1 = new Enum("CENTER", 1);
        b = r1;
        ?? r3 = new Enum("RIGHT", 2);
        c = r3;
        d = new gib[]{r0, r1, r3};
    }

    public static gib valueOf(String str) {
        return (gib) Enum.valueOf(gib.class, str);
    }

    public static gib[] values() {
        return (gib[]) d.clone();
    }
}
