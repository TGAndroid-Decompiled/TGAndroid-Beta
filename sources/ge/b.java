package ge;
public final class b {
    public static final b f9623a;
    public static final b f9624b;
    public static final b f9625c;
    public static final b d;
    public static final b e;
    public static final b[] f9626f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f9623a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f9624b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f9625c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f9626f = bVarArr;
        w7.m.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f9626f.clone();
    }
}
