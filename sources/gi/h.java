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
        J.f26799z = i11;
        J.f26785k = i12;
        J.f26786l = charSequence;
        J.f26787m = str;
        return J;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ((i) view).a(h61Var.f26799z, h61Var.f26785k, h61Var.f26786l, h61Var.f26787m);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, d6 d6Var) {
        return new i(context, d6Var);
    }
}
