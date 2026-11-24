package defpackage;

import android.os.Bundle;
public final class xv6 implements kw6 {
    public final byte a;
    public final lw6 b;

    public xv6(lw6 lw6Var, fz8 fz8Var) {
        this.a = (byte) 1;
        this.b = lw6Var;
    }

    @Override
    public final void a(su6 su6Var) {
        byte b = this.a;
        lw6 lw6Var = this.b;
        switch (b) {
            case 0:
                lw6Var.j.m(su6Var);
                return;
            case 1:
                tv6 tv6Var = lw6Var.j;
                tv6Var.t();
                if (tv6Var.t.S0() != null) {
                    cff cffVar = tv6Var.e;
                    tv6Var.q(su6Var);
                    cffVar.getClass();
                    jie.c(new o6a(-6));
                    return;
                }
                return;
            case 2:
                tv6 tv6Var2 = lw6Var.j;
                tv6Var2.t();
                tv6Var2.t.S();
                return;
            case 3:
                tv6 tv6Var3 = lw6Var.j;
                tv6Var3.t();
                tv6Var3.t.C();
                return;
            case 4:
                tv6 tv6Var4 = lw6Var.j;
                tv6Var4.t();
                tv6Var4.t.L0();
                return;
            case 5:
                tv6 tv6Var5 = lw6Var.j;
                tv6Var5.t();
                tv6Var5.t.K0();
                return;
            case 6:
                tv6 tv6Var6 = lw6Var.j;
                tv6Var6.getClass();
                am5 c = jie.c(Boolean.TRUE);
                pv6 pv6Var = new pv6(tv6Var6, su6Var, true);
                c.b(new tq4(c, pv6Var, (byte) 0), new ge2(tv6Var6, (byte) 3));
                return;
            case 7:
                tv6 tv6Var7 = lw6Var.j;
                tv6Var7.t();
                tv6Var7.t.a();
                return;
            case 8:
                tv6 tv6Var8 = lw6Var.j;
                tv6Var8.t();
                tv6Var8.t.stop();
                return;
            case 9:
                tv6 tv6Var9 = lw6Var.j;
                tv6Var9.t();
                ad8 ad8Var = tv6Var9.t;
                if (g8c.d0(ad8Var, tv6Var9.p)) {
                    g8c.L(ad8Var);
                    return;
                } else if (ad8Var != null && ad8Var.m0(1)) {
                    ad8Var.e();
                    return;
                } else {
                    return;
                }
            case 10:
                tv6 tv6Var10 = lw6Var.j;
                tv6Var10.t();
                tv6Var10.t.J0();
                return;
            case 11:
                tv6 tv6Var11 = lw6Var.j;
                tv6Var11.t();
                tv6Var11.t.d0();
                return;
            default:
                tv6 tv6Var12 = lw6Var.j;
                tv6Var12.t();
                ad8 ad8Var2 = tv6Var12.t;
                String str = g8c.a;
                if (ad8Var2 != null && ad8Var2.m0(1)) {
                    ad8Var2.e();
                    return;
                }
                return;
        }
    }

    public xv6(lw6 lw6Var, byte b) {
        this.a = b;
        this.b = lw6Var;
    }

    public xv6(lw6 lw6Var, p5a p5aVar, Bundle bundle) {
        this.a = (byte) 0;
        this.b = lw6Var;
    }
}
