package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class p0 extends w31 {
    static {
        w31.h(new w31());
    }

    public static x31 i(String str, CharSequence charSequence, int i7) {
        x31 K = x31.K(p0.class);
        K.f54440b = false;
        K.f40172z = i7;
        K.f40159l = str;
        K.f40160m = charSequence;
        return K;
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        ((q0) view).a(x31Var.f40172z, x31Var.f40159l, x31Var.f40160m);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new q0(0, context, f6Var);
    }
}
