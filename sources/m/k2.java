package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
public final class k2 extends e2 implements f2 {
    public static final Method Q;
    public androidx.biometric.e0 P;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                Q = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override
    public final void d(l.k kVar, MenuItem menuItem) {
        androidx.biometric.e0 e0Var = this.P;
        if (e0Var != null) {
            e0Var.d(kVar, menuItem);
        }
    }

    @Override
    public final void n(l.k kVar, l.m mVar) {
        androidx.biometric.e0 e0Var = this.P;
        if (e0Var != null) {
            e0Var.n(kVar, mVar);
        }
    }

    @Override
    public final s1 q(Context context, boolean z4) {
        j2 j2Var = new j2(context, z4);
        j2Var.setHoverListener(this);
        return j2Var;
    }
}
