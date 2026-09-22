package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
public final class j2 extends d2 implements e2 {
    public static final Method T;
    public k2.u S;

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
    public final void G(l.k kVar, l.m mVar) {
        k2.u uVar = this.S;
        if (uVar != null) {
            uVar.G(kVar, mVar);
        }
    }

    @Override
    public final r1 o(Context context, boolean z10) {
        i2 i2Var = new i2(context, z10);
        i2Var.setHoverListener(this);
        return i2Var;
    }

    @Override
    public final void s(l.k kVar, MenuItem menuItem) {
        k2.u uVar = this.S;
        if (uVar != null) {
            uVar.s(kVar, menuItem);
        }
    }
}
