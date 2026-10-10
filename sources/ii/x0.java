package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class x0 extends p61 {
    public static final int f12799a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) q61Var.G;
        y0Var.f12251a = aVar;
        y0Var.v = (t2) q61Var.H;
        y0Var.f12846w = LocaleController.isRTL;
        y0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new y0(context, e6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
