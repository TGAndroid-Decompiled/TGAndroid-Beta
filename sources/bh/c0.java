package bh;

import android.widget.FrameLayout;
import di.e6;
import di.j4;
import di.p9;
import di.q3;
import di.t5;
import di.y9;
import fi.sb;
import hi.n4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.ub;
public final class c0 implements ob {
    public final int f3999a;
    public final Object f4000b;

    public c0(Object obj, int i10) {
        this.f3999a = i10;
        this.f4000b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f3999a) {
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
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final void b(qc qcVar) {
        j4 j4Var;
        switch (this.f3999a) {
            case 0:
                return;
            case 1:
                if (qcVar.f31881a == 2 && (j4Var = ((q3) this.f4000b).f8964x.F1) != null) {
                    y9 y9Var = ((p9) j4Var).d;
                    y9Var.Y0 = true;
                    y9Var.P();
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return;
            default:
                ub ubVar = qcVar.e;
                zh.i0 i0Var = (zh.i0) this.f4000b;
                eh.d c10 = i0Var.e.c(ubVar, null, true);
                fh.e eVar = new fh.e(zh.i0.o(i0Var));
                eVar.e = new gh.a(1);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f10484f = dpf2;
                eVar.h = dpf22;
                c10.v(eVar);
                c10.x(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                return;
        }
    }

    @Override
    public final void c(float f7) {
        int i10 = this.f3999a;
    }

    @Override
    public final void d(qc qcVar) {
        j4 j4Var;
        switch (this.f3999a) {
            case 0:
                return;
            case 1:
                if (qcVar.f31881a == 2 && (j4Var = ((q3) this.f4000b).f8964x.F1) != null) {
                    y9 y9Var = ((p9) j4Var).d;
                    y9Var.Y0 = false;
                    y9Var.P();
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                return;
        }
    }

    @Override
    public final boolean e() {
        switch (this.f3999a) {
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
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final int f(int i10) {
        int editTextHeight;
        int dp;
        switch (this.f3999a) {
            case 0:
                return (int) ((i0) ((p) this.f4000b).f4102c).f4064u;
            case 1:
                if (((q3) this.f4000b).f8964x.f9001m2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 2:
                return ((t5) this.f4000b).f9196r.getPaddingBottom();
            case 3:
                return 0;
            case 4:
                editTextHeight = ((sb) this.f4000b).f11614c1.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 5:
                return ((a8) this.f4000b).e.f30451y.getHeight();
            case 6:
                return ((r2) this.f4000b).getBottomInset();
            case 7:
                ob obVar = (ob) this.f4000b;
                if (obVar == null) {
                    return 0;
                }
                return obVar.f(i10);
            case 8:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((pm) this.f4000b).f31604c.f30213b.getBottomInset();
                break;
            case 9:
                editTextHeight = ta0.V((ta0) this.f4000b).d;
                dp = AndroidUtilities.dp(72.0f);
                break;
            case 10:
                FrameLayout frameLayout = ((cz0) this.f4000b).f27313w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 11:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f4000b;
                if (a1Var.getParent() instanceof n4) {
                    n4 n4Var = (n4) a1Var.getParent();
                    return (int) ((n4Var.getSwipeOffsetY() + n4Var.getOffsetY()) - n4Var.getTopActionBarOffsetY());
                }
                return 0;
            default:
                return 0;
        }
        return dp + editTextHeight;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f3999a) {
            case 0:
                return false;
            case 1:
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return true;
                }
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
                return false;
            case 7:
                ob obVar = (ob) this.f4000b;
                if (obVar != null && obVar.g(i10)) {
                    return true;
                }
                return false;
            case 8:
                return false;
            case 9:
                return false;
            case 10:
                return false;
            case 11:
                return false;
            default:
                return false;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f3999a) {
            case 0:
                return 0;
            case 1:
                return AndroidUtilities.dp(58.0f);
            case 2:
                return 0;
            case 3:
                return (int) (((e6) this.f4000b).f8522a + AndroidUtilities.dp(58.0f));
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                ob obVar = (ob) this.f4000b;
                if (obVar == null) {
                    return AndroidUtilities.statusBarHeight;
                }
                return obVar.h(i10);
            case 8:
                return 0;
            case 9:
                return 0;
            case 10:
                return 0;
            case 11:
                return 0;
            default:
                return AndroidUtilities.statusBarHeight;
        }
    }

    private final void A(qc qcVar) {
    }

    private final void B(qc qcVar) {
    }

    private final void C(qc qcVar) {
    }

    private final void D(qc qcVar) {
    }

    private final void E(qc qcVar) {
    }

    private final void F(qc qcVar) {
    }

    private final void G(qc qcVar) {
    }

    private final void H(qc qcVar) {
    }

    private final void I(qc qcVar) {
    }

    private final void J(qc qcVar) {
    }

    private final void K(qc qcVar) {
    }

    private final void L(qc qcVar) {
    }

    private final void M(qc qcVar) {
    }

    private final void N(qc qcVar) {
    }

    private final void O(qc qcVar) {
    }

    private final void P(qc qcVar) {
    }

    private final void Q(qc qcVar) {
    }

    private final void R(qc qcVar) {
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

    private final void u(float f7) {
    }

    private final void v(qc qcVar) {
    }

    private final void w(qc qcVar) {
    }

    private final void x(qc qcVar) {
    }

    private final void y(qc qcVar) {
    }

    private final void z(qc qcVar) {
    }
}
