package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class z3 extends w31 {
    public static final int f13243b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        a4 a4Var = (a4) view;
        a4Var.a(x31Var.d, x31Var.f40172z, (e7) x31Var.G);
        a4Var.b(x31Var.f40153e, false);
        boolean z10 = x31Var.f40154f;
        if (a4Var.h != z10) {
            a4Var.h = z10;
            a4Var.F.a(z10);
            a4Var.invalidate();
        }
        a4Var.setOnCheckboxClick(x31Var.D);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new a4(context, f6Var);
    }
}
