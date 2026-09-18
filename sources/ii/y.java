package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
public final class y extends w51 {
    public static final int f11771a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        ((z) view).i((a) x51Var.G, (q3) x51Var.H);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        z zVar = new z(context, i10, e6Var);
        zVar.setBackground(new a2(j6.v0(j6.f19062d6, e6Var)));
        return zVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
