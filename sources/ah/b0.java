package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.sn;
import w7.z5;
public final class b0 implements Runnable {
    public final int f662a;
    public final f0 f663b;

    public b0(f0 f0Var, int i10) {
        this.f662a = i10;
        this.f663b = f0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f662a) {
            case 0:
                this.f663b.c(true);
                return;
            default:
                f0 f0Var = this.f663b;
                f0Var.e = f0Var.b();
                int i12 = f0Var.f728f;
                int i13 = f0Var.h;
                sn snVar = f0Var.f725a;
                if (f0Var.f726b == null) {
                    if (snVar.getUserConfig().getClientUserId() == snVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    ?? cl0Var = new cl0(i10, snVar.getCurrentAccount(), f0Var.getContext(), f0Var.f725a, snVar.getResourceProvider());
                    cl0Var.l1 = 1.0f;
                    cl0Var.setWillNotDraw(false);
                    f0Var.f726b = cl0Var;
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
                    cl0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    f0Var.f726b.setDelegate(new a6.m(f0Var, 2));
                    f0Var.f726b.setClipChildren(false);
                    f0Var.f726b.setClipToPadding(false);
                    f0Var.addView(f0Var.f726b, z5.e(-2, i12 + 70, 5));
                }
                f0Var.c(false);
                if (f0Var.f726b.isEnabled()) {
                    f0Var.f733x = true;
                    f0Var.f726b.p(f0Var.e, snVar.Z7, true);
                    f0Var.f726b.r(false);
                    return;
                }
                f0Var.f733x = false;
                f0Var.f726b.setTransitionProgress(1.0f);
                return;
        }
    }
}
