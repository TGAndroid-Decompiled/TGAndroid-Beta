package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class q0 extends a41 {
    public static final int f12220b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ((r0) view).set((t0) b41Var.G);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new r0(context);
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        if (b41Var.G == b41Var2.G) {
            return true;
        }
        return false;
    }
}
