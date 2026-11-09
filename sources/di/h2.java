package di;

import c8.da;
import org.telegram.messenger.ij;
import org.telegram.messenger.mj;
import org.telegram.messenger.qp;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.cn;
import org.telegram.ui.sm;
import org.telegram.ui.vk;
public final class h2 extends da {
    public final int f9059a;
    public final Object f9060b;

    public h2(Object obj, int i7) {
        this.f9059a = i7;
        this.f9060b = obj;
    }

    @Override
    public final void a(boolean z9) {
        ij ijVar;
        switch (this.f9059a) {
            case 0:
                j4 j4Var = (j4) this.f9060b;
                c4 c4Var = j4Var.f9253z1;
                boolean x10 = j4Var.f9228t0.W.x();
                q9 q9Var = ((h9) c4Var).d;
                q9Var.f9616i1 = x10;
                q9Var.V();
                return;
            case 1:
                cn cnVar = (cn) this.f9060b;
                cnVar.I9 = !z9;
                if (z9) {
                    if (cnVar.f44631t9 != null) {
                        cn.e2(cnVar, 0.0f);
                        cnVar.f44631t9 = null;
                    }
                    cnVar.f44644u9 = false;
                    cnVar.A9 = false;
                    vk vkVar = cnVar.C9;
                    if (vkVar != null) {
                        org.telegram.messenger.g0.r(vkVar.H);
                        vkVar.a();
                    }
                }
                cnVar.cd();
                return;
            default:
                da0 da0Var = (da0) this.f9060b;
                x90 x90Var = da0Var.f32921e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = da0Var.f32925s;
                ja0 ja0Var = da0Var.f32920c0;
                if (ja0Var.f34977s) {
                    if (!z9 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f40040b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z9) {
                        if (x90Var.v - x90Var.f30684u > qp.s1(ja0Var.f34979x).o4) {
                            da0Var.g();
                            return;
                        }
                        org.telegram.ui.Cells.q9 q9Var2 = x90Var.W;
                        if (q9Var2 != null) {
                            ijVar = ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject();
                        } else {
                            ijVar = null;
                        }
                        ij c10 = da0Var.c(ijVar);
                        mj mjVar = ja0Var.d;
                        if (mjVar.d == null) {
                            int i7 = x90Var.f30684u;
                            mjVar.f24033e = i7;
                            int i10 = x90Var.v;
                            mjVar.f24034f = i10;
                            mjVar.d = sm.b(i7, i10, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(da0Var.I);
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
        switch (this.f9059a) {
            case 1:
                cn cnVar = (cn) this.f9060b;
                kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                    if (kVar2.w()) {
                        cnVar.O7(false);
                    }
                }
                cnVar.g8();
                cnVar.M3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
