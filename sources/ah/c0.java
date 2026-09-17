package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.co;
import w7.x5;
public final class c0 implements Runnable {
    public final int f481a;
    public final g0 f482b;

    public c0(g0 g0Var, int i10) {
        this.f481a = i10;
        this.f482b = g0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f481a) {
            case 0:
                this.f482b.c(true);
                return;
            default:
                g0 g0Var = this.f482b;
                g0Var.f550e = g0Var.b();
                int i12 = g0Var.f551f;
                int i13 = g0Var.h;
                co coVar = g0Var.f547a;
                if (g0Var.f548b == null) {
                    if (coVar.getUserConfig().getClientUserId() == coVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    co coVar2 = g0Var.f547a;
                    ?? fk0Var = new fk0(i10, coVar.getCurrentAccount(), g0Var.getContext(), coVar2, coVar.getResourceProvider());
                    fk0Var.l1 = 1.0f;
                    fk0Var.setWillNotDraw(false);
                    g0Var.f548b = fk0Var;
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
                    fk0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    g0Var.f548b.setDelegate(new a6.m(g0Var, 1));
                    g0Var.f548b.setClipChildren(false);
                    g0Var.f548b.setClipToPadding(false);
                    g0Var.addView(g0Var.f548b, x5.e(-2, i12 + 70, 5));
                }
                g0Var.c(false);
                if (g0Var.f548b.isEnabled()) {
                    g0Var.f556x = true;
                    g0Var.f548b.p(g0Var.f550e, coVar.Z7, true);
                    g0Var.f548b.r(false);
                    return;
                }
                g0Var.f556x = false;
                g0Var.f548b.setTransitionProgress(1.0f);
                return;
        }
    }
}
