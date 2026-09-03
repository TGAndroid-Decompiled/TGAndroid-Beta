package lh;

import android.widget.FrameLayout;
import oh.i9;
import oh.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.xx0;
import qh.ba;
public final class t0 implements fb {
    public final int f12973a;
    public final Object f12974b;

    public t0(Object obj, int i10) {
        this.f12973a = i10;
        this.f12974b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f12973a) {
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
    public final void b(ic icVar) {
        g6 g6Var;
        oh.z3 z3Var;
        switch (this.f12973a) {
            case 0:
                nb nbVar = icVar.f27774e;
                u0 u0Var = (u0) this.f12974b;
                qg.b c3 = u0Var.f12986e.c(nbVar, null, true);
                g6Var = ((org.telegram.ui.ActionBar.h3) u0Var).resourcesProvider;
                rg.d dVar = new rg.d(g6Var);
                dVar.f46842e = new s0.b(21);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                dVar.f46843f = dpf2;
                dVar.h = dpf22;
                c3.n(dVar);
                c3.p(AndroidUtilities.dp(16.0f));
                nbVar.setCustomBackground(c3);
                return;
            case 1:
                return;
            case 2:
                if (icVar.f27771a == 2 && (z3Var = ((oh.j3) this.f12974b).f17331x.N1) != null) {
                    i9 i9Var = ((z8) z3Var).d;
                    i9Var.V0 = true;
                    i9Var.P();
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
        int i10 = this.f12973a;
    }

    @Override
    public final void d(ic icVar) {
        oh.z3 z3Var;
        switch (this.f12973a) {
            case 0:
            case 1:
                return;
            case 2:
                if (icVar.f27771a == 2 && (z3Var = ((oh.j3) this.f12974b).f17331x.N1) != null) {
                    i9 i9Var = ((z8) z3Var).d;
                    i9Var.V0 = false;
                    i9Var.P();
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
        switch (this.f12973a) {
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
    public final int f(int i10) {
        int dp;
        int bottomInset;
        switch (this.f12973a) {
            case 0:
                return 0;
            case 1:
                return (int) ((ng.d0) ((ag.l) this.f12974b).f213c).f16053u;
            case 2:
                if (((oh.j3) this.f12974b).f17331x.f17115u2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 3:
                return ((oh.e5) this.f12974b).f17033r.getPaddingBottom();
            case 4:
                return 0;
            case 5:
                return ((r7) this.f12974b).f30677e.B.getHeight();
            case 6:
                return ((org.telegram.ui.ActionBar.p2) this.f12974b).getBottomInset();
            case 7:
                fb fbVar = (fb) this.f12974b;
                if (fbVar == null) {
                    return 0;
                }
                return fbVar.f(i10);
            case 8:
                dp = AndroidUtilities.dp(126.0f);
                bottomInset = ((bm) this.f12974b).f25661c.f26590b.getBottomInset();
                break;
            case 9:
                FrameLayout frameLayout = ((xx0) this.f12974b).f33243w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 10:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f12974b;
                if (a1Var.getParent() instanceof sh.m3) {
                    sh.m3 m3Var = (sh.m3) a1Var.getParent();
                    return (int) ((m3Var.getSwipeOffsetY() + m3Var.getOffsetY()) - m3Var.getTopActionBarOffsetY());
                }
                return 0;
            default:
                dp = ((ba) this.f12974b).Z0.getEditTextHeight();
                bottomInset = AndroidUtilities.dp(12.0f);
                break;
        }
        return bottomInset + dp;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f12973a) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                if (i10 == 1 || i10 == 2 || i10 == 3) {
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
                fb fbVar = (fb) this.f12974b;
                if (fbVar != null && fbVar.g(i10)) {
                    return true;
                }
                return false;
            case 8:
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
    public final int h(int i10) {
        switch (this.f12973a) {
            case 0:
                return AndroidUtilities.statusBarHeight;
            case 1:
                return 0;
            case 2:
                return AndroidUtilities.dp(58.0f);
            case 3:
                return 0;
            case 4:
                return (int) (((oh.q5) this.f12974b).f17660a + AndroidUtilities.dp(58.0f));
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                fb fbVar = (fb) this.f12974b;
                if (fbVar == null) {
                    return AndroidUtilities.statusBarHeight;
                }
                return fbVar.h(i10);
            case 8:
                return 0;
            case 9:
                return 0;
            case 10:
                return 0;
            default:
                return 0;
        }
    }

    private final void A(ic icVar) {
    }

    private final void B(ic icVar) {
    }

    private final void C(ic icVar) {
    }

    private final void D(ic icVar) {
    }

    private final void E(ic icVar) {
    }

    private final void F(ic icVar) {
    }

    private final void G(ic icVar) {
    }

    private final void H(ic icVar) {
    }

    private final void I(ic icVar) {
    }

    private final void J(ic icVar) {
    }

    private final void K(ic icVar) {
    }

    private final void L(ic icVar) {
    }

    private final void M(ic icVar) {
    }

    private final void N(ic icVar) {
    }

    private final void O(ic icVar) {
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

    private final void u(ic icVar) {
    }

    private final void v(ic icVar) {
    }

    private final void w(ic icVar) {
    }

    private final void x(ic icVar) {
    }

    private final void y(ic icVar) {
    }

    private final void z(ic icVar) {
    }
}
