package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class j4 extends k61 {
    public static final int f9255a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        k4 k4Var = (k4) view;
        k4Var.a(l61Var.d, l61Var.f28240z, (a8) l61Var.G);
        k4Var.b(l61Var.e, false);
        boolean z11 = l61Var.f28222f;
        if (k4Var.h != z11) {
            k4Var.h = z11;
            k4Var.F.a(z11);
            k4Var.invalidate();
        }
        k4Var.setOnCheckboxClick(l61Var.D);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new k4(context, g6Var);
    }
}
