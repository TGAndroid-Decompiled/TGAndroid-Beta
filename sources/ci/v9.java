package ci;

import android.content.Context;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.gu0;
public final class v9 implements Runnable {
    public final int f6209a;
    public final org.telegram.ui.ActionBar.t2[] f6210b;
    public final Context f6211c;

    public v9(Context context, org.telegram.ui.ActionBar.t2[] t2VarArr) {
        this.f6209a = 0;
        this.f6211c = context;
        this.f6210b = t2VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.t2 t2Var;
        org.telegram.ui.ActionBar.d2 d2Var;
        int i3 = this.f6209a;
        Context context = this.f6211c;
        org.telegram.ui.ActionBar.t2[] t2VarArr = this.f6210b;
        switch (i3) {
            case 0:
                gu0 gu0Var = new gu0(context);
                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(t2VarArr[0].f28601g1) && (t2Var = t2VarArr[0]) != null && (d2Var = t2Var.f28601g1) != null) {
                    gu0Var.a0(d2Var);
                }
                gu0Var.show();
                return;
            case 1:
                t2VarArr[0].dismiss();
                sf.c.t(context, bd.M0(2131752035, null));
                return;
            case 2:
                t2VarArr[0].dismiss();
                sf.c.v(context, bd.M0(2131752030, null), false);
                return;
            default:
                t2VarArr[0].dismiss();
                sf.c.t(context, bd.M0(2131752027, null));
                return;
        }
    }

    public v9(org.telegram.ui.ActionBar.t2[] t2VarArr, Context context, int i3) {
        this.f6209a = i3;
        this.f6210b = t2VarArr;
        this.f6211c = context;
    }
}
