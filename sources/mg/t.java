package mg;

import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.xn;
public final class t implements Runnable {
    public final int f14145a;
    public final v f14146b;

    public t(v vVar, int i10) {
        this.f14145a = i10;
        this.f14146b = vVar;
    }

    @Override
    public final void run() {
        boolean z4;
        int i10;
        int i11;
        switch (this.f14145a) {
            case 0:
                this.f14146b.c(true);
                return;
            default:
                v vVar = this.f14146b;
                vVar.e = vVar.b();
                int i12 = vVar.f14153f;
                int i13 = vVar.h;
                xn xnVar = vVar.f14150a;
                if (vVar.f14151b == null) {
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
                    xn xnVar2 = vVar.f14150a;
                    ?? pk0Var = new pk0(i10, xnVar.getCurrentAccount(), vVar.getContext(), xnVar2, xnVar.getResourceProvider());
                    pk0Var.f14148i1 = 1.0f;
                    pk0Var.setWillNotDraw(false);
                    vVar.f14151b = pk0Var;
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
                    pk0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    vVar.f14151b.setDelegate(new o5.i(vVar, 27));
                    vVar.f14151b.setClipChildren(false);
                    vVar.f14151b.setClipToPadding(false);
                    vVar.addView(vVar.f14151b, b6.e(-2, i12 + 70, 5));
                }
                vVar.c(false);
                if (vVar.f14151b.isEnabled()) {
                    vVar.f14158x = true;
                    vVar.f14151b.p(vVar.e, xnVar.W7, true);
                    vVar.f14151b.r(false);
                    return;
                }
                vVar.f14158x = false;
                vVar.f14151b.setTransitionProgress(1.0f);
                return;
        }
    }
}
