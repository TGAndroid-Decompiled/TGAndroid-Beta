package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.nn;
import org.telegram.ui.ol;
import org.telegram.ui.xn;
public final class h2 extends k7.x5 {
    public final int f15375a;
    public final Object f15376b;

    public h2(Object obj, int i10) {
        this.f15375a = i10;
        this.f15376b = obj;
    }

    @Override
    public final void a(boolean z4) {
        MessageObject messageObject;
        switch (this.f15375a) {
            case 0:
                d4 d4Var = (d4) this.f15376b;
                x3 x3Var = d4Var.N1;
                boolean y10 = d4Var.H0.T.y();
                i9 i9Var = ((z8) x3Var).d;
                i9Var.f15465g1 = y10;
                i9Var.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.g3 g3Var = ((org.telegram.ui.l4) this.f15376b).F;
                if (g3Var != null) {
                    g3Var.setDisableScroll(z4);
                    return;
                }
                return;
            case 2:
                xn xnVar = (xn) this.f15376b;
                xnVar.f40080k9 = !z4;
                if (z4) {
                    if (xnVar.f39953a9 != null) {
                        xn.V1(xnVar, 0.0f);
                        xnVar.f39953a9 = null;
                    }
                    xnVar.f39967b9 = false;
                    xnVar.f39980c9 = false;
                    ol olVar = xnVar.f40005e9;
                    if (olVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(olVar.E);
                        olVar.a();
                    }
                }
                xnVar.vc();
                return;
            default:
                qb0 qb0Var = (qb0) this.f15376b;
                hb0 hb0Var = qb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = qb0Var.f28108s;
                wb0 wb0Var = qb0Var.W;
                if (wb0Var.f30291s) {
                    if (!z4 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f23394b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z4) {
                        if (hb0Var.v - hb0Var.f22701u > MessagesController.getInstance(wb0Var.f30292w).quoteLengthMax) {
                            qb0Var.f();
                            return;
                        }
                        u9 u9Var = hb0Var.W;
                        if (u9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.t1) u9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c3 = qb0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = wb0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = hb0Var.f22701u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = hb0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = nn.b(i10, i11, c3);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(qb0Var.F);
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
        switch (this.f15375a) {
            case 2:
                xn xnVar = (xn) this.f15376b;
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                    if (kVar2.s()) {
                        xnVar.z7(false);
                    }
                }
                xnVar.Q7();
                xnVar.f40209v3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
