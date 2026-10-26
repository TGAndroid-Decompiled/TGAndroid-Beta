package di;

import a8.ye;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.kl;
import org.telegram.ui.kn;
import org.telegram.ui.un;
public final class n2 extends ye {
    public final int f8812a;
    public final Object f8813b;

    public n2(Object obj, int i10) {
        this.f8812a = i10;
        this.f8813b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f8812a) {
            case 0:
                q4 q4Var = (q4) this.f8813b;
                j4 j4Var = q4Var.F1;
                boolean x9 = q4Var.f9050z0.W.x();
                y9 y9Var = ((p9) j4Var).d;
                y9Var.f9439j1 = x9;
                y9Var.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.k3 k3Var = ((org.telegram.ui.j4) this.f8813b).I;
                if (k3Var != null) {
                    k3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                un unVar = (un) this.f8813b;
                unVar.f44505z9 = !z10;
                if (z10) {
                    if (unVar.f44378p9 != null) {
                        un.Y1(unVar, 0.0f);
                        unVar.f44378p9 = null;
                    }
                    unVar.q9 = false;
                    unVar.f44400r9 = false;
                    kl klVar = unVar.f44427t9;
                    if (klVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(klVar.H);
                        klVar.a();
                    }
                }
                unVar.Ic();
                return;
            default:
                hc0 hc0Var = (hc0) this.f8813b;
                zb0 zb0Var = hc0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = hc0Var.f28923s;
                nc0 nc0Var = hc0Var.f28919c0;
                if (nc0Var.f30962s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f32559b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (zb0Var.v - zb0Var.f24118u > MessagesController.getInstance(nc0Var.f30963w).quoteLengthMax) {
                            hc0Var.g();
                            return;
                        }
                        org.telegram.ui.Cells.aa aaVar = zb0Var.W;
                        if (aaVar != null) {
                            messageObject = ((org.telegram.ui.Cells.s1) aaVar).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = hc0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = nc0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = zb0Var.f24118u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = zb0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = kn.c(c10, i10, i11);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(hc0Var.I);
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
        switch (this.f8812a) {
            case 2:
                un unVar = (un) this.f8813b;
                kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                    if (kVar2.q()) {
                        unVar.G7(false);
                    }
                }
                unVar.X7();
                unVar.K3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
