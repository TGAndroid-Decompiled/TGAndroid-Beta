package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class i0 extends z41 {
    public static final int f3067b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        j0 j0Var = (j0) view;
        a aVar = (a) a51Var.G;
        j0Var.f2881a = aVar;
        j0Var.E = (h0) a51Var.H;
        j0Var.c(aVar);
        j0Var.j();
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        j0 j0Var = new j0(i10, context, p6Var);
        j0Var.setBackground(new h2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, p6Var)));
        return j0Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
