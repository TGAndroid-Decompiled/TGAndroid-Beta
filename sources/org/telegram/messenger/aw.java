package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class aw implements Runnable {
    public final int f21537a;
    public final dw f21538b;
    public final Context f21539c;
    public final org.telegram.ui.ActionBar.u1 d;

    public aw(dw dwVar, Context context, org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f21537a = i7;
        this.f21538b = dwVar;
        this.f21539c = context;
        this.d = u1Var;
    }

    @Override
    public final void run() {
        int i7 = this.f21537a;
        org.telegram.ui.ActionBar.u1 u1Var = this.d;
        Context context = this.f21539c;
        dw dwVar = this.f21538b;
        switch (i7) {
            case 0:
                dwVar.f22103n = false;
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
                    dwVar.f22103n = false;
                    try {
                        u1Var.dismiss();
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String M0 = hd.M0(2131689472, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f27292a;
                    u1Var2.R = M0;
                    u1Var2.T = hd.M0(2131751750, null);
                    alertDialog$Builder.k(hd.M0(2131747830, null), null);
                    alertDialog$Builder.p().setCanceledOnTouchOutside(true);
                    return;
                }
                return;
        }
    }
}
