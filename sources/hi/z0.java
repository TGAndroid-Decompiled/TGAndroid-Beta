package hi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class z0 extends u51 {
    public static final int f9989a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        a1 a1Var = (a1) view;
        a aVar = (a) v51Var.G;
        a1Var.f9464a = aVar;
        a1Var.v = (v2) v51Var.H;
        a1Var.f9446w = LocaleController.isRTL;
        a1Var.c(aVar);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new a1(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
