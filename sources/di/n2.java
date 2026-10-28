package di;

import a8.ye;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.ml;
import org.telegram.ui.mn;
import org.telegram.ui.wn;
public final class n2 extends ye {
    public final int f8811a;
    public final Object f8812b;

    public n2(Object obj, int i10) {
        this.f8811a = i10;
        this.f8812b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f8811a) {
            case 0:
                q4 q4Var = (q4) this.f8812b;
                j4 j4Var = q4Var.F1;
                boolean x9 = q4Var.f9049z0.W.x();
                y9 y9Var = ((p9) j4Var).d;
                y9Var.f9438j1 = x9;
                y9Var.Q();
                return;
            case 1:
                org.telegram.ui.ActionBar.k3 k3Var = ((org.telegram.ui.j4) this.f8812b).I;
                if (k3Var != null) {
                    k3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                wn wnVar = (wn) this.f8812b;
                wnVar.D9 = !z10;
                if (z10) {
                    if (wnVar.f45295t9 != null) {
                        wn.Z1(wnVar, 0.0f);
                        wnVar.f45295t9 = null;
                    }
                    wnVar.f45308u9 = false;
                    wnVar.f45321v9 = false;
                    ml mlVar = wnVar.x9;
                    if (mlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(mlVar.H);
                        mlVar.a();
                    }
                }
                wnVar.Mc();
                return;
            default:
                ic0 ic0Var = (ic0) this.f8812b;
                ac0 ac0Var = ic0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ic0Var.f29310s;
                oc0 oc0Var = ic0Var.f29306c0;
                if (oc0Var.f31269s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f32964b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (ac0Var.v - ac0Var.f24120u > MessagesController.getInstance(oc0Var.f31270w).quoteLengthMax) {
                            ic0Var.g();
                            return;
                        }
                        org.telegram.ui.Cells.aa aaVar = ac0Var.W;
                        if (aaVar != null) {
                            messageObject = ((org.telegram.ui.Cells.s1) aaVar).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = ic0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = oc0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = ac0Var.f24120u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = ac0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = mn.c(c10, i10, i11);
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
        switch (this.f8811a) {
            case 2:
                wn wnVar = (wn) this.f8812b;
                kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                    if (kVar2.q()) {
                        wnVar.I7(false);
                    }
                }
                wnVar.Z7();
                wnVar.K3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
