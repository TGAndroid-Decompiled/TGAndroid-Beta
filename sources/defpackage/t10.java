package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.p;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
public final class t10 implements bnb {
    public final byte a;
    public final Object b;

    public t10(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(float f) {
        byte b = this.a;
    }

    @Override
    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((i30) obj).E0();
                return;
            case 1:
                wf3 wf3Var = ((y71) obj).a0;
                if (wf3Var != null) {
                    wf3Var.s0(cmb.w0(null, cmb.g5, false));
                    return;
                }
                return;
            case 2:
                ((yv1) obj).wb();
                return;
            case 3:
                ((n52) obj).P();
                return;
            case 4:
                ((zd2) obj).h.f();
                return;
            case 5:
                p pVar = (p) obj;
                r7 r7Var = pVar.J;
                r7Var.setIconColor(cmb.v0(cmb.F6, pVar.e0));
                cmb.A1(cmb.v0(cmb.H5, pVar.e0), r7Var.getBackground());
                r7Var.O(cmb.v0(cmb.D8, pVar.e0), false);
                r7Var.O(cmb.v0(cmb.E8, pVar.e0), true);
                r7Var.I(cmb.v0(cmb.F8, pVar.e0));
                return;
            case 6:
                nk3 nk3Var = (nk3) obj;
                sj3 sj3Var = nk3Var.D0;
                if (sj3Var != null) {
                    r6 actionMode = sj3Var.getActionMode();
                    if (actionMode != null) {
                        anb.h(cmb.v8, nk3Var.getResourceProvider(), actionMode);
                    }
                    r7 speedItem = nk3Var.D0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(nk3Var.getThemedColor(cmb.x8), PorterDuff.Mode.SRC_IN));
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((h15) obj).x0();
                return;
            case 8:
                ((vr5) obj).a0(true);
                return;
            case 9:
                ((mh6) obj).P1();
                return;
            case 10:
                ((ak6) obj).d0();
                return;
            case 11:
                ((t67) obj).c0();
                return;
            case 12:
                ((d38) obj).J0();
                return;
            case 13:
                ((ih8) obj).H0();
                return;
            case 14:
                ((PremiumPreviewFragment) obj).z0();
                return;
            case 15:
                RectF rectF = ProfileActivity.e7;
                ((ProfileActivity) obj).J3();
                return;
            case 16:
                ((a39) obj).b.f();
                return;
            case 17:
                sv9 sv9Var = ((sj3) obj).A0;
                if (sv9Var != null) {
                    sv9Var.setTextColor(cmb.w0(null, cmb.x8, false));
                    return;
                }
                return;
            case 18:
                ((Runnable) obj).run();
                return;
            case 19:
                ((xza) obj).s0();
                return;
            case 20:
                ((x2b) obj).R0(false);
                return;
            case 21:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                for (int i = 0; i < themeActivity.b.getChildCount(); i++) {
                    View childAt = themeActivity.b.getChildAt(i);
                    if (childAt instanceof os) {
                        ((os) childAt).getAdapter().f();
                    } else if (childAt instanceof g28) {
                        ((g28) childAt).updateColors();
                    }
                }
                for (int i2 = 0; i2 < themeActivity.b.getCachedChildCount(); i2++) {
                    View P = themeActivity.b.P(i2);
                    if (P instanceof os) {
                        ((os) P).getAdapter().f();
                    } else if (P instanceof g28) {
                        ((g28) P).updateColors();
                    }
                }
                for (int i3 = 0; i3 < themeActivity.b.getHiddenChildCount(); i3++) {
                    View W = themeActivity.b.W(i3);
                    if (W instanceof os) {
                        ((os) W).getAdapter().f();
                    } else if (W instanceof g28) {
                        ((g28) W).updateColors();
                    }
                }
                for (int i4 = 0; i4 < themeActivity.b.getAttachedScrapChildCount(); i4++) {
                    View O = themeActivity.b.O(i4);
                    if (O instanceof os) {
                        ((os) O).getAdapter().f();
                    } else if (O instanceof g28) {
                        ((g28) O).updateColors();
                    }
                }
                return;
            case 22:
                ((rob) obj).S0();
                return;
            case 23:
                ((avb) obj).Z();
                return;
            default:
                ((d4c) obj).d();
                return;
        }
    }

    private final void A(float f) {
    }

    private final void c(float f) {
    }

    private final void d(float f) {
    }

    private final void e(float f) {
    }

    private final void f(float f) {
    }

    private final void g(float f) {
    }

    private final void h(float f) {
    }

    private final void i(float f) {
    }

    private final void j(float f) {
    }

    private final void k(float f) {
    }

    private final void l(float f) {
    }

    private final void m(float f) {
    }

    private final void n(float f) {
    }

    private final void o(float f) {
    }

    private final void p(float f) {
    }

    private final void q(float f) {
    }

    private final void r(float f) {
    }

    private final void s(float f) {
    }

    private final void t(float f) {
    }

    private final void u(float f) {
    }

    private final void v(float f) {
    }

    private final void w(float f) {
    }

    private final void x(float f) {
    }

    private final void y(float f) {
    }

    private final void z(float f) {
    }
}
