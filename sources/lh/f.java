package lh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class f extends a51 {
    public static final int f12016b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        qg.b bVar = (qg.b) view;
        bVar.f45533w = (TLRPC.TL_help_country) b51Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(b51Var.e, false);
    }

    @Override
    public final boolean c(b51 b51Var, b51 b51Var2) {
        return b51Var.I(b51Var2);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        qg.b bVar = new qg.b(context, p6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean e(b51 b51Var, b51 b51Var2) {
        return b51Var.J(b51Var2);
    }
}
