package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class j4 extends l61 {
    public static final int f9255a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        k4 k4Var = (k4) view;
        k4Var.a(m61Var.d, m61Var.f28572z, (a8) m61Var.G);
        k4Var.b(m61Var.e, false);
        boolean z11 = m61Var.f28554f;
        if (k4Var.h != z11) {
            k4Var.h = z11;
            k4Var.F.a(z11);
            k4Var.invalidate();
        }
        k4Var.setOnCheckboxClick(m61Var.D);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new k4(context, g6Var);
    }
}
