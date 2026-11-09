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
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.q7;
import org.telegram.ui.Components.ql;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.web.x0;
public final class v implements ab {
    public final int f6401a;
    public final Object f6402b;

    public v(Object obj, int i7) {
        this.f6401a = i7;
        this.f6402b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f6401a) {
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
    public final void b(cc ccVar) {
        c4 c4Var;
        switch (this.f6401a) {
            case 0:
                return;
            case 1:
                if (ccVar.f32620a == 2 && (c4Var = ((j3) this.f6402b).f9161y.f9253z1) != null) {
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
                gb gbVar = ccVar.f32623e;
                zh.h0 h0Var = (zh.h0) this.f6402b;
                fh.g c10 = h0Var.l1.c(gbVar, null, true);
                gh.e eVar = new gh.e(h0Var.I0);
                eVar.f13971e = new g2.c(9);
                float N = org.telegram.messenger.g0.N(0.5f);
                float N2 = org.telegram.messenger.g0.N(0.5f);
                eVar.f13972f = N;
                eVar.h = N2;
                c10.p(eVar);
                c10.r(org.telegram.messenger.g0.L(16.0f));
                gbVar.setCustomBackground(c10);
                return;
        }
    }

    @Override
    public final void c(float f10) {
        int i7 = this.f6401a;
    }

    @Override
    public final void d(cc ccVar) {
        c4 c4Var;
        switch (this.f6401a) {
            case 0:
                return;
            case 1:
                if (ccVar.f32620a == 2 && (c4Var = ((j3) this.f6402b).f9161y.f9253z1) != null) {
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
        switch (this.f6401a) {
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
        switch (this.f6401a) {
            case 0:
                return (int) ((b0) ((x5) this.f6402b).f5025c).f6199u;
            case 1:
                if (((j3) this.f6402b).f9161y.f9182g2) {
                    return 0;
                }
                return org.telegram.messenger.g0.L(64.0f);
            case 2:
                return ((l5) this.f6402b).f9329r.getPaddingBottom();
            case 3:
                return 0;
            case 4:
                editTextHeight = ((va) this.f6402b).f12944c1.getEditTextHeight();
                L = org.telegram.messenger.g0.L(12.0f);
                break;
            case 5:
                return ((q7) this.f6402b).f37210e.f32154u1.getHeight();
            case 6:
                ab abVar = (ab) this.f6402b;
                if (abVar == null) {
                    return 0;
                }
                return abVar.f(i7);
            case 7:
                editTextHeight = org.telegram.messenger.g0.L(126.0f);
                L = ((ql) this.f6402b).f37409c.f39071b.Q();
                break;
            case 8:
                editTextHeight = v80.Z((v80) this.f6402b).d;
                L = org.telegram.messenger.g0.L(72.0f);
                break;
            case 9:
                FrameLayout frameLayout = ((zv0) this.f6402b).f41164s1;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 10:
                x0 x0Var = (x0) this.f6402b;
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
        switch (this.f6401a) {
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
                ab abVar = (ab) this.f6402b;
                if (abVar != null && abVar.g(i7)) {
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
        switch (this.f6401a) {
            case 0:
                return 0;
            case 1:
                return org.telegram.messenger.g0.L(58.0f);
            case 2:
                return 0;
            case 3:
                return (int) (((w5) this.f6402b).f9897a + org.telegram.messenger.g0.L(58.0f));
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                ab abVar = (ab) this.f6402b;
                if (abVar == null) {
                    return org.telegram.messenger.g0.f22557m;
                }
                return abVar.h(i7);
            case 7:
                return 0;
            case 8:
                return 0;
            case 9:
                return 0;
            case 10:
                return 0;
            default:
                return org.telegram.messenger.g0.f22557m;
        }
    }

    private final void A(cc ccVar) {
    }

    private final void B(cc ccVar) {
    }

    private final void C(cc ccVar) {
    }

    private final void D(cc ccVar) {
    }

    private final void E(cc ccVar) {
    }

    private final void F(cc ccVar) {
    }

    private final void G(cc ccVar) {
    }

    private final void H(cc ccVar) {
    }

    private final void I(cc ccVar) {
    }

    private final void J(cc ccVar) {
    }

    private final void K(cc ccVar) {
    }

    private final void L(cc ccVar) {
    }

    private final void M(cc ccVar) {
    }

    private final void N(cc ccVar) {
    }

    private final void O(cc ccVar) {
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

    private final void u(cc ccVar) {
    }

    private final void v(cc ccVar) {
    }

    private final void w(cc ccVar) {
    }

    private final void x(cc ccVar) {
    }

    private final void y(cc ccVar) {
    }

    private final void z(cc ccVar) {
    }
}
