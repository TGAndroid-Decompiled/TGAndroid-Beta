package oi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class q0 extends k41 {
    public static final int f22252b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ((r0) view).f22272c = (a) l41Var.H;
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new r0(context, i6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
