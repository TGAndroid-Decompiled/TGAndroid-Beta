package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
public final class h extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        h51 J = h51.J(h.class);
        J.d = i10;
        J.f24520z = i11;
        J.f24506k = i12;
        J.f24507l = charSequence;
        J.f24508m = str;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        ((i) view).a(h51Var.f24520z, h51Var.f24506k, h51Var.f24507l, h51Var.f24508m);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        return new i(context, d6Var);
    }
}
