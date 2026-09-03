package m;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
public abstract class v3 {
    public static final Method f13650a;
    public static final boolean f13651b;

    static {
        boolean z4;
        if (Build.VERSION.SDK_INT >= 27) {
            z4 = true;
        } else {
            z4 = false;
        }
        f13651b = z4;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f13650a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        WeakHashMap weakHashMap = r0.j0.f43142a;
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
