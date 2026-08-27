package f9;

import java.util.HashMap;

public final class g {

    public static final g f5934a;

    public static final HashMap f5935b;

    public static final g[] f5936c;

    g EF0;

    static {
        g gVar = new g("X86_32", 0);
        g gVar2 = new g("X86_64", 1);
        g gVar3 = new g("ARM_UNKNOWN", 2);
        g gVar4 = new g("PPC", 3);
        g gVar5 = new g("PPC64", 4);
        g gVar6 = new g("ARMV6", 5);
        g gVar7 = new g("ARMV7", 6);
        g gVar8 = new g("UNKNOWN", 7);
        f5934a = gVar8;
        g gVar9 = new g("ARMV7S", 8);
        g gVar10 = new g("ARM64", 9);
        f5936c = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10};
        HashMap map = new HashMap(4);
        f5935b = map;
        map.put("armeabi-v7a", gVar7);
        map.put("armeabi", gVar6);
        map.put("arm64-v8a", gVar10);
        map.put("x86", gVar);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f5936c.clone();
    }
}
