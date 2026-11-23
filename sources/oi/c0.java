package oi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class c0 extends n41 {
    public static final int f21990b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        d0 d0Var = (d0) view;
        a aVar = (a) o41Var.H;
        d0Var.f22468a = aVar;
        d0Var.F = (b0) o41Var.I;
        d0Var.c(aVar);
        d0Var.h();
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        d0 d0Var = new d0(i7, context, h6Var);
        d0Var.setBackground(new x1(m6.w0(m6.f29347d6, h6Var)));
        return d0Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
