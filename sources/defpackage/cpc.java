package defpackage;
public final class cpc implements Runnable {
    public final byte a;
    public final uqc b;

    public cpc(uqc uqcVar, byte b) {
        this.a = b;
        this.b = uqcVar;
    }

    @Override
    public final void run() {
        boolean z;
        x25 x25Var;
        x25 x25Var2;
        byte b = this.a;
        uqc uqcVar = this.b;
        switch (b) {
            case 0:
                wsc wscVar = uqcVar.k0;
                if (wscVar != null && (x25Var = uqcVar.H0) != null) {
                    wscVar.Y(x25Var);
                }
                x25 x25Var3 = uqcVar.H0;
                if (x25Var3 != null && !x25Var3.a.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (uqcVar.g0 != z) {
                    uqcVar.O0(z);
                }
                if (z && uqcVar.I0) {
                    ltc ltcVar = uqcVar.j0;
                    if (ltcVar != null) {
                        ltcVar.b(false);
                    }
                    if (!uqcVar.g0) {
                        uqcVar.I0 = true;
                    } else {
                        uqcVar.I0 = false;
                        uqcVar.f0 = 1;
                        ir1 ir1Var = uqcVar.s0;
                        if (ir1Var != null) {
                            ir1Var.setPosition(1);
                        }
                    }
                }
                wa waVar = uqcVar.a;
                if (waVar != null && waVar.g3 != null) {
                    uqcVar.b1(true);
                    return;
                }
                return;
            case 1:
                uqcVar.h0(false);
                return;
            case 2:
                uqcVar.G0();
                return;
            case 3:
                q9c q9cVar = uqcVar.u0[1];
                if (uqcVar.f0 == 1 && q9cVar != null && q9cVar.H && (x25Var2 = uqcVar.H0) != null && !x25Var2.i && !x25Var2.g && x25Var2.m == null && q9cVar.f3.M0() >= q9cVar.g3.E.size() - 3) {
                    uqcVar.H0.e();
                    return;
                }
                return;
            case 4:
                if (uqcVar.S.isAttachedToWindow()) {
                    if (!uqcVar.a.canScrollVertically(-1)) {
                        uqcVar.a.f3.g1(0, 0);
                    }
                    uqcVar.S.requestLayout();
                    return;
                }
                return;
            case 5:
                uqcVar.i0();
                return;
            case 6:
                uqcVar.X0();
                return;
            case 7:
                uqcVar.Q0 = null;
                return;
            case 8:
                uqcVar.S.post(new cpc(uqcVar, (byte) 4));
                return;
            case 9:
                d31.b0(uqcVar).N(ob6.M0(2131745589, null), ob6.M0(2131751070, null)).j();
                return;
            case 10:
                uqcVar.z0();
                return;
            case 11:
                uqcVar.presentFragment(new gtc());
                return;
            default:
                uqcVar.presentFragment(new thb());
                return;
        }
    }
}
