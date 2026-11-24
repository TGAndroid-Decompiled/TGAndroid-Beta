package defpackage;

import android.view.View;
public final class bc5 implements pq4, ee, qq7 {
    public final byte a;
    public final oc5 b;

    public bc5(oc5 oc5Var, byte b) {
        this.a = b;
        this.b = oc5Var;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        int i = gm.H0(wzcVar, false).d;
        oc5 oc5Var = this.b;
        oc5Var.n0 = i;
        ec0 ec0Var = oc5Var.G;
        if (ec0Var != null) {
            ec0Var.setPadding(0, 0, 0, i);
        }
        oc5Var.l0();
        oc5Var.j0();
        return wzc.b;
    }

    @Override
    public final void a(int i) {
        oc5 oc5Var = this.b;
        oc5Var.b.a(Math.min(i, oc5Var.d0));
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        oc5 oc5Var = this.b;
        switch (b) {
            case 1:
                oc5Var.s0();
                return;
            default:
                oc5Var.finishFragment();
                return;
        }
    }
}
