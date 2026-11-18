package fi;

import c8.ha;
import org.telegram.messenger.fj;
import org.telegram.messenger.jj;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.bn;
import org.telegram.ui.rm;
import org.telegram.ui.uk;
public final class b2 extends ha {
    public final int f11762a;
    public final Object f11763b;

    public b2(Object obj, int i7) {
        this.f11762a = i7;
        this.f11763b = obj;
    }

    @Override
    public final void a(boolean z10) {
        fj fjVar;
        switch (this.f11762a) {
            case 0:
                z3 z3Var = (z3) this.f11763b;
                s3 s3Var = z3Var.A1;
                boolean x10 = z3Var.f12876u0.f12735a0.x();
                f9 f9Var = ((w8) s3Var).d;
                f9Var.f11976j1 = x10;
                f9Var.V();
                return;
            case 1:
                bn bnVar = (bn) this.f11763b;
                bnVar.K9 = !z10;
                if (z10) {
                    if (bnVar.f46205v9 != null) {
                        bn.e2(bnVar, 0.0f);
                        bnVar.f46205v9 = null;
                    }
                    bnVar.f46219w9 = false;
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
                oa0 oa0Var = (oa0) this.f11763b;
                ia0 ia0Var = oa0Var.f38046e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = oa0Var.f38050s;
                ua0 ua0Var = oa0Var.f38045d0;
                if (ua0Var.f40284s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f36113b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (ia0Var.v - ia0Var.f32269u > mp.u1(ua0Var.f40286x).f25749r4) {
                            oa0Var.g();
                            return;
                        }
                        r9 r9Var = ia0Var.W;
                        if (r9Var != null) {
                            fjVar = ((org.telegram.ui.Cells.r1) r9Var).getMessageObject();
                        } else {
                            fjVar = null;
                        }
                        fj c10 = oa0Var.c(fjVar);
                        jj jjVar = ua0Var.d;
                        if (jjVar.d == null) {
                            int i7 = ia0Var.f32269u;
                            jjVar.f24867e = i7;
                            int i10 = ia0Var.v;
                            jjVar.f24868f = i10;
                            jjVar.d = rm.b(i7, i10, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(oa0Var.J);
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
        switch (this.f11762a) {
            case 1:
                bn bnVar = (bn) this.f11763b;
                kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
                    if (kVar2.y()) {
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
