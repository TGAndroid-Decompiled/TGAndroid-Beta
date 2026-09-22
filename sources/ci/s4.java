package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
public final class s4 extends h51 {
    public static final int f5508a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        t4 t4Var = (t4) view;
        t4Var.a(i51Var.d, i51Var.f24913z, (o8) i51Var.G);
        t4Var.b(i51Var.e, false);
        boolean z11 = i51Var.f24895f;
        if (t4Var.f5558f != z11) {
            t4Var.f5558f = z11;
            t4Var.E.a(z11);
            t4Var.invalidate();
        }
        t4Var.setOnCheckboxClick(i51Var.D);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new t4(context, e6Var);
    }
}
