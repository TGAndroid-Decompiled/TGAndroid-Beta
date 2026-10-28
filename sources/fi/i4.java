package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class i4 extends t61 {
    public static final int f10992a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        j4 j4Var = (j4) view;
        j4Var.a(u61Var.d, u61Var.f33262z, (w7) u61Var.G);
        j4Var.b(u61Var.e, false);
        boolean z11 = u61Var.f33244f;
        if (j4Var.h != z11) {
            j4Var.h = z11;
            j4Var.F.a(z11);
            j4Var.invalidate();
        }
        j4Var.setOnCheckboxClick(u61Var.D);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new j4(context, u6Var);
    }
}
