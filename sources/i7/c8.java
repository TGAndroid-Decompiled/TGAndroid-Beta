package i7;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class c8 {
    public static Method f8282a;
    public static boolean f8283b;
    public static Field f8284c;
    public static boolean d;

    public static void a(m.y yVar, boolean z10) {
        if (Build.VERSION.SDK_INT >= 23) {
            e0.b.x(yVar, z10);
            return;
        }
        if (!d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f8284c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e10);
            }
            d = true;
        }
        Field field = f8284c;
        if (field != null) {
            try {
                field.set(yVar, Boolean.valueOf(z10));
            } catch (IllegalAccessException e11) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e11);
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            e0.b.y(popupWindow, i10);
            return;
        }
        if (!f8283b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f8282a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f8283b = true;
        }
        Method method = f8282a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i10));
            } catch (Exception unused2) {
            }
        }
    }
}
