package ah;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class q extends v31 {
    public static final int f1109b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        r rVar = (r) view;
        rVar.setUser((TLRPC.User) w31Var.G);
        rVar.c(w31Var.f39824e, false);
        rVar.setDivider(z9);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new r(context, true, false, f6Var, false);
    }
}
