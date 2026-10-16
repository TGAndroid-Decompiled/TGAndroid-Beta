package ji;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class f0 extends l61 {
    public static final int f13263a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        g0 g0Var = (g0) view;
        a aVar = (a) m61Var.G;
        g0Var.f13123a = aVar;
        g0Var.E = (e0) m61Var.H;
        g0Var.c(aVar);
        g0Var.i();
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        g0 g0Var = new g0(context, i10, c6Var);
        g0Var.setBackground(new a2(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var)));
        return g0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
