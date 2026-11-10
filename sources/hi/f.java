package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class f extends w31 {
    static {
        w31.h(new w31());
    }

    public static x31 i(int i7, int i10, CharSequence charSequence, String str) {
        x31 K = x31.K(f.class);
        K.d = i7;
        K.f40169z = i10;
        K.f40155k = 2131231105;
        K.f40156l = charSequence;
        K.f40157m = str;
        return K;
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((g) view).a(x31Var.f40169z, x31Var.f40155k, x31Var.f40156l, x31Var.f40157m);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new g(context, h6Var);
    }
}
