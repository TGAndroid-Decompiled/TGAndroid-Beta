package ji;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class w0 extends k61 {
    public static final int f13582a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        x0 x0Var = (x0) view;
        a aVar = (a) l61Var.G;
        x0Var.f13119a = aVar;
        x0Var.v = (s2) l61Var.H;
        x0Var.f13615w = LocaleController.isRTL;
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
