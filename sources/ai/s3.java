package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.mn;
import org.telegram.ui.nl;
import org.telegram.ui.wn;
public final class s3 extends w7.i0 {
    public final int f1488a;
    public final Object f1489b;

    public s3(Object obj, int i10) {
        this.f1488a = i10;
        this.f1489b = obj;
    }

    @Override
    public final void a(boolean z10) {
        MessageObject messageObject;
        switch (this.f1488a) {
            case 0:
                e6 e6Var = (e6) this.f1489b;
                x5 x5Var = e6Var.Q1;
                boolean y3 = e6Var.K0.W.y();
                jc jcVar = ((ac) x5Var).d;
                jcVar.f1081j1 = y3;
                jcVar.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.i4) this.f1489b).I;
                if (e3Var != null) {
                    e3Var.setDisableScroll(z10);
                    return;
                }
                return;
            case 2:
                wn wnVar = (wn) this.f1489b;
                wnVar.f39577n9 = !z10;
                if (z10) {
                    if (wnVar.f39455d9 != null) {
                        wn.V1(wnVar, 0.0f);
                        wnVar.f39455d9 = null;
                    }
                    wnVar.f39467e9 = false;
                    wnVar.f39479f9 = false;
                    nl nlVar = wnVar.f39503h9;
                    if (nlVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(nlVar.H);
                        nlVar.a();
                    }
                }
                wnVar.vc();
                return;
            default:
                ac0 ac0Var = (ac0) this.f1489b;
                sb0 sb0Var = ac0Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ac0Var.f22610s;
                gc0 gc0Var = ac0Var.f22606c0;
                if (gc0Var.f24468s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f24502b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (sb0Var.v - sb0Var.f20191u > MessagesController.getInstance(gc0Var.f24469w).quoteLengthMax) {
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
                            int i10 = sb0Var.f20191u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = sb0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = mn.b(i10, i11, c10);
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
        switch (this.f1488a) {
            case 2:
                wn wnVar = (wn) this.f1489b;
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                    if (kVar2.s()) {
                        wnVar.z7(false);
                    }
                }
                wnVar.Q7();
                wnVar.y3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
