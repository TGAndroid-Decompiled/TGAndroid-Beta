package ah;

import android.widget.FrameLayout;
import bi.d7;
import bi.gb;
import bi.h5;
import bi.l4;
import bi.pb;
import bi.s6;
import di.pc;
import di.w9;
import fi.q4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.y7;
public final class n0 implements ob {
    public final int f656a;
    public final Object f657b;

    public n0(Object obj, int i10) {
        this.f656a = i10;
        this.f657b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f656a) {
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
        h5 h5Var;
        f6 f6Var;
        switch (this.f656a) {
            case 0:
                return;
            case 1:
                if (qcVar.f29699a == 2 && (h5Var = ((l4) this.f657b).f3274x.Q1) != null) {
                    pb pbVar = ((gb) h5Var).d;
                    pbVar.Y0 = true;
                    pbVar.P();
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
                ub ubVar = qcVar.f29702e;
                yh.j0 j0Var = (yh.j0) this.f657b;
                dh.d c10 = j0Var.f50368e.c(ubVar, null, true);
                f6Var = ((f3) j0Var).resourcesProvider;
                eh.e eVar = new eh.e(f6Var);
                eVar.f9141e = new w9(5);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f9142f = dpf2;
                eVar.h = dpf22;
                c10.n(eVar);
                c10.p(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                return;
        }
    }

    @Override
    public final void c(float f7) {
        int i10 = this.f656a;
    }

    @Override
    public final void d(qc qcVar) {
        h5 h5Var;
        switch (this.f656a) {
            case 0:
                return;
            case 1:
                if (qcVar.f29699a == 2 && (h5Var = ((l4) this.f657b).f3274x.Q1) != null) {
                    pb pbVar = ((gb) h5Var).d;
                    pbVar.Y0 = false;
                    pbVar.P();
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
        switch (this.f656a) {
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
        switch (this.f656a) {
            case 0:
                return (int) ((u0) ((w) this.f657b).f725c).f715u;
            case 1:
                if (((l4) this.f657b).f3274x.f3502x2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 2:
                return ((s6) this.f657b).f3723r.getPaddingBottom();
            case 3:
                return 0;
            case 4:
                editTextHeight = ((pc) this.f657b).f7878c1.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 5:
                return ((y7) this.f657b).f32886e.E.getHeight();
            case 6:
                return ((n2) this.f657b).getBottomInset();
            case 7:
                ob obVar = (ob) this.f657b;
                if (obVar == null) {
                    return 0;
                }
                return obVar.f(i10);
            case 8:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((dm) this.f657b).f25452c.f28780b.getBottomInset();
                break;
            case 9:
                FrameLayout frameLayout = ((ux0) this.f657b).f31044w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 10:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f657b;
                if (d1Var.getParent() instanceof q4) {
                    q4 q4Var = (q4) d1Var.getParent();
                    return (int) ((q4Var.getSwipeOffsetY() + q4Var.getOffsetY()) - q4Var.getTopActionBarOffsetY());
                }
                return 0;
            default:
                return 0;
        }
        return dp + editTextHeight;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f656a) {
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
                ob obVar = (ob) this.f657b;
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
        switch (this.f656a) {
            case 0:
                return 0;
            case 1:
                return AndroidUtilities.dp(58.0f);
            case 2:
                return 0;
            case 3:
                return (int) (((d7) this.f657b).f2893a + AndroidUtilities.dp(58.0f));
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                ob obVar = (ob) this.f657b;
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
