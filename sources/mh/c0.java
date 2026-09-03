package mh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class c0 extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(String str, CharSequence charSequence, int i10) {
        h51 J = h51.J(c0.class);
        J.f2506b = false;
        J.f27388z = i10;
        J.f27375l = str;
        J.f27376m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        ((d0) view).a(h51Var.f27375l, h51Var.f27376m, h51Var.f27388z);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new d0(context, 0, g6Var);
    }
}
