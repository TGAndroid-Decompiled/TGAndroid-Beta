package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class s4 extends g51 {
    public static final int f8119a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        t4 t4Var = (t4) view;
        t4Var.a(h51Var.d, h51Var.f26607z, (o8) h51Var.G);
        t4Var.b(h51Var.f26588e, false);
        boolean z11 = h51Var.f26589f;
        if (t4Var.f8183f != z11) {
            t4Var.f8183f = z11;
            t4Var.E.a(z11);
            t4Var.invalidate();
        }
        t4Var.setOnCheckboxClick(h51Var.D);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new t4(context, f6Var);
    }
}
