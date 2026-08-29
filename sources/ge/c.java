package ge;
public final class c {
    public static final c f7270a;
    public static final c f7271b;
    public static final c f7272c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f7270a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f7271b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f7272c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
