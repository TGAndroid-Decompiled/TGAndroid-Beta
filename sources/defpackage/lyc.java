package defpackage;
public final class lyc {
    public static final lyc a;
    public static final lyc b;
    public static final lyc c;
    public static final lyc d;
    public static final lyc e;
    public static final lyc f;
    public static final lyc h;
    public static final lyc n;
    public static final lyc r;
    public static final lyc[] s;

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
        f51 f51Var = f51.c;
        ?? r11 = new Enum("BYTE_STRING", 6);
        h = r11;
        ?? r13 = new Enum("ENUM", 7);
        n = r13;
        ?? r15 = new Enum("MESSAGE", 8);
        r = r15;
        s = new lyc[]{r0, r1, r3, r5, r7, r9, r11, r13, r15};
    }

    public static lyc valueOf(String str) {
        return (lyc) Enum.valueOf(lyc.class, str);
    }

    public static lyc[] values() {
        return (lyc[]) s.clone();
    }
}
