package defpackage;

import android.view.View;
public final class tv4 implements View.OnClickListener {
    public final byte a;
    public final xv4 b;
    public final Runnable c;

    public tv4(xv4 xv4Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = xv4Var;
        this.c = runnable;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        xv4 xv4Var = this.b;
        switch (b) {
            case 0:
                xv4Var.c(runnable);
                return;
            default:
                xv4Var.c(runnable);
                return;
        }
    }
}
