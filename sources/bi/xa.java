package bi;

import android.content.Context;
import org.telegram.ui.Components.hu0;
public final class xa implements Runnable {
    public final int f5044a;
    public final org.telegram.ui.ActionBar.v2[] f5045b;
    public final Context f5046c;

    public xa(Context context, org.telegram.ui.ActionBar.v2[] v2VarArr) {
        this.f5044a = 0;
        this.f5046c = context;
        this.f5045b = v2VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.v2 v2Var;
        org.telegram.ui.ActionBar.f2 f2Var;
        int i7 = this.f5044a;
        Context context = this.f5046c;
        org.telegram.ui.ActionBar.v2[] v2VarArr = this.f5045b;
        switch (i7) {
            case 0:
                hu0 hu0Var = new hu0(context);
                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(v2VarArr[0].f28632f1) && (v2Var = v2VarArr[0]) != null && (f2Var = v2Var.f28632f1) != null) {
                    hu0Var.a0(f2Var);
                }
                hu0Var.show();
                return;
            case 1:
                v2VarArr[0].dismiss();
                vf.c.t(context, org.telegram.messenger.id.M0(2131752035, null));
                return;
            case 2:
                v2VarArr[0].dismiss();
                vf.c.v(context, org.telegram.messenger.id.M0(2131752030, null), false);
                return;
            default:
                v2VarArr[0].dismiss();
                vf.c.t(context, org.telegram.messenger.id.M0(2131752027, null));
                return;
        }
    }

    public xa(org.telegram.ui.ActionBar.v2[] v2VarArr, Context context, int i7) {
        this.f5044a = i7;
        this.f5045b = v2VarArr;
        this.f5046c = context;
    }
}
