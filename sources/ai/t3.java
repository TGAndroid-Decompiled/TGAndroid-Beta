package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.eo;
import org.telegram.ui.tn;
import org.telegram.ui.vl;
public final class t3 extends w7.g0 {
    public final int f1725a;
    public final Object f1726b;

    public t3(Object obj, int i10) {
        this.f1725a = i10;
        this.f1726b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f1725a) {
            case 0:
                f6 f6Var = (f6) this.f1726b;
                y5 y5Var = f6Var.Q1;
                boolean x10 = f6Var.K0.W.x();
                kc kcVar = ((bc) y5Var).d;
                kcVar.f1275j1 = x10;
                kcVar.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.i4) this.f1726b).I;
                if (e3Var != null) {
                    e3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                eo eoVar = (eo) this.f1726b;
                eoVar.f37365n9 = !z10;
                if (z10) {
                    if (eoVar.f37242d9 != null) {
                        eo.W1(eoVar, 0.0f);
                        eoVar.f37242d9 = null;
                    }
                    eoVar.f37255e9 = false;
                    eoVar.f37267f9 = false;
                    vl vlVar = eoVar.f37291h9;
                    if (vlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(vlVar.H);
                        vlVar.a();
                    }
                }
                eoVar.zc();
                return;
            default:
                tc0 tc0Var = (tc0) this.f1726b;
                lc0 lc0Var = tc0Var.f30860e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = tc0Var.f30864s;
                zc0 zc0Var = tc0Var.f30859c0;
                if (zc0Var.f33337s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f24650b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (lc0Var.v - lc0Var.f21647u > MessagesController.getInstance(zc0Var.f33338w).quoteLengthMax) {
                            tc0Var.f();
                            return;
                        }
                        org.telegram.ui.Cells.w9 w9Var = lc0Var.W;
                        if (w9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.u1) w9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = tc0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = zc0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = lc0Var.f21647u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = lc0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = tn.b(i10, i11, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(tc0Var.I);
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
        switch (this.f1725a) {
            case 2:
                eo eoVar = (eo) this.f1726b;
                kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
                    if (kVar2.u()) {
                        eoVar.C7(false);
                    }
                }
                eoVar.T7();
                eoVar.y3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
