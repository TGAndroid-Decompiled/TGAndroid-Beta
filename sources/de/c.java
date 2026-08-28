package de;
public final class c {
    public static final c f4477a;
    public static final c f4478b;
    public static final c f4479c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f4477a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f4478b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f4479c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
