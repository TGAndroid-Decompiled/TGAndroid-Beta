package oi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class q0 extends n41 {
    public static final int f22282b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ((r0) view).f22303c = (a) o41Var.H;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new r0(context, h6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
