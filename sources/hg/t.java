package hg;

import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.qn;
public final class t implements Runnable {
    public final int f10756a;
    public final v f10757b;

    public t(v vVar, int i9) {
        this.f10756a = i9;
        this.f10757b = vVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i9;
        int i10;
        switch (this.f10756a) {
            case 0:
                this.f10757b.c(true);
                return;
            default:
                v vVar = this.f10757b;
                vVar.f10764e = vVar.b();
                int i11 = vVar.f10765f;
                int i12 = vVar.h;
                qn qnVar = vVar.f10761a;
                if (vVar.f10762b == null) {
                    if (qnVar.getUserConfig().getClientUserId() == qnVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i9 = 3;
                    } else {
                        i9 = 0;
                    }
                    qn qnVar2 = vVar.f10761a;
                    ?? uj0Var = new uj0(i9, qnVar.getCurrentAccount(), vVar.getContext(), qnVar2, qnVar.getResourceProvider());
                    uj0Var.f10758h1 = 1.0f;
                    uj0Var.setWillNotDraw(false);
                    vVar.f10762b = uj0Var;
                    int dp = AndroidUtilities.dp(4.0f);
                    if (LocaleController.isRTL) {
                        i10 = 0;
                    } else {
                        i10 = i12;
                    }
                    int i13 = dp + i10;
                    int dp2 = AndroidUtilities.dp(4.0f);
                    int dp3 = AndroidUtilities.dp(4.0f);
                    if (!LocaleController.isRTL) {
                        i12 = 0;
                    }
                    uj0Var.setPadding(i13, dp2, dp3 + i12, AndroidUtilities.dp(i11));
                    vVar.f10762b.setDelegate(new xa.c(vVar, 18));
                    vVar.f10762b.setClipChildren(false);
                    vVar.f10762b.setClipToPadding(false);
                    vVar.addView(vVar.f10762b, e6.e(-2, i11 + 70, 5));
                }
                vVar.c(false);
                if (vVar.f10762b.isEnabled()) {
                    vVar.f10770x = true;
                    vVar.f10762b.p(vVar.f10764e, qnVar.V7, true);
                    vVar.f10762b.r(false);
                    return;
                }
                vVar.f10770x = false;
                vVar.f10762b.setTransitionProgress(1.0f);
                return;
        }
    }
}
