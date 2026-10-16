package bi;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.y70;
import org.telegram.ui.ki1;
public final class w5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3902a;
    public final Object f3903b;

    public w5(Object obj, int i10) {
        this.f3902a = i10;
        this.f3903b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        float f11;
        View view;
        switch (this.f3902a) {
            case 0:
                y5 y5Var = (y5) this.f3903b;
                y5Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y5Var.invalidate();
                return;
            case 1:
                ci.t tVar = (ci.t) this.f3903b;
                tVar.f4785c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.f4786f.invalidate();
                return;
            case 2:
                di.d0 d0Var = (di.d0) this.f3903b;
                d0Var.f6776l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f6780p.invalidate();
                return;
            case 3:
                hg.m1 m1Var = (hg.m1) this.f3903b;
                m1Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var.invalidate();
                for (int i10 = 0; i10 < 2; i10++) {
                    m1Var.f10676c[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.e));
                    m1Var.f10676c[i10].setVisibility(0);
                    TextView textView = m1Var.f10676c[i10];
                    float f12 = 0.0f;
                    if (i10 == 0) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    if (i10 == 1) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    textView.setAlpha(AndroidUtilities.lerp(f7, f10, m1Var.e));
                    m1Var.d[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.e));
                    m1Var.d[i10].setVisibility(0);
                    TextView textView2 = m1Var.d[i10];
                    if (i10 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    if (i10 == 1) {
                        f12 = 1.0f;
                    }
                    textView2.setAlpha(AndroidUtilities.lerp(f11, f12, m1Var.e));
                }
                return;
            case 4:
                jg.k kVar = (jg.k) this.f3903b;
                kVar.f13055j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.H = true;
                kVar.invalidate();
                return;
            case 5:
                jg.p pVar = (jg.p) this.f3903b;
                pVar.f13055j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.H = true;
                pVar.invalidate();
                return;
            case 6:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f3903b;
                t7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.invalidate();
                return;
            case 7:
                ((org.telegram.ui.Components.z9) this.f3903b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 8:
                o0 o0Var = ((y70) this.f3903b).e.d;
                int i11 = o0Var.C1;
                if (i11 != -1 && (view = o0Var.D1) != null) {
                    o0Var.i1(i11, view);
                    o0Var.invalidate();
                    return;
                }
                return;
            case 9:
                l91 l91Var = (l91) this.f3903b;
                View[] viewArr = l91Var.e;
                if (l91Var.f26699x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    l91Var.f26693c = abs;
                    b91 b91Var = l91Var.M;
                    if (b91Var != null) {
                        b91Var.e(abs, l91Var.d, l91Var.f26692b);
                    }
                }
                l91Var.w(false);
                return;
            case 10:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.f3903b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.J = floatValue;
                org.telegram.ui.Components.voip.r1 r1Var = s1Var.f30130i0;
                if (r1Var != null) {
                    ((ki1) r1Var).f37441b.f34685d0.d(floatValue, s1Var.P);
                }
                s1Var.invalidate();
                return;
            case 11:
                ((s4.u) this.f3903b).f44966x = valueAnimator.getAnimatedFraction();
                return;
            case 12:
                sg.q0 q0Var = (sg.q0) this.f3903b;
                q0Var.f45313n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var.e();
                return;
            default:
                ((sg.n0) this.f3903b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
