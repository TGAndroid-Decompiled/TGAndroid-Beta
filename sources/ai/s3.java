package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.pl;
import org.telegram.ui.pn;
import org.telegram.ui.zn;
public final class s3 extends w7.i0 {
    public final int f1496a;
    public final Object f1497b;

    public s3(Object obj, int i10) {
        this.f1496a = i10;
        this.f1497b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f1496a) {
            case 0:
                f6 f6Var = (f6) this.f1497b;
                y5 y5Var = f6Var.Q1;
                boolean y3 = f6Var.K0.W.y();
                jc jcVar = ((ac) y5Var).d;
                jcVar.f1087j1 = y3;
                jcVar.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.h4) this.f1497b).I;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                zn znVar = (zn) this.f1497b;
                znVar.f40434n9 = !z10;
                if (z10) {
                    if (znVar.f40311d9 != null) {
                        zn.V1(znVar, 0.0f);
                        znVar.f40311d9 = null;
                    }
                    znVar.f40323e9 = false;
                    znVar.f40335f9 = false;
                    pl plVar = znVar.f40360h9;
                    if (plVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(plVar.H);
                        plVar.a();
                    }
                }
                znVar.vc();
                return;
            default:
                ac0 ac0Var = (ac0) this.f1497b;
                rb0 rb0Var = ac0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ac0Var.f22629s;
                gc0 gc0Var = ac0Var.f22625c0;
                if (gc0Var.f24500s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f24828b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (rb0Var.v - rb0Var.f20254u > MessagesController.getInstance(gc0Var.f24501w).quoteLengthMax) {
                            ac0Var.f();
                            return;
                        }
                        org.telegram.ui.Cells.z9 z9Var = rb0Var.W;
                        if (z9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.u1) z9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = ac0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = gc0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = rb0Var.f20254u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = rb0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = pn.b(i10, i11, c10);
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
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f1496a) {
            case 2:
                zn znVar = (zn) this.f1497b;
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
