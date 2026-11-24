package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class uz1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public uz1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x02 x02Var = ((c02) obj).e;
                wz1 wz1Var = x02Var.u3;
                wz1Var.setAlpha(1.0f - floatValue);
                x02Var.B3.setAlpha(floatValue);
                float L = floatValue * gl.L(36.0f);
                x02Var.C3 = L;
                wz1Var.setTranslationY(L);
                return;
            case 1:
                wz1 wz1Var2 = (wz1) obj;
                x02 x02Var2 = wz1Var2.b;
                x02Var2.S3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x02Var2.z2.invalidate();
                x02Var2.A2.invalidate();
                wz1Var2.invalidate();
                return;
            case 2:
                ((r32) obj).X(valueAnimator);
                return;
            case 3:
                j52 j52Var = (j52) obj;
                j52Var.getClass();
                j52Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j52Var.O.z.invalidate();
                return;
            case 4:
                la2 la2Var = (la2) obj;
                mu1 mu1Var = la2Var.F;
                if (mu1Var != null) {
                    mu1Var.I7();
                    if (mu1Var.Z8 != null) {
                        mu1Var.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                la2Var.G.invalidate();
                return;
            case 5:
                gb2 gb2Var = (gb2) obj;
                gb2Var.Y9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gb2Var.invalidate();
                return;
            case 6:
                zc2 zc2Var = (zc2) obj;
                zc2Var.getClass();
                zc2Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = zc2Var.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
            case 7:
                cd2 cd2Var = (cd2) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cd2Var.d = floatValue2;
                cd2Var.setShown(floatValue2);
                cd2Var.a(false);
                return;
            case 8:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ed2 ed2Var = ((fd2) obj).b;
                if (ed2Var != null) {
                    ed2Var.setAlpha(floatValue3);
                    return;
                }
                return;
            case 9:
                xd2 xd2Var = (xd2) obj;
                xd2Var.Z1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd2Var.C1.setTranslationY((-gl.L(7.0f)) * xd2Var.Z1);
                return;
            case 10:
                sj2 sj2Var = (sj2) obj;
                sj2Var.getClass();
                sj2Var.W1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sj2Var.invalidate();
                if (sj2Var.getParent() != null) {
                    ((ViewGroup) sj2Var.getParent()).invalidate();
                    return;
                }
                return;
            case 11:
                dj2 dj2Var = (dj2) obj;
                dj2Var.V1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dj2Var.invalidate();
                if (dj2Var.getParent() != null) {
                    ((ViewGroup) dj2Var.getParent()).invalidate();
                    return;
                }
                return;
            case 12:
                jk2 jk2Var = (jk2) obj;
                jk2Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jk2Var.a.invalidate();
                return;
            case 13:
                jm2 jm2Var = (jm2) obj;
                jm2Var.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                jm2Var.invalidate();
                return;
            case 14:
                jx2 jx2Var = (jx2) obj;
                jx2Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = jx2Var.G;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                uf3 uf3Var = (uf3) obj;
                uf3Var.P.e = gl.R1(0.0f, 1.0f - uf3Var.c0.e0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                uf3Var.invalidate();
                return;
            case 16:
                ((yi3) obj).setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 17:
                ((hl3) obj).a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 18:
                qx3 qx3Var = (qx3) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qx3Var.D1 = floatValue4;
                qx3Var.q1.setAlpha(floatValue4);
                qx3Var.u1.setAlpha(qx3Var.D1);
                qx3Var.v1.setAlpha(qx3Var.D1);
                qx3Var.b.invalidate();
                return;
            case 19:
                ix3 ix3Var = (ix3) obj;
                ix3Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (ix3Var.getParent() instanceof View) {
                    ((View) ix3Var.getParent()).invalidate();
                    return;
                }
                return;
            case 20:
                mx3 mx3Var = (mx3) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mx3Var.w = floatValue5;
                TextView textView = mx3Var.c;
                textView.setScaleX(1.0f - floatValue5);
                textView.setScaleY(1.0f - mx3Var.w);
                textView.setAlpha(1.0f - mx3Var.w);
                TextView textView2 = mx3Var.d;
                textView2.setScaleX(mx3Var.w);
                textView2.setScaleY(mx3Var.w);
                textView2.setAlpha(mx3Var.w);
                return;
            case 21:
                zx3 zx3Var = (zx3) obj;
                zx3Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zx3Var.d();
                return;
            case 22:
                by3 by3Var = (by3) obj;
                by3Var.getClass();
                by3Var.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                by3Var.invalidate();
                by3Var.requestLayout();
                by3Var.c();
                by3Var.s.b.invalidate();
                return;
            case 23:
                c14 c14Var = (c14) obj;
                c14Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c14Var.invalidate();
                return;
            case 24:
                h14 h14Var = (h14) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h14Var.x = floatValue6;
                View view2 = h14Var.w;
                if (view2 != null) {
                    view2.setAlpha(floatValue6);
                    return;
                }
                st stVar = h14Var.s;
                if (stVar != null) {
                    stVar.invalidate();
                    return;
                }
                return;
            case 25:
                jd4 jd4Var = (jd4) obj;
                jd4Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jd4Var.invalidate();
                return;
            case 26:
                ((he4) obj).e(valueAnimator);
                return;
            case 27:
                he4 he4Var = ((zd4) obj).F;
                he4Var.G.invalidate();
                he4Var.invalidate();
                return;
            case 28:
                ff4 ff4Var = (ff4) obj;
                ff4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = ff4Var.c;
                imageView.setAlpha(floatValue7);
                float f = (floatValue7 * 0.5f) + 0.5f;
                imageView.setScaleX(f);
                imageView.setScaleY(f);
                View view3 = ff4Var.f;
                float f2 = 1.0f - floatValue7;
                view3.setAlpha(f2);
                float f3 = (f2 * 0.5f) + 0.5f;
                view3.setScaleX(f3);
                view3.setScaleY(f3);
                return;
            default:
                mi4 mi4Var = (mi4) obj;
                mi4Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mi4Var.i();
                return;
        }
    }
}
