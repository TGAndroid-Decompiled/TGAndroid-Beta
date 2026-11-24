package defpackage;
public final class b02 {
    public static final b02 a;
    public static final b02 b;
    public static final b02 c;
    public static final b02 d;
    public static final b02 e;
    public static final b02 f;
    public static final b02[] h;

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
        h = new b02[]{r0, r1, r3, r5, r7, r9};
    }

    public static b02 valueOf(String str) {
        return (b02) Enum.valueOf(b02.class, str);
    }

    public static b02[] values() {
        return (b02[]) h.clone();
    }
}
