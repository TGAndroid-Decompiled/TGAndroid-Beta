package ah;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class q extends a41 {
    public static final int f1107b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        r rVar = (r) view;
        rVar.setUser((TLRPC.User) b41Var.G);
        rVar.c(b41Var.f33178e, false);
        rVar.setDivider(z10);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new r(context, true, false, e6Var, false);
    }
}
