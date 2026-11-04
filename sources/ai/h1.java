package ai;

import android.widget.FrameLayout;
import ei.i9;
import ei.r9;
import gi.i8;
import gi.va;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.o7;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.za;
public final class h1 implements za {
    public final int f673a;
    public final Object f674b;

    public h1(Object obj, int i3) {
        this.f673a = i3;
        this.f674b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f673a) {
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
    public final void b(ac acVar) {
        ei.c4 c4Var;
        switch (this.f673a) {
            case 0:
                fb fbVar = acVar.f31788e;
                i1 i1Var = (i1) this.f674b;
                gh.g c2 = i1Var.m1.c(fbVar, null, true);
                hh.e eVar = new hh.e(i1Var.J0);
                eVar.f14417e = new i8(9);
                float N = org.telegram.messenger.g0.N(0.5f);
                float N2 = org.telegram.messenger.g0.N(0.5f);
                eVar.f14418f = N;
                eVar.h = N2;
                c2.p(eVar);
                c2.r(org.telegram.messenger.g0.L(16.0f));
                fbVar.setCustomBackground(c2);
                return;
            case 1:
                return;
            case 2:
                if (acVar.f31785a == 2 && (c4Var = ((ei.m3) this.f674b).f10637y.A1) != null) {
                    r9 r9Var = ((i9) c4Var).d;
                    r9Var.Z0 = true;
                    r9Var.d0();
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
        int i3 = this.f673a;
    }

    @Override
    public final void d(ac acVar) {
        ei.c4 c4Var;
        switch (this.f673a) {
            case 0:
            case 1:
                return;
            case 2:
                if (acVar.f31785a == 2 && (c4Var = ((ei.m3) this.f674b).f10637y.A1) != null) {
                    r9 r9Var = ((i9) c4Var).d;
                    r9Var.Z0 = false;
                    r9Var.d0();
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
        switch (this.f673a) {
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
    public final int f(int i3) {
        int editTextHeight;
        int L;
        switch (this.f673a) {
            case 0:
                return 0;
            case 1:
                return (int) ((dh.a0) ((c0) this.f674b).f537c).f8949u;
            case 2:
                if (((ei.m3) this.f674b).f10637y.f10464h2) {
                    return 0;
                }
                return org.telegram.messenger.g0.L(64.0f);
            case 3:
                return ((ei.k5) this.f674b).f10577r.getPaddingBottom();
            case 4:
                return 0;
            case 5:
                editTextHeight = ((va) this.f674b).f13710d1.getEditTextHeight();
                L = org.telegram.messenger.g0.L(12.0f);
                break;
            case 6:
                return ((o7) this.f674b).f36774e.f40970v1.getHeight();
            case 7:
                za zaVar = (za) this.f674b;
                if (zaVar == null) {
                    return 0;
                }
                return zaVar.f(i3);
            case 8:
                editTextHeight = org.telegram.messenger.g0.L(126.0f);
                L = ((pl) this.f674b).f37176c.f38416b.Q();
                break;
            case 9:
                editTextHeight = r80.Z((r80) this.f674b).d;
                L = org.telegram.messenger.g0.L(72.0f);
                break;
            case 10:
                FrameLayout frameLayout = ((xv0) this.f674b).f40527t1;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            default:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.f674b;
                if (w0Var.getParent() instanceof ii.c4) {
                    ii.c4 c4Var = (ii.c4) w0Var.getParent();
                    return (int) ((c4Var.getSwipeOffsetY() + c4Var.getOffsetY()) - c4Var.getTopActionBarOffsetY());
                }
                return 0;
        }
        return L + editTextHeight;
    }

    @Override
    public final boolean g(int i3) {
        switch (this.f673a) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                if (i3 == 1 || i3 == 2 || i3 == 3) {
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
                za zaVar = (za) this.f674b;
                if (zaVar != null && zaVar.g(i3)) {
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
    public final int h(int i3) {
        switch (this.f673a) {
            case 0:
                return org.telegram.messenger.g0.f22602m;
            case 1:
                return 0;
            case 2:
                return org.telegram.messenger.g0.L(58.0f);
            case 3:
                return 0;
            case 4:
                return (int) (((ei.v5) this.f674b).f11125a + org.telegram.messenger.g0.L(58.0f));
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                za zaVar = (za) this.f674b;
                if (zaVar == null) {
                    return org.telegram.messenger.g0.f22602m;
                }
                return zaVar.h(i3);
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

    private final void A(ac acVar) {
    }

    private final void B(ac acVar) {
    }

    private final void C(ac acVar) {
    }

    private final void D(ac acVar) {
    }

    private final void E(ac acVar) {
    }

    private final void F(ac acVar) {
    }

    private final void G(ac acVar) {
    }

    private final void H(ac acVar) {
    }

    private final void I(ac acVar) {
    }

    private final void J(ac acVar) {
    }

    private final void K(ac acVar) {
    }

    private final void L(ac acVar) {
    }

    private final void M(ac acVar) {
    }

    private final void N(ac acVar) {
    }

    private final void O(ac acVar) {
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

    private final void u(ac acVar) {
    }

    private final void v(ac acVar) {
    }

    private final void w(ac acVar) {
    }

    private final void x(ac acVar) {
    }

    private final void y(ac acVar) {
    }

    private final void z(ac acVar) {
    }
}
