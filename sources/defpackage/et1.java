package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class et1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public et1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ft1 ft1Var = (ft1) obj;
                ft1Var.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ft1Var.invalidate();
                return;
            case 1:
                ((xz1) obj).g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i22 i22Var = ((n12) obj).e;
                h12 h12Var = i22Var.u3;
                h12Var.setAlpha(1.0f - floatValue);
                i22Var.B3.setAlpha(floatValue);
                float L = floatValue * gm.L(36.0f);
                i22Var.C3 = L;
                h12Var.setTranslationY(L);
                return;
            case 3:
                h12 h12Var2 = (h12) obj;
                i22 i22Var2 = h12Var2.b;
                i22Var2.S3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i22Var2.z2.invalidate();
                i22Var2.A2.invalidate();
                h12Var2.invalidate();
                return;
            case 4:
                ((c52) obj).X(valueAnimator);
                return;
            case 5:
                u62 u62Var = (u62) obj;
                u62Var.getClass();
                u62Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u62Var.O.z.invalidate();
                return;
            case 6:
                wb2 wb2Var = (wb2) obj;
                yv1 yv1Var = wb2Var.F;
                if (yv1Var != null) {
                    yv1Var.Q7();
                    if (yv1Var.Z8 != null) {
                        yv1Var.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                wb2Var.G.invalidate();
                return;
            case 7:
                rc2 rc2Var = (rc2) obj;
                rc2Var.Y9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rc2Var.invalidate();
                return;
            case 8:
                ke2 ke2Var = (ke2) obj;
                ke2Var.getClass();
                ke2Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = ke2Var.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
            case 9:
                ne2 ne2Var = (ne2) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ne2Var.d = floatValue2;
                ne2Var.setShown(floatValue2);
                ne2Var.a(false);
                return;
            case 10:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pe2 pe2Var = ((qe2) obj).b;
                if (pe2Var != null) {
                    pe2Var.setAlpha(floatValue3);
                    return;
                }
                return;
            case 11:
                if2 if2Var = (if2) obj;
                if2Var.Z1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if2Var.C1.setTranslationY((-gm.L(7.0f)) * if2Var.Z1);
                return;
            case 12:
                gl2 gl2Var = (gl2) obj;
                gl2Var.getClass();
                gl2Var.W1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gl2Var.invalidate();
                if (gl2Var.getParent() != null) {
                    ((ViewGroup) gl2Var.getParent()).invalidate();
                    return;
                }
                return;
            case 13:
                rk2 rk2Var = (rk2) obj;
                rk2Var.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rk2Var.invalidate();
                if (rk2Var.getParent() != null) {
                    ((ViewGroup) rk2Var.getParent()).invalidate();
                    return;
                }
                return;
            case 14:
                wl2 wl2Var = (wl2) obj;
                wl2Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wl2Var.a.invalidate();
                return;
            case 15:
                vn2 vn2Var = (vn2) obj;
                vn2Var.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                vn2Var.invalidate();
                return;
            case 16:
                ty2 ty2Var = (ty2) obj;
                ty2Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = ty2Var.G;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 17:
                hh3 hh3Var = (hh3) obj;
                hh3Var.P.e = gm.R1(0.0f, 1.0f - hh3Var.c0.e0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                hh3Var.invalidate();
                return;
            case 18:
                ((jk3) obj).setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                ((sm3) obj).a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 20:
                az3 az3Var = (az3) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                az3Var.D1 = floatValue4;
                az3Var.q1.setAlpha(floatValue4);
                az3Var.u1.setAlpha(az3Var.D1);
                az3Var.v1.setAlpha(az3Var.D1);
                az3Var.b.invalidate();
                return;
            case 21:
                ty3 ty3Var = (ty3) obj;
                ty3Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (ty3Var.getParent() instanceof View) {
                    ((View) ty3Var.getParent()).invalidate();
                    return;
                }
                return;
            case 22:
                wy3 wy3Var = (wy3) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wy3Var.w = floatValue5;
                TextView textView = wy3Var.c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - wy3Var.w);
                textView.setAlpha(1.0f - wy3Var.w);
                TextView textView2 = wy3Var.d;
                textView2.setScaleX(wy3Var.w);
                textView2.setScaleY(wy3Var.w);
                textView2.setAlpha(wy3Var.w);
                return;
            case 23:
                jz3 jz3Var = (jz3) obj;
                jz3Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jz3Var.d();
                return;
            case 24:
                lz3 lz3Var = (lz3) obj;
                lz3Var.getClass();
                lz3Var.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lz3Var.invalidate();
                lz3Var.requestLayout();
                lz3Var.c();
                lz3Var.s.b.invalidate();
                return;
            case 25:
                n24 n24Var = (n24) obj;
                n24Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n24Var.invalidate();
                return;
            case 26:
                s24 s24Var = (s24) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s24Var.x = floatValue6;
                View view2 = s24Var.w;
                if (view2 != null) {
                    view2.setAlpha(floatValue6);
                    return;
                }
                su suVar = s24Var.s;
                if (suVar != null) {
                    suVar.invalidate();
                    return;
                }
                return;
            case 27:
                kf4 kf4Var = (kf4) obj;
                kf4Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kf4Var.invalidate();
                return;
            case 28:
                ((ig4) obj).e(valueAnimator);
                return;
            default:
                ig4 ig4Var = ((ag4) obj).F;
                ig4Var.G.invalidate();
                ig4Var.invalidate();
                return;
        }
    }
}
