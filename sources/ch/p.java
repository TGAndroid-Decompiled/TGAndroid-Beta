package ch;

import c8.ha;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.an;
public final class p implements Runnable {
    public final int f6358a;
    public final r f6359b;

    public p(r rVar, int i7) {
        this.f6358a = i7;
        this.f6359b = rVar;
    }

    @Override
    public final void run() {
        boolean z9;
        int i7;
        int i10;
        switch (this.f6358a) {
            case 0:
                this.f6359b.c(true);
                return;
            default:
                r rVar = this.f6359b;
                rVar.f6387e = rVar.b();
                int i11 = rVar.f6388f;
                int i12 = rVar.h;
                an anVar = rVar.f6384a;
                if (rVar.f6385b == null) {
                    if (anVar.getUserConfig().e() == anVar.a()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i7 = 3;
                    } else {
                        i7 = 0;
                    }
                    ?? ii0Var = new ii0(i7, anVar.getCurrentAccount(), rVar.getContext(), rVar.f6384a, anVar.getResourceProvider());
                    ii0Var.f6383m1 = 1.0f;
                    ii0Var.setWillNotDraw(false);
                    rVar.f6385b = ii0Var;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    if (hd.f22871a0) {
                        i10 = 0;
                    } else {
                        i10 = i12;
                    }
                    int i13 = L + i10;
                    int L2 = org.telegram.messenger.g0.L(4.0f);
                    int L3 = org.telegram.messenger.g0.L(4.0f);
                    if (!hd.f22871a0) {
                        i12 = 0;
                    }
                    ii0Var.setPadding(i13, L2, L3 + i12, org.telegram.messenger.g0.L(i11));
                    rVar.f6385b.setDelegate(new d6.i(rVar, 13));
                    rVar.f6385b.setClipChildren(false);
                    rVar.f6385b.setClipToPadding(false);
                    rVar.addView(rVar.f6385b, ha.e(-2, i11 + 70, 5));
                }
                rVar.c(false);
                if (rVar.f6385b.isEnabled()) {
                    rVar.f6394y = true;
                    rVar.f6385b.p(rVar.f6387e, anVar.f43892p8, true);
                    rVar.f6385b.r(false);
                    return;
                }
                rVar.f6394y = false;
                rVar.f6385b.setTransitionProgress(1.0f);
                return;
        }
    }
}
