package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import ji.w4;
public final class j2 extends d2 implements e2 {
    public static final Method T;
    public w4 S;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                T = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override
    public final void d(l.k kVar, MenuItem menuItem) {
        w4 w4Var = this.S;
        if (w4Var != null) {
            w4Var.d(kVar, menuItem);
        }
    }

    @Override
    public final r1 p(Context context, boolean z10) {
        i2 i2Var = new i2(context, z10);
        i2Var.setHoverListener(this);
        return i2Var;
    }

    @Override
    public final void s(l.k kVar, l.m mVar) {
        w4 w4Var = this.S;
        if (w4Var != null) {
            w4Var.s(kVar, mVar);
        }
    }
}
