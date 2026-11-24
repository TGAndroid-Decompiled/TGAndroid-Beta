package defpackage;
public final class a implements Runnable {
    public final byte a;
    public final a1 b;

    public a(a1 a1Var, byte b) {
        this.a = b;
        this.b = a1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        a1 a1Var = this.b;
        switch (b) {
            case 0:
                z0 z0Var = a1Var.u2;
                if (z0Var == null || z0Var.getSelectedTone() == null) {
                    hg5 hg5Var = a1Var.y2;
                    if (hg5Var != null) {
                        hg5Var.f(true);
                        a1Var.y2 = null;
                    }
                    hg5 hg5Var2 = new hg5(a1Var.getContext(), 1);
                    a1Var.y2 = hg5Var2;
                    hg5Var2.r();
                    a1Var.y2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                    a1Var.y2.q(20.0f);
                    a1Var.y2.s(gm.L(12.0f), gm.L(4.0f), cmb.p1(0.25f, -16777216));
                    a1Var.y2.t(jb6.M0(2131755000, null));
                    if (on2.h(cmb.v0(cmb.c6, a1Var.J0)) < 0.5d) {
                        a1Var.y2.i(956301311);
                        hg5 hg5Var3 = a1Var.y2;
                        hg5Var3.I.u(-1);
                        hg5Var3.K.setColor(-1);
                        a1Var.y2.s(gm.L(12.0f), gm.L(4.0f), cmb.p1(0.12f, -16777216));
                    }
                    a1Var.y2.n(0.5f, 0.0f);
                    hg5 hg5Var4 = a1Var.y2;
                    hg5Var4.d = 8000L;
                    a1Var.b.addView(hg5Var4, qoe.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
                    a1Var.y2.v();
                    a1Var.u1();
                    return;
                }
                return;
            case 1:
                if (!a1Var.H2) {
                    a1Var.A2.setVisibility(8);
                    return;
                }
                return;
            case 2:
                if (a1Var.H2) {
                    a1Var.z2.setVisibility(8);
                    return;
                }
                return;
            case 3:
                gm.E3(a1Var.x2.d);
                return;
            default:
                a1Var.l1(0, 0, false);
                a1Var.dismiss();
                return;
        }
    }
}
