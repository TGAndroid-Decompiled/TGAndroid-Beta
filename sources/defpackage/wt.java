package defpackage;

import android.view.View;
public final class wt extends l01 {
    public final byte d = 1;
    public final Object e;
    public final Object f;
    public final Object g;

    public wt(ju1 ju1Var, r47 r47Var, wb2 wb2Var) {
        this.g = ju1Var;
        this.e = r47Var;
        this.f = wb2Var;
    }

    @Override
    public final void b() {
        switch (this.d) {
            case 0:
                xi5 xi5Var = (xi5) this.e;
                xi5Var.c.m(xi5Var.w, true);
                View view = xi5Var.s;
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
                    hl.d3(new zo1(((ju1) this.g).a, (byte) 7), 250L);
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
                q66 q66Var = (q66) obj3;
                xi5 xi5Var = (xi5) obj2;
                xi5Var.getClass();
                m66 m66Var = xi5Var.c;
                cw cwVar = (cw) obj;
                if (cwVar != null) {
                    view = cwVar.b;
                } else {
                    view = null;
                }
                xi5Var.s = view;
                plb plbVar = (plb) q66Var.i;
                m66Var.m(xi5Var.w, true);
                if (cwVar != null) {
                    xi5Var.w = m66.j(cwVar.d, q66Var.i, 0.0f);
                    int w0 = aob.w0(null, aob.Ce, false);
                    xi5Var.w.g(aob.p1(0.8f, w0), aob.p1(1.3f, w0), aob.p1(1.0f, w0), aob.p1(4.0f, w0));
                    xi5Var.w.x.setStrokeWidth(hl.N(1.25f));
                    m66Var.b(xi5Var.w, cwVar);
                }
                View view2 = xi5Var.s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                zu1 zu1Var = ((ju1) obj3).a;
                zu1Var.lc = ((r47) obj2).e1();
                zu1Var.mc = 0;
                zu1Var.nc = null;
                ((wb2) obj).invalidate();
                return;
        }
    }

    public wt(xi5 xi5Var, cw cwVar, q66 q66Var) {
        this.e = xi5Var;
        this.f = cwVar;
        this.g = q66Var;
    }
}
