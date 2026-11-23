package di;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.su0;
public final class o9 implements Runnable {
    public final int f9454a;
    public final org.telegram.ui.ActionBar.w2[] f9455b;
    public final Context f9456c;

    public o9(Context context, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f9454a = 0;
        this.f9456c = context;
        this.f9455b = w2VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.w2 w2Var;
        org.telegram.ui.ActionBar.g2 g2Var;
        int i7 = this.f9454a;
        Context context = this.f9456c;
        org.telegram.ui.ActionBar.w2[] w2VarArr = this.f9455b;
        switch (i7) {
            case 0:
                su0 su0Var = new su0(context);
                if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(w2VarArr[0].f30247j1) && (w2Var = w2VarArr[0]) != null && (g2Var = w2Var.f30247j1) != null) {
                    su0Var.a0(g2Var);
                }
                su0Var.show();
                return;
            case 1:
                w2VarArr[0].dismiss();
                vf.c.t(context, gd.N0(2131752023, null));
                return;
            case 2:
                w2VarArr[0].dismiss();
                vf.c.v(context, gd.N0(2131752018, null), false);
                return;
            default:
                w2VarArr[0].dismiss();
                vf.c.t(context, gd.N0(2131752015, null));
                return;
        }
    }

    public o9(org.telegram.ui.ActionBar.w2[] w2VarArr, Context context, int i7) {
        this.f9454a = i7;
        this.f9455b = w2VarArr;
        this.f9456c = context;
    }
}
