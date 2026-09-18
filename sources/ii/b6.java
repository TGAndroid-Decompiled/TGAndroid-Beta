package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
public final class b6 extends w51 {
    public static final int f11271a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        ((d6) view).g((a) x51Var.G, (a6) x51Var.H, x51Var.f30254r);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        d6 d6Var = new d6(context, e6Var);
        d6Var.setBackground(new a2(j6.v0(j6.f19062d6, e6Var)));
        return d6Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
