package de;

import b8.zc;
public final class b {
    public static final b f8809a;
    public static final b f8810b;
    public static final b f8811c;
    public static final b d;
    public static final b f8812e;
    public static final b[] f8813f;

    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f8809a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f8810b = r12;
        ?? r32 = new Enum("PARKING", 2);
        f8811c = r32;
        ?? r5 = new Enum("DORMANT", 3);
        d = r5;
        ?? r72 = new Enum("TERMINATED", 4);
        f8812e = r72;
        b[] bVarArr = {r02, r12, r32, r5, r72};
        f8813f = bVarArr;
        zc.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f8813f.clone();
    }
}
