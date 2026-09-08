package ji;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class w0 extends g51 {
    public static final int f14306a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        x0 x0Var = (x0) view;
        a aVar = (a) h51Var.G;
        x0Var.f13775a = aVar;
        x0Var.v = (r2) h51Var.H;
        x0Var.f14350w = LocaleController.isRTL;
        x0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new x0(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
