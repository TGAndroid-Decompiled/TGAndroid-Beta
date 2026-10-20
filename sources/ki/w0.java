package ki;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class w0 extends g61 {
    public static final int f15582a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        x0 x0Var = (x0) view;
        a aVar = (a) h61Var.G;
        x0Var.f15111a = aVar;
        x0Var.v = (s2) h61Var.H;
        x0Var.f15640w = LocaleController.isRTL;
        x0Var.c(aVar);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new x0(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
