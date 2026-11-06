package ge;

import c8.j1;
public final class b {
    public static final b f13837a;
    public static final b f13838b;
    public static final b f13839c;
    public static final b d;
    public static final b f13840e;
    public static final b[] f13841f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f13837a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f13838b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f13839c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f13840e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f13841f = bVarArr;
        j1.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13841f.clone();
    }
}
