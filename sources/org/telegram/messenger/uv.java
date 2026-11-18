package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uv implements Runnable {
    public final int f27261a;
    public final xv f27262b;
    public final Context f27263c;
    public final org.telegram.ui.ActionBar.u1 d;

    public uv(xv xvVar, Context context, org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f27261a = i7;
        this.f27262b = xvVar;
        this.f27263c = context;
        this.d = u1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f27261a;
        org.telegram.ui.ActionBar.u1 u1Var = this.d;
        Context context = this.f27263c;
        xv xvVar = this.f27262b;
        switch (i7) {
            case 0:
                xvVar.f28012n = false;
                if (!((Activity) context).isFinishing()) {
                    try {
                        u1Var.dismiss();
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                if (!((Activity) context).isFinishing()) {
                    xvVar.f28012n = false;
                    try {
                        u1Var.dismiss();
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String M0 = gd.M0(2131689472, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f28744a;
                    u1Var2.S = M0;
                    u1Var2.U = gd.M0(2131751739, null);
                    alertDialog$Builder.k(gd.M0(2131747638, null), null);
                    alertDialog$Builder.p().setCanceledOnTouchOutside(true);
                    return;
                }
                return;
        }
    }
}
