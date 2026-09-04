package ji;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class f0 extends g51 {
    public static final int f13893a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        g0 g0Var = (g0) view;
        a aVar = (a) h51Var.G;
        g0Var.f13749a = aVar;
        g0Var.E = (e0) h51Var.H;
        g0Var.c(aVar);
        g0Var.i();
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        g0 g0Var = new g0(context, i10, f6Var);
        g0Var.setBackground(new z1(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var)));
        return g0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
