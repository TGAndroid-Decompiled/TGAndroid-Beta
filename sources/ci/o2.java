package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.in;
import org.telegram.ui.kl;
import org.telegram.ui.sn;
public final class o2 extends w7.j0 {
    public final int f5685a;
    public final Object f5686b;

    public o2(Object obj, int i10) {
        this.f5685a = i10;
        this.f5686b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f5685a) {
            case 0:
                q4 q4Var = (q4) this.f5686b;
                j4 j4Var = q4Var.Q1;
                boolean x10 = q4Var.K0.W.x();
                aa aaVar = ((r9) j4Var).d;
                aaVar.f5199j1 = x10;
                aaVar.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.l4) this.f5686b).I;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                sn snVar = (sn) this.f5686b;
                snVar.f41315n9 = !z10;
                if (z10) {
                    if (snVar.f41193d9 != null) {
                        sn.W1(snVar, 0.0f);
                        snVar.f41193d9 = null;
                    }
                    snVar.f41204e9 = false;
                    snVar.f41217f9 = false;
                    kl klVar = snVar.f41242h9;
                    if (klVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(klVar.H);
                        klVar.a();
                    }
                }
                snVar.zc();
                return;
            default:
                ic0 ic0Var = (ic0) this.f5686b;
                ac0 ac0Var = ic0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ic0Var.f27189s;
                oc0 oc0Var = ic0Var.f27185c0;
                if (oc0Var.f28927s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f29303b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (ac0Var.v - ac0Var.f22011u > MessagesController.getInstance(oc0Var.f28928w).quoteLengthMax) {
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
                            int i10 = ac0Var.f22011u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = ac0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = in.c(c10, i10, i11);
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
        switch (this.f5685a) {
            case 2:
                sn snVar = (sn) this.f5686b;
                kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                    if (kVar2.s()) {
                        snVar.C7(false);
                    }
                }
                snVar.T7();
                snVar.y3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
