package dd;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;
public abstract class d {
    public static final Map f8309a;

    static {
        Map map;
        try {
            Field declaredField = bf.b.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable th2) {
            Map map2 = Collections.EMPTY_MAP;
            th2.printStackTrace();
            map = map2;
        }
        f8309a = map;
    }
}
