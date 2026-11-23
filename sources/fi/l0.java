package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class l0 extends m41 {
    public static final int f12209b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ((m0) view).set((r0) n41Var.H);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        m0 m0Var = new m0(i7, context, false);
        m0Var.setLayoutParams(new v4.q0(-2, -2));
        return m0Var;
    }

    @Override
    public final boolean e(n41 n41Var, n41 n41Var2) {
        if (n41Var.H == n41Var2.H) {
            return true;
        }
        return false;
    }
}
