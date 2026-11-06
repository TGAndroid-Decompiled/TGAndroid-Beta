package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class y5 extends w31 {
    public static final int f19031b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        ((a6) view).f((a) x31Var.G, (x5) x31Var.H, x31Var.f40165r);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        a6 a6Var = new a6(context, f6Var);
        a6Var.setBackground(new y1(k6.w0(k6.f27849d6, f6Var)));
        return a6Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
