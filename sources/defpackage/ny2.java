package defpackage;
public final class ny2 {
    public static final ny2 a;
    public static final ny2 b;
    public static final ny2[] c;

    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        Enum r1 = new Enum("LAZY", 1);
        ?? r3 = new Enum("ATOMIC", 2);
        b = r3;
        c = new ny2[]{r0, r1, r3, new Enum("UNDISPATCHED", 3)};
    }

    public static ny2 valueOf(String str) {
        return (ny2) Enum.valueOf(ny2.class, str);
    }

    public static ny2[] values() {
        return (ny2[]) c.clone();
    }
}
