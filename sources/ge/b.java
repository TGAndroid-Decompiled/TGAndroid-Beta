package ge;
public final class b {
    public static final b f10596a;
    public static final b f10597b;
    public static final b f10598c;
    public static final b d;
    public static final b f10599e;
    public static final b[] f10600f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f10596a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f10597b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f10598c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f10599e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f10600f = bVarArr;
        w7.m.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f10600f.clone();
    }
}
