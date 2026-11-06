package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class q0 extends v31 {
    public static final int f9621b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        ((r0) view).set((t0) w31Var.G);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new r0(context);
    }

    @Override
    public final boolean e(w31 w31Var, w31 w31Var2) {
        if (w31Var.G == w31Var2.G) {
            return true;
        }
        return false;
    }
}
