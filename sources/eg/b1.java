package eg;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import nh.i4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.p9;
import org.telegram.ui.ih1;
public final class b1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5223a;
    public final Object f5224b;

    public b1(Object obj, int i10) {
        this.f5223a = i10;
        this.f5224b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        float f10;
        float f11;
        float f12;
        switch (this.f5223a) {
            case 0:
                c1 c1Var = (c1) this.f5224b;
                c1Var.f5231n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.e();
                return;
            case 1:
                ((z0) this.f5224b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                ((f2.z) this.f5224b).f5871x = valueAnimator.getAnimatedFraction();
                return;
            case 3:
                i4 i4Var = (i4) this.f5224b;
                i4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var.invalidate();
                return;
            case 4:
                oh.r rVar = (oh.r) this.f5224b;
                rVar.f16603c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.f16604f.invalidate();
                return;
            case 5:
                r7 r7Var = (r7) this.f5224b;
                r7Var.f21798y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var.invalidate();
                return;
            case 6:
                ((p9) this.f5224b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                lh.e1 e1Var = ((b70) this.f5224b).e.d;
                int i10 = e1Var.B1;
                if (i10 != -1 && (view = e1Var.C1) != null) {
                    e1Var.i1(i10, view);
                    e1Var.invalidate();
                    return;
                }
                return;
            case 8:
                l81 l81Var = (l81) this.f5224b;
                View[] viewArr = l81Var.e;
                if (l81Var.f26600x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    l81Var.f26594c = abs;
                    a81 a81Var = l81Var.J;
                    if (a81Var != null) {
                        a81Var.e(abs, l81Var.d, l81Var.f26593b);
                    }
                }
                l81Var.w(false);
                return;
            case 9:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.f5224b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.G = floatValue;
                org.telegram.ui.Components.voip.r1 r1Var = s1Var.f29898f0;
                if (r1Var != null) {
                    ((ih1) r1Var).f35125b.f32599a0.d(floatValue, s1Var.M);
                }
                s1Var.invalidate();
                return;
            case 10:
                ph.x xVar = (ph.x) this.f5224b;
                xVar.f42526l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar.f42530p.invalidate();
                return;
            case 11:
                tf.x0 x0Var = (tf.x0) this.f5224b;
                x0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x0Var.invalidate();
                for (int i11 = 0; i11 < 2; i11++) {
                    x0Var.f44878c[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    x0Var.f44878c[i11].setVisibility(0);
                    TextView textView = x0Var.f44878c[i11];
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
                vf.k kVar = (vf.k) this.f5224b;
                kVar.f45720g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.E = true;
                kVar.invalidate();
                return;
            default:
                vf.p pVar = (vf.p) this.f5224b;
                pVar.f45720g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.E = true;
                pVar.invalidate();
                return;
        }
    }
}
