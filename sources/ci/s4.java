package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
public final class s4 extends w51 {
    public static final int f5511a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        t4 t4Var = (t4) view;
        t4Var.a(x51Var.d, x51Var.f30261z, (o8) x51Var.G);
        t4Var.b(x51Var.e, false);
        boolean z11 = x51Var.f30243f;
        if (t4Var.f5561f != z11) {
            t4Var.f5561f = z11;
            t4Var.E.a(z11);
            t4Var.invalidate();
        }
        t4Var.setOnCheckboxClick(x51Var.D);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new t4(context, e6Var);
    }
}
