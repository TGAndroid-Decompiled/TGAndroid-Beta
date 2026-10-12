package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
public final class k2 extends e2 implements f2 {
    public static final Method T;
    public xa.c S;

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
    public final void e(l.k kVar, MenuItem menuItem) {
        xa.c cVar = this.S;
        if (cVar != null) {
            cVar.e(kVar, menuItem);
        }
    }

    @Override
    public final void n(l.k kVar, l.m mVar) {
        xa.c cVar = this.S;
        if (cVar != null) {
            cVar.n(kVar, mVar);
        }
    }

    @Override
    public final s1 q(Context context, boolean z10) {
        j2 j2Var = new j2(context, z10);
        j2Var.setHoverListener(this);
        return j2Var;
    }
}
