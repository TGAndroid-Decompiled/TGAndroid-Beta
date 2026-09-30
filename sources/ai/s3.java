package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.mn;
import org.telegram.ui.nl;
import org.telegram.ui.wn;
public final class s3 extends w7.i0 {
    public final int f1493a;
    public final Object f1494b;

    public s3(Object obj, int i10) {
        this.f1493a = i10;
        this.f1494b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f1493a) {
            case 0:
                e6 e6Var = (e6) this.f1494b;
                x5 x5Var = e6Var.Q1;
                boolean y3 = e6Var.K0.W.y();
                jc jcVar = ((ac) x5Var).d;
                jcVar.f1083j1 = y3;
                jcVar.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.i4) this.f1494b).I;
                if (e3Var != null) {
                    e3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                wn wnVar = (wn) this.f1494b;
                wnVar.f39671n9 = !z10;
                if (z10) {
                    if (wnVar.f39549d9 != null) {
                        wn.V1(wnVar, 0.0f);
                        wnVar.f39549d9 = null;
                    }
                    wnVar.f39561e9 = false;
                    wnVar.f39573f9 = false;
                    nl nlVar = wnVar.f39597h9;
                    if (nlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(nlVar.H);
                        nlVar.a();
                    }
                }
                wnVar.vc();
                return;
            default:
                cc0 cc0Var = (cc0) this.f1494b;
                ub0 ub0Var = cc0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = cc0Var.f23268s;
                ic0 ic0Var = cc0Var.f23264c0;
                if (ic0Var.f25077s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f25125b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (ub0Var.v - ub0Var.f20208u > MessagesController.getInstance(ic0Var.f25078w).quoteLengthMax) {
                            cc0Var.f();
                            return;
                        }
                        org.telegram.ui.Cells.y9 y9Var = ub0Var.W;
                        if (y9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.u1) y9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = cc0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = ic0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = ub0Var.f20208u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = ub0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = mn.b(i10, i11, c10);
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
        switch (this.f1493a) {
            case 2:
                wn wnVar = (wn) this.f1494b;
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                    if (kVar2.s()) {
                        wnVar.z7(false);
                    }
                }
                wnVar.Q7();
                wnVar.y3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
