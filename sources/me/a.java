package me;

import b8.zc;
public final class a {
    public static final a f19275a;
    public static final a[] f19276b;

    static {
        Enum r02 = new Enum("NONE", 0);
        Enum r12 = new Enum("ALL_JSON_OBJECTS", 1);
        ?? r32 = new Enum("POLYMORPHIC", 2);
        f19275a = r32;
        a[] aVarArr = {r02, r12, r32};
        f19276b = aVarArr;
        zc.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f19276b.clone();
    }
}
