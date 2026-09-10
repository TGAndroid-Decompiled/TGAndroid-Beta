package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class e6 extends u51 {
    public static final int f9556a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        ((g6) view).g((a) v51Var.G, (d6) v51Var.H, v51Var.f27835r);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        g6 g6Var = new g6(context, f6Var);
        g6Var.setBackground(new d2(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var)));
        return g6Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
