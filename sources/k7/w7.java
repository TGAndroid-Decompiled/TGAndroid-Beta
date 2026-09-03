package k7;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class w7 {
    public static Method f9999a;
    public static boolean f10000b;
    public static Field f10001c;
    public static boolean d;

    public static void a(m.x xVar, boolean z4) {
        if (Build.VERSION.SDK_INT >= 23) {
            e0.b.x(xVar, z4);
            return;
        }
        if (!d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f10001c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
            d = true;
        }
        Field field = f10001c;
        if (field != null) {
            try {
                field.set(xVar, Boolean.valueOf(z4));
            } catch (IllegalAccessException e6) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e6);
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            e0.b.y(popupWindow, i10);
            return;
        }
        if (!f10000b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f9999a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f10000b = true;
        }
        Method method = f9999a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i10));
            } catch (Exception unused2) {
            }
        }
    }
}
