package g7;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

public abstract class b7 {

    public static Field f6412a;

    public static boolean f6413b;

    public static Class f6414c;
    public static boolean d;

    public static Field f6415e;

    public static boolean f6416f;

    public static Field f6417g;
    public static boolean h;

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                f6414c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e9) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e9);
            }
            d = true;
        }
        Class cls = f6414c;
        if (cls == null) {
            return;
        }
        if (!f6416f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f6415e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e10);
            }
            f6416f = true;
        }
        Field field = f6415e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e11);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            g.w.a(longSparseArray);
        }
    }
}
