package defpackage;
public final class eu9 {
    public static final eu9 a;
    public static final eu9 b;
    public static final eu9 c;
    public static final eu9[] d;

    static {
        ?? r0 = new Enum("NETWORK_UNMETERED", 0);
        a = r0;
        ?? r1 = new Enum("DEVICE_IDLE", 1);
        b = r1;
        ?? r3 = new Enum("DEVICE_CHARGING", 2);
        c = r3;
        d = new eu9[]{r0, r1, r3};
    }

    public static eu9 valueOf(String str) {
        return (eu9) Enum.valueOf(eu9.class, str);
    }

    public static eu9[] values() {
        return (eu9[]) d.clone();
    }
}
