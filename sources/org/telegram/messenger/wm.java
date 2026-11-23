package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
public final class wm implements Runnable {
    public final int f27773a;
    public final Context f27774b;
    public final org.telegram.ui.ActionBar.t1 f27775c;

    public wm(int i7, Context context, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f27773a = i7;
        this.f27774b = context;
        this.f27775c = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f27773a) {
            case 0:
                org.telegram.ui.ActionBar.t1 t1Var = this.f27775c;
                if (!((Activity) this.f27774b).isFinishing()) {
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
                org.telegram.ui.ActionBar.t1 t1Var2 = this.f27775c;
                if (!((Activity) this.f27774b).isFinishing()) {
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
                Context context = this.f27774b;
                org.telegram.ui.ActionBar.t1 t1Var3 = this.f27775c;
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
