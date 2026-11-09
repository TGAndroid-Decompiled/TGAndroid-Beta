package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class z3 extends x31 {
    public static final int f13243b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        a4 a4Var = (a4) view;
        a4Var.a(y31Var.d, y31Var.f40581z, (e7) y31Var.G);
        a4Var.b(y31Var.f40562e, false);
        boolean z10 = y31Var.f40563f;
        if (a4Var.h != z10) {
            a4Var.h = z10;
            a4Var.F.a(z10);
            a4Var.invalidate();
        }
        a4Var.setOnCheckboxClick(y31Var.D);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new a4(context, g6Var);
    }
}
