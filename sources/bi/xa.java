package bi;

import android.content.Context;
import org.telegram.ui.Components.iu0;
public final class xa implements Runnable {
    public final int f5047a;
    public final org.telegram.ui.ActionBar.w2[] f5048b;
    public final Context f5049c;

    public xa(Context context, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f5047a = 0;
        this.f5049c = context;
        this.f5048b = w2VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.w2 w2Var;
        org.telegram.ui.ActionBar.f2 f2Var;
        int i7 = this.f5047a;
        Context context = this.f5049c;
        org.telegram.ui.ActionBar.w2[] w2VarArr = this.f5048b;
        switch (i7) {
            case 0:
                iu0 iu0Var = new iu0(context);
                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(w2VarArr[0].f28691i1) && (w2Var = w2VarArr[0]) != null && (f2Var = w2Var.f28691i1) != null) {
                    iu0Var.a0(f2Var);
                }
                iu0Var.show();
                return;
            case 1:
                w2VarArr[0].dismiss();
                vf.c.t(context, org.telegram.messenger.id.M0(2131752035, null));
                return;
            case 2:
                w2VarArr[0].dismiss();
                vf.c.v(context, org.telegram.messenger.id.M0(2131752030, null), false);
                return;
            default:
                w2VarArr[0].dismiss();
                vf.c.t(context, org.telegram.messenger.id.M0(2131752027, null));
                return;
        }
    }

    public xa(org.telegram.ui.ActionBar.w2[] w2VarArr, Context context, int i7) {
        this.f5047a = i7;
        this.f5048b = w2VarArr;
        this.f5049c = context;
    }
}
