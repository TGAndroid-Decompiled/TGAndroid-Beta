package ki;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class w0 extends k61 {
    public static final int f15643a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        x0 x0Var = (x0) view;
        a aVar = (a) l61Var.G;
        x0Var.f15157a = aVar;
        x0Var.v = (s2) l61Var.H;
        x0Var.f15701w = LocaleController.isRTL;
        x0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new x0(context, g6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
