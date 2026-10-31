package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lw implements Runnable {
    public final int f16824a;
    public final ow f16825b;
    public final Context f16826c;
    public final org.telegram.ui.ActionBar.x1 d;

    public lw(ow owVar, Context context, org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.f16824a = i10;
        this.f16825b = owVar;
        this.f16826c = context;
        this.d = x1Var;
    }

    @Override
    public final void run() {
        int i10 = this.f16824a;
        org.telegram.ui.ActionBar.x1 x1Var = this.d;
        Context context = this.f16826c;
        ow owVar = this.f16825b;
        switch (i10) {
            case 0:
                owVar.f17351n = false;
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
                    owVar.f17351n = false;
                    try {
                        x1Var.dismiss();
                    } catch (Exception e7) {
                        f8.g(e7, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String L0 = cd.L0(2131689472, null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.f20134a;
                    x1Var2.R = L0;
                    x1Var2.T = cd.L0(2131751750, null);
                    alertDialog$Builder.k(cd.L0(2131747847, null), null);
                    alertDialog$Builder.p().setCanceledOnTouchOutside(true);
                    return;
                }
                return;
        }
    }
}
