package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
public final class fn implements Runnable {
    public final int f22443a;
    public final Context f22444b;
    public final org.telegram.ui.ActionBar.u1 f22445c;

    public fn(int i7, Context context, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f22443a = i7;
        this.f22444b = context;
        this.f22445c = u1Var;
    }

    @Override
    public final void run() {
        switch (this.f22443a) {
            case 0:
                org.telegram.ui.ActionBar.u1 u1Var = this.f22445c;
                if (!((Activity) this.f22444b).isFinishing()) {
                    try {
                        u1Var.dismiss();
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var2 = this.f22445c;
                if (!((Activity) this.f22444b).isFinishing()) {
                    try {
                        u1Var2.dismiss();
                        return;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        return;
                    }
                }
                return;
            default:
                Context context = this.f22444b;
                org.telegram.ui.ActionBar.u1 u1Var3 = this.f22445c;
                try {
                    if (!((Activity) context).isFinishing()) {
                        u1Var3.dismiss();
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
