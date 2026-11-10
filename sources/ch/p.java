package ch;

import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.cn;
public final class p implements Runnable {
    public final int f6361a;
    public final r f6362b;

    public p(r rVar, int i7) {
        this.f6361a = i7;
        this.f6362b = rVar;
    }

    @Override
    public final void run() {
        boolean z9;
        int i7;
        int i10;
        switch (this.f6361a) {
            case 0:
                this.f6362b.c(true);
                return;
            default:
                r rVar = this.f6362b;
                rVar.f6390e = rVar.b();
                int i11 = rVar.f6391f;
                int i12 = rVar.h;
                cn cnVar = rVar.f6387a;
                if (rVar.f6388b == null) {
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
                    ?? ii0Var = new ii0(i7, cnVar.getCurrentAccount(), rVar.getContext(), rVar.f6387a, cnVar.getResourceProvider());
                    ii0Var.f6386m1 = 1.0f;
                    ii0Var.setWillNotDraw(false);
                    rVar.f6388b = ii0Var;
                    int L = org.telegram.messenger.g0.L(4.0f);
                    if (id.f23161a0) {
                        i10 = 0;
                    } else {
                        i10 = i12;
                    }
                    int i13 = L + i10;
                    int L2 = org.telegram.messenger.g0.L(4.0f);
                    int L3 = org.telegram.messenger.g0.L(4.0f);
                    if (!id.f23161a0) {
                        i12 = 0;
                    }
                    ii0Var.setPadding(i13, L2, L3 + i12, org.telegram.messenger.g0.L(i11));
                    rVar.f6388b.setDelegate(new d6.i(rVar, 13));
                    rVar.f6388b.setClipChildren(false);
                    rVar.f6388b.setClipToPadding(false);
                    rVar.addView(rVar.f6388b, ha.e(-2, i11 + 70, 5));
                }
                rVar.c(false);
                if (rVar.f6388b.isEnabled()) {
                    rVar.f6397y = true;
                    rVar.f6388b.p(rVar.f6390e, cnVar.f44620p8, true);
                    rVar.f6388b.r(false);
                    return;
                }
                rVar.f6397y = false;
                rVar.f6388b.setTransitionProgress(1.0f);
                return;
        }
    }
}
