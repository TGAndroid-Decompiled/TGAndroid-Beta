package defpackage;

import android.view.View;
public final class ea5 implements View.OnClickListener {
    public final byte a;
    public final qa5 b;

    public ea5(qa5 qa5Var, byte b) {
        this.a = b;
        this.b = qa5Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        qa5 qa5Var = this.b;
        switch (b) {
            case 0:
                qa5Var.Y = null;
                qa5Var.a0.b();
                qa5Var.h.b();
                qa5Var.l0();
                qa5Var.v0();
                qa5Var.w0();
                return;
            case 1:
                qa5Var.f.r.clearFocus();
                qa5Var.f.r.requestFocus();
                gl.E3(qa5Var.f.r);
                return;
            case 2:
                qa5Var.r0();
                return;
            case 3:
                qa5Var.q0(qa5Var.n0());
                return;
            default:
                qa5Var.q0(qa5Var.n0());
                return;
        }
    }
}
