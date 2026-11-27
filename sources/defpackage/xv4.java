package defpackage;

import android.view.View;
public final class xv4 implements View.OnClickListener {
    public final byte a;
    public final zv4 b;

    public xv4(zv4 zv4Var, byte b) {
        this.a = b;
        this.b = zv4Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        zv4 zv4Var = this.b;
        switch (b) {
            case 0:
                zv4Var.c(null);
                return;
            default:
                zv4Var.d();
                return;
        }
    }
}
