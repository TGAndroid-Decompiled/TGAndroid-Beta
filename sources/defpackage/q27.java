package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
public final class q27 extends o76 implements b27 {
    public static final Method U;
    public nl9 T;

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
    public final void B(y17 y17Var, c27 c27Var) {
        nl9 nl9Var = this.T;
        if (nl9Var != null) {
            nl9Var.B(y17Var, c27Var);
        }
    }

    @Override
    public final void g0(y17 y17Var, c27 c27Var) {
        nl9 nl9Var = this.T;
        if (nl9Var != null) {
            nl9Var.g0(y17Var, c27Var);
        }
    }

    @Override
    public final os3 o(Context context, boolean z) {
        p27 p27Var = new p27(context, z);
        p27Var.setHoverListener(this);
        return p27Var;
    }
}
