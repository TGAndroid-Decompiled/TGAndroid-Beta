package he;

import w7.u;
public final class b {
    public static final b f11098a;
    public static final b f11099b;
    public static final b f11100c;
    public static final b d;
    public static final b f11101e;
    public static final b[] f11102f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f11098a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f11099b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f11100c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f11101e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f11102f = bVarArr;
        u.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f11102f.clone();
    }
}
