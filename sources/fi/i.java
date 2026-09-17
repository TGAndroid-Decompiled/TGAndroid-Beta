package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class i extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        h51 J = h51.J(i.class);
        J.d = i10;
        J.f26635z = i11;
        J.f26621k = i12;
        J.f26622l = charSequence;
        J.f26623m = str;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        ((j) view).a(h51Var.f26635z, h51Var.f26621k, h51Var.f26622l, h51Var.f26623m);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new j(context, f6Var);
    }
}
