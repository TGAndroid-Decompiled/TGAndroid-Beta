package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class r4 extends g61 {
    public static final int f5863a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        s4 s4Var = (s4) view;
        s4Var.a(h61Var.d, h61Var.f27106z, (k8) h61Var.G);
        s4Var.b(h61Var.f27087e, false);
        boolean z11 = h61Var.f27088f;
        if (s4Var.f5907f != z11) {
            s4Var.f5907f = z11;
            s4Var.E.a(z11);
            s4Var.invalidate();
        }
        s4Var.setOnCheckboxClick(h61Var.D);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new s4(context, d6Var);
    }
}
