package fi;

import c8.fa;
import org.telegram.messenger.gj;
import org.telegram.messenger.kj;
import org.telegram.messenger.np;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.an;
import org.telegram.ui.qm;
import org.telegram.ui.tk;
public final class d2 extends fa {
    public final int f11621a;
    public final Object f11622b;

    public d2(Object obj, int i7) {
        this.f11621a = i7;
        this.f11622b = obj;
    }

    @Override
    public final void a(boolean z10) {
        gj gjVar;
        switch (this.f11621a) {
            case 0:
                b4 b4Var = (b4) this.f11622b;
                u3 u3Var = b4Var.A1;
                boolean x10 = b4Var.f11526u0.f11418a0.x();
                i9 i9Var = ((z8) u3Var).d;
                i9Var.f11854j1 = x10;
                i9Var.V();
                return;
            case 1:
                an anVar = (an) this.f11622b;
                anVar.J9 = !z10;
                if (z10) {
                    if (anVar.f45386u9 != null) {
                        an.e2(anVar, 0.0f);
                        anVar.f45386u9 = null;
                    }
                    anVar.f45399v9 = false;
                    anVar.B9 = false;
                    tk tkVar = anVar.D9;
                    if (tkVar != null) {
                        org.telegram.messenger.g0.r(tkVar.I);
                        tkVar.a();
                    }
                }
                anVar.dd();
                return;
            default:
                da0 da0Var = (da0) this.f11622b;
                x90 x90Var = da0Var.f33901e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = da0Var.f33905s;
                ja0 ja0Var = da0Var.f33900d0;
                if (ja0Var.f35955s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f41980b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (x90Var.v - x90Var.f31767u > np.s1(ja0Var.f35957x).f25361p4) {
                            da0Var.g();
                            return;
                        }
                        org.telegram.ui.Cells.p9 p9Var = x90Var.W;
                        if (p9Var != null) {
                            gjVar = ((org.telegram.ui.Cells.q1) p9Var).getMessageObject();
                        } else {
                            gjVar = null;
                        }
                        gj c10 = da0Var.c(gjVar);
                        kj kjVar = ja0Var.d;
                        if (kjVar.d == null) {
                            int i7 = x90Var.f31767u;
                            kjVar.f24706e = i7;
                            int i10 = x90Var.v;
                            kjVar.f24707f = i10;
                            kjVar.d = qm.b(i7, i10, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(da0Var.J);
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
        switch (this.f11621a) {
            case 1:
                an anVar = (an) this.f11622b;
                kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                    if (kVar2.x()) {
                        anVar.O7(false);
                    }
                }
                anVar.h8();
                anVar.N3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
