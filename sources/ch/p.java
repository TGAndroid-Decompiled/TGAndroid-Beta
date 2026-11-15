package ch;

import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.an;
public final class p implements Runnable {
    public final int f5182a;
    public final r f5183b;

    public p(r rVar, int i7) {
        this.f5182a = i7;
        this.f5183b = rVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i7;
        int i10;
        switch (this.f5182a) {
            case 0:
                this.f5183b.c(true);
                return;
            default:
                r rVar = this.f5183b;
                rVar.f5217e = rVar.b();
                int i11 = rVar.f5218f;
                int i12 = rVar.h;
                an anVar = rVar.f5214a;
                if (rVar.f5215b == null) {
                    if (anVar.getUserConfig().e() == anVar.a()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i7 = 3;
                    } else {
                        i7 = 0;
                    }
                    ?? mi0Var = new mi0(i7, anVar.getCurrentAccount(), rVar.getContext(), rVar.f5214a, anVar.getResourceProvider());
                    mi0Var.n1 = 1.0f;
                    mi0Var.setWillNotDraw(false);
                    rVar.f5215b = mi0Var;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    if (hd.f24101a0) {
                        i10 = 0;
                    } else {
                        i10 = i12;
                    }
                    int i13 = L + i10;
                    int L2 = org.telegram.messenger.g0.L(4.0f);
                    int L3 = org.telegram.messenger.g0.L(4.0f);
                    if (!hd.f24101a0) {
                        i12 = 0;
                    }
                    mi0Var.setPadding(i13, L2, L3 + i12, org.telegram.messenger.g0.L(i11));
                    rVar.f5215b.setDelegate(new d6.i(rVar, 6));
                    rVar.f5215b.setClipChildren(false);
                    rVar.f5215b.setClipToPadding(false);
                    rVar.addView(rVar.f5215b, ja.e(-2, i11 + 70, 5));
                }
                rVar.c(false);
                if (rVar.f5215b.isEnabled()) {
                    rVar.f5224y = true;
                    rVar.f5215b.p(rVar.f5217e, anVar.f45334q8, true);
                    rVar.f5215b.r(false);
                    return;
                }
                rVar.f5224y = false;
                rVar.f5215b.setTransitionProgress(1.0f);
                return;
        }
    }
}
