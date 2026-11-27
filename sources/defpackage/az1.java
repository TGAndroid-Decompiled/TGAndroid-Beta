package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class az1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public az1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((bz1) obj).g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n12 n12Var = ((s02) obj).e;
                m02 m02Var = n12Var.u3;
                m02Var.setAlpha(1.0f - floatValue);
                n12Var.B3.setAlpha(floatValue);
                float L = floatValue * hl.L(36.0f);
                n12Var.C3 = L;
                m02Var.setTranslationY(L);
                return;
            case 2:
                m02 m02Var2 = (m02) obj;
                n12 n12Var2 = m02Var2.b;
                n12Var2.S3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n12Var2.z2.invalidate();
                n12Var2.A2.invalidate();
                m02Var2.invalidate();
                return;
            case 3:
                ((h42) obj).W(valueAnimator);
                return;
            case 4:
                z52 z52Var = (z52) obj;
                z52Var.getClass();
                z52Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z52Var.O.z.invalidate();
                return;
            case 5:
                bb2 bb2Var = (bb2) obj;
                zu1 zu1Var = bb2Var.F;
                if (zu1Var != null) {
                    zu1Var.Q7();
                    if (zu1Var.Z8 != null) {
                        zu1Var.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                bb2Var.G.invalidate();
                return;
            case 6:
                wb2 wb2Var = (wb2) obj;
                wb2Var.Y9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wb2Var.invalidate();
                return;
            case 7:
                pd2 pd2Var = (pd2) obj;
                pd2Var.getClass();
                pd2Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = pd2Var.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
            case 8:
                sd2 sd2Var = (sd2) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sd2Var.d = floatValue2;
                sd2Var.setShown(floatValue2);
                sd2Var.a(false);
                return;
            case 9:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ud2 ud2Var = ((wd2) obj).b;
                if (ud2Var != null) {
                    ud2Var.setAlpha(floatValue3);
                    return;
                }
                return;
            case 10:
                oe2 oe2Var = (oe2) obj;
                oe2Var.Z1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oe2Var.C1.setTranslationY((-hl.L(7.0f)) * oe2Var.Z1);
                return;
            case 11:
                ok2 ok2Var = (ok2) obj;
                ok2Var.getClass();
                ok2Var.X1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ok2Var.invalidate();
                if (ok2Var.getParent() != null) {
                    ((ViewGroup) ok2Var.getParent()).invalidate();
                    return;
                }
                return;
            case 12:
                zj2 zj2Var = (zj2) obj;
                zj2Var.W1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zj2Var.invalidate();
                if (zj2Var.getParent() != null) {
                    ((ViewGroup) zj2Var.getParent()).invalidate();
                    return;
                }
                return;
            case 13:
                el2 el2Var = (el2) obj;
                el2Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                el2Var.a.invalidate();
                return;
            case 14:
                dn2 dn2Var = (dn2) obj;
                dn2Var.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dn2Var.invalidate();
                return;
            case 15:
                dy2 dy2Var = (dy2) obj;
                dy2Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = dy2Var.G;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                og3 og3Var = (og3) obj;
                og3Var.P.e = hl.R1(0.0f, 1.0f - og3Var.c0.e0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                og3Var.invalidate();
                return;
            case 17:
                ((qj3) obj).setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                ((zl3) obj).a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 19:
                ly3 ly3Var = (ly3) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ly3Var.D1 = floatValue4;
                ly3Var.q1.setAlpha(floatValue4);
                ly3Var.u1.setAlpha(ly3Var.D1);
                ly3Var.v1.setAlpha(ly3Var.D1);
                ly3Var.b.invalidate();
                return;
            case 20:
                ey3 ey3Var = (ey3) obj;
                ey3Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (ey3Var.getParent() instanceof View) {
                    ((View) ey3Var.getParent()).invalidate();
                    return;
                }
                return;
            case 21:
                hy3 hy3Var = (hy3) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hy3Var.w = floatValue5;
                TextView textView = hy3Var.c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - hy3Var.w);
                textView.setAlpha(1.0f - hy3Var.w);
                TextView textView2 = hy3Var.d;
                textView2.setScaleX(hy3Var.w);
                textView2.setScaleY(hy3Var.w);
                textView2.setAlpha(hy3Var.w);
                return;
            case 22:
                uy3 uy3Var = (uy3) obj;
                uy3Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uy3Var.d();
                return;
            case 23:
                wy3 wy3Var = (wy3) obj;
                wy3Var.getClass();
                wy3Var.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wy3Var.invalidate();
                wy3Var.requestLayout();
                wy3Var.c();
                wy3Var.s.b.invalidate();
                return;
            case 24:
                x14 x14Var = (x14) obj;
                x14Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x14Var.invalidate();
                return;
            case 25:
                c24 c24Var = (c24) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c24Var.x = floatValue6;
                View view2 = c24Var.w;
                if (view2 != null) {
                    view2.setAlpha(floatValue6);
                    return;
                }
                tt ttVar = c24Var.s;
                if (ttVar != null) {
                    ttVar.invalidate();
                    return;
                }
                return;
            case 26:
                p94 p94Var = (p94) obj;
                p94Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p94Var.b();
                p94Var.invalidate();
                return;
            case 27:
                hf4 hf4Var = (hf4) obj;
                hf4Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hf4Var.invalidate();
                return;
            case 28:
                ((fg4) obj).f(valueAnimator);
                return;
            default:
                fg4 fg4Var = ((xf4) obj).F;
                fg4Var.G.invalidate();
                fg4Var.invalidate();
                return;
        }
    }
}
