package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class x0 extends v51 {
    public static final int f11756a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) w51Var.G;
        y0Var.f11221a = aVar;
        y0Var.v = (s2) w51Var.H;
        y0Var.f11776w = LocaleController.isRTL;
        y0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new y0(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
