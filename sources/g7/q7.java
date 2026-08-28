package g7;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class q7 {
    public static Method f7349a;
    public static boolean f7350b;
    public static Field f7351c;
    public static boolean d;

    public static void a(m.y yVar, boolean z10) {
        if (Build.VERSION.SDK_INT >= 23) {
            e0.b.x(yVar, z10);
            return;
        }
        if (!d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f7351c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e10);
            }
            d = true;
        }
        Field field = f7351c;
        if (field != null) {
            try {
                field.set(yVar, Boolean.valueOf(z10));
            } catch (IllegalAccessException e11) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e11);
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i9) {
        if (Build.VERSION.SDK_INT >= 23) {
            e0.b.y(popupWindow, i9);
            return;
        }
        if (!f7350b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f7349a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f7350b = true;
        }
        Method method = f7349a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i9));
            } catch (Exception unused2) {
            }
        }
    }
}
