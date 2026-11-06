package cg;
public final class b {
    public static final b f6162a;
    public static final b f6163b;
    public static final b[] f6164c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f6162a = r02;
        ?? r12 = new Enum("TON", 1);
        f6163b = r12;
        f6164c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f6164c.clone();
    }
}
