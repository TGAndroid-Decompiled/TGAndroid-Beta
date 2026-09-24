package ai;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.fy0;
public final class w4 implements org.telegram.ui.Components.ob {
    public final int f1651a;
    public final Object f1652b;

    public w4(Object obj, int i10) {
        this.f1651a = i10;
        this.f1652b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f1651a) {
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
    public final void b(org.telegram.ui.Components.qc qcVar) {
        x5 x5Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.f1651a) {
            case 0:
                if (qcVar.f27565a == 2 && (x5Var = ((a5) this.f1652b).f519x.Q1) != null) {
                    jc jcVar = ((ac) x5Var).d;
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
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                xh.j0 j0Var = (xh.j0) this.f1652b;
                ch.d c10 = j0Var.e.c(ubVar, null, true);
                d6Var = ((org.telegram.ui.ActionBar.e3) j0Var).resourcesProvider;
                dh.e eVar = new dh.e(d6Var);
                eVar.e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f7724f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(float f7) {
        int i10 = this.f1651a;
    }

    @Override
    public final void d(org.telegram.ui.Components.qc qcVar) {
        x5 x5Var;
        switch (this.f1651a) {
            case 0:
                if (qcVar.f27565a == 2 && (x5Var = ((a5) this.f1652b).f519x.Q1) != null) {
                    jc jcVar = ((ac) x5Var).d;
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
        switch (this.f1651a) {
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
        switch (this.f1651a) {
            case 0:
                if (((a5) this.f1652b).f519x.f842x2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 1:
                return ((k7) this.f1652b).f1133r.getPaddingBottom();
            case 2:
                return 0;
            case 3:
                editTextHeight = ((ci.lc) this.f1652b).f5035c1.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 4:
                return ((org.telegram.ui.Components.x7) this.f1652b).e.E.getHeight();
            case 5:
                return ((org.telegram.ui.ActionBar.m2) this.f1652b).getBottomInset();
            case 6:
                org.telegram.ui.Components.ob obVar = (org.telegram.ui.Components.ob) this.f1652b;
                if (obVar == null) {
                    return 0;
                }
                return obVar.f(i10);
            case 7:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((em) this.f1652b).f23957c.f27083b.getBottomInset();
                break;
            case 8:
                FrameLayout frameLayout = ((fy0) this.f1652b).f24293w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 9:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f1652b;
                if (b1Var.getParent() instanceof ei.p4) {
                    ei.p4 p4Var = (ei.p4) b1Var.getParent();
                    return (int) ((p4Var.getSwipeOffsetY() + p4Var.getOffsetY()) - p4Var.getTopActionBarOffsetY());
                }
                return 0;
            case 10:
                return 0;
            default:
                return (int) ((zg.b0) ((yh.t3) this.f1652b).f48024c).f49251u;
        }
        return dp + editTextHeight;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f1651a) {
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
                org.telegram.ui.Components.ob obVar = (org.telegram.ui.Components.ob) this.f1652b;
                if (obVar != null && obVar.g(i10)) {
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
        switch (this.f1651a) {
            case 0:
                return AndroidUtilities.dp(58.0f);
            case 1:
                return 0;
            case 2:
                return (int) (((v7) this.f1652b).f1615a + AndroidUtilities.dp(58.0f));
            case 3:
                return 0;
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                org.telegram.ui.Components.ob obVar = (org.telegram.ui.Components.ob) this.f1652b;
                if (obVar == null) {
                    return AndroidUtilities.statusBarHeight;
                }
                return obVar.h(i10);
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

    private final void A(org.telegram.ui.Components.qc qcVar) {
    }

    private final void B(org.telegram.ui.Components.qc qcVar) {
    }

    private final void C(org.telegram.ui.Components.qc qcVar) {
    }

    private final void D(org.telegram.ui.Components.qc qcVar) {
    }

    private final void E(org.telegram.ui.Components.qc qcVar) {
    }

    private final void F(org.telegram.ui.Components.qc qcVar) {
    }

    private final void G(org.telegram.ui.Components.qc qcVar) {
    }

    private final void H(org.telegram.ui.Components.qc qcVar) {
    }

    private final void I(org.telegram.ui.Components.qc qcVar) {
    }

    private final void J(org.telegram.ui.Components.qc qcVar) {
    }

    private final void K(org.telegram.ui.Components.qc qcVar) {
    }

    private final void L(org.telegram.ui.Components.qc qcVar) {
    }

    private final void M(org.telegram.ui.Components.qc qcVar) {
    }

    private final void N(org.telegram.ui.Components.qc qcVar) {
    }

    private final void O(org.telegram.ui.Components.qc qcVar) {
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

    private final void u(org.telegram.ui.Components.qc qcVar) {
    }

    private final void v(org.telegram.ui.Components.qc qcVar) {
    }

    private final void w(org.telegram.ui.Components.qc qcVar) {
    }

    private final void x(org.telegram.ui.Components.qc qcVar) {
    }

    private final void y(org.telegram.ui.Components.qc qcVar) {
    }

    private final void z(org.telegram.ui.Components.qc qcVar) {
    }
}
