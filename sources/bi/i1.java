package bi;

import android.widget.FrameLayout;
import fi.f9;
import hi.sa;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.lb;
public final class i1 implements fb {
    public final int f3713a;
    public final Object f3714b;

    public i1(Object obj, int i7) {
        this.f3713a = i7;
        this.f3714b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f3713a) {
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
    public final void b(gc gcVar) {
        fi.s3 s3Var;
        switch (this.f3713a) {
            case 0:
                lb lbVar = gcVar.f35504e;
                k1 k1Var = (k1) this.f3714b;
                fh.g c10 = k1Var.f3764p1.c(lbVar, null, true);
                c10.p(c8.i0.c(k1Var.J0));
                c10.r(org.telegram.messenger.g0.L(16.0f));
                lbVar.setCustomBackground(c10);
                return;
            case 1:
                return;
            case 2:
                if (gcVar.f35501a == 2 && (s3Var = ((fi.c3) this.f3714b).f11851y.A1) != null) {
                    f9 f9Var = ((fi.w8) s3Var).d;
                    f9Var.Y0 = true;
                    f9Var.V();
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
        int i7 = this.f3713a;
    }

    @Override
    public final void d(gc gcVar) {
        fi.s3 s3Var;
        switch (this.f3713a) {
            case 0:
            case 1:
                return;
            case 2:
                if (gcVar.f35501a == 2 && (s3Var = ((fi.c3) this.f3714b).f11851y.A1) != null) {
                    f9 f9Var = ((fi.w8) s3Var).d;
                    f9Var.Y0 = false;
                    f9Var.V();
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
        switch (this.f3713a) {
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
    public final int f(int i7) {
        int editTextHeight;
        int L;
        switch (this.f3713a) {
            case 0:
                return 0;
            case 1:
                return (int) ((ch.b0) ((ai.l0) this.f3714b).f1275c).f5341u;
            case 2:
                if (((fi.c3) this.f3714b).f11851y.f12871h2) {
                    return 0;
                }
                return org.telegram.messenger.g0.L(64.0f);
            case 3:
                return ((fi.b5) this.f3714b).f11815r.getPaddingBottom();
            case 4:
                return 0;
            case 5:
                editTextHeight = ((sa) this.f3714b).f15394d1.getEditTextHeight();
                L = org.telegram.messenger.g0.L(12.0f);
                break;
            case 6:
                return ((org.telegram.ui.Components.u7) this.f3714b).f40291e.f35143y1.getHeight();
            case 7:
                fb fbVar = (fb) this.f3714b;
                if (fbVar == null) {
                    return 0;
                }
                return fbVar.f(i7);
            case 8:
                editTextHeight = org.telegram.messenger.g0.L(126.0f);
                L = ((gm) this.f3714b).f35618c.f37521b.R();
                break;
            case 9:
                editTextHeight = k90.Z((k90) this.f3714b).d;
                L = org.telegram.messenger.g0.L(72.0f);
                break;
            case 10:
                FrameLayout frameLayout = ((kw0) this.f3714b).f37027w1;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f3714b;
                if (v0Var.getParent() instanceof ki.r3) {
                    ki.r3 r3Var = (ki.r3) v0Var.getParent();
                    return (int) ((r3Var.getSwipeOffsetY() + r3Var.getOffsetY()) - r3Var.getTopActionBarOffsetY());
                }
                return 0;
        }
        return L + editTextHeight;
    }

    @Override
    public final boolean g(int i7) {
        switch (this.f3713a) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                if (i7 == 1 || i7 == 2 || i7 == 3) {
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
                fb fbVar = (fb) this.f3714b;
                if (fbVar != null && fbVar.g(i7)) {
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
    public final int h(int i7) {
        switch (this.f3713a) {
            case 0:
                return org.telegram.messenger.g0.f24140m;
            case 1:
                return 0;
            case 2:
                return org.telegram.messenger.g0.L(58.0f);
            case 3:
                return 0;
            case 4:
                return (int) (((fi.m5) this.f3714b).f12308a + org.telegram.messenger.g0.L(58.0f));
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                fb fbVar = (fb) this.f3714b;
                if (fbVar == null) {
                    return org.telegram.messenger.g0.f24140m;
                }
                return fbVar.h(i7);
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

    private final void A(gc gcVar) {
    }

    private final void B(gc gcVar) {
    }

    private final void C(gc gcVar) {
    }

    private final void D(gc gcVar) {
    }

    private final void E(gc gcVar) {
    }

    private final void F(gc gcVar) {
    }

    private final void G(gc gcVar) {
    }

    private final void H(gc gcVar) {
    }

    private final void I(gc gcVar) {
    }

    private final void J(gc gcVar) {
    }

    private final void K(gc gcVar) {
    }

    private final void L(gc gcVar) {
    }

    private final void M(gc gcVar) {
    }

    private final void N(gc gcVar) {
    }

    private final void O(gc gcVar) {
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

    private final void u(gc gcVar) {
    }

    private final void v(gc gcVar) {
    }

    private final void w(gc gcVar) {
    }

    private final void x(gc gcVar) {
    }

    private final void y(gc gcVar) {
    }

    private final void z(gc gcVar) {
    }
}
