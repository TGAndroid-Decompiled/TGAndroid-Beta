package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class u0 extends q31 {
    public static final int f18912b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        v0 v0Var = (v0) view;
        a aVar = (a) r31Var.G;
        v0Var.f18986a = aVar;
        v0Var.f18927w = (q2) r31Var.H;
        v0Var.f18928x = hd.f22871a0;
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
