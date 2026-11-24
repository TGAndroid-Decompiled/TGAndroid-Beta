package defpackage;

import android.view.View;
import android.view.WindowInsets;
public final class sx2 implements oo4, no7 {
    public final xx2 a;

    public sx2(xx2 xx2Var) {
        this.a = xx2Var;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        boolean z;
        WindowInsets g = vxcVar.g();
        xx2 xx2Var = this.a;
        xx2Var.q0(g);
        fm0 fm0Var = xx2Var.T1;
        if (vxcVar.a.f(8).d > 0) {
            z = true;
        } else {
            z = false;
        }
        fm0Var.a(z, true);
        return vxc.b;
    }

    @Override
    public final void a(int i) {
        int min = Math.min(i, gl.L(144.0f));
        if (i > 0) {
            min -= gl.L(8.0f);
        }
        xx2 xx2Var = this.a;
        if (xx2Var.g2 != min) {
            xx2Var.g2 = min;
            xx2Var.S1.a(min);
            xx2Var.c2.postOnAnimation(new mk2(xx2Var, (byte) 12));
        }
    }
}
