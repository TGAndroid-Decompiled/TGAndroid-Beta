package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vv implements Runnable {
    public final int f27589a;
    public final yv f27590b;
    public final Context f27591c;
    public final org.telegram.ui.ActionBar.t1 d;

    public vv(yv yvVar, Context context, org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f27589a = i7;
        this.f27590b = yvVar;
        this.f27591c = context;
        this.d = t1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f27589a;
        org.telegram.ui.ActionBar.t1 t1Var = this.d;
        Context context = this.f27591c;
        yv yvVar = this.f27590b;
        switch (i7) {
            case 0:
                yvVar.f28188n = false;
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
                    yvVar.f28188n = false;
                    try {
                        t1Var.dismiss();
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String N0 = hd.N0(2131689472, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28743a;
                    t1Var2.S = N0;
                    t1Var2.U = hd.N0(2131751738, null);
                    alertDialog$Builder.k(hd.N0(2131747637, null), null);
                    alertDialog$Builder.p().setCanceledOnTouchOutside(true);
                    return;
                }
                return;
        }
    }
}
