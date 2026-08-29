package h7;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
public abstract class l8 {
    public static Method f7697a;
    public static boolean f7698b;
    public static Method f7699c;
    public static boolean d;

    public static int a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e0.b.h(drawable);
        }
        if (!d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f7699c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e10);
            }
            d = true;
        }
        Method method = f7699c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, null)).intValue();
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e11);
                f7699c = null;
                return 0;
            }
        }
        return 0;
    }

    public static boolean b(int i10, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e0.b.w(i10, drawable);
        }
        if (!f7698b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f7697a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e10);
            }
            f7698b = true;
        }
        Method method = f7697a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i10));
                return true;
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e11);
                f7697a = null;
            }
        }
        return false;
    }

    public static void c(int i10, Drawable drawable) {
        drawable.setTint(i10);
    }

    public static Drawable d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 && !(drawable instanceof j0.b)) {
            ?? drawable2 = new Drawable();
            drawable2.d = drawable2.c();
            drawable2.h(drawable);
            j0.d.a();
            return drawable2;
        }
        return drawable;
    }
}
