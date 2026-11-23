package a8;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
public abstract class ha {
    public static Field f477a;
    public static boolean f478b;
    public static Class f479c;
    public static boolean d;
    public static Field f480e;
    public static boolean f481f;
    public static Field f482g;
    public static boolean h;

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                f479c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            d = true;
        }
        Class cls = f479c;
        if (cls != null) {
            if (!f481f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f480e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e11) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
                }
                f481f = true;
            }
            Field field = f480e;
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
