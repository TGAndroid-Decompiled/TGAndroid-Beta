package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
public final class j2 extends d2 implements e2 {
    public static final Method T;
    public a4.m S;

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
    public final void d0(l.k kVar, l.m mVar) {
        a4.m mVar2 = this.S;
        if (mVar2 != null) {
            mVar2.d0(kVar, mVar);
        }
    }

    @Override
    public final r1 o(Context context, boolean z10) {
        i2 i2Var = new i2(context, z10);
        i2Var.setHoverListener(this);
        return i2Var;
    }

    @Override
    public final void u(l.k kVar, MenuItem menuItem) {
        a4.m mVar = this.S;
        if (mVar != null) {
            mVar.u(kVar, menuItem);
        }
    }
}
