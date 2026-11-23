package oi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class d0 extends m41 {
    public static final int f22117b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        e0 e0Var = (e0) view;
        a aVar = (a) n41Var.H;
        e0Var.f22598a = aVar;
        e0Var.F = (c0) n41Var.I;
        e0Var.c(aVar);
        e0Var.h();
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        e0 e0Var = new e0(i7, context, i6Var);
        e0Var.setBackground(new y1(n6.w0(n6.f29451d6, i6Var)));
        return e0Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
