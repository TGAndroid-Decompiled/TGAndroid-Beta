package defpackage;

import android.view.View;
public final class sn0 implements gj, eja, r72, b34 {
    public final ao0 a;

    public sn0(ao0 ao0Var) {
        this.a = ao0Var;
    }

    @Override
    public final void k(int i) {
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
        ao0Var.l2.a.c(ao0Var.a1(), true);
        if (ao0Var.c2 == 3) {
            ao0Var.f1(true, true);
        } else {
            ao0Var.f1(false, false);
        }
        km0 km0Var = ao0Var.b2;
        int a1 = ao0Var.a1();
        for (int i5 = 0; i5 < km0Var.f.getChildCount(); i5++) {
            View childAt = km0Var.f.getChildAt(i5);
            if (childAt instanceof wab) {
                hn hnVar = ((wab) childAt).r;
                if (a1 <= 0) {
                    G = "";
                } else {
                    G = k96.G(a1, "BoostingBoostsCountTitle", Integer.valueOf(a1));
                }
                hnVar.a();
                hnVar.c(G, true, true);
            }
            if (childAt instanceof s72) {
                s72 s72Var = (s72) childAt;
                int F = km0Var.F(s72Var.getChat());
                boolean V = hc2.V(s72Var.x);
                if (s72Var.y) {
                    if (F >= 1) {
                        if (V) {
                            str2 = "Subscribers";
                        } else {
                            str2 = "Members";
                        }
                        M0 = k96.G(F, str2, new Object[0]);
                    } else {
                        if (V) {
                            i2 = 2131751378;
                        } else {
                            i2 = 2131754876;
                        }
                        M0 = k96.M0(i2, null);
                    }
                    s72Var.setSubtitle(M0);
                } else {
                    if (V) {
                        str = "BoostingChannelWillReceiveBoost";
                    } else {
                        str = "BoostingGroupWillReceiveBoost";
                    }
                    s72Var.setSubtitle(k96.G(a1, str, new Object[0]));
                }
            }
        }
        km0Var.g(8);
        km0Var.l(km0Var.e.size() - 12, 12);
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        ao0 ao0Var = this.a;
        ao0Var.h2 = i * 1000;
        ao0Var.f1(false, true);
    }

    @Override
    public final void n() {
    }
}
