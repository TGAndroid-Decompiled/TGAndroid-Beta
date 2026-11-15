package hi;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.an;
import org.telegram.ui.sp0;
import org.telegram.ui.yb1;
public final class j3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14458a;
    public final Object f14459b;

    public j3(Object obj, int i7) {
        this.f14458a = i7;
        this.f14459b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14458a) {
            case 0:
                l3 l3Var = (l3) this.f14459b;
                l3Var.getClass();
                l3Var.A0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                l3Var.invalidate();
                return;
            case 1:
                ((x3) this.f14459b).invalidate();
                return;
            case 2:
                r5 r5Var = (r5) this.f14459b;
                r5Var.getClass();
                r5Var.f14991n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r5Var.e();
                return;
            case 3:
                q5 q5Var = (q5) this.f14459b;
                q5Var.getClass();
                q5Var.f14910w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q5Var.invalidate();
                return;
            case 4:
                k6 k6Var = (k6) this.f14459b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6Var.F = floatValue;
                j6 j6Var = k6Var.f14504a;
                j6Var.setScaleX(1.0f - floatValue);
                j6Var.setScaleY(1.0f - k6Var.F);
                k6Var.invalidate();
                return;
            case 5:
                o7 o7Var = (o7) this.f14459b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.f14818r = floatValue2;
                z10 z10Var = o7Var.f14822y;
                if (z10Var != null) {
                    z10Var.a(Float.valueOf(Utilities.i(floatValue2, 1.0f, -1.0f)));
                }
                o7Var.f14812a.invalidate();
                return;
            case 6:
                ((l8) this.f14459b).f14610y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                n8 n8Var = (n8) this.f14459b;
                n8Var.getClass();
                n8Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                lg.h hVar = (lg.h) this.f14459b;
                hVar.f19469f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f19470g.f19471a.invalidate();
                return;
            case 9:
                oi.p4 p4Var = (oi.p4) this.f14459b;
                p4Var.getClass();
                p4Var.f21881b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p4Var.requestLayout();
                p4Var.invalidate();
                return;
            case 10:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f14459b;
                w0Var.getClass();
                w0Var.f29775a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w0Var.invalidate();
                return;
            case 11:
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.f14459b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z0Var.setTextColor(i0.a.f(floatValue3, -1, -9194260));
                z0Var.setIconColor(i0.a.f(floatValue3, -1, -9194260));
                return;
            case 12:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f14459b;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i7 = 0; i7 < itemsCount; i7++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i7);
                    if (!(childAt instanceof org.telegram.ui.ActionBar.d1)) {
                        float s5 = org.telegram.messenger.g0.s(floatValue4, actionBarPopupWindow$ActionBarPopupWindowLayout.f28389w ? (itemsCount - 1) - i7 : i7, itemsCount, 4.0f);
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
                org.telegram.ui.ActionBar.i1 i1Var = (org.telegram.ui.ActionBar.i1) this.f14459b;
                if (!i1Var.f28648e) {
                    float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (i1Var.f28660r) {
                        floatValue5 = 1.0f - floatValue5;
                    }
                    float z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, floatValue5, i1Var.f28659q, i1Var.f28658p * floatValue5);
                    if (!(i1Var instanceof ch.k)) {
                        i1Var.f28645a.setTranslationY(z10);
                    }
                    i1Var.e(-z10, floatValue5, i1Var.f28661s);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.f14459b;
                c3Var.getClass();
                c3Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = c3Var.J.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                c3Var.invalidate();
                return;
            case 15:
                org.telegram.ui.ActionBar.i3 i3Var = (org.telegram.ui.ActionBar.i3) this.f14459b;
                i3Var.f28672i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.ActionBar.j3 j3Var = i3Var.f28667b;
                if (j3Var != null) {
                    j3Var.invalidate();
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.voip.b0 b0Var = (org.telegram.ui.Components.voip.b0) this.f14459b;
                b0Var.getClass();
                b0Var.f40508r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.e();
                return;
            case 17:
                org.telegram.ui.Components.voip.p0 p0Var = (org.telegram.ui.Components.voip.p0) this.f14459b;
                p0Var.getClass();
                p0Var.f40859i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) this.f14459b;
                r0Var.getClass();
                r0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.invalidateSelf();
                return;
            case 19:
                yb1 yb1Var = (yb1) this.f14459b;
                yb1Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L = (org.telegram.messenger.g0.f23609q.x - org.telegram.messenger.g0.L(36.0f)) - org.telegram.messenger.g0.L(52.0f);
                org.telegram.ui.Components.voip.b1 b1Var = yb1Var.f40540c;
                b1Var.getLayoutParams().width = org.telegram.messenger.g0.L(52.0f) + ((int) (L * yb1Var.F));
                b1Var.requestLayout();
                return;
            case 20:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f14459b;
                r1Var.getClass();
                r1Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                return;
            case 21:
                org.telegram.ui.Components.voip.i2 i2Var = (org.telegram.ui.Components.voip.i2) this.f14459b;
                i2Var.getClass();
                i2Var.f40662w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i2Var.f40655b.invalidate();
                return;
            case 22:
                fi.u2 u2Var = (fi.u2) this.f14459b;
                ((fi.v3) u2Var.L1).f35508a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                u2Var.invalidate();
                return;
            case 23:
                org.telegram.ui.web.j1 j1Var = (org.telegram.ui.web.j1) this.f14459b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j1Var.V = floatValue6;
                j1Var.W.setAlpha(floatValue6);
                j1Var.invalidate();
                return;
            case 24:
                org.telegram.ui.l0 l0Var = (org.telegram.ui.l0) this.f14459b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f52647b0 = floatValue7;
                l0Var.j(floatValue7);
                l0Var.f52649c0.setAlpha(l0Var.f52647b0);
                l0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.f52647b0);
                l0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.f52647b0);
                l0Var.invalidate();
                return;
            case 25:
                pi.k kVar = (pi.k) this.f14459b;
                an anVar = kVar.F;
                if (anVar != null) {
                    anVar.O9();
                    if (anVar.Y8 != null) {
                        anVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                kVar.G.invalidate();
                return;
            case 26:
                ((sp0) ((tg.o0) this.f14459b)).L.f42763f0.invalidate();
                return;
            case 27:
                tg.h1 h1Var = (tg.h1) this.f14459b;
                h1Var.getClass();
                h1Var.f57327n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1Var.invalidate();
                return;
            case 28:
                tg.o1 o1Var = (tg.o1) this.f14459b;
                o1Var.getClass();
                o1Var.f57495y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.invalidate();
                return;
            default:
                sg.i iVar = (sg.i) this.f14459b;
                iVar.f57495y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.invalidate();
                return;
        }
    }
}
