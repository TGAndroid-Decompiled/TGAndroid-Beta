package defpackage;

import android.view.View;
public final class ne2 implements vc7, ed, d39, e39 {
    public final byte a;
    public final kf2 b;

    public ne2(kf2 kf2Var, byte b) {
        this.a = b;
        this.b = kf2Var;
    }

    @Override
    public final boolean d(int i, View view) {
        kf2 kf2Var = this.b;
        if (kf2Var.getParentActivity() != null) {
            w39 adapter = kf2Var.c.getAdapter();
            gf2 gf2Var = kf2Var.a;
            if (adapter == gf2Var) {
                return kf2Var.h0(gf2Var.E(i), false, view);
            }
        }
        return false;
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        this.b.r0(i, view);
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final void run(long j) {
        this.b.s0(j);
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        kf2 kf2Var = this.b;
        switch (b) {
            case 1:
                kf2Var.x0();
                return;
            default:
                kf2Var.finishFragment();
                return;
        }
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}
