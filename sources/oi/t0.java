package oi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class t0 extends n41 {
    public static final int f22396b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        u0 u0Var = (u0) view;
        a aVar = (a) o41Var.H;
        u0Var.f22528a = aVar;
        u0Var.f22453w = (r2) o41Var.I;
        u0Var.f22454x = gd.f24241a0;
        u0Var.c(aVar);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new u0(context, h6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
