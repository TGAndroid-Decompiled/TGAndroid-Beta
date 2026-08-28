package fh;

import android.widget.FrameLayout;
import ih.d9;
import ih.m9;
import kh.wb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.q7;
import org.telegram.ui.Components.ul;
public final class y0 implements fb {
    public final int f6876a;
    public final Object f6877b;

    public y0(Object obj, int i9) {
        this.f6876a = i9;
        this.f6877b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f6876a) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                return true;
            case 10:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void b(gc gcVar) {
        org.telegram.ui.ActionBar.b6 b6Var;
        ih.c4 c4Var;
        switch (this.f6876a) {
            case 0:
                lb lbVar = gcVar.f28733e;
                z0 z0Var = (z0) this.f6877b;
                kg.d c10 = z0Var.f6899e.c(lbVar, null, true);
                b6Var = ((org.telegram.ui.ActionBar.f3) z0Var).resourcesProvider;
                lg.d dVar = new lg.d(b6Var);
                dVar.f16866e = new i3.i(25);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                dVar.f16867f = dpf2;
                dVar.h = dpf22;
                c10.n(dVar);
                c10.p(AndroidUtilities.dp(16.0f));
                lbVar.setCustomBackground(c10);
                return;
            case 1:
                return;
            case 2:
                if (gcVar.f28730a == 2 && (c4Var = ((ih.l3) this.f6877b).f11705x.M1) != null) {
                    m9 m9Var = ((d9) c4Var).d;
                    m9Var.U0 = true;
                    m9Var.P();
                    return;
                }
                return;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                return;
        }
    }

    @Override
    public final void c(float f10) {
        int i9 = this.f6876a;
    }

    @Override
    public final void d(gc gcVar) {
        ih.c4 c4Var;
        switch (this.f6876a) {
            case 0:
            case 1:
                return;
            case 2:
                if (gcVar.f28730a == 2 && (c4Var = ((ih.l3) this.f6877b).f11705x.M1) != null) {
                    m9 m9Var = ((d9) c4Var).d;
                    m9Var.U0 = false;
                    m9Var.P();
                    return;
                }
                return;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                return;
        }
    }

    @Override
    public final boolean e() {
        switch (this.f6876a) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                return true;
            case 10:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i9) {
        int editTextHeight;
        int dp;
        switch (this.f6876a) {
            case 0:
                return 0;
            case 1:
                return (int) ((hg.e0) ((v) this.f6877b).f6809b).f10592u;
            case 2:
                if (((ih.l3) this.f6877b).f11705x.f11589t2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 3:
                return ((ih.g5) this.f6877b).f11481r.getPaddingBottom();
            case 4:
                return 0;
            case 5:
                editTextHeight = ((wb) this.f6877b).Y0.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 6:
                return ((q7) this.f6877b).f31850e.A.getHeight();
            case 7:
                return ((org.telegram.ui.ActionBar.o2) this.f6877b).getBottomInset();
            case 8:
                fb fbVar = (fb) this.f6877b;
                if (fbVar == null) {
                    return 0;
                }
                return fbVar.f(i9);
            case 9:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((ul) this.f6877b).f33089c.f27493b.getBottomInset();
                break;
            case 10:
                FrameLayout frameLayout = ((cx0) this.f6877b).f27592w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            default:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.f6877b;
                if (y0Var.getParent() instanceof mh.f4) {
                    mh.f4 f4Var = (mh.f4) y0Var.getParent();
                    return (int) ((f4Var.getSwipeOffsetY() + f4Var.getOffsetY()) - f4Var.getTopActionBarOffsetY());
                }
                return 0;
        }
        return dp + editTextHeight;
    }

    @Override
    public final boolean g(int i9) {
        switch (this.f6876a) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                if (i9 == 1 || i9 == 2 || i9 == 3) {
                    return true;
                }
                return false;
            case 3:
                return false;
            case 4:
                return false;
            case 5:
                return false;
            case 6:
                return false;
            case 7:
                return false;
            case 8:
                fb fbVar = (fb) this.f6877b;
                if (fbVar != null && fbVar.g(i9)) {
                    return true;
                }
                return false;
            case 9:
                return false;
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int h(int i9) {
        switch (this.f6876a) {
            case 0:
                return AndroidUtilities.statusBarHeight;
            case 1:
                return 0;
            case 2:
                return AndroidUtilities.dp(58.0f);
            case 3:
                return 0;
            case 4:
                return (int) (((ih.r5) this.f6877b).f12068a + AndroidUtilities.dp(58.0f));
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                return 0;
            case 8:
                fb fbVar = (fb) this.f6877b;
                if (fbVar == null) {
                    return AndroidUtilities.statusBarHeight;
                }
                return fbVar.h(i9);
            case 9:
                return 0;
            case 10:
                return 0;
            default:
                return 0;
        }
    }

    private final void A(gc gcVar) {
    }

    private final void B(gc gcVar) {
    }

    private final void C(gc gcVar) {
    }

    private final void D(gc gcVar) {
    }

    private final void E(gc gcVar) {
    }

    private final void F(gc gcVar) {
    }

    private final void G(gc gcVar) {
    }

    private final void H(gc gcVar) {
    }

    private final void I(gc gcVar) {
    }

    private final void J(gc gcVar) {
    }

    private final void K(gc gcVar) {
    }

    private final void L(gc gcVar) {
    }

    private final void M(gc gcVar) {
    }

    private final void N(gc gcVar) {
    }

    private final void O(gc gcVar) {
    }

    private final void i(float f10) {
    }

    private final void j(float f10) {
    }

    private final void k(float f10) {
    }

    private final void l(float f10) {
    }

    private final void m(float f10) {
    }

    private final void n(float f10) {
    }

    private final void o(float f10) {
    }

    private final void p(float f10) {
    }

    private final void q(float f10) {
    }

    private final void r(float f10) {
    }

    private final void s(float f10) {
    }

    private final void t(float f10) {
    }

    private final void u(gc gcVar) {
    }

    private final void v(gc gcVar) {
    }

    private final void w(gc gcVar) {
    }

    private final void x(gc gcVar) {
    }

    private final void y(gc gcVar) {
    }

    private final void z(gc gcVar) {
    }
}
