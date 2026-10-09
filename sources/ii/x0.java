package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class x0 extends o61 {
    public static final int f12799a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) p61Var.G;
        y0Var.f12251a = aVar;
        y0Var.v = (t2) p61Var.H;
        y0Var.f12846w = LocaleController.isRTL;
        y0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new y0(context, e6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
