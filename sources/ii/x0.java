package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
public final class x0 extends g51 {
    public static final int f11716a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) h51Var.G;
        y0Var.f11207a = aVar;
        y0Var.v = (t2) h51Var.H;
        y0Var.f11764w = LocaleController.isRTL;
        y0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y0(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
