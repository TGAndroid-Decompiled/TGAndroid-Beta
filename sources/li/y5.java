package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class y5 extends q31 {
    public static final int f19031b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        ((a6) view).f((a) r31Var.G, (x5) r31Var.H, r31Var.f37604r);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        a6 a6Var = new a6(context, f6Var);
        a6Var.setBackground(new y1(k6.w0(k6.f27848d6, f6Var)));
        return a6Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
