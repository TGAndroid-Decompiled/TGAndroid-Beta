package ge;
public final class b {
    public static final b f10624a;
    public static final b f10625b;
    public static final b f10626c;
    public static final b d;
    public static final b f10627e;
    public static final b[] f10628f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f10624a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f10625b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f10626c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f10627e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f10628f = bVarArr;
        w7.m.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f10628f.clone();
    }
}
