package dh;
public final class b {
    public static final b f4744a;
    public static final b f4745b;
    public static final b f4746c;
    public static final b d;
    public static final b[] f4747e;

    static {
        ?? r02 = new Enum("STATE_FULLY_HIDDEN", 0);
        f4744a = r02;
        ?? r12 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        f4745b = r12;
        ?? r32 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        f4746c = r32;
        ?? r52 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r52;
        f4747e = new b[]{r02, r12, r32, r52};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4747e.clone();
    }
}
