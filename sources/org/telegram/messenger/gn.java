package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
public final class gn implements Runnable {
    public final int f15947a;
    public final Context f15948b;
    public final org.telegram.ui.ActionBar.x1 f15949c;

    public gn(int i10, Context context, org.telegram.ui.ActionBar.x1 x1Var) {
        this.f15947a = i10;
        this.f15948b = context;
        this.f15949c = x1Var;
    }

    @Override
    public final void run() {
        switch (this.f15947a) {
            case 0:
                org.telegram.ui.ActionBar.x1 x1Var = this.f15949c;
                if (!((Activity) this.f15948b).isFinishing()) {
                    try {
                        x1Var.dismiss();
                        return;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return;
                    }
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.x1 x1Var2 = this.f15949c;
                if (!((Activity) this.f15948b).isFinishing()) {
                    try {
                        x1Var2.dismiss();
                        return;
                    } catch (Exception e7) {
                        f8.g(e7, true);
                        return;
                    }
                }
                return;
            default:
                Context context = this.f15948b;
                org.telegram.ui.ActionBar.x1 x1Var3 = this.f15949c;
                try {
                    if (!((Activity) context).isFinishing()) {
                        x1Var3.dismiss();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
        }
    }
}
