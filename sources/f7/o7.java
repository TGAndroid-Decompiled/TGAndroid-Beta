package f7;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
public abstract class o7 {
    public static Field f5769a;
    public static boolean f5770b;
    public static Class f5771c;
    public static boolean d;
    public static Field f5772e;
    public static boolean f5773f;
    public static Field f5774g;
    public static boolean h;

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                f5771c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            d = true;
        }
        Class cls = f5771c;
        if (cls != null) {
            if (!f5773f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f5772e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e11) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
                }
                f5773f = true;
            }
            Field field = f5772e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e12) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    g.v.a(longSparseArray);
                }
            }
        }
    }
}
