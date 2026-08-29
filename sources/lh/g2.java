package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.il;
import org.telegram.ui.jn;
import org.telegram.ui.tn;
public final class g2 extends i7.b6 {
    public final int f15617a;
    public final Object f15618b;

    public g2(Object obj, int i10) {
        this.f15617a = i10;
        this.f15618b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f15617a) {
            case 0:
                d4 d4Var = (d4) this.f15618b;
                x3 x3Var = d4Var.M1;
                boolean y8 = d4Var.G0.S.y();
                i9 i9Var = ((z8) x3Var).d;
                i9Var.f15758f1 = y8;
                i9Var.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.m4) this.f15618b).E;
                if (f3Var != null) {
                    f3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                tn tnVar = (tn) this.f15618b;
                tnVar.f42860j9 = !z10;
                if (z10) {
                    if (tnVar.Z8 != null) {
                        tn.V1(tnVar, 0.0f);
                        tnVar.Z8 = null;
                    }
                    tnVar.f42745a9 = false;
                    tnVar.f42759b9 = false;
                    il ilVar = tnVar.f42784d9;
                    if (ilVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(ilVar.D);
                        ilVar.a();
                    }
                }
                tnVar.vc();
                return;
            default:
                lb0 lb0Var = (lb0) this.f15618b;
                db0 db0Var = lb0Var.f30276e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = lb0Var.f30280s;
                rb0 rb0Var = lb0Var.V;
                if (rb0Var.f32256s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f31942b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (db0Var.v - db0Var.f25969u > MessagesController.getInstance(rb0Var.f32257w).quoteLengthMax) {
                            lb0Var.f();
                            return;
                        }
                        s9 s9Var = db0Var.W;
                        if (s9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.s1) s9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c3 = lb0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = rb0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = db0Var.f25969u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = db0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = jn.b(i10, i11, c3);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(lb0Var.E);
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
        switch (this.f15617a) {
            case 2:
                tn tnVar = (tn) this.f15618b;
                lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                if (lVar != null) {
                    lVar2 = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                    if (lVar2.s()) {
                        tnVar.z7(false);
                    }
                }
                tnVar.Q7();
                tnVar.f42989u3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
