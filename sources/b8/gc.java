package b8;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
public abstract class gc {
    public static Field f2637a;
    public static boolean f2638b;
    public static Class f2639c;
    public static boolean d;
    public static Field f2640e;
    public static boolean f2641f;
    public static Field f2642g;
    public static boolean h;

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                f2639c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            d = true;
        }
        Class cls = f2639c;
        if (cls != null) {
            if (!f2641f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f2640e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e11) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
                }
                f2641f = true;
            }
            Field field = f2640e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e12) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    g.x.a(longSparseArray);
                }
            }
        }
    }
}
