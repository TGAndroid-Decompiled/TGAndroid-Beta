package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.pc0;
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
                snVar.f41768z9 = !z10;
                if (z10) {
                    if (snVar.p9 != null) {
                        sn.W1(snVar, 0.0f);
                        snVar.p9 = null;
                    }
                    snVar.f41650q9 = false;
                    snVar.f41664r9 = false;
                    jl jlVar = snVar.f41691t9;
                    if (jlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(jlVar.H);
                        jlVar.a();
                    }
                }
                snVar.Cc();
                return;
            default:
                jc0 jc0Var = (jc0) this.f5591b;
                bc0 bc0Var = jc0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jc0Var.f27678s;
                pc0 pc0Var = jc0Var.f27674c0;
                if (pc0Var.f29543s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f30508b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (bc0Var.v - bc0Var.f22185u > MessagesController.getInstance(pc0Var.f29544w).quoteLengthMax) {
                            jc0Var.g();
                            return;
                        }
                        org.telegram.ui.Cells.w9 w9Var = bc0Var.W;
                        if (w9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.t1) w9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = jc0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = pc0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = bc0Var.f22185u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = bc0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = in.c(c10, i10, i11);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(jc0Var.I);
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
