package ch;

import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.an;
public final class p implements Runnable {
    public final int f5185a;
    public final r f5186b;

    public p(r rVar, int i7) {
        this.f5185a = i7;
        this.f5186b = rVar;
    }

    @Override
    public final void run() {
        boolean z10;
        int i7;
        int i10;
        switch (this.f5185a) {
            case 0:
                this.f5186b.c(true);
                return;
            default:
                r rVar = this.f5186b;
                rVar.f5220e = rVar.b();
                int i11 = rVar.f5221f;
                int i12 = rVar.h;
                an anVar = rVar.f5217a;
                if (rVar.f5218b == null) {
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
                    ?? mi0Var = new mi0(i7, anVar.getCurrentAccount(), rVar.getContext(), rVar.f5217a, anVar.getResourceProvider());
                    mi0Var.n1 = 1.0f;
                    mi0Var.setWillNotDraw(false);
                    rVar.f5218b = mi0Var;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    if (hd.f24104a0) {
                        i10 = 0;
                    } else {
                        i10 = i12;
                    }
                    int i13 = L + i10;
                    int L2 = org.telegram.messenger.g0.L(4.0f);
                    int L3 = org.telegram.messenger.g0.L(4.0f);
                    if (!hd.f24104a0) {
                        i12 = 0;
                    }
                    mi0Var.setPadding(i13, L2, L3 + i12, org.telegram.messenger.g0.L(i11));
                    rVar.f5218b.setDelegate(new d6.i(rVar, 6));
                    rVar.f5218b.setClipChildren(false);
                    rVar.f5218b.setClipToPadding(false);
                    rVar.addView(rVar.f5218b, ja.e(-2, i11 + 70, 5));
                }
                rVar.c(false);
                if (rVar.f5218b.isEnabled()) {
                    rVar.f5227y = true;
                    rVar.f5218b.p(rVar.f5220e, anVar.f45333q8, true);
                    rVar.f5218b.r(false);
                    return;
                }
                rVar.f5227y = false;
                rVar.f5218b.setTransitionProgress(1.0f);
                return;
        }
    }
}
