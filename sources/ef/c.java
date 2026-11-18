package ef;
public final class c {
    public static final c f10957a;
    public static final c f10958b;
    public static final c f10959c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f10957a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f10958b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f10959c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
