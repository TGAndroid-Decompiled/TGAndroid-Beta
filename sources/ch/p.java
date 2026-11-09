package ch;

import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.cn;
public final class p implements Runnable {
    public final int f6356a;
    public final r f6357b;

    public p(r rVar, int i7) {
        this.f6356a = i7;
        this.f6357b = rVar;
    }

    @Override
    public final void run() {
        boolean z9;
        int i7;
        int i10;
        switch (this.f6356a) {
            case 0:
                this.f6357b.c(true);
                return;
            default:
                r rVar = this.f6357b;
                rVar.f6385e = rVar.b();
                int i11 = rVar.f6386f;
                int i12 = rVar.h;
                cn cnVar = rVar.f6382a;
                if (rVar.f6383b == null) {
                    if (cnVar.getUserConfig().e() == cnVar.a()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i7 = 3;
                    } else {
                        i7 = 0;
                    }
                    ?? ji0Var = new ji0(i7, cnVar.getCurrentAccount(), rVar.getContext(), rVar.f6382a, cnVar.getResourceProvider());
                    ji0Var.f6381m1 = 1.0f;
                    ji0Var.setWillNotDraw(false);
                    rVar.f6383b = ji0Var;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    if (id.f23157a0) {
                        i10 = 0;
                    } else {
                        i10 = i12;
                    }
                    int i13 = L + i10;
                    int L2 = org.telegram.messenger.g0.L(4.0f);
                    int L3 = org.telegram.messenger.g0.L(4.0f);
                    if (!id.f23157a0) {
                        i12 = 0;
                    }
                    ji0Var.setPadding(i13, L2, L3 + i12, org.telegram.messenger.g0.L(i11));
                    rVar.f6383b.setDelegate(new d6.i(rVar, 13));
                    rVar.f6383b.setClipChildren(false);
                    rVar.f6383b.setClipToPadding(false);
                    rVar.addView(rVar.f6383b, ha.e(-2, i11 + 70, 5));
                }
                rVar.c(false);
                if (rVar.f6383b.isEnabled()) {
                    rVar.f6392y = true;
                    rVar.f6383b.p(rVar.f6385e, cnVar.f44579p8, true);
                    rVar.f6383b.r(false);
                    return;
                }
                rVar.f6392y = false;
                rVar.f6383b.setTransitionProgress(1.0f);
                return;
        }
    }
}
