package di;

import c8.da;
import org.telegram.messenger.ij;
import org.telegram.messenger.mj;
import org.telegram.messenger.qp;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.w90;
import org.telegram.ui.cn;
import org.telegram.ui.sm;
import org.telegram.ui.vk;
public final class h2 extends da {
    public final int f9064a;
    public final Object f9065b;

    public h2(Object obj, int i7) {
        this.f9064a = i7;
        this.f9065b = obj;
    }

    @Override
    public final void a(boolean z9) {
        ij ijVar;
        switch (this.f9064a) {
            case 0:
                j4 j4Var = (j4) this.f9065b;
                c4 c4Var = j4Var.f9258z1;
                boolean x10 = j4Var.f9233t0.W.x();
                q9 q9Var = ((h9) c4Var).d;
                q9Var.f9621i1 = x10;
                q9Var.V();
                return;
            case 1:
                cn cnVar = (cn) this.f9065b;
                cnVar.I9 = !z9;
                if (z9) {
                    if (cnVar.f44672t9 != null) {
                        cn.e2(cnVar, 0.0f);
                        cnVar.f44672t9 = null;
                    }
                    cnVar.f44685u9 = false;
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
                ca0 ca0Var = (ca0) this.f9065b;
                w90 w90Var = ca0Var.f32525e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ca0Var.f32529s;
                ia0 ia0Var = ca0Var.f32524c0;
                if (ia0Var.f34586s) {
                    if (!z9 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f38991b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z9) {
                        if (w90Var.v - w90Var.f30695u > qp.s1(ia0Var.f34588x).o4) {
                            ca0Var.g();
                            return;
                        }
                        org.telegram.ui.Cells.q9 q9Var2 = w90Var.W;
                        if (q9Var2 != null) {
                            ijVar = ((org.telegram.ui.Cells.q1) q9Var2).getMessageObject();
                        } else {
                            ijVar = null;
                        }
                        ij c10 = ca0Var.c(ijVar);
                        mj mjVar = ia0Var.d;
                        if (mjVar.d == null) {
                            int i7 = w90Var.f30695u;
                            mjVar.f24037e = i7;
                            int i10 = w90Var.v;
                            mjVar.f24038f = i10;
                            mjVar.d = sm.b(i7, i10, c10);
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.f9064a) {
            case 1:
                cn cnVar = (cn) this.f9065b;
                lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                    if (lVar2.x()) {
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
