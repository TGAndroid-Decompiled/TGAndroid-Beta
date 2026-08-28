package c3;
public final class c {
    public static final c f2283a;
    public static final c f2284b;
    public static final c f2285c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f2283a = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f2284b = r12;
        ?? r32 = new Enum("DEVICE_CHARGING", 2);
        f2285c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
