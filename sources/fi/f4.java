package fi;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.z50;
import org.telegram.ui.pb1;
public final class f4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11701a;
    public final Object f11702b;

    public f4(Object obj, int i7) {
        this.f11701a = i7;
        this.f11702b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        float f12;
        View view;
        switch (this.f11701a) {
            case 0:
                h4 h4Var = (h4) this.f11702b;
                h4Var.f11766e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h4Var.invalidate();
                return;
            case 1:
                gi.m mVar = (gi.m) this.f11702b;
                mVar.f13339c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mVar.f13341f.invalidate();
                return;
            case 2:
                hi.d0 d0Var = (hi.d0) this.f11702b;
                d0Var.f14081l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f14085p.invalidate();
                return;
            case 3:
                jg.k1 k1Var = (jg.k1) this.f11702b;
                k1Var.f17176e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var.invalidate();
                for (int i7 = 0; i7 < 2; i7++) {
                    k1Var.f17175c[i7].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17176e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    k1Var.f17175c[i7].setVisibility(0);
                    TextView textView = k1Var.f17175c[i7];
                    float f13 = 0.0f;
                    if (i7 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    if (i7 == 1) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    textView.setAlpha(org.telegram.messenger.g0.T1(f10, f11, k1Var.f17176e));
                    k1Var.d[i7].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17176e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    k1Var.d[i7].setVisibility(0);
                    TextView textView2 = k1Var.d[i7];
                    if (i7 == 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    if (i7 == 1) {
                        f13 = 1.0f;
                    }
                    textView2.setAlpha(org.telegram.messenger.g0.T1(f12, f13, k1Var.f17176e));
                }
                return;
            case 4:
                lg.k kVar = (lg.k) this.f11702b;
                kVar.f19443k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.I = true;
                kVar.invalidate();
                return;
            case 5:
                lg.p pVar = (lg.p) this.f11702b;
                pVar.f19443k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.I = true;
                pVar.invalidate();
                return;
            case 6:
                MediaController mediaController = (MediaController) this.f11702b;
                mediaController.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.n0();
                return;
            case 7:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.f11702b;
                n7Var.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7Var.invalidate();
                return;
            case 8:
                ((org.telegram.ui.Components.i9) this.f11702b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 9:
                di.c1 c1Var = ((z50) this.f11702b).f42254e.f34191o1;
                int i10 = c1Var.D1;
                if (i10 != -1 && (view = c1Var.E1) != null) {
                    c1Var.k1(i10, view);
                    c1Var.invalidate();
                    return;
                }
                return;
            case 10:
                w61 w61Var = (w61) this.f11702b;
                View[] viewArr = w61Var.f41300e;
                if (w61Var.f41307y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    w61Var.f41299c = abs;
                    l61 l61Var = w61Var.N;
                    if (l61Var != null) {
                        l61Var.e(abs, w61Var.d, w61Var.f41298b);
                    }
                }
                w61Var.u(false);
                return;
            case 11:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f11702b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.K = floatValue;
                org.telegram.ui.Components.voip.q1 q1Var = r1Var.f40911j0;
                if (q1Var != null) {
                    ((pb1) q1Var).f50216b.f46683e0.d(r1Var.Q, floatValue);
                }
                r1Var.invalidate();
                return;
            case 12:
                ug.q0 q0Var = (ug.q0) this.f11702b;
                q0Var.f58270s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var.e();
                return;
            case 13:
                ((ug.o0) this.f11702b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((v4.u) this.f11702b).f58657y = valueAnimator.getAnimatedFraction();
                return;
        }
    }
}
