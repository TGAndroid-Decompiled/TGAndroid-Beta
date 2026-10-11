package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class h extends q61 {
    static {
        q61.setup(new q61());
    }

    public static r61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        r61 J = r61.J(h.class);
        J.d = i10;
        J.f30374z = i11;
        J.f30360k = i12;
        J.f30361l = charSequence;
        J.f30362m = str;
        return J;
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        ((i) view).a(r61Var.f30374z, r61Var.f30360k, r61Var.f30361l, r61Var.f30362m);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        return new i(context, d6Var);
    }
}
