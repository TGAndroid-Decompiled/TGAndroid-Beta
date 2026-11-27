package defpackage;
public final class b3d {
    public static final b3d a;
    public static final b3d b;
    public static final b3d c;
    public static final b3d d;
    public static final b3d e;
    public static final b3d f;
    public static final b3d h;
    public static final b3d n;
    public static final b3d r;
    public static final b3d[] s;

    static {
        ?? r0 = new Enum("INT", 0);
        a = r0;
        ?? r1 = new Enum("LONG", 1);
        b = r1;
        ?? r3 = new Enum("FLOAT", 2);
        c = r3;
        ?? r5 = new Enum("DOUBLE", 3);
        d = r5;
        ?? r7 = new Enum("BOOLEAN", 4);
        e = r7;
        ?? r9 = new Enum("STRING", 5);
        f = r9;
        n51 n51Var = n51.c;
        ?? r11 = new Enum("BYTE_STRING", 6);
        h = r11;
        ?? r13 = new Enum("ENUM", 7);
        n = r13;
        ?? r15 = new Enum("MESSAGE", 8);
        r = r15;
        s = new b3d[]{r0, r1, r3, r5, r7, r9, r11, r13, r15};
    }

    public static b3d valueOf(String str) {
        return (b3d) Enum.valueOf(b3d.class, str);
    }

    public static b3d[] values() {
        return (b3d[]) s.clone();
    }
}
