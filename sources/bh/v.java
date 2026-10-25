package bh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.un;
public final class v implements Runnable {
    public final int f4161a;
    public final x f4162b;

    public v(x xVar, int i10) {
        this.f4161a = i10;
        this.f4162b = xVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        switch (this.f4161a) {
            case 0:
                this.f4162b.c(true);
                return;
            default:
                x xVar = this.f4162b;
                xVar.e = xVar.b();
                int i12 = xVar.f4198f;
                int i13 = xVar.h;
                un unVar = xVar.f4195a;
                if (xVar.f4196b == null) {
                    if (unVar.getUserConfig().getClientUserId() == unVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    ?? fl0Var = new fl0(i10, unVar.getCurrentAccount(), xVar.getContext(), xVar.f4195a, unVar.getResourceProvider());
                    fl0Var.f4192m1 = 1.0f;
                    fl0Var.setWillNotDraw(false);
                    xVar.f4196b = fl0Var;
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
                    fl0Var.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(i12));
                    xVar.f4196b.setDelegate(new rb.c(xVar, 9));
                    xVar.f4196b.setClipChildren(false);
                    xVar.f4196b.setClipToPadding(false);
                    xVar.addView(xVar.f4196b, gb1.i(-2, i12 + 70, 5));
                }
                xVar.c(false);
                if (xVar.f4196b.isEnabled()) {
                    xVar.f4203x = true;
                    xVar.f4196b.p(xVar.e, unVar.f44322l8, true);
                    xVar.f4196b.r(false);
                    return;
                }
                xVar.f4203x = false;
                xVar.f4196b.setTransitionProgress(1.0f);
                return;
        }
    }
}
