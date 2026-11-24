package defpackage;

import android.os.Bundle;
public final class xx6 implements ky6 {
    public final byte a;
    public final ly6 b;

    public xx6(ly6 ly6Var, g19 g19Var) {
        this.a = (byte) 1;
        this.b = ly6Var;
    }

    @Override
    public final void a(sw6 sw6Var) {
        byte b = this.a;
        ly6 ly6Var = this.b;
        switch (b) {
            case 0:
                ly6Var.j.m(sw6Var);
                return;
            case 1:
                tx6 tx6Var = ly6Var.j;
                tx6Var.t();
                if (tx6Var.t.S0() != null) {
                    dhf dhfVar = tx6Var.e;
                    tx6Var.q(sw6Var);
                    dhfVar.getClass();
                    kke.c(new q8a(-6));
                    return;
                }
                return;
            case 2:
                tx6 tx6Var2 = ly6Var.j;
                tx6Var2.t();
                tx6Var2.t.S();
                return;
            case 3:
                tx6 tx6Var3 = ly6Var.j;
                tx6Var3.t();
                tx6Var3.t.C();
                return;
            case 4:
                tx6 tx6Var4 = ly6Var.j;
                tx6Var4.t();
                tx6Var4.t.L0();
                return;
            case 5:
                tx6 tx6Var5 = ly6Var.j;
                tx6Var5.t();
                tx6Var5.t.K0();
                return;
            case 6:
                tx6 tx6Var6 = ly6Var.j;
                tx6Var6.getClass();
                ao5 c = kke.c(Boolean.TRUE);
                px6 px6Var = new px6(tx6Var6, sw6Var, true);
                c.b(new us4(c, px6Var, (byte) 0), new rf2(tx6Var6, (byte) 3));
                return;
            case 7:
                tx6 tx6Var7 = ly6Var.j;
                tx6Var7.t();
                tx6Var7.t.a();
                return;
            case 8:
                tx6 tx6Var8 = ly6Var.j;
                tx6Var8.t();
                tx6Var8.t.stop();
                return;
            case 9:
                tx6 tx6Var9 = ly6Var.j;
                tx6Var9.t();
                cf8 cf8Var = tx6Var9.t;
                if (hac.d0(cf8Var, tx6Var9.p)) {
                    hac.L(cf8Var);
                    return;
                } else if (cf8Var != null && cf8Var.m0(1)) {
                    cf8Var.c();
                    return;
                } else {
                    return;
                }
            case 10:
                tx6 tx6Var10 = ly6Var.j;
                tx6Var10.t();
                tx6Var10.t.J0();
                return;
            case 11:
                tx6 tx6Var11 = ly6Var.j;
                tx6Var11.t();
                tx6Var11.t.d0();
                return;
            default:
                tx6 tx6Var12 = ly6Var.j;
                tx6Var12.t();
                cf8 cf8Var2 = tx6Var12.t;
                String str = hac.a;
                if (cf8Var2 != null && cf8Var2.m0(1)) {
                    cf8Var2.c();
                    return;
                }
                return;
        }
    }

    public xx6(ly6 ly6Var, byte b) {
        this.a = b;
        this.b = ly6Var;
    }

    public xx6(ly6 ly6Var, r7a r7aVar, Bundle bundle) {
        this.a = (byte) 0;
        this.b = ly6Var;
    }
}
