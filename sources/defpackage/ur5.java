package defpackage;

import android.view.View;
public final class ur5 implements View.OnClickListener {
    public final byte a;
    public final cs5 b;
    public final Runnable c;

    public ur5(cs5 cs5Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = cs5Var;
        this.c = runnable;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        cs5 cs5Var = this.b;
        switch (b) {
            case 0:
                cs5Var.u();
                runnable.run();
                return;
            case 1:
                runnable.run();
                if (cs5Var.J) {
                    cs5Var.u();
                    return;
                }
                return;
            case 2:
                runnable.run();
                if (cs5Var.J) {
                    cs5Var.u();
                    return;
                }
                return;
            case 3:
                if (runnable != null) {
                    int i = -cs5Var.K;
                    cs5Var.K = i;
                    gl.A3(i, view, null);
                    pw0.APP_ERROR.a();
                    runnable.run();
                    return;
                }
                return;
            case 4:
                if (runnable != null) {
                    runnable.run();
                }
                if (cs5Var.J) {
                    cs5Var.u();
                    return;
                }
                return;
            default:
                if (runnable != null) {
                    runnable.run();
                }
                if (cs5Var.J) {
                    cs5Var.u();
                    return;
                }
                return;
        }
    }
}
