package bh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class i extends k41 {
    public static final int f2033a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        fg.c cVar = (fg.c) view;
        cVar.f6279s = (TLRPC.TL_help_country) l41Var.G;
        cVar.f();
        cVar.setDivider(z10);
        cVar.c(l41Var.f30333e, false);
    }

    @Override
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        return l41Var.H(l41Var2);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        fg.c cVar = new fg.c(context, b6Var);
        cVar.setBackground(null);
        return cVar;
    }

    @Override
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        return l41Var.I(l41Var2);
    }
}
