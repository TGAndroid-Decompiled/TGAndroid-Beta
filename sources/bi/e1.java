package bi;

import android.widget.FrameLayout;
import fi.i9;
import fi.z8;
import hi.sa;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.y80;
public final class e1 implements wa {
    public final int f3454a;
    public final Object f3455b;

    public e1(Object obj, int i7) {
        this.f3454a = i7;
        this.f3455b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f3454a) {
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
    public final void b(xb xbVar) {
        fi.u3 u3Var;
        switch (this.f3454a) {
            case 0:
                cb cbVar = xbVar.f41631e;
                f1 f1Var = (f1) this.f3455b;
                fh.g c10 = f1Var.f3501p1.c(cbVar, null, true);
                gh.e eVar = new gh.e(f1Var.J0);
                eVar.f13313e = new g0.e(11);
                float N = org.telegram.messenger.g0.N(0.5f);
                float N2 = org.telegram.messenger.g0.N(0.5f);
                eVar.f13314f = N;
                eVar.h = N2;
                c10.p(eVar);
                c10.r(org.telegram.messenger.g0.L(16.0f));
                cbVar.setCustomBackground(c10);
                return;
            case 1:
                return;
            case 2:
                if (xbVar.f41628a == 2 && (u3Var = ((fi.e3) this.f3455b).f11671y.A1) != null) {
                    i9 i9Var = ((z8) u3Var).d;
                    i9Var.Y0 = true;
                    i9Var.V();
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
        int i7 = this.f3454a;
    }

    @Override
    public final void d(xb xbVar) {
        fi.u3 u3Var;
        switch (this.f3454a) {
            case 0:
            case 1:
                return;
            case 2:
                if (xbVar.f41628a == 2 && (u3Var = ((fi.e3) this.f3455b).f11671y.A1) != null) {
                    i9 i9Var = ((z8) u3Var).d;
                    i9Var.Y0 = false;
                    i9Var.V();
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
        switch (this.f3454a) {
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
        switch (this.f3454a) {
            case 0:
                return 0;
            case 1:
                return (int) ((ch.b0) ((ai.k0) this.f3455b).f1273c).f5029u;
            case 2:
                if (((fi.e3) this.f3455b).f11671y.f11480h2) {
                    return 0;
                }
                return org.telegram.messenger.g0.L(64.0f);
            case 3:
                return ((fi.c5) this.f3455b).f11603r.getPaddingBottom();
            case 4:
                return 0;
            case 5:
                editTextHeight = ((sa) this.f3455b).f15048d1.getEditTextHeight();
                L = org.telegram.messenger.g0.L(12.0f);
                break;
            case 6:
                return ((n7) this.f3455b).f37470e.f41920y1.getHeight();
            case 7:
                wa waVar = (wa) this.f3455b;
                if (waVar == null) {
                    return 0;
                }
                return waVar.f(i7);
            case 8:
                editTextHeight = org.telegram.messenger.g0.L(126.0f);
                L = ((xl) this.f3455b).f41715c.f33609b.R();
                break;
            case 9:
                editTextHeight = y80.Z((y80) this.f3455b).d;
                L = org.telegram.messenger.g0.L(72.0f);
                break;
            case 10:
                FrameLayout frameLayout = ((bw0) this.f3455b).f33424w1;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f3455b;
                if (v0Var.getParent() instanceof ki.x3) {
                    ki.x3 x3Var = (ki.x3) v0Var.getParent();
                    return (int) ((x3Var.getSwipeOffsetY() + x3Var.getOffsetY()) - x3Var.getTopActionBarOffsetY());
                }
                return 0;
        }
        return L + editTextHeight;
    }

    @Override
    public final boolean g(int i7) {
        switch (this.f3454a) {
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
                wa waVar = (wa) this.f3455b;
                if (waVar != null && waVar.g(i7)) {
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
        switch (this.f3454a) {
            case 0:
                return org.telegram.messenger.g0.f23605m;
            case 1:
                return 0;
            case 2:
                return org.telegram.messenger.g0.L(58.0f);
            case 3:
                return 0;
            case 4:
                return (int) (((fi.n5) this.f3455b).f12076a + org.telegram.messenger.g0.L(58.0f));
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                wa waVar = (wa) this.f3455b;
                if (waVar == null) {
                    return org.telegram.messenger.g0.f23605m;
                }
                return waVar.h(i7);
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

    private final void A(xb xbVar) {
    }

    private final void B(xb xbVar) {
    }

    private final void C(xb xbVar) {
    }

    private final void D(xb xbVar) {
    }

    private final void E(xb xbVar) {
    }

    private final void F(xb xbVar) {
    }

    private final void G(xb xbVar) {
    }

    private final void H(xb xbVar) {
    }

    private final void I(xb xbVar) {
    }

    private final void J(xb xbVar) {
    }

    private final void K(xb xbVar) {
    }

    private final void L(xb xbVar) {
    }

    private final void M(xb xbVar) {
    }

    private final void N(xb xbVar) {
    }

    private final void O(xb xbVar) {
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

    private final void u(xb xbVar) {
    }

    private final void v(xb xbVar) {
    }

    private final void w(xb xbVar) {
    }

    private final void x(xb xbVar) {
    }

    private final void y(xb xbVar) {
    }

    private final void z(xb xbVar) {
    }
}
