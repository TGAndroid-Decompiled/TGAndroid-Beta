package f2;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import oh.k4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.voip.s1;
import org.telegram.ui.Components.voip.t1;
import org.telegram.ui.qh1;
public final class d0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5747a;
    public final Object f5748b;

    public d0(Object obj, int i10) {
        this.f5747a = i10;
        this.f5748b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        float f10;
        float f11;
        float f12;
        switch (this.f5747a) {
            case 0:
                ((z) this.f5748b).f5966x = valueAnimator.getAnimatedFraction();
                return;
            case 1:
                fg.b1 b1Var = (fg.b1) this.f5748b;
                b1Var.f6249n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.e();
                return;
            case 2:
                ((fg.z0) this.f5748b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                k4 k4Var = (k4) this.f5748b;
                k4Var.f17355e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k4Var.invalidate();
                return;
            case 4:
                r7 r7Var = (r7) this.f5748b;
                r7Var.f23593y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var.invalidate();
                return;
            case 5:
                ((p9) this.f5748b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 6:
                mh.d1 d1Var = ((d70) this.f5748b).f26210e.d;
                int i10 = d1Var.B1;
                if (i10 != -1 && (view = d1Var.C1) != null) {
                    d1Var.h1(i10, view);
                    d1Var.invalidate();
                    return;
                }
                return;
            case 7:
                l81 l81Var = (l81) this.f5748b;
                View[] viewArr = l81Var.f28687e;
                if (l81Var.f28693x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    l81Var.f28686c = abs;
                    b81 b81Var = l81Var.J;
                    if (b81Var != null) {
                        b81Var.e(abs, l81Var.d, l81Var.f28685b);
                    }
                }
                l81Var.w(false);
                return;
            case 8:
                t1 t1Var = (t1) this.f5748b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.G = floatValue;
                s1 s1Var = t1Var.f32343f0;
                if (s1Var != null) {
                    ((qh1) s1Var).f40509b.f37671a0.d(floatValue, t1Var.M);
                }
                t1Var.invalidate();
                return;
            case 9:
                ph.l lVar = (ph.l) this.f5748b;
                lVar.f44424c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar.f44426f.invalidate();
                return;
            case 10:
                qh.x xVar = (qh.x) this.f5748b;
                xVar.f46293l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar.f46297p.invalidate();
                return;
            case 11:
                uf.x0 x0Var = (uf.x0) this.f5748b;
                x0Var.f48773e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x0Var.invalidate();
                for (int i11 = 0; i11 < 2; i11++) {
                    x0Var.f48772c[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.f48773e));
                    x0Var.f48772c[i11].setVisibility(0);
                    TextView textView = x0Var.f48772c[i11];
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
                    textView.setAlpha(AndroidUtilities.lerp(f10, f11, x0Var.f48773e));
                    x0Var.d[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.f48773e));
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
                    textView2.setAlpha(AndroidUtilities.lerp(f12, f13, x0Var.f48773e));
                }
                return;
            case 12:
                wf.k kVar = (wf.k) this.f5748b;
                kVar.f49595g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.E = true;
                kVar.invalidate();
                return;
            default:
                wf.p pVar = (wf.p) this.f5748b;
                pVar.f49595g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.E = true;
                pVar.invalidate();
                return;
        }
    }
}
