package ch;

import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.bn;
public final class q implements Runnable {
    public final int f5480a;
    public final s f5481b;

    public q(s sVar, int i7) {
        this.f5480a = i7;
        this.f5481b = sVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i7;
        int i10;
        switch (this.f5480a) {
            case 0:
                this.f5481b.c(true);
                return;
            default:
                s sVar = this.f5481b;
                sVar.f5512e = sVar.b();
                int i11 = sVar.f5513f;
                int i12 = sVar.h;
                bn bnVar = sVar.f5509a;
                if (sVar.f5510b == null) {
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
                    ?? vi0Var = new vi0(i7, bnVar.getCurrentAccount(), sVar.getContext(), sVar.f5509a, bnVar.getResourceProvider());
                    vi0Var.n1 = 1.0f;
                    vi0Var.setWillNotDraw(false);
                    sVar.f5510b = vi0Var;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    if (gd.f24216a0) {
                        i10 = 0;
                    } else {
                        i10 = i12;
                    }
                    int i13 = L + i10;
                    int L2 = org.telegram.messenger.g0.L(4.0f);
                    int L3 = org.telegram.messenger.g0.L(4.0f);
                    if (!gd.f24216a0) {
                        i12 = 0;
                    }
                    vi0Var.setPadding(i13, L2, L3 + i12, org.telegram.messenger.g0.L(i11));
                    sVar.f5510b.setDelegate(new ob.c(sVar, 10));
                    sVar.f5510b.setClipChildren(false);
                    sVar.f5510b.setClipToPadding(false);
                    sVar.addView(sVar.f5510b, ma.e(-2, i11 + 70, 5));
                }
                sVar.c(false);
                if (sVar.f5510b.isEnabled()) {
                    sVar.f5519y = true;
                    sVar.f5510b.p(sVar.f5512e, bnVar.f46163r8, true);
                    sVar.f5510b.r(false);
                    return;
                }
                sVar.f5519y = false;
                sVar.f5510b.setTransitionProgress(1.0f);
                return;
        }
    }
}
