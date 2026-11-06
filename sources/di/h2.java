package di;

import c8.da;
import org.telegram.messenger.ij;
import org.telegram.messenger.mj;
import org.telegram.messenger.qp;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.w90;
import org.telegram.ui.an;
import org.telegram.ui.qm;
import org.telegram.ui.tk;
public final class h2 extends da {
    public final int f9069a;
    public final Object f9070b;

    public h2(Object obj, int i7) {
        this.f9069a = i7;
        this.f9070b = obj;
    }

    @Override
    public final void a(boolean z9) {
        ij ijVar;
        switch (this.f9069a) {
            case 0:
                i4 i4Var = (i4) this.f9070b;
                b4 b4Var = i4Var.f9221z1;
                boolean x10 = i4Var.f9196t0.W.x();
                p9 p9Var = ((g9) b4Var).d;
                p9Var.f9551i1 = x10;
                p9Var.V();
                return;
            case 1:
                an anVar = (an) this.f9070b;
                anVar.G9 = !z9;
                if (z9) {
                    if (anVar.f43944r9 != null) {
                        an.d2(anVar, 0.0f);
                        anVar.f43944r9 = null;
                    }
                    anVar.s9 = false;
                    anVar.f44034y9 = false;
                    tk tkVar = anVar.A9;
                    if (tkVar != null) {
                        org.telegram.messenger.g0.r(tkVar.H);
                        tkVar.a();
                    }
                }
                anVar.Zc();
                return;
            default:
                ca0 ca0Var = (ca0) this.f9070b;
                w90 w90Var = ca0Var.f32495e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ca0Var.f32499s;
                ia0 ia0Var = ca0Var.f32494c0;
                if (ia0Var.f34575s) {
                    if (!z9 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f38953b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z9) {
                        if (w90Var.v - w90Var.f30676u > qp.s1(ia0Var.f34577x).o4) {
                            ca0Var.g();
                            return;
                        }
                        org.telegram.ui.Cells.q9 q9Var = w90Var.W;
                        if (q9Var != null) {
                            ijVar = ((org.telegram.ui.Cells.q1) q9Var).getMessageObject();
                        } else {
                            ijVar = null;
                        }
                        ij c10 = ca0Var.c(ijVar);
                        mj mjVar = ia0Var.d;
                        if (mjVar.d == null) {
                            int i7 = w90Var.f30676u;
                            mjVar.f24028e = i7;
                            int i10 = w90Var.v;
                            mjVar.f24029f = i10;
                            mjVar.d = qm.b(i7, i10, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(ca0Var.I);
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
        switch (this.f9069a) {
            case 1:
                an anVar = (an) this.f9070b;
                kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                    if (kVar2.v()) {
                        anVar.N7(false);
                    }
                }
                anVar.f8();
                anVar.M3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
