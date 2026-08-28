package od;

import g7.n7;
public final class b {
    public static final b f19205a;
    public static final b f19206b;
    public static final b f19207c;
    public static final b d;
    public static final b f19208e;
    public static final b[] f19209f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f19205a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f19206b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f19207c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f19208e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f19209f = bVarArr;
        n7.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f19209f.clone();
    }
}
