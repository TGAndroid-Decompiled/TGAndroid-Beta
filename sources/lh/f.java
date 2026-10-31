package lh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class f extends z41 {
    public static final int f12015b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        qg.b bVar = (qg.b) view;
        bVar.f45522w = (TLRPC.TL_help_country) a51Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(a51Var.e, false);
    }

    @Override
    public final boolean c(a51 a51Var, a51 a51Var2) {
        return a51Var.I(a51Var2);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        qg.b bVar = new qg.b(context, p6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean e(a51 a51Var, a51 a51Var2) {
        return a51Var.J(a51Var2);
    }
}
