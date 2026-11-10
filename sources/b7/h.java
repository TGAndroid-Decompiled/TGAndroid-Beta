package b7;

import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
public abstract class h {
    public static ClassLoader f3005a;
    public static Thread f3006b;

    public static int a(String str) {
        Integer num;
        try {
            Map map = ResourceProvider.f6523a;
            num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static synchronized java.lang.ClassLoader b() {
        throw new UnsupportedOperationException("Method not decompiled: b7.h.b():java.lang.ClassLoader");
    }
}
