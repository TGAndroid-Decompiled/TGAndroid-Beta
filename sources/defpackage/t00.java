package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.p;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
public final class t00 implements alb {
    public final byte a;
    public final Object b;

    public t00(Object obj, byte b) {
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
                ((i20) obj).E0();
                return;
            case 1:
                je3 je3Var = ((r61) obj).a0;
                if (je3Var != null) {
                    je3Var.s0(bkb.w0(null, bkb.g5, false));
                    return;
                }
                return;
            case 2:
                ((mu1) obj).kb();
                return;
            case 3:
                ((c42) obj).Q();
                return;
            case 4:
                ((oc2) obj).h.f();
                return;
            case 5:
                p pVar = (p) obj;
                r7 r7Var = pVar.J;
                r7Var.setIconColor(bkb.v0(bkb.F6, pVar.e0));
                bkb.A1(bkb.v0(bkb.H5, pVar.e0), r7Var.getBackground());
                r7Var.O(bkb.v0(bkb.D8, pVar.e0), false);
                r7Var.O(bkb.v0(bkb.E8, pVar.e0), true);
                r7Var.I(bkb.v0(bkb.F8, pVar.e0));
                return;
            case 6:
                cj3 cj3Var = (cj3) obj;
                hi3 hi3Var = cj3Var.D0;
                if (hi3Var != null) {
                    r6 actionMode = hi3Var.getActionMode();
                    if (actionMode != null) {
                        zkb.h(bkb.v8, cj3Var.getResourceProvider(), actionMode);
                    }
                    r7 speedItem = cj3Var.D0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(cj3Var.getThemedColor(bkb.x8), PorterDuff.Mode.SRC_IN));
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((iz4) obj).w0();
                return;
            case 8:
                ((wp5) obj).Z(true);
                return;
            case 9:
                ((mf6) obj).O1();
                return;
            case 10:
                ((yh6) obj).c0();
                return;
            case 11:
                ((s47) obj).b0();
                return;
            case 12:
                ((a18) obj).I0();
                return;
            case 13:
                ((gf8) obj).H0();
                return;
            case 14:
                ((PremiumPreviewFragment) obj).y0();
                return;
            case 15:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj).F3();
                return;
            case 16:
                ((y09) obj).b.f();
                return;
            case 17:
                qt9 qt9Var = ((hi3) obj).A0;
                if (qt9Var != null) {
                    qt9Var.setTextColor(bkb.w0(null, bkb.x8, false));
                    return;
                }
                return;
            case 18:
                ((Runnable) obj).run();
                return;
            case 19:
                ((uxa) obj).r0();
                return;
            case 20:
                ((u0b) obj).R0(false);
                return;
            case 21:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                for (int i = 0; i < themeActivity.b.getChildCount(); i++) {
                    View childAt = themeActivity.b.getChildAt(i);
                    if (childAt instanceof or) {
                        ((or) childAt).getAdapter().f();
                    } else if (childAt instanceof d08) {
                        ((d08) childAt).updateColors();
                    }
                }
                for (int i2 = 0; i2 < themeActivity.b.getCachedChildCount(); i2++) {
                    View P = themeActivity.b.P(i2);
                    if (P instanceof or) {
                        ((or) P).getAdapter().f();
                    } else if (P instanceof d08) {
                        ((d08) P).updateColors();
                    }
                }
                for (int i3 = 0; i3 < themeActivity.b.getHiddenChildCount(); i3++) {
                    View W = themeActivity.b.W(i3);
                    if (W instanceof or) {
                        ((or) W).getAdapter().f();
                    } else if (W instanceof d08) {
                        ((d08) W).updateColors();
                    }
                }
                for (int i4 = 0; i4 < themeActivity.b.getAttachedScrapChildCount(); i4++) {
                    View O = themeActivity.b.O(i4);
                    if (O instanceof or) {
                        ((or) O).getAdapter().f();
                    } else if (O instanceof d08) {
                        ((d08) O).updateColors();
                    }
                }
                return;
            case 22:
                ((qmb) obj).R0();
                return;
            case 23:
                ((zsb) obj).Y();
                return;
            default:
                ((d2c) obj).d();
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
