package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.fl;
import org.telegram.ui.gn;
import org.telegram.ui.qn;
public final class i2 extends g7.a6 {
    public final int f11527a;
    public final Object f11528b;

    public i2(Object obj, int i9) {
        this.f11527a = i9;
        this.f11528b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f11527a) {
            case 0:
                i4 i4Var = (i4) this.f11528b;
                c4 c4Var = i4Var.M1;
                boolean y10 = i4Var.G0.S.y();
                m9 m9Var = ((d9) c4Var).d;
                m9Var.f11799f1 = y10;
                m9Var.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.l4) this.f11528b).E;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                qn qnVar = (qn) this.f11528b;
                qnVar.f41963j9 = !z10;
                if (z10) {
                    if (qnVar.Z8 != null) {
                        qn.V1(qnVar, 0.0f);
                        qnVar.Z8 = null;
                    }
                    qnVar.f41847a9 = false;
                    qnVar.f41861b9 = false;
                    fl flVar = qnVar.d9;
                    if (flVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(flVar.D);
                        flVar.a();
                    }
                }
                qnVar.vc();
                return;
            default:
                wa0 wa0Var = (wa0) this.f11528b;
                oa0 oa0Var = wa0Var.f34171e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = wa0Var.f34175s;
                cb0 cb0Var = wa0Var.V;
                if (cb0Var.f27461s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f28417b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (oa0Var.v - oa0Var.f24108u > MessagesController.getInstance(cb0Var.f27462w).quoteLengthMax) {
                            wa0Var.f();
                            return;
                        }
                        org.telegram.ui.Cells.v9 v9Var = oa0Var.W;
                        if (v9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.t1) v9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = wa0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = cb0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i9 = oa0Var.f24108u;
                            messagePreviewParams.quoteStart = i9;
                            int i10 = oa0Var.v;
                            messagePreviewParams.quoteEnd = i10;
                            messagePreviewParams.quote = gn.b(i9, i10, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(wa0Var.E);
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
        switch (this.f11527a) {
            case 2:
                qn qnVar = (qn) this.f11528b;
                kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                    if (kVar2.s()) {
                        qnVar.z7(false);
                    }
                }
                qnVar.Q7();
                qnVar.f42093u3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
