package defpackage;

import android.view.View;
public final class sn0 implements hj, yma, i82, x34 {
    public final ao0 a;

    public sn0(ao0 ao0Var) {
        this.a = ao0Var;
    }

    @Override
    public final void j(int i) {
        String str;
        int i2;
        String M0;
        String str2;
        String G;
        ao0 ao0Var = this.a;
        int i3 = ao0Var.c2;
        int i4 = pn0.w;
        if (i3 == 2) {
            ao0Var.i2 = i;
        } else {
            ao0Var.j2 = i;
        }
        ao0Var.l2.a.c(ao0Var.b1(), true);
        if (ao0Var.c2 == 3) {
            ao0Var.g1(true, true);
        } else {
            ao0Var.g1(false, false);
        }
        km0 km0Var = ao0Var.b2;
        int b1 = ao0Var.b1();
        for (int i5 = 0; i5 < km0Var.f.getChildCount(); i5++) {
            View childAt = km0Var.f.getChildAt(i5);
            if (childAt instanceof teb) {
                in inVar = ((teb) childAt).r;
                if (b1 <= 0) {
                    G = "";
                } else {
                    G = ob6.G(b1, "BoostingBoostsCountTitle", Integer.valueOf(b1));
                }
                inVar.a();
                inVar.c(G, true, true);
            }
            if (childAt instanceof j82) {
                j82 j82Var = (j82) childAt;
                int F = km0Var.F(j82Var.getChat());
                boolean V = xc2.V(j82Var.x);
                if (j82Var.y) {
                    if (F >= 1) {
                        if (V) {
                            str2 = "Subscribers";
                        } else {
                            str2 = "Members";
                        }
                        M0 = ob6.G(F, str2, new Object[0]);
                    } else {
                        if (V) {
                            i2 = 2131751355;
                        } else {
                            i2 = 2131754872;
                        }
                        M0 = ob6.M0(i2, null);
                    }
                    j82Var.setSubtitle(M0);
                } else {
                    if (V) {
                        str = "BoostingChannelWillReceiveBoost";
                    } else {
                        str = "BoostingGroupWillReceiveBoost";
                    }
                    j82Var.setSubtitle(ob6.G(b1, str, new Object[0]));
                }
            }
        }
        km0Var.g(8);
        km0Var.l(km0Var.e.size() - 12, 12);
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        ao0 ao0Var = this.a;
        ao0Var.h2 = i * 1000;
        ao0Var.g1(false, true);
    }

    @Override
    public final void m() {
    }
}
