package a8;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
public abstract class ga {
    public static Field f456a;
    public static boolean f457b;
    public static Class f458c;
    public static boolean d;
    public static Field f459e;
    public static boolean f460f;
    public static Field f461g;
    public static boolean h;

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                f458c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            d = true;
        }
        Class cls = f458c;
        if (cls != null) {
            if (!f460f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f459e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e11) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
                }
                f460f = true;
            }
            Field field = f459e;
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
