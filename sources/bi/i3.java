package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.fo;
import org.telegram.ui.un;
import org.telegram.ui.vl;
public final class i3 extends w7.j0 {
    public final int f3169a;
    public final Object f3170b;

    public i3(Object obj, int i10) {
        this.f3169a = i10;
        this.f3170b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f3169a) {
            case 0:
                q5 q5Var = (q5) this.f3170b;
                j5 j5Var = q5Var.Q1;
                boolean x10 = q5Var.K0.W.x();
                sb sbVar = ((jb) j5Var).d;
                sbVar.f3687j1 = x10;
                sbVar.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.k4) this.f3170b).I;
                if (e3Var != null) {
                    e3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                fo foVar = (fo) this.f3170b;
                foVar.f35743n9 = !z10;
                if (z10) {
                    if (foVar.f35621d9 != null) {
                        fo.W1(foVar, 0.0f);
                        foVar.f35621d9 = null;
                    }
                    foVar.f35632e9 = false;
                    foVar.f35645f9 = false;
                    vl vlVar = foVar.f35670h9;
                    if (vlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(vlVar.H);
                        vlVar.a();
                    }
                }
                foVar.zc();
                return;
            default:
                pc0 pc0Var = (pc0) this.f3170b;
                gc0 gc0Var = pc0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = pc0Var.f27971s;
                vc0 vc0Var = pc0Var.f27967c0;
                if (vc0Var.f29624s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f29646b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (gc0Var.v - gc0Var.f20686u > MessagesController.getInstance(vc0Var.f29625w).quoteLengthMax) {
                            pc0Var.f();
                            return;
                        }
                        org.telegram.ui.Cells.w9 w9Var = gc0Var.W;
                        if (w9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.u1) w9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c10 = pc0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = vc0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = gc0Var.f20686u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = gc0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = un.b(i10, i11, c10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(pc0Var.I);
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
        switch (this.f3169a) {
            case 2:
                fo foVar = (fo) this.f3170b;
                kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                    if (kVar2.t()) {
                        foVar.C7(false);
                    }
                }
                foVar.T7();
                foVar.y3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
