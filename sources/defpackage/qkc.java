package defpackage;
public final class qkc implements Runnable {
    public final byte a;
    public final hmc b;

    public qkc(hmc hmcVar, byte b) {
        this.a = b;
        this.b = hmcVar;
    }

    @Override
    public final void run() {
        boolean z;
        t05 t05Var;
        byte b = this.a;
        hmc hmcVar = this.b;
        switch (b) {
            case 0:
                koc kocVar = hmcVar.k0;
                if (kocVar != null && (t05Var = hmcVar.H0) != null) {
                    kocVar.Y(t05Var);
                }
                t05 t05Var2 = hmcVar.H0;
                if (t05Var2 != null && !t05Var2.a.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (hmcVar.g0 != z) {
                    hmcVar.O0(z);
                }
                if (z && hmcVar.I0) {
                    zoc zocVar = hmcVar.j0;
                    if (zocVar != null) {
                        zocVar.b(false);
                    }
                    if (!hmcVar.g0) {
                        hmcVar.I0 = true;
                    } else {
                        hmcVar.I0 = false;
                        hmcVar.f0 = 1;
                        vq1 vq1Var = hmcVar.s0;
                        if (vq1Var != null) {
                            vq1Var.setPosition(1);
                        }
                    }
                }
                va vaVar = hmcVar.a;
                if (vaVar != null && vaVar.g3 != null) {
                    hmcVar.b1(true);
                    return;
                }
                return;
            case 1:
                hmcVar.h0(false);
                return;
            case 2:
                hmcVar.G0();
                return;
            case 3:
                hmcVar.F0();
                return;
            case 4:
                if (hmcVar.S.isAttachedToWindow()) {
                    if (!hmcVar.a.canScrollVertically(-1)) {
                        hmcVar.a.f3.g1(0, 0);
                    }
                    hmcVar.S.requestLayout();
                    return;
                }
                return;
            case 5:
                hmcVar.i0();
                return;
            case 6:
                hmcVar.X0();
                return;
            case 7:
                hmcVar.Q0 = null;
                return;
            case 8:
                hmcVar.S.post(new qkc(hmcVar, (byte) 4));
                return;
            case 9:
                u21.b0(hmcVar).N(k96.M0(2131745669, null), k96.M0(2131751093, null)).j();
                return;
            case 10:
                hmcVar.y0();
                return;
            case 11:
                hmcVar.presentFragment(new toc());
                return;
            case 12:
                hmcVar.presentFragment(new ydb());
                return;
            case 13:
                hmcVar.F0();
                return;
            default:
                hmcVar.F0();
                return;
        }
    }
}
