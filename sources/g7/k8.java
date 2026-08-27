package g7;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

public abstract class k8 {

    public static Method f6534a;

    public static boolean f6535b;

    public static Method f6536c;
    public static boolean d;

    public static int a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e0.b.h(drawable);
        }
        if (!d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f6536c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e9) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e9);
            }
            d = true;
        }
        Method method = f6536c;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception e10) {
            Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e10);
            f6536c = null;
            return 0;
        }
    }

    public static boolean b(int i10, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e0.b.w(i10, drawable);
        }
        if (!f6535b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f6534a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e9) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e9);
            }
            f6535b = true;
        }
        Method method = f6534a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i10));
                return true;
            } catch (Exception e10) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e10);
                f6534a = null;
            }
        }
        return false;
    }

    public static void c(int i10, Drawable drawable) {
        drawable.setTint(i10);
    }

    public static Drawable d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof j0.b)) {
            return drawable;
        }
        j0.d dVar = new j0.d();
        dVar.d = dVar.c();
        dVar.h(drawable);
        j0.d.a();
        return dVar;
    }
}
