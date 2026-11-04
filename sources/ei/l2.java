package ei;

import b8.hf;
import org.telegram.messenger.dj;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.x90;
import org.telegram.ui.mm;
import org.telegram.ui.pk;
import org.telegram.ui.wm;
public final class l2 extends hf {
    public final int f10602a;
    public final Object f10603b;

    public l2(Object obj, int i3) {
        this.f10602a = i3;
        this.f10603b = obj;
    }

    @Override
    public final void a(boolean z10) {
        zi ziVar;
        switch (this.f10602a) {
            case 0:
                j4 j4Var = (j4) this.f10603b;
                c4 c4Var = j4Var.A1;
                boolean x10 = j4Var.f10510u0.f10373a0.x();
                r9 r9Var = ((i9) c4Var).d;
                r9Var.k1 = x10;
                r9Var.d0();
                return;
            case 1:
                wm wmVar = (wm) this.f10603b;
                wmVar.H9 = !z10;
                if (z10) {
                    if (wmVar.f51479s9 != null) {
                        wm.d2(wmVar, 0.0f);
                        wmVar.f51479s9 = null;
                    }
                    wmVar.f51492t9 = false;
                    wmVar.f51568z9 = false;
                    pk pkVar = wmVar.B9;
                    if (pkVar != null) {
                        org.telegram.messenger.g0.r(pkVar.I);
                        pkVar.a();
                    }
                }
                wmVar.Zc();
                return;
            default:
                x90 x90Var = (x90) this.f10603b;
                r90 r90Var = x90Var.f40292e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = x90Var.f40296s;
                da0 da0Var = x90Var.f40291d0;
                if (da0Var.f33040s) {
                    if (!z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f40329b > 0.0f) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                        return;
                    } else if (z10) {
                        if (r90Var.v - r90Var.f30691u > hp.s1(da0Var.f33042x).f23081o4) {
                            x90Var.g();
                            return;
                        }
                        org.telegram.ui.Cells.p9 p9Var = r90Var.W;
                        if (p9Var != null) {
                            ziVar = ((org.telegram.ui.Cells.q1) p9Var).getMessageObject();
                        } else {
                            ziVar = null;
                        }
                        zi c2 = x90Var.c(ziVar);
                        dj djVar = da0Var.d;
                        if (djVar.d == null) {
                            int i3 = r90Var.f30691u;
                            djVar.f22200e = i3;
                            int i10 = r90Var.v;
                            djVar.f22201f = i10;
                            djVar.d = mm.b(i3, i10, c2);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(x90Var.J);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f10602a) {
            case 1:
                wm wmVar = (wm) this.f10603b;
                kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                    if (kVar2.v()) {
                        wmVar.N7(false);
                    }
                }
                wmVar.f8();
                wmVar.N3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
