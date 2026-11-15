package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
public final class cn implements Runnable {
    public final int f22912a;
    public final Context f22913b;
    public final org.telegram.ui.ActionBar.t1 f22914c;

    public cn(int i7, Context context, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f22912a = i7;
        this.f22913b = context;
        this.f22914c = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f22912a) {
            case 0:
                org.telegram.ui.ActionBar.t1 t1Var = this.f22914c;
                if (!((Activity) this.f22913b).isFinishing()) {
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
                org.telegram.ui.ActionBar.t1 t1Var2 = this.f22914c;
                if (!((Activity) this.f22913b).isFinishing()) {
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
                Context context = this.f22913b;
                org.telegram.ui.ActionBar.t1 t1Var3 = this.f22914c;
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
