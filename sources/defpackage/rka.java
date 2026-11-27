package defpackage;
public final class rka {
    public static final rka a;
    public static final rka b;
    public static final rka[] c;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        ?? r1 = new Enum("RECORDING", 1);
        b = r1;
        c = new rka[]{r0, r1};
    }

    public static rka valueOf(String str) {
        return (rka) Enum.valueOf(rka.class, str);
    }

    public static rka[] values() {
        return (rka[]) c.clone();
    }
}
