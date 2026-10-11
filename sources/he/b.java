package he;

import w7.v;
public final class b {
    public static final b f11099a;
    public static final b f11100b;
    public static final b f11101c;
    public static final b d;
    public static final b f11102e;
    public static final b[] f11103f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f11099a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f11100b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f11101c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f11102e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f11103f = bVarArr;
        v.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f11103f.clone();
    }
}
