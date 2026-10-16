package ah;

import android.widget.FrameLayout;
import bi.h7;
import bi.j5;
import bi.jb;
import bi.o4;
import bi.sb;
import bi.w2;
import bi.w6;
import di.kc;
import fi.p4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.wb;
public final class m0 implements qb {
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
    public final void b(sc scVar) {
        j5 j5Var;
        switch (this.f828a) {
            case 0:
                return;
            case 1:
                if (scVar.f28799a == 2 && (j5Var = ((o4) this.f829b).f3416x.Q1) != null) {
                    sb sbVar = ((jb) j5Var).d;
                    sbVar.Y0 = true;
                    sbVar.P();
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
                wb wbVar = scVar.e;
                yh.k0 k0Var = (yh.k0) this.f829b;
                dh.d c10 = k0Var.e.c(wbVar, null, true);
                eh.e eVar = new eh.e(yh.k0.n(k0Var));
                eVar.e = new w2(18);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f8782f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                wbVar.setCustomBackground(c10);
                return;
        }
    }

    @Override
    public final void c(float f7) {
        int i10 = this.f828a;
    }

    @Override
    public final void d(sc scVar) {
        j5 j5Var;
        switch (this.f828a) {
            case 0:
                return;
            case 1:
                if (scVar.f28799a == 2 && (j5Var = ((o4) this.f829b).f3416x.Q1) != null) {
                    sb sbVar = ((jb) j5Var).d;
                    sbVar.Y0 = false;
                    sbVar.P();
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
                if (((o4) this.f829b).f3416x.f3582x2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 2:
                return ((w6) this.f829b).f3909r.getPaddingBottom();
            case 3:
                return 0;
            case 4:
                editTextHeight = ((kc) this.f829b).f7246c1.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 5:
                return ((a8) this.f829b).e.E.getHeight();
            case 6:
                return ((m2) this.f829b).getBottomInset();
            case 7:
                qb qbVar = (qb) this.f829b;
                if (qbVar == null) {
                    return 0;
                }
                return qbVar.f(i10);
            case 8:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((qm) this.f829b).f28327c.f27360b.getBottomInset();
                break;
            case 9:
                FrameLayout frameLayout = ((uy0) this.f829b).f29513w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 10:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f829b;
                if (c1Var.getParent() instanceof p4) {
                    p4 p4Var = (p4) c1Var.getParent();
                    return (int) ((p4Var.getSwipeOffsetY() + p4Var.getOffsetY()) - p4Var.getTopActionBarOffsetY());
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
                qb qbVar = (qb) this.f829b;
                if (qbVar != null && qbVar.g(i10)) {
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
                return (int) (((h7) this.f829b).f3129a + AndroidUtilities.dp(58.0f));
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                qb qbVar = (qb) this.f829b;
                if (qbVar == null) {
                    return AndroidUtilities.statusBarHeight;
                }
                return qbVar.h(i10);
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

    private final void A(sc scVar) {
    }

    private final void B(sc scVar) {
    }

    private final void C(sc scVar) {
    }

    private final void D(sc scVar) {
    }

    private final void E(sc scVar) {
    }

    private final void F(sc scVar) {
    }

    private final void G(sc scVar) {
    }

    private final void H(sc scVar) {
    }

    private final void I(sc scVar) {
    }

    private final void J(sc scVar) {
    }

    private final void K(sc scVar) {
    }

    private final void L(sc scVar) {
    }

    private final void M(sc scVar) {
    }

    private final void N(sc scVar) {
    }

    private final void O(sc scVar) {
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

    private final void u(sc scVar) {
    }

    private final void v(sc scVar) {
    }

    private final void w(sc scVar) {
    }

    private final void x(sc scVar) {
    }

    private final void y(sc scVar) {
    }

    private final void z(sc scVar) {
    }
}
