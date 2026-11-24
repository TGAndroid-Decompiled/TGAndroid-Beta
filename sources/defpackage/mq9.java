package defpackage;
public final class mq9 {
    public static final mq9 a;
    public static final mq9 b;
    public static final mq9 c;
    public static final mq9[] d;

    static {
        ?? r0 = new Enum("NETWORK_UNMETERED", 0);
        a = r0;
        ?? r1 = new Enum("DEVICE_IDLE", 1);
        b = r1;
        ?? r3 = new Enum("DEVICE_CHARGING", 2);
        c = r3;
        d = new mq9[]{r0, r1, r3};
    }

    public static mq9 valueOf(String str) {
        return (mq9) Enum.valueOf(mq9.class, str);
    }

    public static mq9[] values() {
        return (mq9[]) d.clone();
    }
}
