package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class i4 extends s61 {
    public static final int f10993a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        j4 j4Var = (j4) view;
        j4Var.a(t61Var.d, t61Var.f32885z, (w7) t61Var.G);
        j4Var.b(t61Var.e, false);
        boolean z11 = t61Var.f32867f;
        if (j4Var.h != z11) {
            j4Var.h = z11;
            j4Var.F.a(z11);
            j4Var.invalidate();
        }
        j4Var.setOnCheckboxClick(t61Var.D);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new j4(context, u6Var);
    }
}
