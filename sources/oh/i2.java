package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.nn;
import org.telegram.ui.ol;
import org.telegram.ui.xn;
public final class i2 extends k7.y5 {
    public final int f17204a;
    public final Object f17205b;

    public i2(Object obj, int i10) {
        this.f17204a = i10;
        this.f17205b = obj;
    }

    @Override
    public final void a(boolean z4) {
        MessageObject messageObject;
        switch (this.f17204a) {
            case 0:
                f4 f4Var = (f4) this.f17205b;
                z3 z3Var = f4Var.N1;
                boolean y10 = f4Var.H0.T.y();
                i9 i9Var = ((z8) z3Var).d;
                i9Var.f17270g1 = y10;
                i9Var.P();
                return;
            case 1:
                org.telegram.ui.ActionBar.h3 h3Var = ((org.telegram.ui.l4) this.f17205b).F;
                if (h3Var != null) {
                    h3Var.setDisableScroll(z4);
                    return;
                }
                return;
            case 2:
                xn xnVar = (xn) this.f17205b;
                xnVar.f43249k9 = !z4;
                if (z4) {
                    if (xnVar.f43121a9 != null) {
                        xn.V1(xnVar, 0.0f);
                        xnVar.f43121a9 = null;
                    }
                    xnVar.f43135b9 = false;
                    xnVar.f43148c9 = false;
                    ol olVar = xnVar.f43174e9;
                    if (olVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(olVar.E);
                        olVar.a();
                    }
                }
                xnVar.vc();
                return;
            default:
                sb0 sb0Var = (sb0) this.f17205b;
                jb0 jb0Var = sb0Var.f31030e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = sb0Var.f31034s;
                yb0 yb0Var = sb0Var.W;
                if (yb0Var.f33439s) {
                    if (!z4 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f25964b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z4) {
                        if (jb0Var.v - jb0Var.f24537u > MessagesController.getInstance(yb0Var.f33440w).quoteLengthMax) {
                            sb0Var.f();
                            return;
                        }
                        u9 u9Var = jb0Var.W;
                        if (u9Var != null) {
                            messageObject = ((org.telegram.ui.Cells.t1) u9Var).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        MessageObject c3 = sb0Var.c(messageObject);
                        MessagePreviewParams messagePreviewParams = yb0Var.d;
                        if (messagePreviewParams.quote == null) {
                            int i10 = jb0Var.f24537u;
                            messagePreviewParams.quoteStart = i10;
                            int i11 = jb0Var.v;
                            messagePreviewParams.quoteEnd = i11;
                            messagePreviewParams.quote = nn.b(i10, i11, c3);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(sb0Var.F);
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
        switch (this.f17204a) {
            case 2:
                xn xnVar = (xn) this.f17205b;
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                    if (kVar2.s()) {
                        xnVar.z7(false);
                    }
                }
                xnVar.Q7();
                xnVar.f43378v3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
