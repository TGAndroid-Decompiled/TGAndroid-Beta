package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.hl;
import org.telegram.ui.hn;
import org.telegram.ui.rn;

public final class h2 extends h7.j0 {

    public final int f13376a;

    public final Object f13377b;

    public h2(Object obj, int i10) {
        this.f13376a = i10;
        this.f13377b = obj;
    }

    @Override
    public final void a(boolean z10) {
        switch (this.f13376a) {
            case 0:
                e4 e4Var = (e4) this.f13377b;
                y3 y3Var = e4Var.M1;
                boolean zY = e4Var.G0.S.y();
                i9 i9Var = ((z8) y3Var).d;
                i9Var.f13480f1 = zY;
                i9Var.P();
                break;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.m4) this.f13377b).E;
                if (e3Var != null) {
                    e3Var.setDisableScroll(z10);
                }
                break;
            case 2:
                rn rnVar = (rn) this.f13377b;
                rnVar.f42099j9 = !z10;
                if (z10) {
                    if (rnVar.Z8 != null) {
                        rn.V1(rnVar, 0.0f);
                        rnVar.Z8 = null;
                    }
                    rnVar.f41982a9 = false;
                    rnVar.f41996b9 = false;
                    hl hlVar = rnVar.f42022d9;
                    if (hlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(hlVar.D);
                        hlVar.a();
                    }
                }
                rnVar.vc();
                break;
            default:
                ab0 ab0Var = (ab0) this.f13377b;
                sa0 sa0Var = ab0Var.f26715e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ab0Var.f26719s;
                gb0 gb0Var = ab0Var.V;
                if (gb0Var.f28587s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f29007b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    } else if (z10) {
                        if (sa0Var.v - sa0Var.f25895u <= MessagesController.getInstance(gb0Var.f28588w).quoteLengthMax) {
                            org.telegram.ui.Cells.r9 r9Var = sa0Var.W;
                            MessageObject messageObjectC = ab0Var.c(r9Var != null ? ((org.telegram.ui.Cells.s1) r9Var).getMessageObject() : null);
                            MessagePreviewParams messagePreviewParams = gb0Var.d;
                            if (messagePreviewParams.quote == null) {
                                int i10 = sa0Var.f25895u;
                                messagePreviewParams.quoteStart = i10;
                                int i11 = sa0Var.v;
                                messagePreviewParams.quoteEnd = i11;
                                messagePreviewParams.quote = hn.b(i10, i11, messageObjectC);
                                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(ab0Var.E);
                            }
                        } else {
                            ab0Var.f();
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override
    public void b() {
        switch (this.f13376a) {
            case 2:
                rn rnVar = (rn) this.f13377b;
                if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar != null && ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t()) {
                    rnVar.z7(false);
                }
                rnVar.Q7();
                rnVar.f42229u3.j(58, 0L, null);
                break;
        }
    }
}
