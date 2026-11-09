package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class q0 extends x31 {
    public static final int f9562b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((r0) view).set((t0) y31Var.G);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new r0(context);
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        if (y31Var.G == y31Var2.G) {
            return true;
        }
        return false;
    }
}
