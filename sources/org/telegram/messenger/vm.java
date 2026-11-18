package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
public final class vm implements Runnable {
    public final int f27453a;
    public final Context f27454b;
    public final org.telegram.ui.ActionBar.u1 f27455c;

    public vm(int i7, Context context, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f27453a = i7;
        this.f27454b = context;
        this.f27455c = u1Var;
    }

    @Override
    public final void run() {
        switch (this.f27453a) {
            case 0:
                org.telegram.ui.ActionBar.u1 u1Var = this.f27455c;
                if (!((Activity) this.f27454b).isFinishing()) {
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
                org.telegram.ui.ActionBar.u1 u1Var2 = this.f27455c;
                if (!((Activity) this.f27454b).isFinishing()) {
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
                Context context = this.f27454b;
                org.telegram.ui.ActionBar.u1 u1Var3 = this.f27455c;
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
