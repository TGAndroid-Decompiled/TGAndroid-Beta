package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
public final class x27 extends s76 implements i27 {
    public static final Method U;
    public zm9 T;

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
    public final void C(f27 f27Var, j27 j27Var) {
        zm9 zm9Var = this.T;
        if (zm9Var != null) {
            zm9Var.C(f27Var, j27Var);
        }
    }

    @Override
    public final void k0(f27 f27Var, j27 j27Var) {
        zm9 zm9Var = this.T;
        if (zm9Var != null) {
            zm9Var.k0(f27Var, j27Var);
        }
    }

    @Override
    public final vr3 o(Context context, boolean z) {
        w27 w27Var = new w27(context, z);
        w27Var.setHoverListener(this);
        return w27Var;
    }
}
