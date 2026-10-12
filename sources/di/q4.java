package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class q4 extends k61 {
    public static final int f7643a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        r4 r4Var = (r4) view;
        r4Var.a(l61Var.d, l61Var.f26967z, (k8) l61Var.G);
        r4Var.b(l61Var.e, false);
        boolean z11 = l61Var.f26949f;
        if (r4Var.f7702f != z11) {
            r4Var.f7702f = z11;
            r4Var.E.a(z11);
            r4Var.invalidate();
        }
        r4Var.setOnCheckboxClick(l61Var.D);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new r4(context, c6Var);
    }
}
