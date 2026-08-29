package g9;

import java.util.HashMap;
public final class g {
    public static final g f7156a;
    public static final HashMap f7157b;
    public static final g[] f7158c;
    g EF0;

    static {
        Enum r02 = new Enum("X86_32", 0);
        Enum r12 = new Enum("X86_64", 1);
        Enum r32 = new Enum("ARM_UNKNOWN", 2);
        Enum r52 = new Enum("PPC", 3);
        Enum r72 = new Enum("PPC64", 4);
        Enum r9 = new Enum("ARMV6", 5);
        Enum r11 = new Enum("ARMV7", 6);
        ?? r13 = new Enum("UNKNOWN", 7);
        f7156a = r13;
        Enum r15 = new Enum("ARMV7S", 8);
        Enum r22 = new Enum("ARM64", 9);
        f7158c = new g[]{r02, r12, r32, r52, r72, r9, r11, r13, r15, r22};
        HashMap hashMap = new HashMap(4);
        f7157b = hashMap;
        hashMap.put("armeabi-v7a", r11);
        hashMap.put("armeabi", r9);
        hashMap.put("arm64-v8a", r22);
        hashMap.put("x86", r02);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f7158c.clone();
    }
}
