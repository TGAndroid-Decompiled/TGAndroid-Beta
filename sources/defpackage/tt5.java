package defpackage;

import android.view.View;
public final class tt5 implements View.OnClickListener {
    public final byte a;
    public final bu5 b;
    public final Runnable c;

    public tt5(bu5 bu5Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = bu5Var;
        this.c = runnable;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        bu5 bu5Var = this.b;
        switch (b) {
            case 0:
                bu5Var.u();
                runnable.run();
                return;
            case 1:
                runnable.run();
                if (bu5Var.J) {
                    bu5Var.u();
                    return;
                }
                return;
            case 2:
                runnable.run();
                if (bu5Var.J) {
                    bu5Var.u();
                    return;
                }
                return;
            case 3:
                if (runnable != null) {
                    int i = -bu5Var.K;
                    bu5Var.K = i;
                    gm.A3(i, view, null);
                    xx0.APP_ERROR.a();
                    runnable.run();
                    return;
                }
                return;
            case 4:
                if (runnable != null) {
                    runnable.run();
                }
                if (bu5Var.J) {
                    bu5Var.u();
                    return;
                }
                return;
            default:
                if (runnable != null) {
                    runnable.run();
                }
                if (bu5Var.J) {
                    bu5Var.u();
                    return;
                }
                return;
        }
    }
}
