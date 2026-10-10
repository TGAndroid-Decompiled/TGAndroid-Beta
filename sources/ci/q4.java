package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class q4 extends p61 {
    public static final int f5786a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        r4 r4Var = (r4) view;
        r4Var.a(q61Var.d, q61Var.f30076z, (l8) q61Var.G);
        r4Var.b(q61Var.f30057e, false);
        boolean z11 = q61Var.f30058f;
        if (r4Var.f5898f != z11) {
            r4Var.f5898f = z11;
            r4Var.E.a(z11);
            r4Var.invalidate();
        }
        r4Var.setOnCheckboxClick(q61Var.D);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new r4(context, e6Var);
    }
}
