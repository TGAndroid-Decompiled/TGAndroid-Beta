package gi;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.kp0;
import org.telegram.ui.sb1;
import org.telegram.ui.wm;
public final class j3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f13004a;
    public final Object f13005b;

    public j3(Object obj, int i3) {
        this.f13004a = i3;
        this.f13005b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13004a) {
            case 0:
                l3 l3Var = (l3) this.f13005b;
                l3Var.getClass();
                l3Var.A0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                l3Var.invalidate();
                return;
            case 1:
                ((y3) this.f13005b).invalidate();
                return;
            case 2:
                q5 q5Var = (q5) this.f13005b;
                q5Var.getClass();
                q5Var.f13432n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q5Var.e();
                return;
            case 3:
                p5 p5Var = (p5) this.f13005b;
                p5Var.getClass();
                p5Var.f13378w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p5Var.invalidate();
                return;
            case 4:
                m6 m6Var = (m6) this.f13005b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.F = floatValue;
                l6 l6Var = m6Var.f13243a;
                l6Var.setScaleX(1.0f - floatValue);
                l6Var.setScaleY(1.0f - m6Var.F);
                m6Var.invalidate();
                return;
            case 5:
                p7 p7Var = (p7) this.f13005b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.f13388r = floatValue2;
                u10 u10Var = p7Var.f13392y;
                if (u10Var != null) {
                    u10Var.a(Float.valueOf(Utilities.i(floatValue2, 1.0f, -1.0f)));
                }
                p7Var.f13382a.invalidate();
                return;
            case 6:
                ((o8) this.f13005b).f13350y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                q8 q8Var = (q8) this.f13005b;
                q8Var.getClass();
                q8Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                mg.h hVar = (mg.h) this.f13005b;
                hVar.f19375f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f19376g.f19377a.invalidate();
                return;
            case 9:
                mi.t4 t4Var = (mi.t4) this.f13005b;
                t4Var.getClass();
                t4Var.f19940b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t4Var.requestLayout();
                t4Var.invalidate();
                return;
            case 10:
                ni.l lVar = (ni.l) this.f13005b;
                wm wmVar = lVar.F;
                if (wmVar != null) {
                    wmVar.M9();
                    if (wmVar.Y8 != null) {
                        wmVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                lVar.G.invalidate();
                return;
            case 11:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f13005b;
                v0Var.getClass();
                v0Var.f28712a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v0Var.invalidate();
                return;
            case 12:
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) this.f13005b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y0Var.setTextColor(i0.a.f(floatValue3, -1, -9194260));
                y0Var.setIconColor(i0.a.f(floatValue3, -1, -9194260));
                return;
            case 13:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f13005b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i3 = 0; i3 < itemsCount; i3++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
                    if (!(childAt instanceof org.telegram.ui.ActionBar.c1)) {
                        float s6 = org.telegram.messenger.g0.s(floatValue4, actionBarPopupWindow$ActionBarPopupWindowLayout.f27340w ? (itemsCount - 1) - i3 : i3, itemsCount, 4.0f);
                        float f10 = 1.0f;
                        childAt.setTranslationY((1.0f - s6) * org.telegram.messenger.g0.L(-6.0f));
                        if (!childAt.isEnabled()) {
                            f10 = 0.5f;
                        }
                        childAt.setAlpha(s6 * f10);
                    }
                }
                return;
            case 14:
                org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) this.f13005b;
                if (!h1Var.f27555e) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (h1Var.f27567r) {
                        floatValue5 = 1.0f - floatValue5;
                    }
                    float y9 = (int) com.google.android.recaptcha.internal.a.y(1.0f, floatValue5, h1Var.f27566q, h1Var.f27565p * floatValue5);
                    if (!(h1Var instanceof dh.k)) {
                        h1Var.f27552a.setTranslationY(y9);
                    }
                    h1Var.e(-y9, floatValue5, h1Var.f27568s);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.f13005b;
                b3Var.getClass();
                b3Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = b3Var.J.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                b3Var.invalidate();
                return;
            case 16:
                org.telegram.ui.ActionBar.i3 i3Var = (org.telegram.ui.ActionBar.i3) this.f13005b;
                i3Var.f27598i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.ActionBar.j3 j3Var = i3Var.f27593b;
                if (j3Var != null) {
                    j3Var.invalidate();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.voip.b0 b0Var = (org.telegram.ui.Components.voip.b0) this.f13005b;
                b0Var.getClass();
                b0Var.f39236i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                sb1 sb1Var = (sb1) this.f13005b;
                sb1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L = (org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                org.telegram.ui.Components.voip.j0 j0Var = sb1Var.f39447c;
                j0Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L * sb1Var.F));
                j0Var.requestLayout();
                return;
            case 19:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.f13005b;
                s0Var.getClass();
                s0Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                org.telegram.ui.Components.voip.c1 c1Var = (org.telegram.ui.Components.voip.c1) this.f13005b;
                c1Var.getClass();
                c1Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.invalidate();
                return;
            case 21:
                org.telegram.ui.Components.voip.u1 u1Var = (org.telegram.ui.Components.voip.u1) this.f13005b;
                u1Var.getClass();
                u1Var.f39629w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.f39622b.invalidate();
                return;
            case 22:
                ei.c3 c3Var = (ei.c3) this.f13005b;
                ((ei.d4) c3Var.L1).f35342a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                c3Var.invalidate();
                return;
            case 23:
                org.telegram.ui.web.i1 i1Var = (org.telegram.ui.web.i1) this.f13005b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i1Var.V = floatValue6;
                i1Var.W.setAlpha(floatValue6);
                i1Var.invalidate();
                return;
            case 24:
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this.f13005b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f50873b0 = floatValue7;
                m0Var.j(floatValue7);
                m0Var.f50875c0.setAlpha(m0Var.f50873b0);
                m0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * m0Var.f50873b0);
                m0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * m0Var.f50873b0);
                m0Var.invalidate();
                return;
            case 25:
                ((kp0) ((ug.n0) this.f13005b)).L.f41420f0.invalidate();
                return;
            case 26:
                ug.g1 g1Var = (ug.g1) this.f13005b;
                g1Var.getClass();
                g1Var.f56019n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var.invalidate();
                return;
            case 27:
                ug.o1 o1Var = (ug.o1) this.f13005b;
                o1Var.getClass();
                o1Var.f56204y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.invalidate();
                return;
            case 28:
                tg.i iVar = (tg.i) this.f13005b;
                iVar.f56204y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.invalidate();
                return;
            default:
                ug.c2 c2Var = (ug.c2) this.f13005b;
                c2Var.getClass();
                c2Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
