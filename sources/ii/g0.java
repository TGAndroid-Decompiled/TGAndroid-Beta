package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class g0 extends w51 {
    public static final int f11373a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        h0 h0Var = (h0) view;
        a aVar = (a) x51Var.G;
        h0Var.f11207a = aVar;
        h0Var.E = (f0) x51Var.H;
        h0Var.c(aVar);
        h0Var.i();
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        h0 h0Var = new h0(context, i10, d6Var);
        h0Var.setBackground(new b2(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, d6Var)));
        return h0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
