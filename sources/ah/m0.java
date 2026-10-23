package ah;

import android.widget.FrameLayout;
import ci.e6;
import ci.i4;
import ci.q3;
import ci.q9;
import ci.t5;
import ci.z9;
import ei.vb;
import gi.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.y7;
public final class m0 implements ob {
    public final int f829a;
    public final Object f830b;

    public m0(Object obj, int i10) {
        this.f829a = i10;
        this.f830b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f829a) {
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
    public final void b(qc qcVar) {
        i4 i4Var;
        switch (this.f829a) {
            case 0:
                return;
            case 1:
                if (qcVar.f29826a == 2 && (i4Var = ((q3) this.f830b).f5782x.Q1) != null) {
                    z9 z9Var = ((q9) i4Var).d;
                    z9Var.Y0 = true;
                    z9Var.P();
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
                return;
            default:
                ub ubVar = qcVar.e;
                yh.i0 i0Var = (yh.i0) this.f830b;
                dh.d c10 = i0Var.e.c(ubVar, null, true);
                eh.e eVar = new eh.e(yh.i0.p(i0Var));
                eVar.e = new c3.m(22);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f8668f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                return;
        }
    }

    @Override
    public final void c(float f7) {
        int i10 = this.f829a;
    }

    @Override
    public final void d(qc qcVar) {
        i4 i4Var;
        switch (this.f829a) {
            case 0:
                return;
            case 1:
                if (qcVar.f29826a == 2 && (i4Var = ((q3) this.f830b).f5782x.Q1) != null) {
                    z9 z9Var = ((q9) i4Var).d;
                    z9Var.Y0 = false;
                    z9Var.P();
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
            default:
                return;
        }
    }

    @Override
    public final boolean e() {
        switch (this.f829a) {
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
        switch (this.f829a) {
            case 0:
                return (int) ((t0) ((v) this.f830b).f896c).f886u;
            case 1:
                if (((q3) this.f830b).f5782x.f5723x2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 2:
                return ((t5) this.f830b).f5958r.getPaddingBottom();
            case 3:
                return 0;
            case 4:
                editTextHeight = ((vb) this.f830b).f9973c1.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 5:
                return ((y7) this.f830b).e.f27945y.getHeight();
            case 6:
                return ((o2) this.f830b).getBottomInset();
            case 7:
                ob obVar = (ob) this.f830b;
                if (obVar == null) {
                    return 0;
                }
                return obVar.f(i10);
            case 8:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((om) this.f830b).f29231c.f28366b.getBottomInset();
                break;
            case 9:
                FrameLayout frameLayout = ((ty0) this.f830b).f30954w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 10:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f830b;
                if (b1Var.getParent() instanceof e4) {
                    e4 e4Var = (e4) b1Var.getParent();
                    return (int) ((e4Var.getSwipeOffsetY() + e4Var.getOffsetY()) - e4Var.getTopActionBarOffsetY());
                }
                return 0;
            default:
                return 0;
        }
        return dp + editTextHeight;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f829a) {
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
                ob obVar = (ob) this.f830b;
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
            default:
                return false;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f829a) {
            case 0:
                return 0;
            case 1:
                return AndroidUtilities.dp(58.0f);
            case 2:
                return 0;
            case 3:
                return (int) (((e6) this.f830b).f5291a + AndroidUtilities.dp(58.0f));
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                ob obVar = (ob) this.f830b;
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

    private final void u(qc qcVar) {
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
