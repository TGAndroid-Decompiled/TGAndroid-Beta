package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.p;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
public final class u00 implements zob {
    public final byte a;
    public final Object b;

    public u00(Object obj, byte b) {
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
                ((j20) obj).F0();
                return;
            case 1:
                df3 df3Var = ((z61) obj).a0;
                if (df3Var != null) {
                    df3Var.s0(aob.w0(null, aob.h5, false));
                    return;
                }
                return;
            case 2:
                ((zu1) obj).xb();
                return;
            case 3:
                ((s42) obj).P();
                return;
            case 4:
                ((ed2) obj).h.f();
                return;
            case 5:
                p pVar = (p) obj;
                s7 s7Var = pVar.J;
                s7Var.setIconColor(aob.v0(aob.G6, pVar.e0));
                aob.A1(aob.v0(aob.I5, pVar.e0), s7Var.getBackground());
                s7Var.O(aob.v0(aob.E8, pVar.e0), false);
                s7Var.O(aob.v0(aob.F8, pVar.e0), true);
                s7Var.I(aob.v0(aob.G8, pVar.e0));
                return;
            case 6:
                uj3 uj3Var = (uj3) obj;
                bj3 bj3Var = uj3Var.D0;
                if (bj3Var != null) {
                    s6 actionMode = bj3Var.getActionMode();
                    if (actionMode != null) {
                        yob.h(aob.w8, uj3Var.getResourceProvider(), actionMode);
                    }
                    s7 speedItem = uj3Var.D0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(uj3Var.getThemedColor(aob.y8), PorterDuff.Mode.SRC_IN));
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((m15) obj).x0();
                return;
            case 8:
                ((yr5) obj).Z(true);
                return;
            case 9:
                ((qh6) obj).P1();
                return;
            case 10:
                ((ck6) obj).c0();
                return;
            case 11:
                ((z67) obj).b0();
                return;
            case 12:
                ((h48) obj).J0();
                return;
            case 13:
                ((ui8) obj).I0();
                return;
            case 14:
                ((PremiumPreviewFragment) obj).z0();
                return;
            case 15:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj).G3();
                return;
            case 16:
                ((n49) obj).b.f();
                return;
            case 17:
                kx9 kx9Var = ((bj3) obj).A0;
                if (kx9Var != null) {
                    kx9Var.setTextColor(aob.w0(null, aob.y8, false));
                    return;
                }
                return;
            case 18:
                ((Runnable) obj).run();
                return;
            case 19:
                ((w1b) obj).r0();
                return;
            case 20:
                ((s4b) obj).S0(false);
                return;
            case 21:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                for (int i = 0; i < themeActivity.b.getChildCount(); i++) {
                    View childAt = themeActivity.b.getChildAt(i);
                    if (childAt instanceof pr) {
                        ((pr) childAt).getAdapter().f();
                    } else if (childAt instanceof j38) {
                        ((j38) childAt).updateColors();
                    }
                }
                for (int i2 = 0; i2 < themeActivity.b.getCachedChildCount(); i2++) {
                    View Q = themeActivity.b.Q(i2);
                    if (Q instanceof pr) {
                        ((pr) Q).getAdapter().f();
                    } else if (Q instanceof j38) {
                        ((j38) Q).updateColors();
                    }
                }
                for (int i3 = 0; i3 < themeActivity.b.getHiddenChildCount(); i3++) {
                    View X = themeActivity.b.X(i3);
                    if (X instanceof pr) {
                        ((pr) X).getAdapter().f();
                    } else if (X instanceof j38) {
                        ((j38) X).updateColors();
                    }
                }
                for (int i4 = 0; i4 < themeActivity.b.getAttachedScrapChildCount(); i4++) {
                    View P = themeActivity.b.P(i4);
                    if (P instanceof pr) {
                        ((pr) P).getAdapter().f();
                    } else if (P instanceof j38) {
                        ((j38) P).updateColors();
                    }
                }
                return;
            case 22:
                ((pqb) obj).S0();
                return;
            case 23:
                ((axb) obj).Y();
                return;
            default:
                ((d6c) obj).d();
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
