package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class z3 extends w31 {
    public static final int f13245b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        a4 a4Var = (a4) view;
        a4Var.a(x31Var.d, x31Var.f40169z, (e7) x31Var.G);
        a4Var.b(x31Var.f40150e, false);
        boolean z10 = x31Var.f40151f;
        if (a4Var.h != z10) {
            a4Var.h = z10;
            a4Var.F.a(z10);
            a4Var.invalidate();
        }
        a4Var.setOnCheckboxClick(x31Var.D);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new a4(context, h6Var);
    }
}
