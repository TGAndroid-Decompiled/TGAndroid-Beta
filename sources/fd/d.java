package fd;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;
public abstract class d {
    public static final Map f10434a;

    static {
        Map map;
        try {
            Field declaredField = df.b.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable th2) {
            Map map2 = Collections.EMPTY_MAP;
            th2.printStackTrace();
            map = map2;
        }
        f10434a = map;
    }
}
