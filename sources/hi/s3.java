package hi;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.bn;
import org.telegram.ui.up0;
import org.telegram.ui.zb1;
public final class s3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15375a;
    public final Object f15376b;

    public s3(Object obj, int i7) {
        this.f15375a = i7;
        this.f15376b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15375a) {
            case 0:
                u3 u3Var = (u3) this.f15376b;
                u3Var.getClass();
                u3Var.A0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                u3Var.invalidate();
                return;
            case 1:
                ((g4) this.f15376b).invalidate();
                return;
            case 2:
                z5 z5Var = (z5) this.f15376b;
                z5Var.getClass();
                z5Var.f15915n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z5Var.e();
                return;
            case 3:
                y5 y5Var = (y5) this.f15376b;
                y5Var.getClass();
                y5Var.f15873w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y5Var.invalidate();
                return;
            case 4:
                s6 s6Var = (s6) this.f15376b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s6Var.F = floatValue;
                r6 r6Var = s6Var.f15386a;
                r6Var.setScaleX(1.0f - floatValue);
                r6Var.setScaleY(1.0f - s6Var.F);
                s6Var.invalidate();
                return;
            case 5:
                i8 i8Var = (i8) this.f15376b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var.f14696r = floatValue2;
                w10 w10Var = i8Var.f14700y;
                if (w10Var != null) {
                    w10Var.a(Float.valueOf(Utilities.i(floatValue2, 1.0f, -1.0f)));
                }
                i8Var.f14690a.invalidate();
                return;
            case 6:
                ((f9) this.f15376b).f14505y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                h9 h9Var = (h9) this.f15376b;
                h9Var.getClass();
                h9Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                lg.h hVar = (lg.h) this.f15376b;
                hVar.f19930f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f19931g.f19932a.invalidate();
                return;
            case 9:
                oi.s4 s4Var = (oi.s4) this.f15376b;
                s4Var.getClass();
                s4Var.f22445b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s4Var.requestLayout();
                s4Var.invalidate();
                return;
            case 10:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f15376b;
                v0Var.getClass();
                v0Var.f30169a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v0Var.invalidate();
                return;
            case 11:
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) this.f15376b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y0Var.setTextColor(i0.a.f(floatValue3, -1, -9194260));
                y0Var.setIconColor(i0.a.f(floatValue3, -1, -9194260));
                return;
            case 12:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f15376b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
                    if (!(childAt instanceof org.telegram.ui.ActionBar.d1)) {
                        float s5 = org.telegram.messenger.g0.s(floatValue4, actionBarPopupWindow$ActionBarPopupWindowLayout.f28832w ? (itemsCount - 1) - i7 : i7, itemsCount, 4.0f);
                        float f10 = 1.0f;
                        childAt.setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-6.0f));
                        if (!childAt.isEnabled()) {
                            f10 = 0.5f;
                        }
                        childAt.setAlpha(s5 * f10);
                    }
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.i1 i1Var = (org.telegram.ui.ActionBar.i1) this.f15376b;
                if (!i1Var.f29070e) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (i1Var.f29082r) {
                        floatValue5 = 1.0f - floatValue5;
                    }
                    float z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, floatValue5, i1Var.f29081q, i1Var.f29080p * floatValue5);
                    if (!(i1Var instanceof ch.l)) {
                        i1Var.f29067a.setTranslationY(z10);
                    }
                    i1Var.e(-z10, floatValue5, i1Var.f29083s);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f15376b;
                f3Var.getClass();
                f3Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = f3Var.J.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                f3Var.invalidate();
                return;
            case 15:
                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) this.f15376b;
                l3Var.f29257i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.ActionBar.m3 m3Var = l3Var.f29252b;
                if (m3Var != null) {
                    m3Var.invalidate();
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.voip.b0 b0Var = (org.telegram.ui.Components.voip.b0) this.f15376b;
                b0Var.getClass();
                b0Var.f40787r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.e();
                return;
            case 17:
                org.telegram.ui.Components.voip.p0 p0Var = (org.telegram.ui.Components.voip.p0) this.f15376b;
                p0Var.getClass();
                p0Var.f41132i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) this.f15376b;
                r0Var.getClass();
                r0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.invalidateSelf();
                return;
            case 19:
                zb1 zb1Var = (zb1) this.f15376b;
                zb1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L = (org.telegram.messenger.g0.f24226q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                org.telegram.ui.Components.voip.b1 b1Var = zb1Var.f40819c;
                b1Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L * zb1Var.F));
                b1Var.requestLayout();
                return;
            case 20:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f15376b;
                r1Var.getClass();
                r1Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                return;
            case 21:
                org.telegram.ui.Components.voip.i2 i2Var = (org.telegram.ui.Components.voip.i2) this.f15376b;
                i2Var.getClass();
                i2Var.f40941w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i2Var.f40934b.invalidate();
                return;
            case 22:
                fi.s2 s2Var = (fi.s2) this.f15376b;
                ((fi.t3) s2Var.L1).f38429a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                s2Var.invalidate();
                return;
            case 23:
                org.telegram.ui.web.j1 j1Var = (org.telegram.ui.web.j1) this.f15376b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j1Var.V = floatValue6;
                j1Var.W.setAlpha(floatValue6);
                j1Var.invalidate();
                return;
            case 24:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f15376b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f53412b0 = floatValue7;
                l0Var.j(floatValue7);
                l0Var.f53414c0.setAlpha(l0Var.f53412b0);
                l0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.f53412b0);
                l0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.f53412b0);
                l0Var.invalidate();
                return;
            case 25:
                pi.k kVar = (pi.k) this.f15376b;
                bn bnVar = kVar.F;
                if (bnVar != null) {
                    bnVar.O9();
                    if (bnVar.Z8 != null) {
                        bnVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                kVar.G.invalidate();
                return;
            case 26:
                ((up0) ((tg.t0) this.f15376b)).L.f43334f0.invalidate();
                return;
            case 27:
                tg.m1 m1Var = (tg.m1) this.f15376b;
                m1Var.getClass();
                m1Var.f58083n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var.invalidate();
                return;
            case 28:
                tg.t1 t1Var = (tg.t1) this.f15376b;
                t1Var.getClass();
                t1Var.f58254y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                return;
            default:
                sg.i iVar = (sg.i) this.f15376b;
                iVar.f58254y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.invalidate();
                return;
        }
    }
}
