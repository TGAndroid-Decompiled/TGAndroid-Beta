package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class h0 extends u51 {
    public static final int f9631a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        i0 i0Var = (i0) view;
        a aVar = (a) v51Var.G;
        i0Var.f9464a = aVar;
        i0Var.E = (g0) v51Var.H;
        i0Var.c(aVar);
        i0Var.i();
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        i0 i0Var = new i0(context, i10, f6Var);
        i0Var.setBackground(new d2(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var)));
        return i0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
