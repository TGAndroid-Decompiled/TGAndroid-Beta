package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class q4 extends q61 {
    public static final int f5785a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        r4 r4Var = (r4) view;
        r4Var.a(r61Var.d, r61Var.f30374z, (l8) r61Var.G);
        r4Var.b(r61Var.f30355e, false);
        boolean z11 = r61Var.f30356f;
        if (r4Var.f5897f != z11) {
            r4Var.f5897f = z11;
            r4Var.E.a(z11);
            r4Var.invalidate();
        }
        r4Var.setOnCheckboxClick(r61Var.D);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new r4(context, d6Var);
    }
}
