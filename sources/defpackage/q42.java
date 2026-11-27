package defpackage;

import android.content.Context;
import android.widget.TextView;
public final class q42 extends wc6 {
    public final byte E = 0;
    public final fn7 F;

    public q42(uc6 uc6Var, Context context, vnb vnbVar, boolean z) {
        super(vnbVar, context, false, z);
        this.F = uc6Var;
    }

    @Override
    public final void f() {
        byte b = this.E;
        fn7 fn7Var = this.F;
        switch (b) {
            case 0:
                s42 s42Var = (s42) fn7Var;
                q42 q42Var = s42Var.O;
                s7 s7Var = s42Var.x;
                if (s7Var != null) {
                    s7Var.setShowSearchProgress(q42Var.w);
                }
                TextView textView = s42Var.w;
                if (textView != null) {
                    textView.setText(ob6.a0(null, null, 2131747896, q42Var.h));
                }
                super.f();
                return;
            default:
                uc6 uc6Var = (uc6) fn7Var;
                sla slaVar = uc6Var.r;
                if (slaVar != null) {
                    slaVar.setShowSearchProgress(uc6Var.T.w);
                }
                TextView textView2 = uc6Var.n;
                if (textView2 != null) {
                    textView2.setText(ob6.a0(null, null, 2131747896, uc6Var.T.h));
                }
                super.f();
                return;
        }
    }

    public q42(s42 s42Var, Context context, vnb vnbVar, boolean z) {
        super(vnbVar, context, z, false);
        this.F = s42Var;
    }
}
