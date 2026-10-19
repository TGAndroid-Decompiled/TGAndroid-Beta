package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public final class h extends f61 {
    static {
        f61.setup(new f61());
    }

    public static g61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        g61 J = g61.J(h.class);
        J.d = i10;
        J.f26510z = i11;
        J.f26496k = i12;
        J.f26497l = charSequence;
        J.f26498m = str;
        return J;
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        ((i) view).a(g61Var.f26510z, g61Var.f26496k, g61Var.f26497l, g61Var.f26498m);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new i(context, d6Var);
    }
}
