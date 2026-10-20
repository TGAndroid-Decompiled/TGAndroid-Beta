package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class m0 extends g61 {
    static {
        g61.setup(new g61());
    }

    public static h61 a(String str, CharSequence charSequence, int i10) {
        h61 J = h61.J(m0.class);
        J.f44297b = false;
        J.f26795z = i10;
        J.f26782l = str;
        J.f26783m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ((n0) view).a(h61Var.f26782l, h61Var.f26783m, h61Var.f26795z);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new n0(context, 0, d6Var);
    }
}
