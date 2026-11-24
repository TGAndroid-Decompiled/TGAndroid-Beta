package defpackage;

import android.view.View;
import android.widget.FrameLayout;
public final class b08 implements no7, ed {
    public final byte a;
    public final a18 b;

    public b08(a18 a18Var, byte b) {
        this.a = b;
        this.b = a18Var;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        io5 H0 = gl.H0(vxcVar, false);
        a18 a18Var = this.b;
        a18Var.c0 = H0;
        j08 j08Var = a18Var.h.b;
        int i = H0.a;
        int paddingTop = j08Var.getPaddingTop();
        io5 io5Var = a18Var.c0;
        j08Var.setPadding(i, paddingTop, io5Var.c, gl.L(72.0f) + io5Var.d);
        j08 j08Var2 = a18Var.n.b;
        int i2 = a18Var.c0.a;
        int paddingTop2 = j08Var2.getPaddingTop();
        io5 io5Var2 = a18Var.c0;
        j08Var2.setPadding(i2, paddingTop2, io5Var2.c, gl.L(72.0f) + io5Var2.d);
        FrameLayout frameLayout = a18Var.Q;
        io5 io5Var3 = a18Var.c0;
        frameLayout.setPadding(io5Var3.a, 0, io5Var3.c, io5Var3.d);
        return vxc.b;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        a18 a18Var = this.b;
        switch (b) {
            case 1:
                a18Var.finishFragment();
                return;
            default:
                a18Var.A0();
                return;
        }
    }
}
