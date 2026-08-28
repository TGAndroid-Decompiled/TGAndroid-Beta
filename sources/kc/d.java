package kc;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;
public abstract class d {
    public static final Map f14759a;

    static {
        Map map;
        try {
            Field declaredField = he.b.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable th) {
            Map map2 = Collections.EMPTY_MAP;
            th.printStackTrace();
            map = map2;
        }
        f14759a = map;
    }
}
