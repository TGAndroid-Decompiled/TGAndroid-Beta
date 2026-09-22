package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
public final class x0 extends h51 {
    public static final int f11754a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) i51Var.G;
        y0Var.f11219a = aVar;
        y0Var.v = (s2) i51Var.H;
        y0Var.f11774w = LocaleController.isRTL;
        y0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new y0(context, e6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
