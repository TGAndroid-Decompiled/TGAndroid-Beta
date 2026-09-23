package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.nn;
import org.telegram.ui.ol;
import org.telegram.ui.xn;
public final class s3 extends w7.h0 {
    public final int f1488a;
    public final Object f1489b;

    public s3(Object obj, int i10) {
        this.f1488a = i10;
        this.f1489b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f1488a) {
            case 0:
                e6 e6Var = (e6) this.f1489b;
                x5 x5Var = e6Var.Q1;
                boolean y3 = e6Var.K0.W.y();
                jc jcVar = ((ac) x5Var).d;
                jcVar.f1081j1 = y3;
                jcVar.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.i4) this.f1489b).I;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                xn xnVar = (xn) this.f1489b;
                xnVar.f39479n9 = !z10;
                if (z10) {
                    if (xnVar.f39357d9 != null) {
                        xn.V1(xnVar, 0.0f);
                        xnVar.f39357d9 = null;
                    }
                    xnVar.f39369e9 = false;
                    xnVar.f39381f9 = false;
                    ol olVar = xnVar.f39405h9;
                    if (olVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(olVar.H);
                        olVar.a();
                    }
                }
                xnVar.vc();
                return;
            default:
                ob0 ob0Var = (ob0) this.f1489b;
                gb0 gb0Var = ob0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ob0Var.f26712s;
                ub0 ub0Var = ob0Var.f26708c0;
                if (ub0Var.f28454s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f28740b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (gb0Var.v - gb0Var.f20013u > MessagesController.getInstance(ub0Var.f28455w).quoteLengthMax) {
                            ob0Var.f();
                            return;
                        }
                        org.telegram.ui.Cells.z9 z9Var = gb0Var.W;
                        if (z9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.t1) z9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = ob0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = ub0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = gb0Var.f20013u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = gb0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = nn.b(i10, i11, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(ob0Var.I);
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
        switch (this.f1488a) {
            case 2:
                xn xnVar = (xn) this.f1489b;
                kVar = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) xnVar).actionBar;
                    if (kVar2.s()) {
                        xnVar.z7(false);
                    }
                }
                xnVar.Q7();
                xnVar.y3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
