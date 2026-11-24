package defpackage;

import android.view.View;
public final class zf2 implements xe7, ee, g59, h59 {
    public final byte a;
    public final wg2 b;

    public zf2(wg2 wg2Var, byte b) {
        this.a = b;
        this.b = wg2Var;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        this.b.s0(i, view);
    }

    @Override
    public final boolean g(int i, View view) {
        wg2 wg2Var = this.b;
        if (wg2Var.getParentActivity() != null) {
            y59 adapter = wg2Var.c.getAdapter();
            sg2 sg2Var = wg2Var.a;
            if (adapter == sg2Var) {
                return wg2Var.i0(sg2Var.E(i), false, view);
            }
        }
        return false;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        wg2 wg2Var = this.b;
        switch (b) {
            case 1:
                wg2Var.y0();
                return;
            default:
                wg2Var.finishFragment();
                return;
        }
    }

    @Override
    public final void run(long j) {
        this.b.t0(j);
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}
