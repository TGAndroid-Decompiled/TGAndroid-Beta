package fi;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.p9;
import org.telegram.ui.qb1;
public final class d4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11851a;
    public final Object f11852b;

    public d4(Object obj, int i7) {
        this.f11851a = i7;
        this.f11852b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        float f12;
        View view;
        switch (this.f11851a) {
            case 0:
                f4 f4Var = (f4) this.f11852b;
                f4Var.f11939e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f4Var.invalidate();
                return;
            case 1:
                gi.m mVar = (gi.m) this.f11852b;
                mVar.f13646c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mVar.f13648f.invalidate();
                return;
            case 2:
                hi.m0 m0Var = (hi.m0) this.f11852b;
                m0Var.f14873l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f14877p.invalidate();
                return;
            case 3:
                jg.k1 k1Var = (jg.k1) this.f11852b;
                k1Var.f17655e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var.invalidate();
                for (int i7 = 0; i7 < 2; i7++) {
                    k1Var.f17654c[i7].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17655e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    k1Var.f17654c[i7].setVisibility(0);
                    TextView textView = k1Var.f17654c[i7];
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
                    textView.setAlpha(org.telegram.messenger.g0.T1(f10, f11, k1Var.f17655e));
                    k1Var.d[i7].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17655e, 0, -org.telegram.messenger.g0.L(62.0f)));
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
                    textView2.setAlpha(org.telegram.messenger.g0.T1(f12, f13, k1Var.f17655e));
                }
                return;
            case 4:
                lg.k kVar = (lg.k) this.f11852b;
                kVar.f19904k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.I = true;
                kVar.invalidate();
                return;
            case 5:
                lg.p pVar = (lg.p) this.f11852b;
                pVar.f19904k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.I = true;
                pVar.invalidate();
                return;
            case 6:
                MediaController mediaController = (MediaController) this.f11852b;
                mediaController.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.n0();
                return;
            case 7:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.f11852b;
                o7Var.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.invalidate();
                return;
            case 8:
                ((p9) this.f11852b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 9:
                di.b1 b1Var = ((h60) this.f11852b).f35648e.f38698o1;
                int i10 = b1Var.D1;
                if (i10 != -1 && (view = b1Var.E1) != null) {
                    b1Var.k1(i10, view);
                    b1Var.invalidate();
                    return;
                }
                return;
            case 10:
                k71 k71Var = (k71) this.f11852b;
                View[] viewArr = k71Var.f36665e;
                if (k71Var.f36672y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    k71Var.f36664c = abs;
                    a71 a71Var = k71Var.N;
                    if (a71Var != null) {
                        a71Var.f(abs, k71Var.d, k71Var.f36663b);
                    }
                }
                k71Var.u(false);
                return;
            case 11:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.f11852b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.K = floatValue;
                org.telegram.ui.Components.voip.q1 q1Var = r1Var.f41185j0;
                if (q1Var != null) {
                    ((qb1) q1Var).f51400b.f47764e0.d(r1Var.Q, floatValue);
                }
                r1Var.invalidate();
                return;
            case 12:
                ug.r0 r0Var = (ug.r0) this.f11852b;
                r0Var.f58987s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.e();
                return;
            case 13:
                ((ug.p0) this.f11852b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((v4.v) this.f11852b).f59367y = valueAnimator.getAnimatedFraction();
                return;
        }
    }
}
