package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class p9a implements mw4, no7, k8, nw4 {
    public final byte a;
    public final taa b;

    public p9a(taa taaVar, byte b) {
        this.a = b;
        this.b = taaVar;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        WindowInsets g = vxcVar.g();
        taa taaVar = this.b;
        taaVar.q0(g);
        io5 f = vxcVar.a.f(519);
        if (!taaVar.B2.equals(f)) {
            taaVar.B2 = f;
            taaVar.c.requestLayout();
        }
        return vxc.b;
    }

    @Override
    public final int i() {
        return bkb.v0(bkb.c6, this.b.J0);
    }

    @Override
    public final void j(int i) {
        taa taaVar = this.b;
        cq3 cq3Var = taaVar.J2;
        if (Build.VERSION.SDK_INT >= 31 && cq3Var != null) {
            if (fod.a(i, 4)) {
                cq3Var.h(taaVar.X0.e());
            }
            cq3Var.e(taaVar.O2, taaVar.b.getWidth(), taaVar.b.getHeight());
        }
    }

    @Override
    public final void r(KeyEvent keyEvent) {
        m8 m8Var;
        m8 m8Var2;
        byte b = this.a;
        taa taaVar = this.b;
        switch (b) {
            case 2:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = taaVar.E2) != null && m8Var.isShowing()) {
                    taaVar.E2.d(true);
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var2 = taaVar.E2) != null && m8Var2.isShowing()) {
                    taaVar.E2.d(true);
                    return;
                }
                return;
        }
    }
}
