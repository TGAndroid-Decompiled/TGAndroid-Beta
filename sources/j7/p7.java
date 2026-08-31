package j7;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
public abstract class p7 {
    public static Field f9728a;
    public static boolean f9729b;
    public static Class f9730c;
    public static boolean d;
    public static Field f9731e;
    public static boolean f9732f;
    public static Field f9733g;
    public static boolean h;

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                f9730c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e6) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e6);
            }
            d = true;
        }
        Class cls = f9730c;
        if (cls != null) {
            if (!f9732f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f9731e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e10);
                }
                f9732f = true;
            }
            Field field = f9731e;
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
