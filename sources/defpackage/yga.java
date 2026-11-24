package defpackage;
public final class yga {
    public static final yga a;
    public static final yga b;
    public static final yga[] c;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        ?? r1 = new Enum("RECORDING", 1);
        b = r1;
        c = new yga[]{r0, r1};
    }

    public static yga valueOf(String str) {
        return (yga) Enum.valueOf(yga.class, str);
    }

    public static yga[] values() {
        return (yga[]) c.clone();
    }
}
