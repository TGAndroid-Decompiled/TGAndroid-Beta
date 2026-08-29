package ah;
public final class b {
    public static final b f736a;
    public static final b f737b;
    public static final b f738c;
    public static final b d;
    public static final b[] f739e;

    static {
        ?? r02 = new Enum("STATE_FULLY_HIDDEN", 0);
        f736a = r02;
        ?? r12 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        f737b = r12;
        ?? r32 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        f738c = r32;
        ?? r52 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r52;
        f739e = new b[]{r02, r12, r32, r52};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f739e.clone();
    }
}
