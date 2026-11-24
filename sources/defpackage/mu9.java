package defpackage;

import android.view.View;
public final class mu9 implements no7, ed {
    public final byte a;
    public final qu9 b;

    public mu9(qu9 qu9Var, byte b) {
        this.a = b;
        this.b = qu9Var;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        io5 H0 = gl.H0(vxcVar, false);
        qu9 qu9Var = this.b;
        qu9Var.e = H0;
        qu9Var.c.setPadding(H0.a, H0.b, H0.c, H0.d);
        qu9Var.b.requestLayout();
        return vxc.b;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        qu9 qu9Var = this.b;
        switch (b) {
            case 1:
                hd hdVar2 = qu9Var.d0;
                if (hdVar2 != null) {
                    hdVar2.dismiss();
                    return;
                }
                return;
            default:
                hd hdVar3 = qu9Var.d0;
                if (hdVar3 != null) {
                    hdVar3.dismiss();
                    qu9Var.d0 = null;
                }
                qu9Var.dismiss();
                return;
        }
    }
}
