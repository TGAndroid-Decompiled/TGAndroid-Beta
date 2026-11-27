package defpackage;

import android.view.View;
public final class wt5 implements View.OnClickListener {
    public final byte a;
    public final fu5 b;
    public final Runnable c;

    public wt5(fu5 fu5Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = fu5Var;
        this.c = runnable;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        fu5 fu5Var = this.b;
        switch (b) {
            case 0:
                runnable.run();
                if (fu5Var.J) {
                    fu5Var.u();
                    return;
                }
                return;
            case 1:
                fu5Var.u();
                runnable.run();
                return;
            case 2:
                if (runnable != null) {
                    int i = -fu5Var.K;
                    fu5Var.K = i;
                    hl.A3(i, view, null);
                    yw0.APP_ERROR.a();
                    runnable.run();
                    return;
                }
                return;
            case 3:
                runnable.run();
                if (fu5Var.J) {
                    fu5Var.u();
                    return;
                }
                return;
            case 4:
                if (runnable != null) {
                    runnable.run();
                }
                if (fu5Var.J) {
                    fu5Var.u();
                    return;
                }
                return;
            default:
                if (runnable != null) {
                    runnable.run();
                }
                if (fu5Var.J) {
                    fu5Var.u();
                    return;
                }
                return;
        }
    }
}
