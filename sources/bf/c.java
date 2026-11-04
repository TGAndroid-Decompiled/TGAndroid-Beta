package bf;
public final class c {
    public static final c f3291a;
    public static final c f3292b;
    public static final c f3293c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f3291a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f3292b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f3293c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
