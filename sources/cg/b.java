package cg;
public final class b {
    public static final b f4987a;
    public static final b f4988b;
    public static final b[] f4989c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f4987a = r02;
        ?? r12 = new Enum("TON", 1);
        f4988b = r12;
        f4989c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4989c.clone();
    }
}
