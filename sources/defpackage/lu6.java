package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
public class lu6 extends mg3 {
    public boolean B0 = false;
    public dq C0;
    public yv6 D0;

    public lu6() {
        this.r0 = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override
    public final Dialog P() {
        if (this.B0) {
            gv6 gv6Var = new gv6(n());
            this.C0 = gv6Var;
            Q();
            gv6Var.f(this.D0);
        } else {
            ku6 ku6Var = new ku6(n());
            this.C0 = ku6Var;
            Q();
            ku6Var.h(this.D0);
        }
        return this.C0;
    }

    public final void Q() {
        yv6 yv6Var = this.D0;
        if (yv6Var == null) {
            Bundle bundle = this.f;
            if (bundle != null) {
                yv6Var = yv6.b(bundle.getBundle("selector"));
                this.D0 = yv6Var;
            }
            if (yv6Var == null) {
                this.D0 = yv6.c;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int a;
        this.V = true;
        dq dqVar = this.C0;
        if (dqVar == null) {
            return;
        }
        int i = -2;
        if (this.B0) {
            gv6 gv6Var = (gv6) dqVar;
            Context context = gv6Var.n;
            if (!context.getResources().getBoolean(2131034115)) {
                a = -1;
            } else {
                a = uqe.a(context);
            }
            if (!context.getResources().getBoolean(2131034115)) {
                i = -1;
            }
            gv6Var.getWindow().setLayout(a, i);
            return;
        }
        ku6 ku6Var = (ku6) dqVar;
        ku6Var.getWindow().setLayout(uqe.a(ku6Var.getContext()), -2);
    }
}
