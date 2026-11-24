package defpackage;
public final class aja {
    public static final aja a;
    public static final aja b;
    public static final aja[] c;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        ?? r1 = new Enum("RECORDING", 1);
        b = r1;
        c = new aja[]{r0, r1};
    }

    public static aja valueOf(String str) {
        return (aja) Enum.valueOf(aja.class, str);
    }

    public static aja[] values() {
        return (aja[]) c.clone();
    }
}
