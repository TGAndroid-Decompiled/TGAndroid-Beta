package ch;

import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.bn;
public final class q implements Runnable {
    public final int f5477a;
    public final s f5478b;

    public q(s sVar, int i7) {
        this.f5477a = i7;
        this.f5478b = sVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i7;
        int i10;
        switch (this.f5477a) {
            case 0:
                this.f5478b.c(true);
                return;
            default:
                s sVar = this.f5478b;
                sVar.f5509e = sVar.b();
                int i11 = sVar.f5510f;
                int i12 = sVar.h;
                bn bnVar = sVar.f5506a;
                if (sVar.f5507b == null) {
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
                    ?? vi0Var = new vi0(i7, bnVar.getCurrentAccount(), sVar.getContext(), sVar.f5506a, bnVar.getResourceProvider());
                    vi0Var.n1 = 1.0f;
                    vi0Var.setWillNotDraw(false);
                    sVar.f5507b = vi0Var;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    if (gd.f24213a0) {
                        i10 = 0;
                    } else {
                        i10 = i12;
                    }
                    int i13 = L + i10;
                    int L2 = org.telegram.messenger.g0.L(4.0f);
                    int L3 = org.telegram.messenger.g0.L(4.0f);
                    if (!gd.f24213a0) {
                        i12 = 0;
                    }
                    vi0Var.setPadding(i13, L2, L3 + i12, org.telegram.messenger.g0.L(i11));
                    sVar.f5507b.setDelegate(new ob.c(sVar, 10));
                    sVar.f5507b.setClipChildren(false);
                    sVar.f5507b.setClipToPadding(false);
                    sVar.addView(sVar.f5507b, ma.e(-2, i11 + 70, 5));
                }
                sVar.c(false);
                if (sVar.f5507b.isEnabled()) {
                    sVar.f5516y = true;
                    sVar.f5507b.p(sVar.f5509e, bnVar.f46154r8, true);
                    sVar.f5507b.r(false);
                    return;
                }
                sVar.f5516y = false;
                sVar.f5507b.setTransitionProgress(1.0f);
                return;
        }
    }
}
