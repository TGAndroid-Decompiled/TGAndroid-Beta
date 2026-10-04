package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
public final class r4 extends f61 {
    public static final int f5863a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        s4 s4Var = (s4) view;
        s4Var.a(g61Var.d, g61Var.f26687z, (k8) g61Var.G);
        s4Var.b(g61Var.f26668e, false);
        boolean z11 = g61Var.f26669f;
        if (s4Var.f5907f != z11) {
            s4Var.f5907f = z11;
            s4Var.E.a(z11);
            s4Var.invalidate();
        }
        s4Var.setOnCheckboxClick(g61Var.D);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new s4(context, d6Var);
    }
}
