package ie;

import w7.d0;
public final class b {
    public static final b f11393a;
    public static final b f11394b;
    public static final b f11395c;
    public static final b d;
    public static final b e;
    public static final b[] f11396f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f11393a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f11394b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f11395c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f11396f = bVarArr;
        d0.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f11396f.clone();
    }
}
