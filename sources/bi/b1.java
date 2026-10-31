package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class b1 extends z41 {
    public static final int f2857b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        c1 c1Var = (c1) view;
        a aVar = (a) a51Var.G;
        c1Var.f2881a = aVar;
        c1Var.f2888w = (z2) a51Var.H;
        c1Var.f2889x = cd.X;
        c1Var.c(aVar);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new c1(context, p6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
