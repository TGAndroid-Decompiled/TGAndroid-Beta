package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
public final class i extends f61 {
    static {
        f61.setup(new f61());
    }

    public static g61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        g61 J = g61.J(i.class);
        J.d = i10;
        J.f26687z = i11;
        J.f26673k = i12;
        J.f26674l = charSequence;
        J.f26675m = str;
        return J;
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ((j) view).a(g61Var.f26687z, g61Var.f26673k, g61Var.f26674l, g61Var.f26675m);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new j(context, d6Var);
    }
}
