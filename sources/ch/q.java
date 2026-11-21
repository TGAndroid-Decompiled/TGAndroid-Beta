package ch;

import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.bn;
public final class q implements Runnable {
    public final int f5506a;
    public final s f5507b;

    public q(s sVar, int i7) {
        this.f5506a = i7;
        this.f5507b = sVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i7;
        int i10;
        switch (this.f5506a) {
            case 0:
                this.f5507b.c(true);
                return;
            default:
                s sVar = this.f5507b;
                sVar.f5538e = sVar.b();
                int i11 = sVar.f5539f;
                int i12 = sVar.h;
                bn bnVar = sVar.f5535a;
                if (sVar.f5536b == null) {
                    if (bnVar.getUserConfig().e() == bnVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i7 = 3;
                    } else {
                        i7 = 0;
                    }
                    ?? xi0Var = new xi0(i7, bnVar.getCurrentAccount(), sVar.getContext(), sVar.f5535a, bnVar.getResourceProvider());
                    xi0Var.n1 = 1.0f;
                    xi0Var.setWillNotDraw(false);
                    sVar.f5536b = xi0Var;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    if (gd.f24241a0) {
                        i10 = 0;
                    } else {
                        i10 = i12;
                    }
                    int i13 = L + i10;
                    int L2 = org.telegram.messenger.g0.L(4.0f);
                    int L3 = org.telegram.messenger.g0.L(4.0f);
                    if (!gd.f24241a0) {
                        i12 = 0;
                    }
                    xi0Var.setPadding(i13, L2, L3 + i12, org.telegram.messenger.g0.L(i11));
                    sVar.f5536b.setDelegate(new ob.c(sVar, 10));
                    sVar.f5536b.setClipChildren(false);
                    sVar.f5536b.setClipToPadding(false);
                    sVar.addView(sVar.f5536b, ma.e(-2, i11 + 70, 5));
                }
                sVar.c(false);
                if (sVar.f5536b.isEnabled()) {
                    sVar.f5545y = true;
                    sVar.f5536b.p(sVar.f5538e, bnVar.f46177r8, true);
                    sVar.f5536b.r(false);
                    return;
                }
                sVar.f5545y = false;
                sVar.f5536b.setTransitionProgress(1.0f);
                return;
        }
    }
}
