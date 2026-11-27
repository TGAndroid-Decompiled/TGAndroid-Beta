package defpackage;

import android.view.View;
public final class ef2 implements ff7, fd, s69, t69 {
    public final byte a;
    public final bg2 b;

    public ef2(bg2 bg2Var, byte b) {
        this.a = b;
        this.b = bg2Var;
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        this.b.r0(i, view);
    }

    @Override
    public final boolean e(int i, View view) {
        bg2 bg2Var = this.b;
        if (bg2Var.getParentActivity() != null) {
            j79 adapter = bg2Var.c.getAdapter();
            xf2 xf2Var = bg2Var.a;
            if (adapter == xf2Var) {
                return bg2Var.h0(xf2Var.E(i), false, view);
            }
        }
        return false;
    }

    @Override
    public final void run(long j) {
        this.b.s0(j);
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        bg2 bg2Var = this.b;
        switch (b) {
            case 1:
                bg2Var.y0();
                return;
            default:
                bg2Var.finishFragment();
                return;
        }
    }

    @Override
    public final void u(View view, float f, float f2) {
    }
}
