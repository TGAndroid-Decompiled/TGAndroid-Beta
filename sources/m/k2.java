package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
public final class k2 extends e2 implements f2 {
    public static final Method P;
    public ag.o1 O;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                P = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override
    public final void g(l.k kVar, MenuItem menuItem) {
        ag.o1 o1Var = this.O;
        if (o1Var != null) {
            o1Var.g(kVar, menuItem);
        }
    }

    @Override
    public final void o(l.k kVar, l.m mVar) {
        ag.o1 o1Var = this.O;
        if (o1Var != null) {
            o1Var.o(kVar, mVar);
        }
    }

    @Override
    public final s1 q(Context context, boolean z10) {
        j2 j2Var = new j2(context, z10);
        j2Var.setHoverListener(this);
        return j2Var;
    }
}
