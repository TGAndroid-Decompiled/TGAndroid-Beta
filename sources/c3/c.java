package c3;

public final class c {

    public static final c f2421a;

    public static final c f2422b;

    public static final c f2423c;
    public static final c[] d;

    static {
        c cVar = new c("NETWORK_UNMETERED", 0);
        f2421a = cVar;
        c cVar2 = new c("DEVICE_IDLE", 1);
        f2422b = cVar2;
        c cVar3 = new c("DEVICE_CHARGING", 2);
        f2423c = cVar3;
        d = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
