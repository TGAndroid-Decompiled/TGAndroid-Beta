package bh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class o extends q31 {
    public static final int f3346b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        p pVar = (p) view;
        pVar.setUser((TLRPC.User) r31Var.G);
        pVar.c(r31Var.f37621e, false);
        pVar.setDivider(z10);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        return new p(context, true, false, e6Var, false);
    }
}
