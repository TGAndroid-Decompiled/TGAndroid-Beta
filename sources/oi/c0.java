package oi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class c0 extends k41 {
    public static final int f21964b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        d0 d0Var = (d0) view;
        a aVar = (a) l41Var.H;
        d0Var.f22442a = aVar;
        d0Var.F = (b0) l41Var.I;
        d0Var.c(aVar);
        d0Var.h();
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        d0 d0Var = new d0(i7, context, i6Var);
        d0Var.setBackground(new w1(n6.w0(n6.f29396d6, i6Var)));
        return d0Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
