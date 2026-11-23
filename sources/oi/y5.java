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
public final class y5 extends m41 {
    public static final int f22647b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ((a6) view).f((a) n41Var.H, (x5) n41Var.I, n41Var.f37661s);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        a6 a6Var = new a6(context, i6Var);
        a6Var.setBackground(new y1(n6.w0(n6.f29451d6, i6Var)));
        return a6Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
