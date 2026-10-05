package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class x0 extends g61 {
    public static final int f12752a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) h61Var.G;
        y0Var.f12204a = aVar;
        y0Var.v = (t2) h61Var.H;
        y0Var.f12800w = LocaleController.isRTL;
        y0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y0(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
