package e3;
public final class c {
    public static final c f5083a;
    public static final c f5084b;
    public static final c f5085c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f5083a = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f5084b = r12;
        ?? r32 = new Enum("DEVICE_CHARGING", 2);
        f5085c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
