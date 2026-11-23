package bi;

import android.widget.FrameLayout;
import hi.nb;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.kb;
public final class i1 implements eb {
    public final int f3654a;
    public final Object f3655b;

    public i1(Object obj, int i7) {
        this.f3654a = i7;
        this.f3655b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f3654a) {
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
    public final void b(fc fcVar) {
        fi.s3 s3Var;
        switch (this.f3654a) {
            case 0:
                kb kbVar = fcVar.f35087e;
                k1 k1Var = (k1) this.f3655b;
                fh.g c10 = k1Var.f3737p1.c(kbVar, null, true);
                c10.p(c8.j0.c(k1Var.J0));
                c10.r(org.telegram.messenger.g0.L(16.0f));
                kbVar.setCustomBackground(c10);
                return;
            case 1:
                return;
            case 2:
                if (fcVar.f35084a == 2 && (s3Var = ((fi.c3) this.f3655b).f11816y.A1) != null) {
                    fi.f9 f9Var = ((fi.w8) s3Var).d;
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
        int i7 = this.f3654a;
    }

    @Override
    public final void d(fc fcVar) {
        fi.s3 s3Var;
        switch (this.f3654a) {
            case 0:
            case 1:
                return;
            case 2:
                if (fcVar.f35084a == 2 && (s3Var = ((fi.c3) this.f3655b).f11816y.A1) != null) {
                    fi.f9 f9Var = ((fi.w8) s3Var).d;
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
        switch (this.f3654a) {
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
        switch (this.f3654a) {
            case 0:
                return 0;
            case 1:
                return (int) ((ch.b0) ((ai.h0) this.f3655b).f1215c).f5307u;
            case 2:
                if (((fi.c3) this.f3655b).f11816y.f12836h2) {
                    return 0;
                }
                return org.telegram.messenger.g0.L(64.0f);
            case 3:
                return ((fi.b5) this.f3655b).f11780r.getPaddingBottom();
            case 4:
                return 0;
            case 5:
                editTextHeight = ((nb) this.f3655b).f15067d1.getEditTextHeight();
                L = org.telegram.messenger.g0.L(12.0f);
                break;
            case 6:
                return ((org.telegram.ui.Components.t7) this.f3655b).f39839e.f34626y1.getHeight();
            case 7:
                eb ebVar = (eb) this.f3655b;
                if (ebVar == null) {
                    return 0;
                }
                return ebVar.f(i7);
            case 8:
                editTextHeight = org.telegram.messenger.g0.L(126.0f);
                L = ((em) this.f3655b).f34793c.f37135b.R();
                break;
            case 9:
                editTextHeight = h90.Z((h90) this.f3655b).d;
                L = org.telegram.messenger.g0.L(72.0f);
                break;
            case 10:
                FrameLayout frameLayout = ((jw0) this.f3655b).f36552w1;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f3655b;
                if (v0Var.getParent() instanceof ki.s3) {
                    ki.s3 s3Var = (ki.s3) v0Var.getParent();
                    return (int) ((s3Var.getSwipeOffsetY() + s3Var.getOffsetY()) - s3Var.getTopActionBarOffsetY());
                }
                return 0;
        }
        return L + editTextHeight;
    }

    @Override
    public final boolean g(int i7) {
        switch (this.f3654a) {
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
                eb ebVar = (eb) this.f3655b;
                if (ebVar != null && ebVar.g(i7)) {
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
        switch (this.f3654a) {
            case 0:
                return org.telegram.messenger.g0.f24220m;
            case 1:
                return 0;
            case 2:
                return org.telegram.messenger.g0.L(58.0f);
            case 3:
                return 0;
            case 4:
                return (int) (((fi.m5) this.f3655b).f12273a + org.telegram.messenger.g0.L(58.0f));
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                eb ebVar = (eb) this.f3655b;
                if (ebVar == null) {
                    return org.telegram.messenger.g0.f24220m;
                }
                return ebVar.h(i7);
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

    private final void A(fc fcVar) {
    }

    private final void B(fc fcVar) {
    }

    private final void C(fc fcVar) {
    }

    private final void D(fc fcVar) {
    }

    private final void E(fc fcVar) {
    }

    private final void F(fc fcVar) {
    }

    private final void G(fc fcVar) {
    }

    private final void H(fc fcVar) {
    }

    private final void I(fc fcVar) {
    }

    private final void J(fc fcVar) {
    }

    private final void K(fc fcVar) {
    }

    private final void L(fc fcVar) {
    }

    private final void M(fc fcVar) {
    }

    private final void N(fc fcVar) {
    }

    private final void O(fc fcVar) {
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

    private final void u(fc fcVar) {
    }

    private final void v(fc fcVar) {
    }

    private final void w(fc fcVar) {
    }

    private final void x(fc fcVar) {
    }

    private final void y(fc fcVar) {
    }

    private final void z(fc fcVar) {
    }
}
