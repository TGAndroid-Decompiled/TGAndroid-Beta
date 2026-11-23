package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vv implements Runnable {
    public final int f27625a;
    public final yv f27626b;
    public final Context f27627c;
    public final org.telegram.ui.ActionBar.t1 d;

    public vv(yv yvVar, Context context, org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f27625a = i7;
        this.f27626b = yvVar;
        this.f27627c = context;
        this.d = t1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f27625a;
        org.telegram.ui.ActionBar.t1 t1Var = this.d;
        Context context = this.f27627c;
        yv yvVar = this.f27626b;
        switch (i7) {
            case 0:
                yvVar.f28224n = false;
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
                    yvVar.f28224n = false;
                    try {
                        t1Var.dismiss();
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String N0 = hd.N0(2131689472, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28777a;
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
