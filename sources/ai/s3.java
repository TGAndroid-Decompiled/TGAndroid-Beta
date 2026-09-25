package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.mn;
import org.telegram.ui.nl;
import org.telegram.ui.wn;
public final class s3 extends w7.i0 {
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
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.i4) this.f1489b).I;
                if (e3Var != null) {
                    e3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                wn wnVar = (wn) this.f1489b;
                wnVar.f39579n9 = !z10;
                if (z10) {
                    if (wnVar.f39457d9 != null) {
                        wn.V1(wnVar, 0.0f);
                        wnVar.f39457d9 = null;
                    }
                    wnVar.f39469e9 = false;
                    wnVar.f39481f9 = false;
                    nl nlVar = wnVar.f39505h9;
                    if (nlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(nlVar.H);
                        nlVar.a();
                    }
                }
                wnVar.vc();
                return;
            default:
                zb0 zb0Var = (zb0) this.f1489b;
                rb0 rb0Var = zb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = zb0Var.f30844s;
                fc0 fc0Var = zb0Var.f30840c0;
                if (fc0Var.f24146s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f24188b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (rb0Var.v - rb0Var.f20192u > MessagesController.getInstance(fc0Var.f24147w).quoteLengthMax) {
                            zb0Var.f();
                            return;
                        }
                        org.telegram.ui.Cells.y9 y9Var = rb0Var.W;
                        if (y9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.u1) y9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = zb0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = fc0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = rb0Var.f20192u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = rb0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = mn.b(i10, i11, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(zb0Var.I);
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
                wn wnVar = (wn) this.f1489b;
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
