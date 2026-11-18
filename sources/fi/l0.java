package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class l0 extends k41 {
    public static final int f12202b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ((m0) view).set((r0) l41Var.H);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        m0 m0Var = new m0(i7, context, false);
        m0Var.setLayoutParams(new v4.q0(-2, -2));
        return m0Var;
    }

    @Override
    public final boolean e(l41 l41Var, l41 l41Var2) {
        if (l41Var.H == l41Var2.H) {
            return true;
        }
        return false;
    }
}
