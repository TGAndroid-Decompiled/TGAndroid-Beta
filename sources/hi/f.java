package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class f extends x31 {
    static {
        x31.h(new x31());
    }

    public static y31 i(int i7, int i10, CharSequence charSequence, String str) {
        y31 K = y31.K(f.class);
        K.d = i7;
        K.f40581z = i10;
        K.f40567k = 2131231105;
        K.f40568l = charSequence;
        K.f40569m = str;
        return K;
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((g) view).a(y31Var.f40581z, y31Var.f40567k, y31Var.f40568l, y31Var.f40569m);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new g(context, g6Var);
    }
}
