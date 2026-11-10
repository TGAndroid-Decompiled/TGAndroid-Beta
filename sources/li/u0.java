package li;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class u0 extends w31 {
    public static final int f18918b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        v0 v0Var = (v0) view;
        a aVar = (a) x31Var.G;
        v0Var.f18994a = aVar;
        v0Var.f18935w = (q2) x31Var.H;
        v0Var.f18936x = id.f23161a0;
        v0Var.c(aVar);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new v0(context, h6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
