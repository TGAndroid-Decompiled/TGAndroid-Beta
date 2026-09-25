package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
public final class g0 extends u51 {
    public static final int f11373a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        h0 h0Var = (h0) view;
        a aVar = (a) v51Var.G;
        h0Var.f11207a = aVar;
        h0Var.E = (f0) v51Var.H;
        h0Var.c(aVar);
        h0Var.i();
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        h0 h0Var = new h0(context, i10, d6Var);
        h0Var.setBackground(new b2(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d6, d6Var)));
        return h0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
