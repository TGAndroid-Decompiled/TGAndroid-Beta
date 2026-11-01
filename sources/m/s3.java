package m;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
public abstract class s3 {
    public static final Method f12548a;
    public static final boolean f12549b;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 27) {
            z10 = true;
        } else {
            z10 = false;
        }
        f12549b = z10;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f12548a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        WeakHashMap weakHashMap = r0.h0.f46134a;
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
