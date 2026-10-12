package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class q4 extends t61 {
    public static final int f5784a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        r4 r4Var = (r4) view;
        r4Var.a(u61Var.d, u61Var.f31089z, (l8) u61Var.G);
        r4Var.b(u61Var.f31070e, false);
        boolean z11 = u61Var.f31071f;
        if (r4Var.f5896f != z11) {
            r4Var.f5896f = z11;
            r4Var.E.a(z11);
            r4Var.invalidate();
        }
        r4Var.setOnCheckboxClick(u61Var.D);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new r4(context, c6Var);
    }
}
