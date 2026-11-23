package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uv implements Runnable {
    public final int f27365a;
    public final xv f27366b;
    public final Context f27367c;
    public final org.telegram.ui.ActionBar.t1 d;

    public uv(xv xvVar, Context context, org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f27365a = i7;
        this.f27366b = xvVar;
        this.f27367c = context;
        this.d = t1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f27365a;
        org.telegram.ui.ActionBar.t1 t1Var = this.d;
        Context context = this.f27367c;
        xv xvVar = this.f27366b;
        switch (i7) {
            case 0:
                xvVar.f28128n = false;
                if (!((Activity) context).isFinishing()) {
                    try {
                        t1Var.dismiss();
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                if (!((Activity) context).isFinishing()) {
                    xvVar.f28128n = false;
                    try {
                        t1Var.dismiss();
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String N0 = gd.N0(2131689472, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28835a;
                    t1Var2.S = N0;
                    t1Var2.U = gd.N0(2131751738, null);
                    alertDialog$Builder.k(gd.N0(2131747637, null), null);
                    alertDialog$Builder.p().setCanceledOnTouchOutside(true);
                    return;
                }
                return;
        }
    }
}
