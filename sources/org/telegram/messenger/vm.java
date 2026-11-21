package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
public final class vm implements Runnable {
    public final int f27481a;
    public final Context f27482b;
    public final org.telegram.ui.ActionBar.t1 f27483c;

    public vm(int i7, Context context, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f27481a = i7;
        this.f27482b = context;
        this.f27483c = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f27481a) {
            case 0:
                org.telegram.ui.ActionBar.t1 t1Var = this.f27483c;
                if (!((Activity) this.f27482b).isFinishing()) {
                    try {
                        t1Var.dismiss();
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var2 = this.f27483c;
                if (!((Activity) this.f27482b).isFinishing()) {
                    try {
                        t1Var2.dismiss();
                        return;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        return;
                    }
                }
                return;
            default:
                Context context = this.f27482b;
                org.telegram.ui.ActionBar.t1 t1Var3 = this.f27483c;
                try {
                    if (!((Activity) context).isFinishing()) {
                        t1Var3.dismiss();
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
        }
    }
}
