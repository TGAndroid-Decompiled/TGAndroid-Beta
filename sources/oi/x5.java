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
public final class x5 extends n41 {
    public static final int f22517b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ((z5) view).f((a) o41Var.H, (w5) o41Var.I, o41Var.f38064s);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        z5 z5Var = new z5(context, h6Var);
        z5Var.setBackground(new x1(m6.w0(m6.f29347d6, h6Var)));
        return z5Var;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
