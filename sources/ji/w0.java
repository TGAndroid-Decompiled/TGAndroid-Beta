package ji;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class w0 extends l61 {
    public static final int f13585a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        x0 x0Var = (x0) view;
        a aVar = (a) m61Var.G;
        x0Var.f13123a = aVar;
        x0Var.v = (s2) m61Var.H;
        x0Var.f13618w = LocaleController.isRTL;
        x0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new x0(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
