package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class q0 extends q31 {
    public static final int f9621b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        ((r0) view).set((t0) r31Var.G);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new r0(context);
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.G == r31Var2.G) {
            return true;
        }
        return false;
    }
}
