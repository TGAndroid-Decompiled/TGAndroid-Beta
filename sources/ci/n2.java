package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.in;
import org.telegram.ui.jl;
import org.telegram.ui.sn;
public final class n2 extends w7.j0 {
    public final int f5590a;
    public final Object f5591b;

    public n2(Object obj, int i10) {
        this.f5590a = i10;
        this.f5591b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f5590a) {
            case 0:
                p4 p4Var = (p4) this.f5591b;
                i4 i4Var = p4Var.Q1;
                boolean x10 = p4Var.K0.W.x();
                z9 z9Var = ((q9) i4Var).d;
                z9Var.f6243j1 = x10;
                z9Var.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.h3 h3Var = ((org.telegram.ui.k4) this.f5591b).I;
                if (h3Var != null) {
                    h3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                sn snVar = (sn) this.f5591b;
                snVar.f41771z9 = !z10;
                if (z10) {
                    if (snVar.p9 != null) {
                        sn.W1(snVar, 0.0f);
                        snVar.p9 = null;
                    }
                    snVar.f41653q9 = false;
                    snVar.f41667r9 = false;
                    jl jlVar = snVar.f41694t9;
                    if (jlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(jlVar.H);
                        jlVar.a();
                    }
                }
                snVar.Cc();
                return;
            default:
                lc0 lc0Var = (lc0) this.f5591b;
                dc0 dc0Var = lc0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = lc0Var.f28344s;
                rc0 rc0Var = lc0Var.f28340c0;
                if (rc0Var.f30149s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f30704b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (dc0Var.v - dc0Var.f22184u > MessagesController.getInstance(rc0Var.f30150w).quoteLengthMax) {
                            lc0Var.g();
                            return;
                        }
                        org.telegram.ui.Cells.w9 w9Var = dc0Var.W;
                        if (w9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.t1) w9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = lc0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = rc0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = dc0Var.f22184u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = dc0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = in.c(c10, i10, i11);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(lc0Var.I);
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
        switch (this.f5590a) {
            case 2:
                sn snVar = (sn) this.f5591b;
                kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                    if (kVar2.s()) {
                        snVar.C7(false);
                    }
                }
                snVar.T7();
                snVar.K3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
