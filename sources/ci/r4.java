package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class r4 extends w51 {
    public static final int f5452a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        s4 s4Var = (s4) view;
        s4Var.a(x51Var.d, x51Var.f30305z, (l8) x51Var.G);
        s4Var.b(x51Var.e, false);
        boolean z11 = x51Var.f30287f;
        if (s4Var.f5486f != z11) {
            s4Var.f5486f = z11;
            s4Var.E.a(z11);
            s4Var.invalidate();
        }
        s4Var.setOnCheckboxClick(x51Var.D);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new s4(context, d6Var);
    }
}
