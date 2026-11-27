package defpackage;

import android.view.View;
import android.view.WindowInsets;
public abstract class bhc {
    public static l2d a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        l2d h = l2d.h(null, rootWindowInsets);
        i2d i2dVar = h.a;
        i2dVar.r(h);
        i2dVar.d(view.getRootView());
        return h;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
