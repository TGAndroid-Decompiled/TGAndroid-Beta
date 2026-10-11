package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.pn;
import org.telegram.ui.rl;
import org.telegram.ui.zn;
public final class t3 extends w7.h0 {
    public final int f1727a;
    public final Object f1728b;

    public t3(Object obj, int i10) {
        this.f1727a = i10;
        this.f1728b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f1727a) {
            case 0:
                f6 f6Var = (f6) this.f1728b;
                y5 y5Var = f6Var.Q1;
                boolean x10 = f6Var.K0.W.x();
                kc kcVar = ((bc) y5Var).d;
                kcVar.f1277j1 = x10;
                kcVar.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.h4) this.f1728b).I;
                if (e3Var != null) {
                    e3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                zn znVar = (zn) this.f1728b;
                znVar.f44905n9 = !z10;
                if (z10) {
                    if (znVar.f44782d9 != null) {
                        zn.W1(znVar, 0.0f);
                        znVar.f44782d9 = null;
                    }
                    znVar.f44795e9 = false;
                    znVar.f44807f9 = false;
                    rl rlVar = znVar.f44831h9;
                    if (rlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(rlVar.H);
                        rlVar.a();
                    }
                }
                znVar.zc();
                return;
            default:
                pc0 pc0Var = (pc0) this.f1728b;
                hc0 hc0Var = pc0Var.f29849e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = pc0Var.f29853s;
                vc0 vc0Var = pc0Var.f29848c0;
                if (vc0Var.f31858s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f33261b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (hc0Var.v - hc0Var.f21912u > MessagesController.getInstance(vc0Var.f31859w).quoteLengthMax) {
                            pc0Var.f();
                            return;
                        }
                        org.telegram.ui.Cells.w9 w9Var = hc0Var.W;
                        if (w9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.u1) w9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = pc0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = vc0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = hc0Var.f21912u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = hc0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = pn.b(i10, i11, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(pc0Var.I);
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
        switch (this.f1727a) {
            case 2:
                zn znVar = (zn) this.f1728b;
                kVar = ((org.telegram.ui.ActionBar.m2) znVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) znVar).actionBar;
                    if (kVar2.t()) {
                        znVar.C7(false);
                    }
                }
                znVar.T7();
                znVar.y3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
