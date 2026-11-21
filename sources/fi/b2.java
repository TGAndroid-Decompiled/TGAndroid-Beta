package fi;

import c8.ha;
import org.telegram.messenger.fj;
import org.telegram.messenger.jj;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.bn;
import org.telegram.ui.rm;
import org.telegram.ui.uk;
public final class b2 extends ha {
    public final int f11792a;
    public final Object f11793b;

    public b2(Object obj, int i7) {
        this.f11792a = i7;
        this.f11793b = obj;
    }

    @Override
    public final void a(boolean z10) {
        fj fjVar;
        switch (this.f11792a) {
            case 0:
                z3 z3Var = (z3) this.f11793b;
                s3 s3Var = z3Var.A1;
                boolean x10 = z3Var.f12917u0.f12775a0.x();
                f9 f9Var = ((w8) s3Var).d;
                f9Var.f12017j1 = x10;
                f9Var.V();
                return;
            case 1:
                bn bnVar = (bn) this.f11793b;
                bnVar.K9 = !z10;
                if (z10) {
                    if (bnVar.f46228v9 != null) {
                        bn.e2(bnVar, 0.0f);
                        bnVar.f46228v9 = null;
                    }
                    bnVar.f46242w9 = false;
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
                qa0 qa0Var = (qa0) this.f11793b;
                ka0 ka0Var = qa0Var.f38865e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = qa0Var.f38869s;
                wa0 wa0Var = qa0Var.f38864d0;
                if (wa0Var.f41750s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f36896b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (ka0Var.v - ka0Var.f32297u > mp.u1(wa0Var.f41752x).f25777r4) {
                            qa0Var.g();
                            return;
                        }
                        r9 r9Var = ka0Var.W;
                        if (r9Var != null) {
                            fjVar = ((org.telegram.ui.Cells.r1) r9Var).getMessageObject();
                        } else {
                            fjVar = null;
                        }
                        fj c10 = qa0Var.c(fjVar);
                        jj jjVar = wa0Var.d;
                        if (jjVar.d == null) {
                            int i7 = ka0Var.f32297u;
                            jjVar.f24895e = i7;
                            int i10 = ka0Var.v;
                            jjVar.f24896f = i10;
                            jjVar.d = rm.b(i7, i10, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(qa0Var.J);
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
        switch (this.f11792a) {
            case 1:
                bn bnVar = (bn) this.f11793b;
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
