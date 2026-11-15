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
public final class w5 extends a41 {
    public static final int f22105b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ((y5) view).f((a) b41Var.G, (v5) b41Var.H, b41Var.f33187r);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        y5 y5Var = new y5(context, e6Var);
        y5Var.setBackground(new w1(j6.w0(j6.f28849d6, e6Var)));
        return y5Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
