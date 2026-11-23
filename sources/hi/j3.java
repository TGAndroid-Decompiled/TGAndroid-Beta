package hi;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.bc1;
import org.telegram.ui.bn;
import org.telegram.ui.vp0;
public final class j3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14762a;
    public final Object f14763b;

    public j3(Object obj, int i7) {
        this.f14762a = i7;
        this.f14763b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14762a) {
            case 0:
                l3 l3Var = (l3) this.f14763b;
                l3Var.getClass();
                l3Var.A0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                l3Var.invalidate();
                return;
            case 1:
                ((x3) this.f14763b).invalidate();
                return;
            case 2:
                p5 p5Var = (p5) this.f14763b;
                p5Var.getClass();
                p5Var.f15180n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p5Var.e();
                return;
            case 3:
                o5 o5Var = (o5) this.f14763b;
                o5Var.getClass();
                o5Var.f15125w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.invalidate();
                return;
            case 4:
                j6 j6Var = (j6) this.f14763b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6Var.F = floatValue;
                i6 i6Var = j6Var.f14767a;
                i6Var.setScaleX(1.0f - floatValue);
                i6Var.setScaleY(1.0f - j6Var.F);
                j6Var.invalidate();
                return;
            case 5:
                o7 o7Var = (o7) this.f14763b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.f15145r = floatValue2;
                y10 y10Var = o7Var.f15149y;
                if (y10Var != null) {
                    y10Var.a(Float.valueOf(Utilities.i(floatValue2, 1.0f, -1.0f)));
                }
                o7Var.f15139a.invalidate();
                return;
            case 6:
                ((l8) this.f14763b).f14952y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                n8 n8Var = (n8) this.f14763b;
                n8Var.getClass();
                n8Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                lg.h hVar = (lg.h) this.f14763b;
                hVar.f19830f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f19831g.f19832a.invalidate();
                return;
            case 9:
                oi.r4 r4Var = (oi.r4) this.f14763b;
                r4Var.getClass();
                r4Var.f22320b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r4Var.requestLayout();
                r4Var.invalidate();
                return;
            case 10:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f14763b;
                v0Var.getClass();
                v0Var.f30075a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v0Var.invalidate();
                return;
            case 11:
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) this.f14763b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y0Var.setTextColor(i0.a.f(floatValue3, -1, -9194260));
                y0Var.setIconColor(i0.a.f(floatValue3, -1, -9194260));
                return;
            case 12:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f14763b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
                    if (!(childAt instanceof org.telegram.ui.ActionBar.d1)) {
                        float s5 = org.telegram.messenger.g0.s(floatValue4, actionBarPopupWindow$ActionBarPopupWindowLayout.f28740w ? (itemsCount - 1) - i7 : i7, itemsCount, 4.0f);
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
                org.telegram.ui.ActionBar.i1 i1Var = (org.telegram.ui.ActionBar.i1) this.f14763b;
                if (!i1Var.f28975e) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (i1Var.f28987r) {
                        floatValue5 = 1.0f - floatValue5;
                    }
                    float z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, floatValue5, i1Var.f28986q, i1Var.f28985p * floatValue5);
                    if (!(i1Var instanceof ch.l)) {
                        i1Var.f28972a.setTranslationY(z10);
                    }
                    i1Var.e(-z10, floatValue5, i1Var.f28988s);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f14763b;
                f3Var.getClass();
                f3Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = f3Var.J.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                f3Var.invalidate();
                return;
            case 15:
                org.telegram.ui.ActionBar.l3 l3Var2 = (org.telegram.ui.ActionBar.l3) this.f14763b;
                l3Var2.f29172i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.ActionBar.m3 m3Var = l3Var2.f29167b;
                if (m3Var != null) {
                    m3Var.invalidate();
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) this.f14763b;
                a0Var.getClass();
                a0Var.f40854r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.e();
                return;
            case 17:
                org.telegram.ui.Components.voip.o0 o0Var = (org.telegram.ui.Components.voip.o0) this.f14763b;
                o0Var.getClass();
                o0Var.f41198i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.f14763b;
                q0Var.getClass();
                q0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var.invalidateSelf();
                return;
            case 19:
                bc1 bc1Var = (bc1) this.f14763b;
                bc1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L = (org.telegram.messenger.g0.f24010q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                org.telegram.ui.Components.voip.a1 a1Var = bc1Var.f40888c;
                a1Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L * bc1Var.F));
                a1Var.requestLayout();
                return;
            case 20:
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.f14763b;
                q1Var.getClass();
                q1Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                return;
            case 21:
                org.telegram.ui.Components.voip.h2 h2Var = (org.telegram.ui.Components.voip.h2) this.f14763b;
                h2Var.getClass();
                h2Var.f41008w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h2Var.f41001b.invalidate();
                return;
            case 22:
                fi.s2 s2Var = (fi.s2) this.f14763b;
                ((fi.t3) s2Var.L1).f38789a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                s2Var.invalidate();
                return;
            case 23:
                org.telegram.ui.web.j1 j1Var = (org.telegram.ui.web.j1) this.f14763b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j1Var.V = floatValue6;
                j1Var.W.setAlpha(floatValue6);
                j1Var.invalidate();
                return;
            case 24:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f14763b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f53141b0 = floatValue7;
                l0Var.j(floatValue7);
                l0Var.f53143c0.setAlpha(l0Var.f53141b0);
                l0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.f53141b0);
                l0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.f53141b0);
                l0Var.invalidate();
                return;
            case 25:
                pi.k kVar = (pi.k) this.f14763b;
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
                ((vp0) ((tg.p0) this.f14763b)).L.f43218f0.invalidate();
                return;
            case 27:
                tg.i1 i1Var2 = (tg.i1) this.f14763b;
                i1Var2.getClass();
                i1Var2.f57931n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i1Var2.invalidate();
                return;
            case 28:
                tg.q1 q1Var2 = (tg.q1) this.f14763b;
                q1Var2.getClass();
                q1Var2.f58115y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var2.invalidate();
                return;
            default:
                sg.i iVar = (sg.i) this.f14763b;
                iVar.f58115y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.invalidate();
                return;
        }
    }
}
