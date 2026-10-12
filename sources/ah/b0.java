package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.fo;
import w7.a6;
public final class b0 implements Runnable {
    public final int f656a;
    public final f0 f657b;

    public b0(f0 f0Var, int i10) {
        this.f656a = i10;
        this.f657b = f0Var;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f656a) {
            case 0:
                this.f657b.c(true);
                return;
            default:
                f0 f0Var = this.f657b;
                f0Var.e = f0Var.b();
                int i12 = f0Var.f722f;
                int i13 = f0Var.h;
                fo foVar = f0Var.f719a;
                if (f0Var.f720b == null) {
                    if (foVar.getUserConfig().getClientUserId() == foVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    ?? gl0Var = new gl0(i10, foVar.getCurrentAccount(), f0Var.getContext(), f0Var.f719a, foVar.getResourceProvider());
                    gl0Var.l1 = 1.0f;
                    gl0Var.setWillNotDraw(false);
                    f0Var.f720b = gl0Var;
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
                    gl0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    f0Var.f720b.setDelegate(new qb.c(f0Var, 3));
                    f0Var.f720b.setClipChildren(false);
                    f0Var.f720b.setClipToPadding(false);
                    f0Var.addView(f0Var.f720b, a6.e(-2, i12 + 70, 5));
                }
                f0Var.c(false);
                if (f0Var.f720b.isEnabled()) {
                    f0Var.f727x = true;
                    f0Var.f720b.p(f0Var.e, foVar.Z7, true);
                    f0Var.f720b.r(false);
                    return;
                }
                f0Var.f727x = false;
                f0Var.f720b.setTransitionProgress(1.0f);
                return;
        }
    }
}
