package oi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class c0 extends a41 {
    public static final int f21603b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        d0 d0Var = (d0) view;
        a aVar = (a) b41Var.G;
        d0Var.f22106a = aVar;
        d0Var.F = (b0) b41Var.H;
        d0Var.c(aVar);
        d0Var.h();
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        d0 d0Var = new d0(i7, context, e6Var);
        d0Var.setBackground(new w1(j6.w0(j6.f28849d6, e6Var)));
        return d0Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
