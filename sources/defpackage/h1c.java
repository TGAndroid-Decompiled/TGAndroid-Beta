package defpackage;
public final class h1c {
    public static final h1c a;
    public static final h1c b;
    public static final h1c c;
    public static final h1c[] d;

    static {
        ?? r0 = new Enum("TOP", 0);
        a = r0;
        ?? r1 = new Enum("LEFT", 1);
        b = r1;
        ?? r3 = new Enum("BOTTOM", 2);
        c = r3;
        d = new h1c[]{r0, r1, r3};
    }

    public static h1c valueOf(String str) {
        return (h1c) Enum.valueOf(h1c.class, str);
    }

    public static h1c[] values() {
        return (h1c[]) d.clone();
    }
}
