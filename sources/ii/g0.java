package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class g0 extends x51 {
    public static final int f11387a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        h0 h0Var = (h0) view;
        a aVar = (a) y51Var.G;
        h0Var.f11221a = aVar;
        h0Var.E = (f0) y51Var.H;
        h0Var.c(aVar);
        h0Var.i();
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        h0 h0Var = new h0(context, i10, d6Var);
        h0Var.setBackground(new b2(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19076d6, d6Var)));
        return h0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
