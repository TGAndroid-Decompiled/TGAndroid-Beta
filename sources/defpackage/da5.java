package defpackage;

import android.view.View;
public final class da5 implements oo4, ed, no7 {
    public final byte a;
    public final qa5 b;

    public da5(qa5 qa5Var, byte b) {
        this.a = b;
        this.b = qa5Var;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        int i = gl.H0(vxcVar, false).d;
        qa5 qa5Var = this.b;
        qa5Var.n0 = i;
        eb0 eb0Var = qa5Var.G;
        if (eb0Var != null) {
            eb0Var.setPadding(0, 0, 0, i);
        }
        qa5Var.k0();
        qa5Var.i0();
        return vxc.b;
    }

    @Override
    public final void a(int i) {
        qa5 qa5Var = this.b;
        qa5Var.b.a(Math.min(i, qa5Var.d0));
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        qa5 qa5Var = this.b;
        switch (b) {
            case 1:
                qa5Var.r0();
                return;
            default:
                qa5Var.finishFragment();
                return;
        }
    }
}
