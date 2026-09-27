package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class c6 extends w51 {
    public static final int f11286a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        ((e6) view).g((a) x51Var.G, (b6) x51Var.H, x51Var.f30308r);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        e6 e6Var2 = new e6(context, e6Var);
        e6Var2.setBackground(new b2(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19057d6, e6Var)));
        return e6Var2;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
