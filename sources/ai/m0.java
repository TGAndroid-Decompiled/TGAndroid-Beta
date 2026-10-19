package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public final class m0 extends f61 {
    static {
        f61.setup(new f61());
    }

    public static g61 a(String str, CharSequence charSequence, int i10) {
        g61 J = g61.J(m0.class);
        J.f44289b = false;
        J.f26510z = i10;
        J.f26497l = str;
        J.f26498m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        ((n0) view).a(g61Var.f26497l, g61Var.f26498m, g61Var.f26510z);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new n0(context, 0, d6Var);
    }
}
