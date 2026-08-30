package ie;
public final class c {
    public static final c f7484a;
    public static final c f7485b;
    public static final c f7486c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f7484a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f7485b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f7486c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
