package defpackage;

import android.view.View;
import android.view.WindowInsets;
public abstract class cdc {
    public static vxc a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        vxc h = vxc.h(null, rootWindowInsets);
        sxc sxcVar = h.a;
        sxcVar.r(h);
        sxcVar.d(view.getRootView());
        return h;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
