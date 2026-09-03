package ng;

import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.xn;
public final class t implements Runnable {
    public final int f16220a;
    public final v f16221b;

    public t(v vVar, int i10) {
        this.f16220a = i10;
        this.f16221b = vVar;
    }

    @Override
    public final void run() {
        boolean z4;
        int i10;
        int i11;
        switch (this.f16220a) {
            case 0:
                this.f16221b.c(true);
                return;
            default:
                v vVar = this.f16221b;
                vVar.f16228e = vVar.b();
                int i12 = vVar.f16229f;
                int i13 = vVar.h;
                xn xnVar = vVar.f16225a;
                if (vVar.f16226b == null) {
                    if (xnVar.getUserConfig().getClientUserId() == xnVar.a()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    xn xnVar2 = vVar.f16225a;
                    ?? qk0Var = new qk0(i10, xnVar.getCurrentAccount(), vVar.getContext(), xnVar2, xnVar.getResourceProvider());
                    qk0Var.f16223i1 = 1.0f;
                    qk0Var.setWillNotDraw(false);
                    vVar.f16226b = qk0Var;
                    int dp = AndroidUtilities.dp(4.0f);
                    if (LocaleController.isRTL) {
                        i11 = 0;
                    } else {
                        i11 = i13;
                    }
                    int i14 = dp + i11;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    int dp3 = AndroidUtilities.dp(4.0f);
                    if (!LocaleController.isRTL) {
                        i13 = 0;
                    }
                    qk0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    vVar.f16226b.setDelegate(new ja.c(vVar));
                    vVar.f16226b.setClipChildren(false);
                    vVar.f16226b.setClipToPadding(false);
                    vVar.addView(vVar.f16226b, c6.e(-2, i12 + 70, 5));
                }
                vVar.c(false);
                if (vVar.f16226b.isEnabled()) {
                    vVar.f16234x = true;
                    vVar.f16226b.p(vVar.f16228e, xnVar.W7, true);
                    vVar.f16226b.r(false);
                    return;
                }
                vVar.f16234x = false;
                vVar.f16226b.setTransitionProgress(1.0f);
                return;
        }
    }
}
