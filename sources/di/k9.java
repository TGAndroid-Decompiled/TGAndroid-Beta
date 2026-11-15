package di;

import android.content.Context;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.iu0;
public final class k9 implements Runnable {
    public final int f8924a;
    public final org.telegram.ui.ActionBar.u2[] f8925b;
    public final Context f8926c;

    public k9(Context context, org.telegram.ui.ActionBar.u2[] u2VarArr) {
        this.f8924a = 0;
        this.f8926c = context;
        this.f8925b = u2VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.u2 u2Var;
        org.telegram.ui.ActionBar.e2 e2Var;
        int i7 = this.f8924a;
        Context context = this.f8926c;
        org.telegram.ui.ActionBar.u2[] u2VarArr = this.f8925b;
        switch (i7) {
            case 0:
                iu0 iu0Var = new iu0(context);
                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(u2VarArr[0].f29703j1) && (u2Var = u2VarArr[0]) != null && (e2Var = u2Var.f29703j1) != null) {
                    iu0Var.a0(e2Var);
                }
                iu0Var.show();
                return;
            case 1:
                u2VarArr[0].dismiss();
                vf.c.t(context, hd.M0(2131752035, null));
                return;
            case 2:
                u2VarArr[0].dismiss();
                vf.c.v(context, hd.M0(2131752030, null), false);
                return;
            default:
                u2VarArr[0].dismiss();
                vf.c.t(context, hd.M0(2131752027, null));
                return;
        }
    }

    public k9(org.telegram.ui.ActionBar.u2[] u2VarArr, Context context, int i7) {
        this.f8924a = i7;
        this.f8925b = u2VarArr;
        this.f8926c = context;
    }
}
