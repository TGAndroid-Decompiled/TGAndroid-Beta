package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
public final class g0 extends f61 {
    public static final int f12382a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        h0 h0Var = (h0) view;
        a aVar = (a) g61Var.G;
        h0Var.f12204a = aVar;
        h0Var.E = (f0) g61Var.H;
        h0Var.c(aVar);
        h0Var.i();
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        h0 h0Var = new h0(context, i10, d6Var);
        h0Var.setBackground(new b2(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20822d6, d6Var)));
        return h0Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
