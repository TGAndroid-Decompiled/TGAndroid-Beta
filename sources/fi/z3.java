package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class z3 extends q31 {
    public static final int f13243b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        a4 a4Var = (a4) view;
        a4Var.a(r31Var.d, r31Var.f37611z, (e7) r31Var.G);
        a4Var.b(r31Var.f37592e, false);
        boolean z10 = r31Var.f37593f;
        if (a4Var.h != z10) {
            a4Var.h = z10;
            a4Var.F.a(z10);
            a4Var.invalidate();
        }
        a4Var.setOnCheckboxClick(r31Var.D);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new a4(context, f6Var);
    }
}
