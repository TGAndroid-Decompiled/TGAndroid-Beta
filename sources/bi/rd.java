package bi;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.im;
public final class rd implements org.telegram.ui.Components.nb {
    public final int f3629a;
    public final Object f3630b;

    public rd(Object obj, int i10) {
        this.f3629a = i10;
        this.f3630b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f3629a) {
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
    public final void b(org.telegram.ui.Components.pc pcVar) {
        zh.w2 w2Var;
        switch (this.f3629a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                org.telegram.ui.Components.tb tbVar = pcVar.e;
                wh.k0 k0Var = (wh.k0) this.f3630b;
                bh.d c10 = k0Var.e.c(tbVar, null, true);
                ch.e eVar = new ch.e(wh.k0.m(k0Var));
                eVar.e = new androidx.emoji2.text.w(27);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f4691f = dpf2;
                eVar.h = dpf22;
                c10.n(eVar);
                c10.p(AndroidUtilities.dp(16.0f));
                tbVar.setCustomBackground(c10);
                return;
            case 8:
                return;
            case 9:
                if (pcVar.f26075a == 2 && (w2Var = ((zh.h2) this.f3630b).f48468x.Q1) != null) {
                    zh.u7 u7Var = ((zh.l7) w2Var).d;
                    u7Var.Y0 = true;
                    u7Var.P();
                    return;
                }
                return;
            case 10:
            default:
                return;
        }
    }

    @Override
    public final void c(float f7) {
        int i10 = this.f3629a;
    }

    @Override
    public final void d(org.telegram.ui.Components.pc pcVar) {
        zh.w2 w2Var;
        switch (this.f3629a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return;
            case 9:
                if (pcVar.f26075a == 2 && (w2Var = ((zh.h2) this.f3630b).f48468x.Q1) != null) {
                    zh.u7 u7Var = ((zh.l7) w2Var).d;
                    u7Var.Y0 = false;
                    u7Var.P();
                    return;
                }
                return;
            case 10:
            default:
                return;
        }
    }

    @Override
    public final boolean e() {
        switch (this.f3629a) {
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
        int editTextHeight;
        int dp;
        switch (this.f3629a) {
            case 0:
                editTextHeight = ((ce) this.f3630b).f2439c1.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 1:
                return ((org.telegram.ui.Components.x7) this.f3630b).e.E.getHeight();
            case 2:
                return ((org.telegram.ui.ActionBar.p2) this.f3630b).getBottomInset();
            case 3:
                org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) this.f3630b;
                if (nbVar == null) {
                    return 0;
                }
                return nbVar.f(i10);
            case 4:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((im) this.f3630b).f24045c.f26422b.getBottomInset();
                break;
            case 5:
                FrameLayout frameLayout = ((hy0) this.f3630b).f23828w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 6:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f3630b;
                if (c1Var.getParent() instanceof di.t4) {
                    di.t4 t4Var = (di.t4) c1Var.getParent();
                    return (int) ((t4Var.getSwipeOffsetY() + t4Var.getOffsetY()) - t4Var.getTopActionBarOffsetY());
                }
                return 0;
            case 7:
                return 0;
            case 8:
                return (int) ((yg.c0) ((xh.t3) this.f3630b).f46058c).f46967u;
            case 9:
                if (((zh.h2) this.f3630b).f48468x.f48226x2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 10:
                return ((zh.z3) this.f3630b).f49142r.getPaddingBottom();
            default:
                return 0;
        }
        return dp + editTextHeight;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f3629a) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) this.f3630b;
                if (nbVar != null && nbVar.g(i10)) {
                    return true;
                }
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
                return false;
            case 9:
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return true;
                }
                return false;
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f3629a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 0;
            case 3:
                org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) this.f3630b;
                if (nbVar == null) {
                    return AndroidUtilities.statusBarHeight;
                }
                return nbVar.h(i10);
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                return AndroidUtilities.statusBarHeight;
            case 8:
                return 0;
            case 9:
                return AndroidUtilities.dp(58.0f);
            case 10:
                return 0;
            default:
                return (int) (((zh.h4) this.f3630b).f48469a + AndroidUtilities.dp(58.0f));
        }
    }

    private final void A(org.telegram.ui.Components.pc pcVar) {
    }

    private final void B(org.telegram.ui.Components.pc pcVar) {
    }

    private final void C(org.telegram.ui.Components.pc pcVar) {
    }

    private final void D(org.telegram.ui.Components.pc pcVar) {
    }

    private final void E(org.telegram.ui.Components.pc pcVar) {
    }

    private final void F(org.telegram.ui.Components.pc pcVar) {
    }

    private final void G(org.telegram.ui.Components.pc pcVar) {
    }

    private final void H(org.telegram.ui.Components.pc pcVar) {
    }

    private final void I(org.telegram.ui.Components.pc pcVar) {
    }

    private final void J(org.telegram.ui.Components.pc pcVar) {
    }

    private final void K(org.telegram.ui.Components.pc pcVar) {
    }

    private final void L(org.telegram.ui.Components.pc pcVar) {
    }

    private final void M(org.telegram.ui.Components.pc pcVar) {
    }

    private final void N(org.telegram.ui.Components.pc pcVar) {
    }

    private final void O(org.telegram.ui.Components.pc pcVar) {
    }

    private final void i(float f7) {
    }

    private final void j(float f7) {
    }

    private final void k(float f7) {
    }

    private final void l(float f7) {
    }

    private final void m(float f7) {
    }

    private final void n(float f7) {
    }

    private final void o(float f7) {
    }

    private final void p(float f7) {
    }

    private final void q(float f7) {
    }

    private final void r(float f7) {
    }

    private final void s(float f7) {
    }

    private final void t(float f7) {
    }

    private final void u(org.telegram.ui.Components.pc pcVar) {
    }

    private final void v(org.telegram.ui.Components.pc pcVar) {
    }

    private final void w(org.telegram.ui.Components.pc pcVar) {
    }

    private final void x(org.telegram.ui.Components.pc pcVar) {
    }

    private final void y(org.telegram.ui.Components.pc pcVar) {
    }

    private final void z(org.telegram.ui.Components.pc pcVar) {
    }
}
