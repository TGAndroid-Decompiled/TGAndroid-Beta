package ge;

import c8.n1;
public final class b {
    public static final b f13525a;
    public static final b f13526b;
    public static final b f13527c;
    public static final b d;
    public static final b f13528e;
    public static final b[] f13529f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f13525a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f13526b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f13527c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f13528e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f13529f = bVarArr;
        n1.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13529f.clone();
    }
}
