package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import ji.w4;
public final class l2 extends f2 implements g2 {
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
    public final t1 o(Context context, boolean z10) {
        k2 k2Var = new k2(context, z10);
        k2Var.setHoverListener(this);
        return k2Var;
    }

    @Override
    public final void w0(l.k kVar, l.m mVar) {
        w4 w4Var = this.S;
        if (w4Var != null) {
            w4Var.w0(kVar, mVar);
        }
    }

    @Override
    public final void z(l.k kVar, MenuItem menuItem) {
        w4 w4Var = this.S;
        if (w4Var != null) {
            w4Var.z(kVar, menuItem);
        }
    }
}
