package defpackage;

import android.view.View;
public final class cc5 implements View.OnClickListener {
    public final byte a;
    public final oc5 b;

    public cc5(oc5 oc5Var, byte b) {
        this.a = b;
        this.b = oc5Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        oc5 oc5Var = this.b;
        switch (b) {
            case 0:
                oc5Var.Y = null;
                oc5Var.a0.b();
                oc5Var.h.b();
                oc5Var.m0();
                oc5Var.w0();
                oc5Var.x0();
                return;
            case 1:
                oc5Var.f.r.clearFocus();
                oc5Var.f.r.requestFocus();
                gm.E3(oc5Var.f.r);
                return;
            case 2:
                oc5Var.s0();
                return;
            case 3:
                oc5Var.r0(oc5Var.o0());
                return;
            default:
                oc5Var.r0(oc5Var.o0());
                return;
        }
    }
}
