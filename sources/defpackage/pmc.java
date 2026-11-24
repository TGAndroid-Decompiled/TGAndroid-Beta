package defpackage;
public final class pmc implements Runnable {
    public final byte a;
    public final goc b;

    public pmc(goc gocVar, byte b) {
        this.a = b;
        this.b = gocVar;
    }

    @Override
    public final void run() {
        boolean z;
        t25 t25Var;
        byte b = this.a;
        goc gocVar = this.b;
        switch (b) {
            case 0:
                mqc mqcVar = gocVar.k0;
                if (mqcVar != null && (t25Var = gocVar.H0) != null) {
                    mqcVar.Y(t25Var);
                }
                t25 t25Var2 = gocVar.H0;
                if (t25Var2 != null && !t25Var2.a.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (gocVar.g0 != z) {
                    gocVar.P0(z);
                }
                if (z && gocVar.I0) {
                    brc brcVar = gocVar.j0;
                    if (brcVar != null) {
                        brcVar.b(false);
                    }
                    if (!gocVar.g0) {
                        gocVar.I0 = true;
                    } else {
                        gocVar.I0 = false;
                        gocVar.f0 = 1;
                        hs1 hs1Var = gocVar.s0;
                        if (hs1Var != null) {
                            hs1Var.setPosition(1);
                        }
                    }
                }
                va vaVar = gocVar.a;
                if (vaVar != null && vaVar.g3 != null) {
                    gocVar.c1(true);
                    return;
                }
                return;
            case 1:
                gocVar.i0(false);
                return;
            case 2:
                gocVar.H0();
                return;
            case 3:
                gocVar.G0();
                return;
            case 4:
                if (gocVar.S.isAttachedToWindow()) {
                    if (!gocVar.a.canScrollVertically(-1)) {
                        gocVar.a.f3.g1(0, 0);
                    }
                    gocVar.S.requestLayout();
                    return;
                }
                return;
            case 5:
                gocVar.j0();
                return;
            case 6:
                gocVar.Y0();
                return;
            case 7:
                gocVar.Q0 = null;
                return;
            case 8:
                gocVar.S.post(new pmc(gocVar, (byte) 4));
                return;
            case 9:
                c41.b0(gocVar).N(jb6.M0(2131745595, null), jb6.M0(2131751042, null)).j();
                return;
            case 10:
                gocVar.z0();
                return;
            case 11:
                gocVar.presentFragment(new vqc());
                return;
            case 12:
                gocVar.presentFragment(new yfb());
                return;
            case 13:
                gocVar.G0();
                return;
            default:
                gocVar.G0();
                return;
        }
    }
}
