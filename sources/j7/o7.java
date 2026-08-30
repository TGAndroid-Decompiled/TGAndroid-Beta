package j7;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
public abstract class o7 {
    public static Field f9103a;
    public static boolean f9104b;
    public static Class f9105c;
    public static boolean d;
    public static Field e;
    public static boolean f9106f;
    public static Field f9107g;
    public static boolean h;

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                f9105c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e6) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e6);
            }
            d = true;
        }
        Class cls = f9105c;
        if (cls != null) {
            if (!f9106f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e10);
                }
                f9106f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e11) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e11);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    g.v.a(longSparseArray);
                }
            }
        }
    }
}
