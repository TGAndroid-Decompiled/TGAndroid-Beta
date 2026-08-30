package j7;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
public abstract class h8 {
    public static Method f9027a;
    public static boolean f9028b;
    public static Method f9029c;
    public static boolean d;

    public static int a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e0.b.h(drawable);
        }
        if (!d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f9029c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            d = true;
        }
        Method method = f9029c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, null)).intValue();
            } catch (Exception e6) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e6);
                f9029c = null;
                return 0;
            }
        }
        return 0;
    }

    public static boolean b(int i10, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e0.b.w(i10, drawable);
        }
        if (!f9028b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f9027a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f9028b = true;
        }
        Method method = f9027a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i10));
                return true;
            } catch (Exception e6) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e6);
                f9027a = null;
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
