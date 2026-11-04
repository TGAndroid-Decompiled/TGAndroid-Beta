package mi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class z5 extends q31 {
    public static final int f20098b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        ((b6) view).f((a) r31Var.G, (y5) r31Var.H, r31Var.f37633r);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        b6 b6Var = new b6(context, e6Var);
        b6Var.setBackground(new z1(k6.w0(k6.f27878d6, e6Var)));
        return b6Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
