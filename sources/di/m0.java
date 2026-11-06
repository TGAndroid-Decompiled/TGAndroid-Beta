package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class m0 extends w31 {
    public static final int f9342b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        ((n0) view).set((s0) x31Var.G);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        n0 n0Var = new n0(i7, context, false);
        n0Var.setLayoutParams(new v4.o0(-2, -2));
        return n0Var;
    }

    @Override
    public final boolean e(x31 x31Var, x31 x31Var2) {
        if (x31Var.G == x31Var2.G) {
            return true;
        }
        return false;
    }
}
