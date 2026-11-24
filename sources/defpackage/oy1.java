package defpackage;
public final class oy1 {
    public static final oy1 a;
    public static final oy1 b;
    public static final oy1 c;
    public static final oy1 d;
    public static final oy1 e;
    public static final oy1 f;
    public static final oy1[] h;

    static {
        ?? r0 = new Enum("VOICE", 0);
        a = r0;
        ?? r1 = new Enum("VIDEO", 1);
        b = r1;
        ?? r3 = new Enum("STICKER", 2);
        c = r3;
        ?? r5 = new Enum("KEYBOARD", 3);
        d = r5;
        ?? r7 = new Enum("SMILE", 4);
        e = r7;
        ?? r9 = new Enum("GIF", 5);
        f = r9;
        h = new oy1[]{r0, r1, r3, r5, r7, r9};
    }

    public static oy1 valueOf(String str) {
        return (oy1) Enum.valueOf(oy1.class, str);
    }

    public static oy1[] values() {
        return (oy1[]) h.clone();
    }
}
