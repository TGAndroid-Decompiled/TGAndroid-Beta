package defpackage;

import java.util.HashMap;
public final class hn2 {
    public static final hn2 a;
    public static final HashMap b;
    public static final hn2[] c;
    hn2 EF0;

    static {
        Enum r0 = new Enum("X86_32", 0);
        Enum r1 = new Enum("X86_64", 1);
        Enum r3 = new Enum("ARM_UNKNOWN", 2);
        Enum r5 = new Enum("PPC", 3);
        Enum r7 = new Enum("PPC64", 4);
        Enum r9 = new Enum("ARMV6", 5);
        Enum r11 = new Enum("ARMV7", 6);
        ?? r13 = new Enum("UNKNOWN", 7);
        a = r13;
        Enum r15 = new Enum("ARMV7S", 8);
        Enum r2 = new Enum("ARM64", 9);
        c = new hn2[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r2};
        HashMap hashMap = new HashMap(4);
        b = hashMap;
        hashMap.put("armeabi-v7a", r11);
        hashMap.put("armeabi", r9);
        hashMap.put("arm64-v8a", r2);
        hashMap.put("x86", r0);
    }

    public static hn2 valueOf(String str) {
        return (hn2) Enum.valueOf(hn2.class, str);
    }

    public static hn2[] values() {
        return (hn2[]) c.clone();
    }
}
