package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class v0 extends t61 {
    public static final int f17536a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        w0 w0Var = (w0) view;
        a aVar = (a) u61Var.G;
        w0Var.f17652a = aVar;
        w0Var.v = (q2) u61Var.H;
        w0Var.f17593w = LocaleController.isRTL;
        w0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new w0(context, u6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
