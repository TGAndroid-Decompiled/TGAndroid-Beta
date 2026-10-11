package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class x0 extends q61 {
    public static final int f12798a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) r61Var.G;
        y0Var.f12250a = aVar;
        y0Var.v = (t2) r61Var.H;
        y0Var.f12845w = LocaleController.isRTL;
        y0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y0(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
