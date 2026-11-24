package defpackage;
public final class ns9 {
    public static final ns9 a;
    public static final ns9 b;
    public static final ns9 c;
    public static final ns9[] d;

    static {
        ?? r0 = new Enum("NETWORK_UNMETERED", 0);
        a = r0;
        ?? r1 = new Enum("DEVICE_IDLE", 1);
        b = r1;
        ?? r3 = new Enum("DEVICE_CHARGING", 2);
        c = r3;
        d = new ns9[]{r0, r1, r3};
    }

    public static ns9 valueOf(String str) {
        return (ns9) Enum.valueOf(ns9.class, str);
    }

    public static ns9[] values() {
        return (ns9[]) d.clone();
    }
}
