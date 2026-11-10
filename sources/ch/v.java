package ch;

import android.widget.FrameLayout;
import bi.x5;
import di.c4;
import di.h9;
import di.j3;
import di.l5;
import di.q9;
import di.w5;
import fi.va;
import hi.b4;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.p7;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.Components.za;
import org.telegram.ui.web.x0;
public final class v implements za {
    public final int f6406a;
    public final Object f6407b;

    public v(Object obj, int i7) {
        this.f6406a = i7;
        this.f6407b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f6406a) {
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
    public final void b(bc bcVar) {
        c4 c4Var;
        switch (this.f6406a) {
            case 0:
                return;
            case 1:
                if (bcVar.f32196a == 2 && (c4Var = ((j3) this.f6407b).f9166y.f9258z1) != null) {
                    q9 q9Var = ((h9) c4Var).d;
                    q9Var.X0 = true;
                    q9Var.V();
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
                fb fbVar = bcVar.f32199e;
                zh.h0 h0Var = (zh.h0) this.f6407b;
                fh.g c10 = h0Var.f60362o1.c(fbVar, null, true);
                gh.e eVar = new gh.e(h0Var.I0);
                eVar.f13973e = new g2.c(9);
                float N = org.telegram.messenger.g0.N(0.5f);
                float N2 = org.telegram.messenger.g0.N(0.5f);
                eVar.f13974f = N;
                eVar.h = N2;
                c10.p(eVar);
                c10.r(org.telegram.messenger.g0.L(16.0f));
                fbVar.setCustomBackground(c10);
                return;
        }
    }

    @Override
    public final void c(float f10) {
        int i7 = this.f6406a;
    }

    @Override
    public final void d(bc bcVar) {
        c4 c4Var;
        switch (this.f6406a) {
            case 0:
                return;
            case 1:
                if (bcVar.f32196a == 2 && (c4Var = ((j3) this.f6407b).f9166y.f9258z1) != null) {
                    q9 q9Var = ((h9) c4Var).d;
                    q9Var.X0 = false;
                    q9Var.V();
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
        switch (this.f6406a) {
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
        switch (this.f6406a) {
            case 0:
                return (int) ((b0) ((x5) this.f6407b).f5030c).f6204u;
            case 1:
                if (((j3) this.f6407b).f9166y.f9187g2) {
                    return 0;
                }
                return org.telegram.messenger.g0.L(64.0f);
            case 2:
                return ((l5) this.f6407b).f9334r.getPaddingBottom();
            case 3:
                return 0;
            case 4:
                editTextHeight = ((va) this.f6407b).f12946c1.getEditTextHeight();
                L = org.telegram.messenger.g0.L(12.0f);
                break;
            case 5:
                return ((p7) this.f6407b).f36809e.f31766x1.getHeight();
            case 6:
                za zaVar = (za) this.f6407b;
                if (zaVar == null) {
                    return 0;
                }
                return zaVar.f(i7);
            case 7:
                editTextHeight = org.telegram.messenger.g0.L(126.0f);
                L = ((pl) this.f6407b).f37008c.f38656b.Q();
                break;
            case 8:
                editTextHeight = v80.Z((v80) this.f6407b).d;
                L = org.telegram.messenger.g0.L(72.0f);
                break;
            case 9:
                FrameLayout frameLayout = ((yv0) this.f6407b).f40759v1;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 10:
                x0 x0Var = (x0) this.f6407b;
                if (x0Var.getParent() instanceof b4) {
                    b4 b4Var = (b4) x0Var.getParent();
                    return (int) ((b4Var.getSwipeOffsetY() + b4Var.getOffsetY()) - b4Var.getTopActionBarOffsetY());
                }
                return 0;
            default:
                return 0;
        }
        return L + editTextHeight;
    }

    @Override
    public final boolean g(int i7) {
        switch (this.f6406a) {
            case 0:
                return false;
            case 1:
                if (i7 == 1 || i7 == 2 || i7 == 3) {
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
                za zaVar = (za) this.f6407b;
                if (zaVar != null && zaVar.g(i7)) {
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
    public final int h(int i7) {
        switch (this.f6406a) {
            case 0:
                return 0;
            case 1:
                return org.telegram.messenger.g0.L(58.0f);
            case 2:
                return 0;
            case 3:
                return (int) (((w5) this.f6407b).f9902a + org.telegram.messenger.g0.L(58.0f));
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                za zaVar = (za) this.f6407b;
                if (zaVar == null) {
                    return org.telegram.messenger.g0.f22561m;
                }
                return zaVar.h(i7);
            case 7:
                return 0;
            case 8:
                return 0;
            case 9:
                return 0;
            case 10:
                return 0;
            default:
                return org.telegram.messenger.g0.f22561m;
        }
    }

    private final void A(bc bcVar) {
    }

    private final void B(bc bcVar) {
    }

    private final void C(bc bcVar) {
    }

    private final void D(bc bcVar) {
    }

    private final void E(bc bcVar) {
    }

    private final void F(bc bcVar) {
    }

    private final void G(bc bcVar) {
    }

    private final void H(bc bcVar) {
    }

    private final void I(bc bcVar) {
    }

    private final void J(bc bcVar) {
    }

    private final void K(bc bcVar) {
    }

    private final void L(bc bcVar) {
    }

    private final void M(bc bcVar) {
    }

    private final void N(bc bcVar) {
    }

    private final void O(bc bcVar) {
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

    private final void u(bc bcVar) {
    }

    private final void v(bc bcVar) {
    }

    private final void w(bc bcVar) {
    }

    private final void x(bc bcVar) {
    }

    private final void y(bc bcVar) {
    }

    private final void z(bc bcVar) {
    }
}
