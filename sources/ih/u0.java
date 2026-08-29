package ih;

import android.widget.FrameLayout;
import lh.i9;
import lh.z8;
import nh.gb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.yl;
import org.telegram.ui.xx0;
public final class u0 implements kb {
    public final int f9411a;
    public final Object f9412b;

    public u0(Object obj, int i10) {
        this.f9411a = i10;
        this.f9412b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f9411a) {
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
    public final void b(mc mcVar) {
        lh.x3 x3Var;
        switch (this.f9411a) {
            case 0:
                rb rbVar = mcVar.f30648e;
                v0 v0Var = (v0) this.f9412b;
                ng.d c3 = v0Var.f9426e.c(rbVar, null, true);
                og.d dVar = new og.d(v0.m(v0Var));
                dVar.f19560e = new xx0(11);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                dVar.f19561f = dpf2;
                dVar.h = dpf22;
                c3.n(dVar);
                c3.p(AndroidUtilities.dp(16.0f));
                rbVar.setCustomBackground(c3);
                return;
            case 1:
                return;
            case 2:
                if (mcVar.f30645a == 2 && (x3Var = ((lh.h3) this.f9412b).f15657x.M1) != null) {
                    i9 i9Var = ((z8) x3Var).d;
                    i9Var.U0 = true;
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
    public final void c(float f9) {
        int i10 = this.f9411a;
    }

    @Override
    public final void d(mc mcVar) {
        lh.x3 x3Var;
        switch (this.f9411a) {
            case 0:
            case 1:
                return;
            case 2:
                if (mcVar.f30645a == 2 && (x3Var = ((lh.h3) this.f9412b).f15657x.M1) != null) {
                    i9 i9Var = ((z8) x3Var).d;
                    i9Var.U0 = false;
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
        switch (this.f9411a) {
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
        switch (this.f9411a) {
            case 0:
                return 0;
            case 1:
                return (int) ((kg.d0) ((bg.d1) this.f9412b).f2147c).f13699u;
            case 2:
                if (((lh.h3) this.f9412b).f15657x.f15525t2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 3:
                return ((lh.c5) this.f9412b).f15438r.getPaddingBottom();
            case 4:
                return 0;
            case 5:
                editTextHeight = ((gb) this.f9412b).Y0.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 6:
                return ((v7) this.f9412b).f33486e.A.getHeight();
            case 7:
                return ((org.telegram.ui.ActionBar.o2) this.f9412b).getBottomInset();
            case 8:
                kb kbVar = (kb) this.f9412b;
                if (kbVar == null) {
                    return 0;
                }
                return kbVar.f(i10);
            case 9:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((yl) this.f9412b).f35089c.f28403b.getBottomInset();
                break;
            case 10:
                FrameLayout frameLayout = ((nx0) this.f9412b).f31190w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f9412b;
                if (z0Var.getParent() instanceof ph.m3) {
                    ph.m3 m3Var = (ph.m3) z0Var.getParent();
                    return (int) ((m3Var.getSwipeOffsetY() + m3Var.getOffsetY()) - m3Var.getTopActionBarOffsetY());
                }
                return 0;
        }
        return dp + editTextHeight;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f9411a) {
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
                return false;
            case 8:
                kb kbVar = (kb) this.f9412b;
                if (kbVar != null && kbVar.g(i10)) {
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
    public final int h(int i10) {
        switch (this.f9411a) {
            case 0:
                return AndroidUtilities.statusBarHeight;
            case 1:
                return 0;
            case 2:
                return AndroidUtilities.dp(58.0f);
            case 3:
                return 0;
            case 4:
                return (int) (((lh.p5) this.f9412b).f16092a + AndroidUtilities.dp(58.0f));
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                return 0;
            case 8:
                kb kbVar = (kb) this.f9412b;
                if (kbVar == null) {
                    return AndroidUtilities.statusBarHeight;
                }
                return kbVar.h(i10);
            case 9:
                return 0;
            case 10:
                return 0;
            default:
                return 0;
        }
    }

    private final void A(mc mcVar) {
    }

    private final void B(mc mcVar) {
    }

    private final void C(mc mcVar) {
    }

    private final void D(mc mcVar) {
    }

    private final void E(mc mcVar) {
    }

    private final void F(mc mcVar) {
    }

    private final void G(mc mcVar) {
    }

    private final void H(mc mcVar) {
    }

    private final void I(mc mcVar) {
    }

    private final void J(mc mcVar) {
    }

    private final void K(mc mcVar) {
    }

    private final void L(mc mcVar) {
    }

    private final void M(mc mcVar) {
    }

    private final void N(mc mcVar) {
    }

    private final void O(mc mcVar) {
    }

    private final void i(float f9) {
    }

    private final void j(float f9) {
    }

    private final void k(float f9) {
    }

    private final void l(float f9) {
    }

    private final void m(float f9) {
    }

    private final void n(float f9) {
    }

    private final void o(float f9) {
    }

    private final void p(float f9) {
    }

    private final void q(float f9) {
    }

    private final void r(float f9) {
    }

    private final void s(float f9) {
    }

    private final void t(float f9) {
    }

    private final void u(mc mcVar) {
    }

    private final void v(mc mcVar) {
    }

    private final void w(mc mcVar) {
    }

    private final void x(mc mcVar) {
    }

    private final void y(mc mcVar) {
    }

    private final void z(mc mcVar) {
    }
}
