package j7;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
public abstract class i8 {
    public static Method f9651a;
    public static boolean f9652b;
    public static Method f9653c;
    public static boolean d;

    public static int a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e0.b.h(drawable);
        }
        if (!d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f9653c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e6) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e6);
            }
            d = true;
        }
        Method method = f9653c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, null)).intValue();
            } catch (Exception e10) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e10);
                f9653c = null;
                return 0;
            }
        }
        return 0;
    }

    public static boolean b(int i10, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e0.b.w(i10, drawable);
        }
        if (!f9652b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f9651a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e6) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e6);
            }
            f9652b = true;
        }
        Method method = f9651a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i10));
                return true;
            } catch (Exception e10) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e10);
                f9651a = null;
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
