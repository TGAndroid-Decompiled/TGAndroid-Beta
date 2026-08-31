package i9;

import java.util.HashMap;
public final class g {
    public static final g f7947a;
    public static final HashMap f7948b;
    public static final g[] f7949c;
    g EF0;

    static {
        Enum r02 = new Enum("X86_32", 0);
        Enum r12 = new Enum("X86_64", 1);
        Enum r32 = new Enum("ARM_UNKNOWN", 2);
        Enum r52 = new Enum("PPC", 3);
        Enum r72 = new Enum("PPC64", 4);
        Enum r92 = new Enum("ARMV6", 5);
        Enum r11 = new Enum("ARMV7", 6);
        ?? r13 = new Enum("UNKNOWN", 7);
        f7947a = r13;
        Enum r15 = new Enum("ARMV7S", 8);
        Enum r22 = new Enum("ARM64", 9);
        f7949c = new g[]{r02, r12, r32, r52, r72, r92, r11, r13, r15, r22};
        HashMap hashMap = new HashMap(4);
        f7948b = hashMap;
        hashMap.put("armeabi-v7a", r11);
        hashMap.put("armeabi", r92);
        hashMap.put("arm64-v8a", r22);
        hashMap.put("x86", r02);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f7949c.clone();
    }
}
