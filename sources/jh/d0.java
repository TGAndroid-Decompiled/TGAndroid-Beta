package jh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class d0 extends v41 {
    static {
        v41.setup(new v41());
    }

    public static w41 a(String str, CharSequence charSequence, int i10) {
        w41 J = w41.J(d0.class);
        J.f50846b = false;
        J.f34313z = i10;
        J.f34300l = str;
        J.f34301m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        ((e0) view).a(w41Var.f34300l, w41Var.f34301m, w41Var.f34313z);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new e0(context, 0, c6Var);
    }
}
