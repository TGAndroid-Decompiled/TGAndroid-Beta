package ji;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class f0 extends k61 {
    public static final int f13260a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        g0 g0Var = (g0) view;
        a aVar = (a) l61Var.G;
        g0Var.f13119a = aVar;
        g0Var.E = (e0) l61Var.H;
        g0Var.c(aVar);
        g0Var.i();
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        g0 g0Var = new g0(context, i10, c6Var);
        g0Var.setBackground(new a2(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, c6Var)));
        return g0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
