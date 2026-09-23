package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
public final class r4 extends g51 {
    public static final int f5452a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        s4 s4Var = (s4) view;
        s4Var.a(h51Var.d, h51Var.f24520z, (l8) h51Var.G);
        s4Var.b(h51Var.e, false);
        boolean z11 = h51Var.f24502f;
        if (s4Var.f5486f != z11) {
            s4Var.f5486f = z11;
            s4Var.E.a(z11);
            s4Var.invalidate();
        }
        s4Var.setOnCheckboxClick(h51Var.D);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new s4(context, d6Var);
    }
}
