package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
public class pu6 extends tf3 {
    public boolean B0 = false;
    public ep C0;
    public dw6 D0;

    public pu6() {
        this.r0 = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override
    public final Dialog P() {
        if (this.B0) {
            lv6 lv6Var = new lv6(n());
            this.C0 = lv6Var;
            Q();
            lv6Var.f(this.D0);
        } else {
            ou6 ou6Var = new ou6(n());
            this.C0 = ou6Var;
            Q();
            ou6Var.h(this.D0);
        }
        return this.C0;
    }

    public final void Q() {
        dw6 dw6Var = this.D0;
        if (dw6Var == null) {
            Bundle bundle = this.f;
            if (bundle != null) {
                dw6Var = dw6.b(bundle.getBundle("selector"));
                this.D0 = dw6Var;
            }
            if (dw6Var == null) {
                this.D0 = dw6.c;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int a;
        this.V = true;
        ep epVar = this.C0;
        if (epVar == null) {
            return;
        }
        int i = -2;
        if (this.B0) {
            lv6 lv6Var = (lv6) epVar;
            Context context = lv6Var.n;
            if (!context.getResources().getBoolean(2131034115)) {
                a = -1;
            } else {
                a = mte.a(context);
            }
            if (!context.getResources().getBoolean(2131034115)) {
                i = -1;
            }
            lv6Var.getWindow().setLayout(a, i);
            return;
        }
        ou6 ou6Var = (ou6) epVar;
        ou6Var.getWindow().setLayout(mte.a(ou6Var.getContext()), -2);
    }
}
