package defpackage;
public final class m0d {
    public static final m0d a;
    public static final m0d b;
    public static final m0d c;
    public static final m0d d;
    public static final m0d e;
    public static final m0d f;
    public static final m0d h;
    public static final m0d n;
    public static final m0d r;
    public static final m0d[] s;

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
        m61 m61Var = m61.c;
        ?? r11 = new Enum("BYTE_STRING", 6);
        h = r11;
        ?? r13 = new Enum("ENUM", 7);
        n = r13;
        ?? r15 = new Enum("MESSAGE", 8);
        r = r15;
        s = new m0d[]{r0, r1, r3, r5, r7, r9, r11, r13, r15};
    }

    public static m0d valueOf(String str) {
        return (m0d) Enum.valueOf(m0d.class, str);
    }

    public static m0d[] values() {
        return (m0d[]) s.clone();
    }
}
