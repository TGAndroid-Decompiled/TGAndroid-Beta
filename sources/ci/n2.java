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
public final class n2 extends w7.j0 {
    public final int f5586a;
    public final Object f5587b;

    public n2(Object obj, int i10) {
        this.f5586a = i10;
        this.f5587b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f5586a) {
            case 0:
                p4 p4Var = (p4) this.f5587b;
                i4 i4Var = p4Var.Q1;
                boolean x10 = p4Var.K0.W.x();
                z9 z9Var = ((q9) i4Var).d;
                z9Var.f6232j1 = x10;
                z9Var.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.l4) this.f5587b).I;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                sn snVar = (sn) this.f5587b;
                snVar.f41301n9 = !z10;
                if (z10) {
                    if (snVar.f41179d9 != null) {
                        sn.W1(snVar, 0.0f);
                        snVar.f41179d9 = null;
                    }
                    snVar.f41190e9 = false;
                    snVar.f41203f9 = false;
                    kl klVar = snVar.f41228h9;
                    if (klVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(klVar.H);
                        klVar.a();
                    }
                }
                snVar.zc();
                return;
            default:
                ic0 ic0Var = (ic0) this.f5587b;
                ac0 ac0Var = ic0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ic0Var.f27189s;
                oc0 oc0Var = ic0Var.f27185c0;
                if (oc0Var.f28927s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f29303b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (ac0Var.v - ac0Var.f22009u > MessagesController.getInstance(oc0Var.f28928w).quoteLengthMax) {
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
                            int i10 = ac0Var.f22009u;
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
        switch (this.f5586a) {
            case 2:
                sn snVar = (sn) this.f5587b;
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
