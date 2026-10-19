package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.gn;
import org.telegram.ui.il;
import org.telegram.ui.qn;
public final class o2 extends w7.j0 {
    public final int f5683a;
    public final Object f5684b;

    public o2(Object obj, int i10) {
        this.f5683a = i10;
        this.f5684b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f5683a) {
            case 0:
                q4 q4Var = (q4) this.f5684b;
                j4 j4Var = q4Var.Q1;
                boolean x10 = q4Var.K0.W.x();
                aa aaVar = ((r9) j4Var).d;
                aaVar.f5197j1 = x10;
                aaVar.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.l4) this.f5684b).I;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                qn qnVar = (qn) this.f5684b;
                qnVar.f40777n9 = !z10;
                if (z10) {
                    if (qnVar.f40655d9 != null) {
                        qn.W1(qnVar, 0.0f);
                        qnVar.f40655d9 = null;
                    }
                    qnVar.f40666e9 = false;
                    qnVar.f40679f9 = false;
                    il ilVar = qnVar.f40704h9;
                    if (ilVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(ilVar.H);
                        ilVar.a();
                    }
                }
                qnVar.zc();
                return;
            default:
                ic0 ic0Var = (ic0) this.f5684b;
                ac0 ac0Var = ic0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ic0Var.f27204s;
                oc0 oc0Var = ic0Var.f27200c0;
                if (oc0Var.f28953s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f29273b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (ac0Var.v - ac0Var.f22010u > MessagesController.getInstance(oc0Var.f28954w).quoteLengthMax) {
                            ic0Var.g();
                            return;
                        }
                        org.telegram.ui.Cells.v9 v9Var = ac0Var.W;
                        if (v9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.u1) v9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = ic0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = oc0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = ac0Var.f22010u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = ac0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = gn.c(c10, i10, i11);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(ic0Var.I);
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
        switch (this.f5683a) {
            case 2:
                qn qnVar = (qn) this.f5684b;
                kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                    if (kVar2.t()) {
                        qnVar.C7(false);
                    }
                }
                qnVar.T7();
                qnVar.y3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
