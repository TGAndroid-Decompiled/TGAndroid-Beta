package e3;
public final class c {
    public static final c f5803a;
    public static final c f5804b;
    public static final c f5805c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f5803a = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f5804b = r12;
        ?? r32 = new Enum("DEVICE_CHARGING", 2);
        f5805c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
