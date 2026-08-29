package h7;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
public abstract class n7 {
    public static Field f7715a;
    public static boolean f7716b;
    public static Class f7717c;
    public static boolean d;
    public static Field f7718e;
    public static boolean f7719f;
    public static Field f7720g;
    public static boolean h;

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                f7717c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            d = true;
        }
        Class cls = f7717c;
        if (cls != null) {
            if (!f7719f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f7718e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e11) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
                }
                f7719f = true;
            }
            Field field = f7718e;
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
