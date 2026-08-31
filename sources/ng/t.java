package ng;

import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.xn;
public final class t implements Runnable {
    public final int f16218a;
    public final v f16219b;

    public t(v vVar, int i10) {
        this.f16218a = i10;
        this.f16219b = vVar;
    }

    @Override
    public final void run() {
        boolean z4;
        int i10;
        int i11;
        switch (this.f16218a) {
            case 0:
                this.f16219b.c(true);
                return;
            default:
                v vVar = this.f16219b;
                vVar.f16226e = vVar.b();
                int i12 = vVar.f16227f;
                int i13 = vVar.h;
                xn xnVar = vVar.f16223a;
                if (vVar.f16224b == null) {
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
                    xn xnVar2 = vVar.f16223a;
                    ?? rk0Var = new rk0(i10, xnVar.getCurrentAccount(), vVar.getContext(), xnVar2, xnVar.getResourceProvider());
                    rk0Var.f16221i1 = 1.0f;
                    rk0Var.setWillNotDraw(false);
                    vVar.f16224b = rk0Var;
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
                    rk0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    vVar.f16224b.setDelegate(new ja.c(vVar));
                    vVar.f16224b.setClipChildren(false);
                    vVar.f16224b.setClipToPadding(false);
                    vVar.addView(vVar.f16224b, c6.e(-2, i12 + 70, 5));
                }
                vVar.c(false);
                if (vVar.f16224b.isEnabled()) {
                    vVar.f16232x = true;
                    vVar.f16224b.p(vVar.f16226e, xnVar.W7, true);
                    vVar.f16224b.r(false);
                    return;
                }
                vVar.f16232x = false;
                vVar.f16224b.setTransitionProgress(1.0f);
                return;
        }
    }
}
