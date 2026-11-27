package defpackage;
public final class gz1 {
    public static final gz1 a;
    public static final gz1 b;
    public static final gz1 c;
    public static final gz1 d;
    public static final gz1 e;
    public static final gz1 f;
    public static final gz1[] h;

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
        h = new gz1[]{r0, r1, r3, r5, r7, r9};
    }

    public static gz1 valueOf(String str) {
        return (gz1) Enum.valueOf(gz1.class, str);
    }

    public static gz1[] values() {
        return (gz1[]) h.clone();
    }
}
