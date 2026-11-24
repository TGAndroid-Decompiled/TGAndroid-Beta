package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
public class ks6 extends ze3 {
    public boolean B0 = false;
    public dp C0;
    public yt6 D0;

    public ks6() {
        this.r0 = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override
    public final Dialog P() {
        if (this.B0) {
            gt6 gt6Var = new gt6(n());
            this.C0 = gt6Var;
            Q();
            gt6Var.f(this.D0);
        } else {
            js6 js6Var = new js6(n());
            this.C0 = js6Var;
            Q();
            js6Var.h(this.D0);
        }
        return this.C0;
    }

    public final void Q() {
        yt6 yt6Var = this.D0;
        if (yt6Var == null) {
            Bundle bundle = this.f;
            if (bundle != null) {
                yt6Var = yt6.b(bundle.getBundle("selector"));
                this.D0 = yt6Var;
            }
            if (yt6Var == null) {
                this.D0 = yt6.c;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int a;
        this.V = true;
        dp dpVar = this.C0;
        if (dpVar == null) {
            return;
        }
        int i = -2;
        if (this.B0) {
            gt6 gt6Var = (gt6) dpVar;
            Context context = gt6Var.n;
            if (!context.getResources().getBoolean(2131034115)) {
                a = -1;
            } else {
                a = roe.a(context);
            }
            if (!context.getResources().getBoolean(2131034115)) {
                i = -1;
            }
            gt6Var.getWindow().setLayout(a, i);
            return;
        }
        js6 js6Var = (js6) dpVar;
        js6Var.getWindow().setLayout(roe.a(js6Var.getContext()), -2);
    }
}
