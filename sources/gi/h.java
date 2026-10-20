package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class h extends g61 {
    static {
        g61.setup(new g61());
    }

    public static h61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        h61 J = h61.J(h.class);
        J.d = i10;
        J.f26795z = i11;
        J.f26781k = i12;
        J.f26782l = charSequence;
        J.f26783m = str;
        return J;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ((i) view).a(h61Var.f26795z, h61Var.f26781k, h61Var.f26782l, h61Var.f26783m);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, d6 d6Var) {
        return new i(context, d6Var);
    }
}
