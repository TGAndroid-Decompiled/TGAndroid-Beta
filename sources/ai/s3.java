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
    public final int f1499a;
    public final Object f1500b;

    public s3(Object obj, int i10) {
        this.f1499a = i10;
        this.f1500b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f1499a) {
            case 0:
                f6 f6Var = (f6) this.f1500b;
                y5 y5Var = f6Var.Q1;
                boolean y3 = f6Var.K0.W.y();
                jc jcVar = ((ac) y5Var).d;
                jcVar.f1090j1 = y3;
                jcVar.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.g3 g3Var = ((org.telegram.ui.h4) this.f1500b).I;
                if (g3Var != null) {
                    g3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                bo boVar = (bo) this.f1500b;
                boVar.f32389n9 = !z10;
                if (z10) {
                    if (boVar.f32266d9 != null) {
                        bo.V1(boVar, 0.0f);
                        boVar.f32266d9 = null;
                    }
                    boVar.f32278e9 = false;
                    boVar.f32290f9 = false;
                    rl rlVar = boVar.f32315h9;
                    if (rlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(rlVar.H);
                        rlVar.a();
                    }
                }
                boVar.vc();
                return;
            default:
                pb0 pb0Var = (pb0) this.f1500b;
                gb0 gb0Var = pb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = pb0Var.f26995s;
                vb0 vb0Var = pb0Var.f26991c0;
                if (vb0Var.f28680s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f28715b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (gb0Var.v - gb0Var.f19986u > MessagesController.getInstance(vb0Var.f28681w).quoteLengthMax) {
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
                            int i10 = gb0Var.f19986u;
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
        switch (this.f1499a) {
            case 2:
                bo boVar = (bo) this.f1500b;
                kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
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
