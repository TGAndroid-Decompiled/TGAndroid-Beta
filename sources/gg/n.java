package gg;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class n extends m41 {

    public static final int f7119a = 0;

    static {
        m41.setup(new n());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        o oVar = (o) view;
        oVar.setUser((TLRPC.User) n41Var.G);
        oVar.c(n41Var.f30838e, false);
        oVar.setDivider(z10);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new o(context, true, false, c6Var, false);
    }
}
