package ai;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.iy0;
public final class w4 implements org.telegram.ui.Components.nb {
    public final int f1647a;
    public final Object f1648b;

    public w4(Object obj, int i10) {
        this.f1647a = i10;
        this.f1648b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f1647a) {
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
        y5 y5Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.f1647a) {
            case 0:
                if (pcVar.f27305a == 2 && (y5Var = ((a5) this.f1648b).f519x.Q1) != null) {
                    jc jcVar = ((ac) y5Var).d;
                    jcVar.Y0 = true;
                    jcVar.P();
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                org.telegram.ui.Components.tb tbVar = pcVar.e;
                xh.j0 j0Var = (xh.j0) this.f1648b;
                ch.d c10 = j0Var.e.c(tbVar, null, true);
                f6Var = ((org.telegram.ui.ActionBar.f3) j0Var).resourcesProvider;
                dh.e eVar = new dh.e(f6Var);
                eVar.e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f7741f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                tbVar.setCustomBackground(c10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(float f7) {
        int i10 = this.f1647a;
    }

    @Override
    public final void d(org.telegram.ui.Components.pc pcVar) {
        y5 y5Var;
        switch (this.f1647a) {
            case 0:
                if (pcVar.f27305a == 2 && (y5Var = ((a5) this.f1648b).f519x.Q1) != null) {
                    jc jcVar = ((ac) y5Var).d;
                    jcVar.Y0 = false;
                    jcVar.P();
                    return;
                }
                return;
            case 1:
            case 2:
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
        switch (this.f1647a) {
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
        switch (this.f1647a) {
            case 0:
                if (((a5) this.f1648b).f519x.f866x2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 1:
                return ((j7) this.f1648b).f1049r.getPaddingBottom();
            case 2:
                return 0;
            case 3:
                editTextHeight = ((ci.oc) this.f1648b).f5212c1.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 4:
                return ((org.telegram.ui.Components.w7) this.f1648b).e.E.getHeight();
            case 5:
                return ((org.telegram.ui.ActionBar.n2) this.f1648b).getBottomInset();
            case 6:
                org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) this.f1648b;
                if (nbVar == null) {
                    return 0;
                }
                return nbVar.f(i10);
            case 7:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((dm) this.f1648b).f23716c.f26786b.getBottomInset();
                break;
            case 8:
                FrameLayout frameLayout = ((iy0) this.f1648b).f25221w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 9:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f1648b;
                if (d1Var.getParent() instanceof ei.p4) {
                    ei.p4 p4Var = (ei.p4) d1Var.getParent();
                    return (int) ((p4Var.getSwipeOffsetY() + p4Var.getOffsetY()) - p4Var.getTopActionBarOffsetY());
                }
                return 0;
            case 10:
                return 0;
            default:
                return (int) ((zg.c0) ((yh.u3) this.f1648b).f48128c).f49320u;
        }
        return dp + editTextHeight;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f1647a) {
            case 0:
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return true;
                }
                return false;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return false;
            case 5:
                return false;
            case 6:
                org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) this.f1648b;
                if (nbVar != null && nbVar.g(i10)) {
                    return true;
                }
                return false;
            case 7:
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
        switch (this.f1647a) {
            case 0:
                return AndroidUtilities.dp(58.0f);
            case 1:
                return 0;
            case 2:
                return (int) (((u7) this.f1648b).f1578a + AndroidUtilities.dp(58.0f));
            case 3:
                return 0;
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) this.f1648b;
                if (nbVar == null) {
                    return AndroidUtilities.statusBarHeight;
                }
                return nbVar.h(i10);
            case 7:
                return 0;
            case 8:
                return 0;
            case 9:
                return 0;
            case 10:
                return AndroidUtilities.statusBarHeight;
            default:
                return 0;
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
