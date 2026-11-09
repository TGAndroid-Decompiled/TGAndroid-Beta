package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class p0 extends x31 {
    static {
        x31.h(new x31());
    }

    public static y31 i(String str, CharSequence charSequence, int i7) {
        y31 K = y31.K(p0.class);
        K.f54545b = false;
        K.f40581z = i7;
        K.f40568l = str;
        K.f40569m = charSequence;
        return K;
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((q0) view).a(y31Var.f40581z, y31Var.f40568l, y31Var.f40569m);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new q0(0, context, g6Var);
    }
}
