package bi;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class v1 extends k41 {
    public static final int f4130b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ah.r rVar = (ah.r) view;
        rVar.setUser((TLRPC.User) l41Var.H);
        rVar.c(l41Var.f37011e, false);
        rVar.setDivider(z10);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        ah.r rVar = new ah.r(context, false, true, i6Var, false);
        rVar.setCellBackgroundVisible(false);
        return rVar;
    }
}
