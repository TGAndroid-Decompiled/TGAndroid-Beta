package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class u0 extends v31 {
    public static final int f18912b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        v0 v0Var = (v0) view;
        a aVar = (a) w31Var.G;
        v0Var.f18986a = aVar;
        v0Var.f18927w = (q2) w31Var.H;
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
