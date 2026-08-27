package ch;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class g extends m41 {

    public static final int f2914a = 0;

    static {
        m41.setup(new g());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        gg.c cVar = (gg.c) view;
        cVar.f7079s = (TLRPC.TL_help_country) n41Var.G;
        cVar.f();
        cVar.setDivider(z10);
        cVar.c(n41Var.f30838e, false);
    }

    @Override
    public final boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return n41Var.H(n41Var2);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        gg.c cVar = new gg.c(context, c6Var);
        cVar.setBackground(null);
        return cVar;
    }

    @Override
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.I(n41Var2);
    }
}
