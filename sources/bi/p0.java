package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class p0 extends w31 {
    static {
        w31.h(new w31());
    }

    public static x31 i(String str, CharSequence charSequence, int i7) {
        x31 K = x31.K(p0.class);
        K.f54544b = false;
        K.f40169z = i7;
        K.f40156l = str;
        K.f40157m = charSequence;
        return K;
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((q0) view).a(x31Var.f40169z, x31Var.f40156l, x31Var.f40157m);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new q0(0, context, h6Var);
    }
}
