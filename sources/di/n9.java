package di;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.qu0;
public final class n9 implements Runnable {
    public final int f9387a;
    public final org.telegram.ui.ActionBar.x2[] f9388b;
    public final Context f9389c;

    public n9(Context context, org.telegram.ui.ActionBar.x2[] x2VarArr) {
        this.f9387a = 0;
        this.f9389c = context;
        this.f9388b = x2VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.x2 x2Var;
        org.telegram.ui.ActionBar.h2 h2Var;
        int i7 = this.f9387a;
        Context context = this.f9389c;
        org.telegram.ui.ActionBar.x2[] x2VarArr = this.f9388b;
        switch (i7) {
            case 0:
                qu0 qu0Var = new qu0(context);
                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(x2VarArr[0].f30213j1) && (x2Var = x2VarArr[0]) != null && (h2Var = x2Var.f30213j1) != null) {
                    qu0Var.a0(h2Var);
                }
                qu0Var.show();
                return;
            case 1:
                x2VarArr[0].dismiss();
                vf.c.t(context, gd.M0(2131752024, null));
                return;
            case 2:
                x2VarArr[0].dismiss();
                vf.c.v(context, gd.M0(2131752019, null), false);
                return;
            default:
                x2VarArr[0].dismiss();
                vf.c.t(context, gd.M0(2131752016, null));
                return;
        }
    }

    public n9(org.telegram.ui.ActionBar.x2[] x2VarArr, Context context, int i7) {
        this.f9387a = i7;
        this.f9388b = x2VarArr;
        this.f9389c = context;
    }
}
