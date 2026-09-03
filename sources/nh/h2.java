package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.pn;
import org.telegram.ui.ql;
import org.telegram.ui.zn;
public final class h2 extends k7.x5 {
    public final int f15355a;
    public final Object f15356b;

    public h2(Object obj, int i10) {
        this.f15355a = i10;
        this.f15356b = obj;
    }

    @Override
    public final void a(boolean z4) {
        MessageObject messageObject;
        switch (this.f15355a) {
            case 0:
                d4 d4Var = (d4) this.f15356b;
                x3 x3Var = d4Var.N1;
                boolean y10 = d4Var.H0.T.y();
                i9 i9Var = ((z8) x3Var).d;
                i9Var.f15445g1 = y10;
                i9Var.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.g3 g3Var = ((org.telegram.ui.n4) this.f15356b).F;
                if (g3Var != null) {
                    g3Var.setDisableScroll(z4);
                    return;
                }
                return;
            case 2:
                zn znVar = (zn) this.f15356b;
                znVar.f40646k9 = !z4;
                if (z4) {
                    if (znVar.f40519a9 != null) {
                        zn.V1(znVar, 0.0f);
                        znVar.f40519a9 = null;
                    }
                    znVar.f40533b9 = false;
                    znVar.f40546c9 = false;
                    ql qlVar = znVar.f40571e9;
                    if (qlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(qlVar.E);
                        qlVar.a();
                    }
                }
                znVar.vc();
                return;
            default:
                rb0 rb0Var = (rb0) this.f15356b;
                ib0 ib0Var = rb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = rb0Var.f28446s;
                xb0 xb0Var = rb0Var.W;
                if (xb0Var.f30579s) {
                    if (!z4 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f23683b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z4) {
                        if (ib0Var.v - ib0Var.f22637u > MessagesController.getInstance(xb0Var.f30580w).quoteLengthMax) {
                            rb0Var.f();
                            return;
                        }
                        t9 t9Var = ib0Var.W;
                        if (t9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.s1) t9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c3 = rb0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = xb0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = ib0Var.f22637u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = ib0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = pn.b(i10, i11, c3);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(rb0Var.F);
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
        switch (this.f15355a) {
            case 2:
                zn znVar = (zn) this.f15356b;
                kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                    if (kVar2.s()) {
                        znVar.z7(false);
                    }
                }
                znVar.Q7();
                znVar.f40775v3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
