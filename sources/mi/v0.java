package mi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class v0 extends q31 {
    public static final int f19976b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        w0 w0Var = (w0) view;
        a aVar = (a) r31Var.G;
        w0Var.f20029a = aVar;
        w0Var.f19991w = (r2) r31Var.H;
        w0Var.f19992x = bd.f21784a0;
        w0Var.c(aVar);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new w0(context, e6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
