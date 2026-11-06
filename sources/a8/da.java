package a8;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
public abstract class da {
    public static Field f366a;
    public static boolean f367b;
    public static Class f368c;
    public static boolean d;
    public static Field f369e;
    public static boolean f370f;
    public static Field f371g;
    public static boolean h;

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                f368c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            d = true;
        }
        Class cls = f368c;
        if (cls != null) {
            if (!f370f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f369e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e11) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
                }
                f370f = true;
            }
            Field field = f369e;
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
