package hi;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.bc1;
import org.telegram.ui.bn;
import org.telegram.ui.up0;
public final class k3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14863a;
    public final Object f14864b;

    public k3(Object obj, int i7) {
        this.f14863a = i7;
        this.f14864b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14863a) {
            case 0:
                m3 m3Var = (m3) this.f14864b;
                m3Var.getClass();
                m3Var.A0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                m3Var.invalidate();
                return;
            case 1:
                ((x3) this.f14864b).invalidate();
                return;
            case 2:
                p5 p5Var = (p5) this.f14864b;
                p5Var.getClass();
                p5Var.f15236n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p5Var.e();
                return;
            case 3:
                o5 o5Var = (o5) this.f14864b;
                o5Var.getClass();
                o5Var.f15170w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.invalidate();
                return;
            case 4:
                j6 j6Var = (j6) this.f14864b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j6Var.F = floatValue;
                i6 i6Var = j6Var.f14813a;
                i6Var.setScaleX(1.0f - floatValue);
                i6Var.setScaleY(1.0f - j6Var.F);
                j6Var.invalidate();
                return;
            case 5:
                o7 o7Var = (o7) this.f14864b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.f15190r = floatValue2;
                x10 x10Var = o7Var.f15194y;
                if (x10Var != null) {
                    x10Var.a(Float.valueOf(Utilities.i(floatValue2, 1.0f, -1.0f)));
                }
                o7Var.f15184a.invalidate();
                return;
            case 6:
                ((l8) this.f14864b).f14965y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                n8 n8Var = (n8) this.f14864b;
                n8Var.getClass();
                n8Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                lg.h hVar = (lg.h) this.f14864b;
                hVar.f19836f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f19837g.f19838a.invalidate();
                return;
            case 9:
                oi.r4 r4Var = (oi.r4) this.f14864b;
                r4Var.getClass();
                r4Var.f22295b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r4Var.requestLayout();
                r4Var.invalidate();
                return;
            case 10:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f14864b;
                w0Var.getClass();
                w0Var.f30125a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w0Var.invalidate();
                return;
            case 11:
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.f14864b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z0Var.setTextColor(i0.a.f(floatValue3, -1, -9194260));
                z0Var.setIconColor(i0.a.f(floatValue3, -1, -9194260));
                return;
            case 12:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f14864b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
                    if (!(childAt instanceof org.telegram.ui.ActionBar.e1)) {
                        float s5 = org.telegram.messenger.g0.s(floatValue4, actionBarPopupWindow$ActionBarPopupWindowLayout.f28743w ? (itemsCount - 1) - i7 : i7, itemsCount, 4.0f);
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
                org.telegram.ui.ActionBar.j1 j1Var = (org.telegram.ui.ActionBar.j1) this.f14864b;
                if (!j1Var.f29023e) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (j1Var.f29035r) {
                        floatValue5 = 1.0f - floatValue5;
                    }
                    float z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, floatValue5, j1Var.f29034q, j1Var.f29033p * floatValue5);
                    if (!(j1Var instanceof ch.l)) {
                        j1Var.f29020a.setTranslationY(z10);
                    }
                    j1Var.e(-z10, floatValue5, j1Var.f29036s);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f14864b;
                g3Var.getClass();
                g3Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = g3Var.J.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                g3Var.invalidate();
                return;
            case 15:
                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) this.f14864b;
                m3Var2.f29223i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.ActionBar.n3 n3Var = m3Var2.f29218b;
                if (n3Var != null) {
                    n3Var.invalidate();
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) this.f14864b;
                a0Var.getClass();
                a0Var.f40756r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.e();
                return;
            case 17:
                org.telegram.ui.Components.voip.o0 o0Var = (org.telegram.ui.Components.voip.o0) this.f14864b;
                o0Var.getClass();
                o0Var.f41100i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.f14864b;
                q0Var.getClass();
                q0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var.invalidateSelf();
                return;
            case 19:
                bc1 bc1Var = (bc1) this.f14864b;
                bc1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L = (org.telegram.messenger.g0.f24121q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                org.telegram.ui.Components.voip.a1 a1Var = bc1Var.f40790c;
                a1Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L * bc1Var.F));
                a1Var.requestLayout();
                return;
            case 20:
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.f14864b;
                q1Var.getClass();
                q1Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                return;
            case 21:
                org.telegram.ui.Components.voip.h2 h2Var = (org.telegram.ui.Components.voip.h2) this.f14864b;
                h2Var.getClass();
                h2Var.f40910w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h2Var.f40903b.invalidate();
                return;
            case 22:
                fi.s2 s2Var = (fi.s2) this.f14864b;
                ((fi.t3) s2Var.L1).f38742a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                s2Var.invalidate();
                return;
            case 23:
                org.telegram.ui.web.j1 j1Var2 = (org.telegram.ui.web.j1) this.f14864b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j1Var2.V = floatValue6;
                j1Var2.W.setAlpha(floatValue6);
                j1Var2.invalidate();
                return;
            case 24:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f14864b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f53179b0 = floatValue7;
                l0Var.j(floatValue7);
                l0Var.f53181c0.setAlpha(l0Var.f53179b0);
                l0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.f53179b0);
                l0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.f53179b0);
                l0Var.invalidate();
                return;
            case 25:
                pi.k kVar = (pi.k) this.f14864b;
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
                ((up0) ((tg.o0) this.f14864b)).L.f43208f0.invalidate();
                return;
            case 27:
                tg.h1 h1Var = (tg.h1) this.f14864b;
                h1Var.getClass();
                h1Var.f57903n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1Var.invalidate();
                return;
            case 28:
                tg.o1 o1Var = (tg.o1) this.f14864b;
                o1Var.getClass();
                o1Var.f58081y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.invalidate();
                return;
            default:
                sg.i iVar = (sg.i) this.f14864b;
                iVar.f58081y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.invalidate();
                return;
        }
    }
}
