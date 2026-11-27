package defpackage;
public final class a implements Runnable {
    public final byte a;
    public final b1 b;

    public a(b1 b1Var, byte b) {
        this.a = b;
        this.b = b1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        b1 b1Var = this.b;
        switch (b) {
            case 0:
                a1 a1Var = b1Var.u2;
                if (a1Var == null || a1Var.getSelectedTone() == null) {
                    kg5 kg5Var = b1Var.y2;
                    if (kg5Var != null) {
                        kg5Var.f(true);
                        b1Var.y2 = null;
                    }
                    kg5 kg5Var2 = new kg5(b1Var.getContext(), 1);
                    b1Var.y2 = kg5Var2;
                    kg5Var2.r();
                    b1Var.y2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                    b1Var.y2.q(20.0f);
                    b1Var.y2.s(hl.L(12.0f), hl.L(4.0f), aob.p1(0.25f, -16777216));
                    b1Var.y2.t(ob6.M0(2131754997, null));
                    if (vm2.h(aob.v0(aob.d6, b1Var.J0)) < 0.5d) {
                        b1Var.y2.i(956301311);
                        kg5 kg5Var3 = b1Var.y2;
                        kg5Var3.I.u(-1);
                        kg5Var3.K.setColor(-1);
                        b1Var.y2.s(hl.L(12.0f), hl.L(4.0f), aob.p1(0.12f, -16777216));
                    }
                    b1Var.y2.n(0.5f, 0.0f);
                    kg5 kg5Var4 = b1Var.y2;
                    kg5Var4.d = 8000L;
                    b1Var.b.addView(kg5Var4, tre.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
                    b1Var.y2.v();
                    b1Var.k1(true);
                    b1Var.n1.getViewTreeObserver().addOnPreDrawListener(new z(b1Var, b1Var.y2, (byte) 0));
                    return;
                }
                return;
            case 1:
                if (!b1Var.H2) {
                    b1Var.A2.setVisibility(8);
                    return;
                }
                return;
            case 2:
                if (b1Var.H2) {
                    b1Var.z2.setVisibility(8);
                    return;
                }
                return;
            case 3:
                hl.E3(b1Var.x2.d);
                return;
            default:
                b1Var.n1(0, 0, false);
                b1Var.dismiss();
                return;
        }
    }
}
