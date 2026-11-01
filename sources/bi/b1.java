package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class b1 extends a51 {
    public static final int f2857b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        c1 c1Var = (c1) view;
        a aVar = (a) b51Var.G;
        c1Var.f2881a = aVar;
        c1Var.f2888w = (z2) b51Var.H;
        c1Var.f2889x = dd.X;
        c1Var.c(aVar);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new c1(context, p6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
