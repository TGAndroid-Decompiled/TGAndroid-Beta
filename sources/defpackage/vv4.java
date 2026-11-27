package defpackage;

import android.view.View;
public final class vv4 implements View.OnClickListener {
    public final byte a;
    public final zv4 b;
    public final Runnable c;

    public vv4(zv4 zv4Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = zv4Var;
        this.c = runnable;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        zv4 zv4Var = this.b;
        switch (b) {
            case 0:
                zv4Var.c(runnable);
                return;
            default:
                zv4Var.c(runnable);
                return;
        }
    }
}
