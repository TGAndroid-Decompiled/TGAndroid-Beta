package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
public final class k2 extends e2 implements f2 {
    public static final Method Q;
    public androidx.biometric.f0 P;

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
    public final void e(l.k kVar, MenuItem menuItem) {
        androidx.biometric.f0 f0Var = this.P;
        if (f0Var != null) {
            f0Var.e(kVar, menuItem);
        }
    }

    @Override
    public final s1 p(Context context, boolean z4) {
        j2 j2Var = new j2(context, z4);
        j2Var.setHoverListener(this);
        return j2Var;
    }

    @Override
    public final void q(l.k kVar, l.m mVar) {
        androidx.biometric.f0 f0Var = this.P;
        if (f0Var != null) {
            f0Var.q(kVar, mVar);
        }
    }
}
