package defpackage;

import android.view.View;
public final class rt4 implements View.OnClickListener {
    public final byte a;
    public final vt4 b;
    public final Runnable c;

    public rt4(vt4 vt4Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = vt4Var;
        this.c = runnable;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        vt4 vt4Var = this.b;
        switch (b) {
            case 0:
                vt4Var.c(runnable);
                return;
            default:
                vt4Var.c(runnable);
                return;
        }
    }
}
