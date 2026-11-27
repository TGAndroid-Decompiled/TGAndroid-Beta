package defpackage;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;
public abstract class fn2 {
    public static final Map a;

    static {
        Map map;
        try {
            Field declaredField = di5.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable th) {
            Map map2 = Collections.EMPTY_MAP;
            th.printStackTrace();
            map = map2;
        }
        a = map;
    }
}
