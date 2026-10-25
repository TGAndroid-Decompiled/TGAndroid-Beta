package a8;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
public abstract class gc {
    public static Field f493a;
    public static boolean f494b;
    public static Class f495c;
    public static boolean d;
    public static Field e;
    public static boolean f496f;
    public static Field f497g;
    public static boolean h;

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                f495c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            d = true;
        }
        Class cls = f495c;
        if (cls != null) {
            if (!f496f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e11) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
                }
                f496f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e12) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    g.w.a(longSparseArray);
                }
            }
        }
    }
}
