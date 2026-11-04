package mi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class e0 extends q31 {
    public static final int f19568b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        f0 f0Var = (f0) view;
        a aVar = (a) r31Var.G;
        f0Var.f20029a = aVar;
        f0Var.F = (d0) r31Var.H;
        f0Var.c(aVar);
        f0Var.h();
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        f0 f0Var = new f0(i3, context, e6Var);
        f0Var.setBackground(new z1(k6.w0(k6.f27878d6, e6Var)));
        return f0Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
