package defpackage;

import android.view.View;
public final class fc5 implements View.OnClickListener {
    public final byte a;
    public final rc5 b;

    public fc5(rc5 rc5Var, byte b) {
        this.a = b;
        this.b = rc5Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        rc5 rc5Var = this.b;
        switch (b) {
            case 0:
                rc5Var.Y = null;
                rc5Var.a0.b();
                rc5Var.h.b();
                rc5Var.l0();
                rc5Var.w0();
                rc5Var.x0();
                return;
            case 1:
                rc5Var.f.r.clearFocus();
                rc5Var.f.r.requestFocus();
                hl.E3(rc5Var.f.r);
                return;
            case 2:
                rc5Var.r0();
                return;
            case 3:
                rc5Var.q0(rc5Var.n0());
                return;
            default:
                rc5Var.q0(rc5Var.n0());
                return;
        }
    }
}
