package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sv implements Runnable {
    public final int f25434a;
    public final vv f25435b;
    public final Context f25436c;
    public final org.telegram.ui.ActionBar.s1 d;

    public sv(vv vvVar, Context context, org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        this.f25434a = i3;
        this.f25435b = vvVar;
        this.f25436c = context;
        this.d = s1Var;
    }

    @Override
    public final void run() {
        int i3 = this.f25434a;
        org.telegram.ui.ActionBar.s1 s1Var = this.d;
        Context context = this.f25436c;
        vv vvVar = this.f25435b;
        switch (i3) {
            case 0:
                vvVar.f26118n = false;
                if (!((Activity) context).isFinishing()) {
                    try {
                        s1Var.dismiss();
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                return;
            default:
                if (!((Activity) context).isFinishing()) {
                    vvVar.f26118n = false;
                    try {
                        s1Var.dismiss();
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String M0 = bd.M0(2131689472, null);
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.f27343a;
                    s1Var2.S = M0;
                    s1Var2.U = bd.M0(2131751750, null);
                    alertDialog$Builder.k(bd.M0(2131747839, null), null);
                    alertDialog$Builder.p().setCanceledOnTouchOutside(true);
                    return;
                }
                return;
        }
    }
}
