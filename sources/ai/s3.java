package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.xb0;
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
                znVar.f40413n9 = !z10;
                if (z10) {
                    if (znVar.f40290d9 != null) {
                        zn.V1(znVar, 0.0f);
                        znVar.f40290d9 = null;
                    }
                    znVar.f40302e9 = false;
                    znVar.f40314f9 = false;
                    ol olVar = znVar.f40339h9;
                    if (olVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(olVar.H);
                        olVar.a();
                    }
                }
                znVar.vc();
                return;
            default:
                xb0 xb0Var = (xb0) this.f1500b;
                ob0 ob0Var = xb0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = xb0Var.f30233s;
                dc0 dc0Var = xb0Var.f30229c0;
                if (dc0Var.f23556s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f23851b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (ob0Var.v - ob0Var.f20239u > MessagesController.getInstance(dc0Var.f23557w).quoteLengthMax) {
                            xb0Var.f();
                            return;
                        }
                        org.telegram.ui.Cells.z9 z9Var = ob0Var.W;
                        if (z9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.u1) z9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = xb0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = dc0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = ob0Var.f20239u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = ob0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = pn.b(i10, i11, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(xb0Var.I);
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
