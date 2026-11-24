package defpackage;

import java.util.Map;
public abstract class fqe {
    public static int a(int i) {
        if (i < 3) {
            ntd.b(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static boolean b(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
