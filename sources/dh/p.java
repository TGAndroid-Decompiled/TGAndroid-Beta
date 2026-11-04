package dh;

import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.li0;
import org.telegram.ui.wm;
public final class p implements Runnable {
    public final int f9135a;
    public final r f9136b;

    public p(r rVar, int i3) {
        this.f9135a = i3;
        this.f9136b = rVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i3;
        int i10;
        switch (this.f9135a) {
            case 0:
                this.f9136b.c(true);
                return;
            default:
                r rVar = this.f9136b;
                rVar.f9143e = rVar.b();
                int i11 = rVar.f9144f;
                int i12 = rVar.h;
                wm wmVar = rVar.f9140a;
                if (rVar.f9141b == null) {
                    if (wmVar.getUserConfig().e() == wmVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i3 = 3;
                    } else {
                        i3 = 0;
                    }
                    ?? li0Var = new li0(i3, wmVar.getCurrentAccount(), rVar.getContext(), rVar.f9140a, wmVar.getResourceProvider());
                    li0Var.f9137n1 = 1.0f;
                    li0Var.setWillNotDraw(false);
                    rVar.f9141b = li0Var;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    if (bd.f21784a0) {
                        i10 = 0;
                    } else {
                        i10 = i12;
                    }
                    int i13 = L + i10;
                    int L2 = org.telegram.messenger.g0.L(4.0f);
                    int L3 = org.telegram.messenger.g0.L(4.0f);
                    if (!bd.f21784a0) {
                        i12 = 0;
                    }
                    li0Var.setPadding(i13, L2, L3 + i12, org.telegram.messenger.g0.L(i11));
                    rVar.f9141b.setDelegate(new android.support.v4.media.c(rVar, 16));
                    rVar.f9141b.setClipChildren(false);
                    rVar.f9141b.setClipToPadding(false);
                    rVar.addView(rVar.f9141b, mf.e(-2, i11 + 70, 5));
                }
                rVar.c(false);
                if (rVar.f9141b.isEnabled()) {
                    rVar.f9150y = true;
                    rVar.f9141b.p(rVar.f9143e, wmVar.f51453q8, true);
                    rVar.f9141b.r(false);
                    return;
                }
                rVar.f9150y = false;
                rVar.f9141b.setTransitionProgress(1.0f);
                return;
        }
    }
}
