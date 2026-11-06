package ch;

import android.widget.FrameLayout;
import bi.x5;
import di.b4;
import di.g9;
import di.j3;
import di.k5;
import di.p9;
import di.v5;
import fi.va;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.q7;
import org.telegram.ui.Components.ql;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.web.x0;
public final class v implements ab {
    public final int f6403a;
    public final Object f6404b;

    public v(Object obj, int i7) {
        this.f6403a = i7;
        this.f6404b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f6403a) {
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
        b4 b4Var;
        switch (this.f6403a) {
            case 0:
                return;
            case 1:
                if (ccVar.f32507a == 2 && (b4Var = ((j3) this.f6404b).f9252y.f9221z1) != null) {
                    p9 p9Var = ((g9) b4Var).d;
                    p9Var.X0 = true;
                    p9Var.V();
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
                gb gbVar = ccVar.f32510e;
                zh.i0 i0Var = (zh.i0) this.f6404b;
                fh.g c10 = i0Var.l1.c(gbVar, null, true);
                gh.e eVar = new gh.e(i0Var.I0);
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
        int i7 = this.f6403a;
    }

    @Override
    public final void d(cc ccVar) {
        b4 b4Var;
        switch (this.f6403a) {
            case 0:
                return;
            case 1:
                if (ccVar.f32507a == 2 && (b4Var = ((j3) this.f6404b).f9252y.f9221z1) != null) {
                    p9 p9Var = ((g9) b4Var).d;
                    p9Var.X0 = false;
                    p9Var.V();
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
        switch (this.f6403a) {
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
        switch (this.f6403a) {
            case 0:
                return (int) ((b0) ((x5) this.f6404b).f5027c).f6201u;
            case 1:
                if (((j3) this.f6404b).f9252y.f9150g2) {
                    return 0;
                }
                return org.telegram.messenger.g0.L(64.0f);
            case 2:
                return ((k5) this.f6404b).f9305r.getPaddingBottom();
            case 3:
                return 0;
            case 4:
                editTextHeight = ((va) this.f6404b).f12944c1.getEditTextHeight();
                L = org.telegram.messenger.g0.L(12.0f);
                break;
            case 5:
                return ((q7) this.f6404b).f37177e.f32091u1.getHeight();
            case 6:
                ab abVar = (ab) this.f6404b;
                if (abVar == null) {
                    return 0;
                }
                return abVar.f(i7);
            case 7:
                editTextHeight = org.telegram.messenger.g0.L(126.0f);
                L = ((ql) this.f6404b).f37326c.f38969b.Q();
                break;
            case 8:
                editTextHeight = u80.Z((u80) this.f6404b).d;
                L = org.telegram.messenger.g0.L(72.0f);
                break;
            case 9:
                FrameLayout frameLayout = ((yv0) this.f6404b).f40772s1;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 10:
                x0 x0Var = (x0) this.f6404b;
                if (x0Var.getParent() instanceof hi.b4) {
                    hi.b4 b4Var = (hi.b4) x0Var.getParent();
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
        switch (this.f6403a) {
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
                ab abVar = (ab) this.f6404b;
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
        switch (this.f6403a) {
            case 0:
                return 0;
            case 1:
                return org.telegram.messenger.g0.L(58.0f);
            case 2:
                return 0;
            case 3:
                return (int) (((v5) this.f6404b).f9869a + org.telegram.messenger.g0.L(58.0f));
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                ab abVar = (ab) this.f6404b;
                if (abVar == null) {
                    return org.telegram.messenger.g0.f22538m;
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
                return org.telegram.messenger.g0.f22538m;
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
