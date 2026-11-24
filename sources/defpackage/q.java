package defpackage;

import android.view.View;
public final class q implements View.OnClickListener {
    public final byte a;
    public final cs5 b;
    public final boolean c;
    public final Runnable d;

    public q(cs5 cs5Var, boolean z, Runnable runnable, byte b) {
        this.a = b;
        this.b = cs5Var;
        this.c = z;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.d;
        boolean z = this.c;
        cs5 cs5Var = this.b;
        switch (b) {
            case 0:
                cs5Var.u();
                if (!z && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                cs5Var.u();
                if (!z && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
