package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class x0 extends w51 {
    public static final int f11716a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) x51Var.G;
        y0Var.f11207a = aVar;
        y0Var.v = (t2) x51Var.H;
        y0Var.f11764w = LocaleController.isRTL;
        y0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y0(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
