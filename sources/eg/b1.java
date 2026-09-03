package eg;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import nh.i4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.p9;
import org.telegram.ui.qh1;
public final class b1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5212a;
    public final Object f5213b;

    public b1(Object obj, int i10) {
        this.f5212a = i10;
        this.f5213b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        float f10;
        float f11;
        float f12;
        switch (this.f5212a) {
            case 0:
                c1 c1Var = (c1) this.f5213b;
                c1Var.f5220n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.e();
                return;
            case 1:
                ((z0) this.f5213b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                ((f2.z) this.f5213b).f5860x = valueAnimator.getAnimatedFraction();
                return;
            case 3:
                i4 i4Var = (i4) this.f5213b;
                i4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var.invalidate();
                return;
            case 4:
                oh.r rVar = (oh.r) this.f5213b;
                rVar.f16583c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.f16584f.invalidate();
                return;
            case 5:
                q7 q7Var = (q7) this.f5213b;
                q7Var.f21731y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q7Var.invalidate();
                return;
            case 6:
                ((p9) this.f5213b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                lh.e1 e1Var = ((c70) this.f5213b).e.d;
                int i10 = e1Var.B1;
                if (i10 != -1 && (view = e1Var.C1) != null) {
                    e1Var.h1(i10, view);
                    e1Var.invalidate();
                    return;
                }
                return;
            case 8:
                l81 l81Var = (l81) this.f5213b;
                View[] viewArr = l81Var.e;
                if (l81Var.f26624x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    l81Var.f26618c = abs;
                    a81 a81Var = l81Var.J;
                    if (a81Var != null) {
                        a81Var.e(abs, l81Var.d, l81Var.f26617b);
                    }
                }
                l81Var.w(false);
                return;
            case 9:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.f5213b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.G = floatValue;
                org.telegram.ui.Components.voip.r1 r1Var = s1Var.f29870f0;
                if (r1Var != null) {
                    ((qh1) r1Var).f37421b.f34945a0.d(floatValue, s1Var.M);
                }
                s1Var.invalidate();
                return;
            case 10:
                ph.x xVar = (ph.x) this.f5213b;
                xVar.f42560l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar.f42564p.invalidate();
                return;
            case 11:
                tf.x0 x0Var = (tf.x0) this.f5213b;
                x0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x0Var.invalidate();
                for (int i11 = 0; i11 < 2; i11++) {
                    x0Var.f44940c[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    x0Var.f44940c[i11].setVisibility(0);
                    TextView textView = x0Var.f44940c[i11];
                    float f13 = 0.0f;
                    if (i11 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    if (i11 == 1) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    textView.setAlpha(AndroidUtilities.lerp(f10, f11, x0Var.e));
                    x0Var.d[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    x0Var.d[i11].setVisibility(0);
                    TextView textView2 = x0Var.d[i11];
                    if (i11 == 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    if (i11 == 1) {
                        f13 = 1.0f;
                    }
                    textView2.setAlpha(AndroidUtilities.lerp(f12, f13, x0Var.e));
                }
                return;
            case 12:
                vf.k kVar = (vf.k) this.f5213b;
                kVar.f45798g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.E = true;
                kVar.invalidate();
                return;
            default:
                vf.p pVar = (vf.p) this.f5213b;
                pVar.f45798g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.E = true;
                pVar.invalidate();
                return;
        }
    }
}
