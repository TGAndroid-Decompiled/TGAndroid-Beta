package fi;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.an;
import org.telegram.ui.tp0;
import org.telegram.ui.yb1;
public final class v3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12918a;
    public final Object f12919b;

    public v3(Object obj, int i7) {
        this.f12918a = i7;
        this.f12919b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12918a) {
            case 0:
                ((b4) this.f12919b).invalidate();
                return;
            case 1:
                s5 s5Var = (s5) this.f12919b;
                s5Var.getClass();
                s5Var.f12795n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s5Var.e();
                return;
            case 2:
                r5 r5Var = (r5) this.f12919b;
                r5Var.getClass();
                r5Var.f12740w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r5Var.invalidate();
                return;
            case 3:
                l6 l6Var = (l6) this.f12919b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var.E = floatValue;
                k6 k6Var = l6Var.f12326a;
                k6Var.setScaleX(1.0f - floatValue);
                k6Var.setScaleY(1.0f - l6Var.E);
                l6Var.invalidate();
                return;
            case 4:
                p7 p7Var = (p7) this.f12919b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.f12606r = floatValue2;
                c20 c20Var = p7Var.f12610y;
                if (c20Var != null) {
                    c20Var.a(Float.valueOf(Utilities.i(floatValue2, 1.0f, -1.0f)));
                }
                p7Var.f12600a.invalidate();
                return;
            case 5:
                ((n8) this.f12919b).f12495y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                p8 p8Var = (p8) this.f12919b;
                p8Var.getClass();
                p8Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                lg.h hVar = (lg.h) this.f12919b;
                hVar.f18333f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f18334g.f18335a.invalidate();
                return;
            case 8:
                li.s4 s4Var = (li.s4) this.f12919b;
                s4Var.getClass();
                s4Var.f18838a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s4Var.requestLayout();
                s4Var.invalidate();
                return;
            case 9:
                mi.l lVar = (mi.l) this.f12919b;
                an anVar = lVar.F;
                if (anVar != null) {
                    anVar.M9();
                    if (anVar.X8 != null) {
                        anVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                lVar.G.invalidate();
                return;
            case 10:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f12919b;
                w0Var.getClass();
                w0Var.f28678a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w0Var.invalidate();
                return;
            case 11:
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.f12919b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z0Var.setTextColor(i0.a.f(floatValue3, -1, -9194260));
                z0Var.setIconColor(i0.a.f(floatValue3, -1, -9194260));
                return;
            case 12:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f12919b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i7);
                    if (!(childAt instanceof org.telegram.ui.ActionBar.d1)) {
                        float s5 = org.telegram.messenger.g0.s(floatValue4, actionBarPopupWindow$ActionBarPopupWindowLayout.f27290w ? (itemsCount - 1) - i7 : i7, itemsCount, 4.0f);
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
                org.telegram.ui.ActionBar.i1 i1Var = (org.telegram.ui.ActionBar.i1) this.f12919b;
                if (!i1Var.f27545e) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (i1Var.f27557r) {
                        floatValue5 = 1.0f - floatValue5;
                    }
                    float z9 = (int) com.google.android.recaptcha.internal.a.z(1.0f, floatValue5, i1Var.f27556q, i1Var.f27555p * floatValue5);
                    if (!(i1Var instanceof ch.k)) {
                        i1Var.f27542a.setTranslationY(z9);
                    }
                    i1Var.e(-z9, floatValue5, i1Var.f27558s);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.ActionBar.d3 d3Var = (org.telegram.ui.ActionBar.d3) this.f12919b;
                d3Var.getClass();
                d3Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = d3Var.I.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                d3Var.invalidate();
                return;
            case 15:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.f12919b;
                j3Var.f27616i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.ActionBar.k3 k3Var = j3Var.f27611b;
                if (k3Var != null) {
                    k3Var.invalidate();
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) this.f12919b;
                a0Var.getClass();
                a0Var.f39047r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.e();
                return;
            case 17:
                org.telegram.ui.Components.voip.o0 o0Var = (org.telegram.ui.Components.voip.o0) this.f12919b;
                o0Var.getClass();
                o0Var.f39400i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                yb1 yb1Var = (yb1) this.f12919b;
                yb1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L = (org.telegram.messenger.g0.f22544q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                org.telegram.ui.Components.voip.x0 x0Var = yb1Var.f39633c;
                x0Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L * yb1Var.E));
                x0Var.requestLayout();
                return;
            case 19:
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.f12919b;
                n1Var.getClass();
                n1Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.invalidate();
                return;
            case 20:
                org.telegram.ui.Components.voip.e2 e2Var = (org.telegram.ui.Components.voip.e2) this.f12919b;
                e2Var.getClass();
                e2Var.f39144w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e2Var.f39137b.invalidate();
                return;
            case 21:
                di.z2 z2Var = (di.z2) this.f12919b;
                ((di.c4) z2Var.K1).f35582a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                z2Var.invalidate();
                return;
            case 22:
                org.telegram.ui.web.k1 k1Var = (org.telegram.ui.web.k1) this.f12919b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var.U = floatValue6;
                k1Var.V.setAlpha(floatValue6);
                k1Var.invalidate();
                return;
            case 23:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f12919b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f51180a0 = floatValue7;
                l0Var.j(floatValue7);
                l0Var.f51182b0.setAlpha(l0Var.f51180a0);
                l0Var.R.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.f51180a0);
                l0Var.O.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.f51180a0);
                l0Var.invalidate();
                return;
            case 24:
                ((tp0) ((tg.o0) this.f12919b)).K.f41380e0.invalidate();
                return;
            case 25:
                tg.h1 h1Var = (tg.h1) this.f12919b;
                h1Var.getClass();
                h1Var.f55626n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1Var.invalidate();
                return;
            case 26:
                tg.o1 o1Var = (tg.o1) this.f12919b;
                o1Var.getClass();
                o1Var.f55800y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.invalidate();
                return;
            case 27:
                sg.i iVar = (sg.i) this.f12919b;
                iVar.f55800y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.invalidate();
                return;
            case 28:
                tg.c2 c2Var = (tg.c2) this.f12919b;
                c2Var.getClass();
                c2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                tg.i2 i2Var = (tg.i2) this.f12919b;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i2Var.D = floatValue8;
                bi.t tVar = i2Var.f55665c;
                tVar.setAlpha(floatValue8);
                tVar.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, i2Var.D));
                tVar.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, i2Var.D));
                i2Var.f55664b.invalidate();
                return;
        }
    }
}
