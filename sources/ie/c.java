package ie;
public final class c {
    public static final c f8056a;
    public static final c f8057b;
    public static final c f8058c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f8056a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f8057b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f8058c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
