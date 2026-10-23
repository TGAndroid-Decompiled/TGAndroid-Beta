package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class f0 extends g61 {
    public static final int f15252a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        g0 g0Var = (g0) view;
        a aVar = (a) h61Var.G;
        g0Var.f15111a = aVar;
        g0Var.E = (e0) h61Var.H;
        g0Var.c(aVar);
        g0Var.i();
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        g0 g0Var = new g0(context, i10, d6Var);
        g0Var.setBackground(new a2(h6.w0(h6.f20994d6, d6Var)));
        return g0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
