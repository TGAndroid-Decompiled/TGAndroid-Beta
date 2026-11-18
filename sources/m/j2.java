package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import hi.u5;
import java.lang.reflect.Method;
public final class j2 extends d2 implements e2 {
    public static final Method U;
    public u5 T;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                U = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override
    public final void h(l.k kVar, MenuItem menuItem) {
        u5 u5Var = this.T;
        if (u5Var != null) {
            u5Var.h(kVar, menuItem);
        }
    }

    @Override
    public final void n(l.k kVar, l.m mVar) {
        u5 u5Var = this.T;
        if (u5Var != null) {
            u5Var.n(kVar, mVar);
        }
    }

    @Override
    public final r1 q(Context context, boolean z10) {
        i2 i2Var = new i2(context, z10);
        i2Var.setHoverListener(this);
        return i2Var;
    }
}
