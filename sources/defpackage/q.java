package defpackage;

import android.view.View;
public final class q implements View.OnClickListener {
    public final byte a;
    public final bu5 b;
    public final boolean c;
    public final Runnable d;

    public q(bu5 bu5Var, boolean z, Runnable runnable, byte b) {
        this.a = b;
        this.b = bu5Var;
        this.c = z;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.d;
        boolean z = this.c;
        bu5 bu5Var = this.b;
        switch (b) {
            case 0:
                bu5Var.u();
                if (!z && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                bu5Var.u();
                if (!z && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
