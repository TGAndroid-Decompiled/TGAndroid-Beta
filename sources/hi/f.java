package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class f extends w31 {
    static {
        w31.h(new w31());
    }

    public static x31 i(int i7, int i10, CharSequence charSequence, String str) {
        x31 K = x31.K(f.class);
        K.d = i7;
        K.f40193z = i10;
        K.f40179k = 2131231105;
        K.f40180l = charSequence;
        K.f40181m = str;
        return K;
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        ((g) view).a(x31Var.f40193z, x31Var.f40179k, x31Var.f40180l, x31Var.f40181m);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new g(context, f6Var);
    }
}
