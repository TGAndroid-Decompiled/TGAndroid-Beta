package defpackage;

import android.view.View;
import android.view.WindowInsets;
public abstract class dfc {
    public static wzc a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        wzc h = wzc.h(null, rootWindowInsets);
        tzc tzcVar = h.a;
        tzcVar.r(h);
        tzcVar.d(view.getRootView());
        return h;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
