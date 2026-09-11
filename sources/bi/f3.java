package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.co;
import org.telegram.ui.rl;
import org.telegram.ui.sn;
public final class f3 extends w7.h0 {
    public final int f2959a;
    public final Object f2960b;

    public f3(Object obj, int i10) {
        this.f2959a = i10;
        this.f2960b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f2959a) {
            case 0:
                o5 o5Var = (o5) this.f2960b;
                h5 h5Var = o5Var.Q1;
                boolean y3 = o5Var.K0.W.y();
                pb pbVar = ((gb) h5Var).d;
                pbVar.f3555j1 = y3;
                pbVar.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.i4) this.f2960b).I;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                co coVar = (co) this.f2960b;
                coVar.f35356n9 = !z10;
                if (z10) {
                    if (coVar.f35233d9 != null) {
                        co.V1(coVar, 0.0f);
                        coVar.f35233d9 = null;
                    }
                    coVar.f35246e9 = false;
                    coVar.f35258f9 = false;
                    rl rlVar = coVar.f35282h9;
                    if (rlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(rlVar.H);
                        rlVar.a();
                    }
                }
                coVar.vc();
                return;
            default:
                qb0 qb0Var = (qb0) this.f2960b;
                hb0 hb0Var = qb0Var.f29663e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = qb0Var.f29667s;
                wb0 wb0Var = qb0Var.f29662c0;
                if (wb0Var.f32231s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f30888b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (hb0Var.v - hb0Var.f21799u > MessagesController.getInstance(wb0Var.f32232w).quoteLengthMax) {
                            qb0Var.f();
                            return;
                        }
                        org.telegram.ui.Cells.y9 y9Var = hb0Var.W;
                        if (y9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.t1) y9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = qb0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = wb0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = hb0Var.f21799u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = hb0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = sn.b(i10, i11, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(qb0Var.I);
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
        switch (this.f2959a) {
            case 2:
                co coVar = (co) this.f2960b;
                kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                    if (kVar2.s()) {
                        coVar.z7(false);
                    }
                }
                coVar.Q7();
                coVar.y3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
