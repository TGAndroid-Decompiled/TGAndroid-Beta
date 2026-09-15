package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.bo;
import org.telegram.ui.rl;
import org.telegram.ui.rn;
public final class s3 extends w7.h0 {
    public final int f1494a;
    public final Object f1495b;

    public s3(Object obj, int i10) {
        this.f1494a = i10;
        this.f1495b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f1494a) {
            case 0:
                f6 f6Var = (f6) this.f1495b;
                y5 y5Var = f6Var.Q1;
                boolean y3 = f6Var.K0.W.y();
                jc jcVar = ((ac) y5Var).d;
                jcVar.f1085j1 = y3;
                jcVar.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.h4) this.f1495b).I;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                bo boVar = (bo) this.f1495b;
                boVar.f32407n9 = !z10;
                if (z10) {
                    if (boVar.f32284d9 != null) {
                        bo.V1(boVar, 0.0f);
                        boVar.f32284d9 = null;
                    }
                    boVar.f32296e9 = false;
                    boVar.f32308f9 = false;
                    rl rlVar = boVar.f32333h9;
                    if (rlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(rlVar.H);
                        rlVar.a();
                    }
                }
                boVar.vc();
                return;
            default:
                pb0 pb0Var = (pb0) this.f1495b;
                gb0 gb0Var = pb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = pb0Var.f27005s;
                vb0 vb0Var = pb0Var.f27001c0;
                if (vb0Var.f28684s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f28398b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (gb0Var.v - gb0Var.f19975u > MessagesController.getInstance(vb0Var.f28685w).quoteLengthMax) {
                            pb0Var.f();
                            return;
                        }
                        org.telegram.ui.Cells.y9 y9Var = gb0Var.W;
                        if (y9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.t1) y9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = pb0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = vb0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = gb0Var.f19975u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = gb0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = rn.b(i10, i11, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(pb0Var.I);
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
        switch (this.f1494a) {
            case 2:
                bo boVar = (bo) this.f1495b;
                kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                    if (kVar2.s()) {
                        boVar.z7(false);
                    }
                }
                boVar.Q7();
                boVar.y3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
