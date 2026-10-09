package ai;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.um;
import org.telegram.ui.Components.xy0;
public final class x4 implements org.telegram.ui.Components.rb {
    public final int f1905a;
    public final Object f1906b;

    public x4(Object obj, int i10) {
        this.f1905a = i10;
        this.f1906b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f1905a) {
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
    public final void b(org.telegram.ui.Components.tc tcVar) {
        y5 y5Var;
        switch (this.f1905a) {
            case 0:
                if (tcVar.f31123a == 2 && (y5Var = ((b5) this.f1906b).f710x.Q1) != null) {
                    kc kcVar = ((bc) y5Var).d;
                    kcVar.Y0 = true;
                    kcVar.P();
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                org.telegram.ui.Components.xb xbVar = tcVar.f31126e;
                xh.l0 l0Var = (xh.l0) this.f1906b;
                ch.d c10 = l0Var.f51332e.c(xbVar, null, true);
                dh.e eVar = new dh.e(xh.l0.o(l0Var));
                eVar.f8366e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f8367f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                xbVar.setCustomBackground(c10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(float f7) {
        int i10 = this.f1905a;
    }

    @Override
    public final void d(org.telegram.ui.Components.tc tcVar) {
        y5 y5Var;
        switch (this.f1905a) {
            case 0:
                if (tcVar.f31123a == 2 && (y5Var = ((b5) this.f1906b).f710x.Q1) != null) {
                    kc kcVar = ((bc) y5Var).d;
                    kcVar.Y0 = false;
                    kcVar.P();
                    return;
                }
                return;
            case 1:
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
        switch (this.f1905a) {
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
        switch (this.f1905a) {
            case 0:
                if (((b5) this.f1906b).f710x.f1021x2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 1:
                return ((l7) this.f1906b).f1340r.getPaddingBottom();
            case 2:
                return 0;
            case 3:
                editTextHeight = ((ci.lc) this.f1906b).f5467c1.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 4:
                return ((org.telegram.ui.Components.z7) this.f1906b).f33485e.E.getHeight();
            case 5:
                return ((org.telegram.ui.ActionBar.n2) this.f1906b).getBottomInset();
            case 6:
                org.telegram.ui.Components.rb rbVar = (org.telegram.ui.Components.rb) this.f1906b;
                if (rbVar == null) {
                    return 0;
                }
                return rbVar.f(i10);
            case 7:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((um) this.f1906b).f31539c.f30173b.getBottomInset();
                break;
            case 8:
                FrameLayout frameLayout = ((xy0) this.f1906b).f33048w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 9:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f1906b;
                if (b1Var.getParent() instanceof ei.o4) {
                    ei.o4 o4Var = (ei.o4) b1Var.getParent();
                    return (int) ((o4Var.getSwipeOffsetY() + o4Var.getOffsetY()) - o4Var.getTopActionBarOffsetY());
                }
                return 0;
            case 10:
                return 0;
            default:
                return (int) ((zg.a0) ((xh.m) this.f1906b).f51345b).f54465u;
        }
        return dp + editTextHeight;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f1905a) {
            case 0:
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return true;
                }
                return false;
            case 1:
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
                org.telegram.ui.Components.rb rbVar = (org.telegram.ui.Components.rb) this.f1906b;
                if (rbVar != null && rbVar.g(i10)) {
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
    public final int h(int i10) {
        switch (this.f1905a) {
            case 0:
                return AndroidUtilities.dp(58.0f);
            case 1:
                return 0;
            case 2:
                return (int) (((w7) this.f1906b).f1863a + AndroidUtilities.dp(58.0f));
            case 3:
                return 0;
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                org.telegram.ui.Components.rb rbVar = (org.telegram.ui.Components.rb) this.f1906b;
                if (rbVar == null) {
                    return AndroidUtilities.statusBarHeight;
                }
                return rbVar.h(i10);
            case 7:
                return 0;
            case 8:
                return 0;
            case 9:
                return 0;
            case 10:
                return AndroidUtilities.statusBarHeight;
            default:
                return 0;
        }
    }

    private final void A(org.telegram.ui.Components.tc tcVar) {
    }

    private final void B(org.telegram.ui.Components.tc tcVar) {
    }

    private final void C(org.telegram.ui.Components.tc tcVar) {
    }

    private final void D(org.telegram.ui.Components.tc tcVar) {
    }

    private final void E(org.telegram.ui.Components.tc tcVar) {
    }

    private final void F(org.telegram.ui.Components.tc tcVar) {
    }

    private final void G(org.telegram.ui.Components.tc tcVar) {
    }

    private final void H(org.telegram.ui.Components.tc tcVar) {
    }

    private final void I(org.telegram.ui.Components.tc tcVar) {
    }

    private final void J(org.telegram.ui.Components.tc tcVar) {
    }

    private final void K(org.telegram.ui.Components.tc tcVar) {
    }

    private final void L(org.telegram.ui.Components.tc tcVar) {
    }

    private final void M(org.telegram.ui.Components.tc tcVar) {
    }

    private final void N(org.telegram.ui.Components.tc tcVar) {
    }

    private final void O(org.telegram.ui.Components.tc tcVar) {
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

    private final void u(org.telegram.ui.Components.tc tcVar) {
    }

    private final void v(org.telegram.ui.Components.tc tcVar) {
    }

    private final void w(org.telegram.ui.Components.tc tcVar) {
    }

    private final void x(org.telegram.ui.Components.tc tcVar) {
    }

    private final void y(org.telegram.ui.Components.tc tcVar) {
    }

    private final void z(org.telegram.ui.Components.tc tcVar) {
    }
}
