package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
public final class k2 extends e2 implements f2 {
    public static final Method T;
    public h9.f1 S;

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
    public final void c0(l.k kVar, MenuItem menuItem) {
        h9.f1 f1Var = this.S;
        if (f1Var != null) {
            f1Var.c0(kVar, menuItem);
        }
    }

    @Override
    public final void h1(l.k kVar, l.m mVar) {
        h9.f1 f1Var = this.S;
        if (f1Var != null) {
            f1Var.h1(kVar, mVar);
        }
    }

    @Override
    public final s1 o(Context context, boolean z9) {
        j2 j2Var = new j2(context, z9);
        j2Var.setHoverListener(this);
        return j2Var;
    }
}
