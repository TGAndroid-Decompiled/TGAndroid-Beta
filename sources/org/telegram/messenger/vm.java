package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
public final class vm implements Runnable {
    public final int f25964a;
    public final Context f25965b;
    public final org.telegram.ui.ActionBar.s1 f25966c;

    public vm(int i3, Context context, org.telegram.ui.ActionBar.s1 s1Var) {
        this.f25964a = i3;
        this.f25965b = context;
        this.f25966c = s1Var;
    }

    @Override
    public final void run() {
        switch (this.f25964a) {
            case 0:
                org.telegram.ui.ActionBar.s1 s1Var = this.f25966c;
                if (!((Activity) this.f25965b).isFinishing()) {
                    try {
                        s1Var.dismiss();
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.s1 s1Var2 = this.f25966c;
                if (!((Activity) this.f25965b).isFinishing()) {
                    try {
                        s1Var2.dismiss();
                        return;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        return;
                    }
                }
                return;
            default:
                Context context = this.f25965b;
                org.telegram.ui.ActionBar.s1 s1Var3 = this.f25966c;
                try {
                    if (!((Activity) context).isFinishing()) {
                        s1Var3.dismiss();
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
