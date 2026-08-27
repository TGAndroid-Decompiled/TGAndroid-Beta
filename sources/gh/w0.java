package gh;

import android.widget.FrameLayout;
import jh.i9;
import jh.z8;
import lh.sb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.q7;
import org.telegram.ui.Components.ql;

public final class w0 implements db {

    public final int f7599a;

    public final Object f7600b;

    public w0(Object obj, int i10) {
        this.f7599a = i10;
        this.f7600b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f7599a) {
        }
        return true;
    }

    @Override
    public final void b(ec ecVar) {
        jh.y3 y3Var;
        switch (this.f7599a) {
            case 0:
                jb jbVar = ecVar.f28016e;
                x0 x0Var = (x0) this.f7600b;
                lg.d dVarC = x0Var.f7616e.c(jbVar, null, true);
                mg.d dVar = new mg.d(((org.telegram.ui.ActionBar.e3) x0Var).resourcesProvider);
                dVar.f18050e = new ng.a(2);
                float fDpf2 = AndroidUtilities.dpf2(0.5f);
                float fDpf3 = AndroidUtilities.dpf2(0.5f);
                dVar.f18051f = fDpf2;
                dVar.h = fDpf3;
                dVarC.n(dVar);
                dVarC.p(AndroidUtilities.dp(16.0f));
                jbVar.setCustomBackground(dVarC);
                break;
            case 2:
                if (ecVar.f28013a == 2 && (y3Var = ((jh.j3) this.f7600b).f13531x.M1) != null) {
                    i9 i9Var = ((z8) y3Var).d;
                    i9Var.U0 = true;
                    i9Var.P();
                    break;
                }
                break;
        }
    }

    @Override
    public final void c(float f10) {
        int i10 = this.f7599a;
    }

    @Override
    public final void d(ec ecVar) {
        jh.y3 y3Var;
        switch (this.f7599a) {
            case 2:
                if (ecVar.f28013a == 2 && (y3Var = ((jh.j3) this.f7600b).f13531x.M1) != null) {
                    i9 i9Var = ((z8) y3Var).d;
                    i9Var.U0 = false;
                    i9Var.P();
                    break;
                }
                break;
        }
    }

    @Override
    public final boolean e() {
        switch (this.f7599a) {
        }
        return true;
    }

    @Override
    public final int f(int i10) {
        int editTextHeight;
        int iDp;
        switch (this.f7599a) {
            case 0:
                return 0;
            case 1:
                return (int) ((ig.d0) ((ag.y1) this.f7600b).f707c).f11286u;
            case 2:
                if (((jh.j3) this.f7600b).f13531x.f13276t2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 3:
                return ((jh.c5) this.f7600b).f13156r.getPaddingBottom();
            case 4:
                return 0;
            case 5:
                editTextHeight = ((sb) this.f7600b).Y0.getEditTextHeight();
                iDp = AndroidUtilities.dp(12.0f);
                break;
            case 6:
                return ((q7) this.f7600b).f31816e.A.getHeight();
            case 7:
                return ((org.telegram.ui.ActionBar.n2) this.f7600b).getBottomInset();
            case 8:
                db dbVar = (db) this.f7600b;
                if (dbVar == null) {
                    return 0;
                }
                return dbVar.f(i10);
            case 9:
                editTextHeight = AndroidUtilities.dp(126.0f);
                iDp = ((ql) this.f7600b).f31923c.f34900b.getBottomInset();
                break;
            case 10:
                FrameLayout frameLayout = ((ex0) this.f7600b).f28192w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f7600b;
                if (!(z0Var.getParent() instanceof nh.d4)) {
                    return 0;
                }
                nh.d4 d4Var = (nh.d4) z0Var.getParent();
                return (int) ((d4Var.getSwipeOffsetY() + d4Var.getOffsetY()) - d4Var.getTopActionBarOffsetY());
        }
        return iDp + editTextHeight;
    }

    @Override
    public final boolean g(int i10) {
        switch (this.f7599a) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return i10 == 1 || i10 == 2 || i10 == 3;
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
                db dbVar = (db) this.f7600b;
                return dbVar != null && dbVar.g(i10);
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
        switch (this.f7599a) {
            case 0:
                return AndroidUtilities.statusBarHeight;
            case 1:
                return 0;
            case 2:
                return AndroidUtilities.dp(58.0f);
            case 3:
                return 0;
            case 4:
                return (int) (((jh.n5) this.f7600b).f13698a + AndroidUtilities.dp(58.0f));
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                return 0;
            case 8:
                db dbVar = (db) this.f7600b;
                return dbVar == null ? AndroidUtilities.statusBarHeight : dbVar.h(i10);
            case 9:
                return 0;
            case 10:
                return 0;
            default:
                return 0;
        }
    }

    private final void A(ec ecVar) {
    }

    private final void B(ec ecVar) {
    }

    private final void C(ec ecVar) {
    }

    private final void D(ec ecVar) {
    }

    private final void E(ec ecVar) {
    }

    private final void F(ec ecVar) {
    }

    private final void G(ec ecVar) {
    }

    private final void H(ec ecVar) {
    }

    private final void I(ec ecVar) {
    }

    private final void J(ec ecVar) {
    }

    private final void K(ec ecVar) {
    }

    private final void L(ec ecVar) {
    }

    private final void M(ec ecVar) {
    }

    private final void N(ec ecVar) {
    }

    private final void O(ec ecVar) {
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

    private final void u(ec ecVar) {
    }

    private final void v(ec ecVar) {
    }

    private final void w(ec ecVar) {
    }

    private final void x(ec ecVar) {
    }

    private final void y(ec ecVar) {
    }

    private final void z(ec ecVar) {
    }
}
