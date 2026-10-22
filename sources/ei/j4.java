package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class j4 extends g61 {
    public static final int f9244a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        k4 k4Var = (k4) view;
        k4Var.a(h61Var.d, h61Var.f26798z, (a8) h61Var.G);
        k4Var.b(h61Var.e, false);
        boolean z11 = h61Var.f26780f;
        if (k4Var.f9305f != z11) {
            k4Var.f9305f = z11;
            k4Var.E.a(z11);
            k4Var.invalidate();
        }
        k4Var.setOnCheckboxClick(h61Var.D);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new k4(context, d6Var);
    }
}
