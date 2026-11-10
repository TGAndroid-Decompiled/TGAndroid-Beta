package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class q0 extends w31 {
    public static final int f9567b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((r0) view).set((t0) x31Var.G);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new r0(context);
    }

    @Override
    public final boolean e(x31 x31Var, x31 x31Var2) {
        if (x31Var.G == x31Var2.G) {
            return true;
        }
        return false;
    }
}
