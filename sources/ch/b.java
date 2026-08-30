package ch;
public final class b {
    public static final b f2595a;
    public static final b f2596b;
    public static final b f2597c;
    public static final b d;
    public static final b[] e;

    static {
        ?? r02 = new Enum("STATE_FULLY_HIDDEN", 0);
        f2595a = r02;
        ?? r12 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        f2596b = r12;
        ?? r32 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        f2597c = r32;
        ?? r52 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r52;
        e = new b[]{r02, r12, r32, r52};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) e.clone();
    }
}
