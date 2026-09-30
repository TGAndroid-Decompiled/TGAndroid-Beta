package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class x0 extends x51 {
    public static final int f11730a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) y51Var.G;
        y0Var.f11221a = aVar;
        y0Var.v = (t2) y51Var.H;
        y0Var.f11779w = LocaleController.isRTL;
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
