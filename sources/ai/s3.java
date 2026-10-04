package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.nl;
import org.telegram.ui.on;
import org.telegram.ui.yn;
public final class s3 extends w7.j0 {
    public final int f1620a;
    public final Object f1621b;

    public s3(Object obj, int i10) {
        this.f1620a = i10;
        this.f1621b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f1620a) {
            case 0:
                e6 e6Var = (e6) this.f1621b;
                x5 x5Var = e6Var.Q1;
                boolean y3 = e6Var.K0.W.y();
                jc jcVar = ((ac) x5Var).d;
                jcVar.f1168j1 = y3;
                jcVar.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.i4) this.f1621b).I;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                yn ynVar = (yn) this.f1621b;
                ynVar.f43408l9 = !z10;
                if (z10) {
                    if (ynVar.f43284b9 != null) {
                        yn.V1(ynVar, 0.0f);
                        ynVar.f43284b9 = null;
                    }
                    ynVar.f43298c9 = false;
                    ynVar.f43310d9 = false;
                    nl nlVar = ynVar.f43335f9;
                    if (nlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(nlVar.H);
                        nlVar.a();
                    }
                }
                ynVar.uc();
                return;
            default:
                cc0 cc0Var = (cc0) this.f1621b;
                tb0 tb0Var = cc0Var.f25321e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = cc0Var.f25325s;
                ic0 ic0Var = cc0Var.f25320c0;
                if (ic0Var.f27362s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f27132b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (tb0Var.v - tb0Var.f21979u > MessagesController.getInstance(ic0Var.f27363w).quoteLengthMax) {
                            cc0Var.f();
                            return;
                        }
                        org.telegram.ui.Cells.y9 y9Var = tb0Var.W;
                        if (y9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.u1) y9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = cc0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = ic0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = tb0Var.f21979u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = tb0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = on.b(i10, i11, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(cc0Var.I);
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
        switch (this.f1620a) {
            case 2:
                yn ynVar = (yn) this.f1621b;
                kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                    if (kVar2.s()) {
                        ynVar.z7(false);
                    }
                }
                ynVar.Q7();
                ynVar.f43541w3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
