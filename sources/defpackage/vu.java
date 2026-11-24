package defpackage;

import android.view.View;
public final class vu extends k11 {
    public final byte d = 1;
    public final Object e;
    public final Object f;
    public final Object g;

    public vu(iv1 iv1Var, k47 k47Var, rc2 rc2Var) {
        this.g = iv1Var;
        this.e = k47Var;
        this.f = rc2Var;
    }

    @Override
    public final void b() {
        switch (this.d) {
            case 0:
                ui5 ui5Var = (ui5) this.e;
                ui5Var.c.m(ui5Var.w, true);
                View view = ui5Var.s;
                if (view != null) {
                    view.invalidate();
                }
                c(false);
                return;
            default:
                super.b();
                return;
        }
    }

    @Override
    public final void c(boolean z) {
        switch (this.d) {
            case 1:
                if (!z) {
                    gm.d3(new pp1(((iv1) this.g).a, (byte) 16), 250L);
                    return;
                }
                return;
            default:
                super.c(z);
                return;
        }
    }

    @Override
    public final void d() {
        View view;
        byte b = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                m66 m66Var = (m66) obj3;
                ui5 ui5Var = (ui5) obj2;
                ui5Var.getClass();
                i66 i66Var = ui5Var.c;
                bx bxVar = (bx) obj;
                if (bxVar != null) {
                    view = bxVar.b;
                } else {
                    view = null;
                }
                ui5Var.s = view;
                vjb vjbVar = (vjb) m66Var.i;
                i66Var.m(ui5Var.w, true);
                if (bxVar != null) {
                    ui5Var.w = i66.j(bxVar.d, m66Var.i, 0.0f);
                    int w0 = cmb.w0(null, cmb.Be, false);
                    ui5Var.w.g(cmb.p1(0.8f, w0), cmb.p1(1.3f, w0), cmb.p1(1.0f, w0), cmb.p1(4.0f, w0));
                    ui5Var.w.x.setStrokeWidth(gm.N(1.25f));
                    i66Var.b(ui5Var.w, bxVar);
                }
                View view2 = ui5Var.s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                yv1 yv1Var = ((iv1) obj3).a;
                yv1Var.kc = ((k47) obj2).e1();
                yv1Var.lc = 0;
                yv1Var.mc = null;
                ((rc2) obj).invalidate();
                return;
        }
    }

    public vu(ui5 ui5Var, bx bxVar, m66 m66Var) {
        this.e = ui5Var;
        this.f = bxVar;
        this.g = m66Var;
    }
}
