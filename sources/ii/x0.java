package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class x0 extends t61 {
    public static final int f12797a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) u61Var.G;
        y0Var.f12249a = aVar;
        y0Var.v = (t2) u61Var.H;
        y0Var.f12846w = LocaleController.isRTL;
        y0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new y0(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
