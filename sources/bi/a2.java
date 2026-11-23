package bi;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class a2 extends m41 {
    public static final int f3349b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ah.r rVar = (ah.r) view;
        rVar.setUser((TLRPC.User) n41Var.H);
        rVar.c(n41Var.f37648e, false);
        rVar.setDivider(z10);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        ah.r rVar = new ah.r(context, false, true, i6Var, false);
        rVar.setCellBackgroundVisible(false);
        return rVar;
    }
}
