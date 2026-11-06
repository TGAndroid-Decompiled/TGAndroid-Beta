package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class z3 extends v31 {
    public static final int f13243b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        a4 a4Var = (a4) view;
        a4Var.a(w31Var.d, w31Var.f39843z, (e7) w31Var.G);
        a4Var.b(w31Var.f39824e, false);
        boolean z10 = w31Var.f39825f;
        if (a4Var.h != z10) {
            a4Var.h = z10;
            a4Var.F.a(z10);
            a4Var.invalidate();
        }
        a4Var.setOnCheckboxClick(w31Var.D);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new a4(context, f6Var);
    }
}
