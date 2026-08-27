package lc;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;

public abstract class c {

    public static final Map f15537a;

    static {
        Map map;
        try {
            Field declaredField = ie.b.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable th) {
            Map map2 = Collections.EMPTY_MAP;
            th.printStackTrace();
            map = map2;
        }
        f15537a = map;
    }
}
