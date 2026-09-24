package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
public final class r4 extends u51 {
    public static final int f5452a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        s4 s4Var = (s4) view;
        s4Var.a(v51Var.d, v51Var.f29055z, (l8) v51Var.G);
        s4Var.b(v51Var.e, false);
        boolean z11 = v51Var.f29037f;
        if (s4Var.f5486f != z11) {
            s4Var.f5486f = z11;
            s4Var.E.a(z11);
            s4Var.invalidate();
        }
        s4Var.setOnCheckboxClick(v51Var.D);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new s4(context, d6Var);
    }
}
