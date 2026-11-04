package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class o0 extends q31 {
    public static final int f10683b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        ((p0) view).set((u0) r31Var.G);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        p0 p0Var = new p0(i3, context, false);
        p0Var.setLayoutParams(new u4.p0(-2, -2));
        return p0Var;
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.G == r31Var2.G) {
            return true;
        }
        return false;
    }
}
