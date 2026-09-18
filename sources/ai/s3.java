package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.ol;
import org.telegram.ui.pn;
import org.telegram.ui.zn;
public final class s3 extends w7.i0 {
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
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.h4) this.f1500b).I;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                zn znVar = (zn) this.f1500b;
                znVar.f40371n9 = !z10;
                if (z10) {
                    if (znVar.f40248d9 != null) {
                        zn.V1(znVar, 0.0f);
                        znVar.f40248d9 = null;
                    }
                    znVar.f40260e9 = false;
                    znVar.f40272f9 = false;
                    ol olVar = znVar.f40297h9;
                    if (olVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(olVar.H);
                        olVar.a();
                    }
                }
                znVar.vc();
                return;
            default:
                yb0 yb0Var = (yb0) this.f1500b;
                pb0 pb0Var = yb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = yb0Var.f30541s;
                ec0 ec0Var = yb0Var.f30537c0;
                if (ec0Var.f23850s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f24162b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (pb0Var.v - pb0Var.f20155u > MessagesController.getInstance(ec0Var.f23851w).quoteLengthMax) {
                            yb0Var.f();
                            return;
                        }
                        org.telegram.ui.Cells.y9 y9Var = pb0Var.W;
                        if (y9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.u1) y9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = yb0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = ec0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = pb0Var.f20155u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = pb0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = pn.b(i10, i11, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(yb0Var.I);
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
                zn znVar = (zn) this.f1500b;
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    if (kVar2.s()) {
                        znVar.z7(false);
                    }
                }
                znVar.Q7();
                znVar.y3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
