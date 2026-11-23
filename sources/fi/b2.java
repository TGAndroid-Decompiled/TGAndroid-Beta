package fi;

import c8.ia;
import org.telegram.messenger.fj;
import org.telegram.messenger.jj;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.bn;
import org.telegram.ui.rm;
import org.telegram.ui.uk;
public final class b2 extends ia {
    public final int f11757a;
    public final Object f11758b;

    public b2(Object obj, int i7) {
        this.f11757a = i7;
        this.f11758b = obj;
    }

    @Override
    public final void a(boolean z10) {
        fj fjVar;
        switch (this.f11757a) {
            case 0:
                z3 z3Var = (z3) this.f11758b;
                s3 s3Var = z3Var.A1;
                boolean x10 = z3Var.f12882u0.f12740a0.x();
                f9 f9Var = ((w8) s3Var).d;
                f9Var.f11982j1 = x10;
                f9Var.V();
                return;
            case 1:
                bn bnVar = (bn) this.f11758b;
                bnVar.K9 = !z10;
                if (z10) {
                    if (bnVar.f46400v9 != null) {
                        bn.e2(bnVar, 0.0f);
                        bnVar.f46400v9 = null;
                    }
                    bnVar.f46414w9 = false;
                    bnVar.C9 = false;
                    uk ukVar = bnVar.E9;
                    if (ukVar != null) {
                        org.telegram.messenger.g0.r(ukVar.I);
                        ukVar.a();
                    }
                }
                bnVar.dd();
                return;
            default:
                na0 na0Var = (na0) this.f11758b;
                ha0 ha0Var = na0Var.f37743e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = na0Var.f37747s;
                ta0 ta0Var = na0Var.f37742d0;
                if (ta0Var.f39888s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f36399b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (ha0Var.v - ha0Var.f32289u > mp.u1(ta0Var.f39890x).f25844r4) {
                            na0Var.g();
                            return;
                        }
                        q9 q9Var = ha0Var.W;
                        if (q9Var != null) {
                            fjVar = ((org.telegram.ui.Cells.r1) q9Var).getMessageObject();
                        } else {
                            fjVar = null;
                        }
                        fj c10 = na0Var.c(fjVar);
                        jj jjVar = ta0Var.d;
                        if (jjVar.d == null) {
                            int i7 = ha0Var.f32289u;
                            jjVar.f24977e = i7;
                            int i10 = ha0Var.v;
                            jjVar.f24978f = i10;
                            jjVar.d = rm.b(i7, i10, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(na0Var.J);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f11757a) {
            case 1:
                bn bnVar = (bn) this.f11758b;
                kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                    if (kVar2.x()) {
                        bnVar.O7(false);
                    }
                }
                bnVar.h8();
                bnVar.N3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
