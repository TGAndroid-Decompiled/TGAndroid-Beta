package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
public final class x0 extends i51 {
    public static final int f11755a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) j51Var.G;
        y0Var.f11220a = aVar;
        y0Var.v = (s2) j51Var.H;
        y0Var.f11775w = LocaleController.isRTL;
        y0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new y0(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
