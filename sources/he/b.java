package he;

import w7.v;
public final class b {
    public static final b f11100a;
    public static final b f11101b;
    public static final b f11102c;
    public static final b d;
    public static final b f11103e;
    public static final b[] f11104f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f11100a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f11101b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f11102c = r32;
        ?? r52 = new Enum("DORMANT", 3);
        d = r52;
        ?? r72 = new Enum("TERMINATED", 4);
        f11103e = r72;
        b[] bVarArr = {r02, r12, r32, r52, r72};
        f11104f = bVarArr;
        v.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f11104f.clone();
    }
}
