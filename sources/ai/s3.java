package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.nn;
import org.telegram.ui.ol;
import org.telegram.ui.xn;
public final class s3 extends w7.i0 {
    public final int f1490a;
    public final Object f1491b;

    public s3(Object obj, int i10) {
        this.f1490a = i10;
        this.f1491b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f1490a) {
            case 0:
                e6 e6Var = (e6) this.f1491b;
                x5 x5Var = e6Var.Q1;
                boolean y3 = e6Var.K0.W.y();
                jc jcVar = ((ac) x5Var).d;
                jcVar.f1083j1 = y3;
                jcVar.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.g3 g3Var = ((org.telegram.ui.j4) this.f1491b).I;
                if (g3Var != null) {
                    g3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                xn xnVar = (xn) this.f1491b;
                xnVar.f39860n9 = !z10;
                if (z10) {
                    if (xnVar.f39737d9 != null) {
                        xn.V1(xnVar, 0.0f);
                        xnVar.f39737d9 = null;
                    }
                    xnVar.f39749e9 = false;
                    xnVar.f39761f9 = false;
                    ol olVar = xnVar.f39786h9;
                    if (olVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(olVar.H);
                        olVar.a();
                    }
                }
                xnVar.vc();
                return;
            default:
                ac0 ac0Var = (ac0) this.f1491b;
                sb0 sb0Var = ac0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ac0Var.f22654s;
                gc0 gc0Var = ac0Var.f22650c0;
                if (gc0Var.f24546s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f24840b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (sb0Var.v - sb0Var.f20193u > MessagesController.getInstance(gc0Var.f24547w).quoteLengthMax) {
                            ac0Var.f();
                            return;
                        }
                        org.telegram.ui.Cells.y9 y9Var = sb0Var.W;
                        if (y9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.u1) y9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = ac0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = gc0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = sb0Var.f20193u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = sb0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = nn.b(i10, i11, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(ac0Var.I);
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.f1490a) {
            case 2:
                xn xnVar = (xn) this.f1491b;
                lVar = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.o2) xnVar).actionBar;
                    if (lVar2.t()) {
                        xnVar.z7(false);
                    }
                }
                xnVar.Q7();
                xnVar.y3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
