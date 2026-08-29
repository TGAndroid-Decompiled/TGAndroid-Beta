package eh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class e extends v41 {
    public static final int f6217a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        ig.c cVar = (ig.c) view;
        cVar.f8969s = (TLRPC.TL_help_country) w41Var.G;
        cVar.f();
        cVar.setDivider(z10);
        cVar.c(w41Var.f34294e, false);
    }

    @Override
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        return w41Var.H(w41Var2);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        ig.c cVar = new ig.c(context, c6Var);
        cVar.setBackground(null);
        return cVar;
    }

    @Override
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        return w41Var.I(w41Var2);
    }
}
