package defpackage;

import android.view.View;
public final class so0 implements gk, gla, c92, m44 {
    public final ap0 a;

    public so0(ap0 ap0Var) {
        this.a = ap0Var;
    }

    @Override
    public final void i(int i) {
        String str;
        int i2;
        String M0;
        String str2;
        String G;
        ap0 ap0Var = this.a;
        int i3 = ap0Var.c2;
        int i4 = po0.w;
        if (i3 == 2) {
            ap0Var.i2 = i;
        } else {
            ap0Var.j2 = i;
        }
        ap0Var.l2.a.c(ap0Var.a1(), true);
        if (ap0Var.c2 == 3) {
            ap0Var.f1(true, true);
        } else {
            ap0Var.f1(false, false);
        }
        kn0 kn0Var = ap0Var.b2;
        int a1 = ap0Var.a1();
        for (int i5 = 0; i5 < kn0Var.f.getChildCount(); i5++) {
            View childAt = kn0Var.f.getChildAt(i5);
            if (childAt instanceof xcb) {
                io ioVar = ((xcb) childAt).r;
                if (a1 <= 0) {
                    G = "";
                } else {
                    G = jb6.G(a1, "BoostingBoostsCountTitle", Integer.valueOf(a1));
                }
                ioVar.a();
                ioVar.c(G, true, true);
            }
            if (childAt instanceof d92) {
                d92 d92Var = (d92) childAt;
                int F = kn0Var.F(d92Var.getChat());
                boolean V = sd2.V(d92Var.x);
                if (d92Var.y) {
                    if (F >= 1) {
                        if (V) {
                            str2 = "Subscribers";
                        } else {
                            str2 = "Members";
                        }
                        M0 = jb6.G(F, str2, new Object[0]);
                    } else {
                        if (V) {
                            i2 = 2131751327;
                        } else {
                            i2 = 2131754876;
                        }
                        M0 = jb6.M0(i2, null);
                    }
                    d92Var.setSubtitle(M0);
                } else {
                    if (V) {
                        str = "BoostingChannelWillReceiveBoost";
                    } else {
                        str = "BoostingGroupWillReceiveBoost";
                    }
                    d92Var.setSubtitle(jb6.G(a1, str, new Object[0]));
                }
            }
        }
        kn0Var.g(8);
        kn0Var.l(kn0Var.e.size() - 12, 12);
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        ap0 ap0Var = this.a;
        ap0Var.h2 = i * 1000;
        ap0Var.f1(false, true);
    }

    @Override
    public final void m() {
    }
}
