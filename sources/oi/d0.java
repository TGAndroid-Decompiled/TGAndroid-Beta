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
public final class d0 extends n41 {
    public static final int f22048b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        e0 e0Var = (e0) view;
        a aVar = (a) o41Var.H;
        e0Var.f22528a = aVar;
        e0Var.F = (c0) o41Var.I;
        e0Var.c(aVar);
        e0Var.h();
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        e0 e0Var = new e0(i7, context, h6Var);
        e0Var.setBackground(new y1(m6.w0(m6.f29378d6, h6Var)));
        return e0Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
