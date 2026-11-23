package oi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class t0 extends m41 {
    public static final int f22466b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        u0 u0Var = (u0) view;
        a aVar = (a) n41Var.H;
        u0Var.f22598a = aVar;
        u0Var.f22523w = (r2) n41Var.I;
        u0Var.f22524x = gd.f24314a0;
        u0Var.c(aVar);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new u0(context, i6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
