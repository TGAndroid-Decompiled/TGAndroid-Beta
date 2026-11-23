package fi;

import c8.ha;
import org.telegram.messenger.gj;
import org.telegram.messenger.kj;
import org.telegram.messenger.np;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.bn;
import org.telegram.ui.rm;
import org.telegram.ui.uk;
public final class b2 extends ha {
    public final int f11795a;
    public final Object f11796b;

    public b2(Object obj, int i7) {
        this.f11795a = i7;
        this.f11796b = obj;
    }

    @Override
    public final void a(boolean z10) {
        gj gjVar;
        switch (this.f11795a) {
            case 0:
                z3 z3Var = (z3) this.f11796b;
                s3 s3Var = z3Var.A1;
                boolean x10 = z3Var.f12920u0.f12778a0.x();
                f9 f9Var = ((w8) s3Var).d;
                f9Var.f12020j1 = x10;
                f9Var.V();
                return;
            case 1:
                bn bnVar = (bn) this.f11796b;
                bnVar.K9 = !z10;
                if (z10) {
                    if (bnVar.f46232v9 != null) {
                        bn.e2(bnVar, 0.0f);
                        bnVar.f46232v9 = null;
                    }
                    bnVar.f46246w9 = false;
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
                qa0 qa0Var = (qa0) this.f11796b;
                ka0 ka0Var = qa0Var.f38858e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = qa0Var.f38862s;
                wa0 wa0Var = qa0Var.f38857d0;
                if (wa0Var.f41743s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f36898b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (ka0Var.v - ka0Var.f32300u > np.u1(wa0Var.f41745x).f25948r4) {
                            qa0Var.g();
                            return;
                        }
                        r9 r9Var = ka0Var.W;
                        if (r9Var != null) {
                            gjVar = ((org.telegram.ui.Cells.r1) r9Var).getMessageObject();
                        } else {
                            gjVar = null;
                        }
                        gj c10 = qa0Var.c(gjVar);
                        kj kjVar = wa0Var.d;
                        if (kjVar.d == null) {
                            int i7 = ka0Var.f32300u;
                            kjVar.f25082e = i7;
                            int i10 = ka0Var.v;
                            kjVar.f25083f = i10;
                            kjVar.d = rm.b(i7, i10, c10);
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
        switch (this.f11795a) {
            case 1:
                bn bnVar = (bn) this.f11796b;
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
