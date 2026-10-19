package ah;

import android.widget.FrameLayout;
import ci.aa;
import ci.f6;
import ci.j4;
import ci.r3;
import ci.r9;
import ci.u5;
import ei.vb;
import gi.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.y7;
public final class m0 implements ob {
    public final int f828a;
    public final Object f829b;

    public m0(Object obj, int i10) {
        this.f828a = i10;
        this.f829b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f828a) {
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
        j4 j4Var;
        switch (this.f828a) {
            case 0:
                return;
            case 1:
                if (qcVar.f29590a == 2 && (j4Var = ((r3) this.f829b).f5914x.Q1) != null) {
                    aa aaVar = ((r9) j4Var).d;
                    aaVar.Y0 = true;
                    aaVar.P();
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
                yh.i0 i0Var = (yh.i0) this.f829b;
                dh.d c10 = i0Var.e.c(ubVar, null, true);
                eh.e eVar = new eh.e(yh.i0.n(i0Var));
                eVar.e = new ci.i1(20);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f8662f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                return;
        }
    }

    @Override
    public final void c(float f7) {
        int i10 = this.f828a;
    }

    @Override
    public final void d(qc qcVar) {
        j4 j4Var;
        switch (this.f828a) {
            case 0:
                return;
            case 1:
                if (qcVar.f29590a == 2 && (j4Var = ((r3) this.f829b).f5914x.Q1) != null) {
                    aa aaVar = ((r9) j4Var).d;
                    aaVar.Y0 = false;
                    aaVar.P();
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
        switch (this.f828a) {
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
        switch (this.f828a) {
            case 0:
                return (int) ((t0) ((v) this.f829b).f895c).f885u;
            case 1:
                if (((r3) this.f829b).f5914x.f5838x2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 2:
                return ((u5) this.f829b).f6053r.getPaddingBottom();
            case 3:
                return 0;
            case 4:
                editTextHeight = ((vb) this.f829b).f9958c1.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 5:
                return ((y7) this.f829b).e.E.getHeight();
            case 6:
                return ((n2) this.f829b).getBottomInset();
            case 7:
                ob obVar = (ob) this.f829b;
                if (obVar == null) {
                    return 0;
                }
                return obVar.f(i10);
            case 8:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((om) this.f829b).f29026c.f28225b.getBottomInset();
                break;
            case 9:
                FrameLayout frameLayout = ((py0) this.f829b).f29442w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 10:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f829b;
                if (a1Var.getParent() instanceof e4) {
                    e4 e4Var = (e4) a1Var.getParent();
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
        switch (this.f828a) {
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
                ob obVar = (ob) this.f829b;
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
        switch (this.f828a) {
            case 0:
                return 0;
            case 1:
                return AndroidUtilities.dp(58.0f);
            case 2:
                return 0;
            case 3:
                return (int) (((f6) this.f829b).f5390a + AndroidUtilities.dp(58.0f));
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                ob obVar = (ob) this.f829b;
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
