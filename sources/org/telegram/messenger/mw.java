package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mw implements Runnable {
    public final int f17208a;
    public final pw f17209b;
    public final Context f17210c;
    public final org.telegram.ui.ActionBar.x1 d;

    public mw(pw pwVar, Context context, org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.f17208a = i10;
        this.f17209b = pwVar;
        this.f17210c = context;
        this.d = x1Var;
    }

    @Override
    public final void run() {
        int i10 = this.f17208a;
        org.telegram.ui.ActionBar.x1 x1Var = this.d;
        Context context = this.f17210c;
        pw pwVar = this.f17209b;
        switch (i10) {
            case 0:
                pwVar.f17684n = false;
                if (!((Activity) context).isFinishing()) {
                    try {
                        x1Var.dismiss();
                        return;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return;
                    }
                }
                return;
            default:
                if (!((Activity) context).isFinishing()) {
                    pwVar.f17684n = false;
                    try {
                        x1Var.dismiss();
                    } catch (Exception e7) {
                        f8.g(e7, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String L0 = dd.L0(2131689472, null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.f20135a;
                    x1Var2.R = L0;
                    x1Var2.T = dd.L0(2131751750, null);
                    alertDialog$Builder.k(dd.L0(2131747847, null), null);
                    alertDialog$Builder.p().setCanceledOnTouchOutside(true);
                    return;
                }
                return;
        }
    }
}
