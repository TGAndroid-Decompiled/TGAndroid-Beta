package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class u0 extends w31 {
    public static final int f18912b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        v0 v0Var = (v0) view;
        a aVar = (a) x31Var.G;
        v0Var.f18986a = aVar;
        v0Var.f18927w = (q2) x31Var.H;
        v0Var.f18928x = hd.f22878a0;
        v0Var.c(aVar);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new v0(context, f6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
