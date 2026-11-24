package defpackage;

import android.view.View;
public final class nm0 implements ed, nw4, no7 {
    public final fx0 a;

    public nm0(fx0 fx0Var) {
        this.a = fx0Var;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        return this.a.Y(vxcVar);
    }

    @Override
    public final int i() {
        return bkb.v0(bkb.g5, this.a.J0);
    }

    @Override
    public final void u(hd hdVar, int i) {
        this.a.dismiss();
        xu4.f1(false, null);
    }
}
