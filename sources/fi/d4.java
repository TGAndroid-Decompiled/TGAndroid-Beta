package fi;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.w61;
import org.telegram.ui.sb1;
public final class d4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11849a;
    public final Object f11850b;

    public d4(Object obj, int i7) {
        this.f11849a = i7;
        this.f11850b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        float f12;
        View view;
        switch (this.f11849a) {
            case 0:
                f4 f4Var = (f4) this.f11850b;
                f4Var.f11935e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f4Var.invalidate();
                return;
            case 1:
                gi.m mVar = (gi.m) this.f11850b;
                mVar.f13654c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mVar.f13656f.invalidate();
                return;
            case 2:
                hi.e0 e0Var = (hi.e0) this.f11850b;
                e0Var.f14518l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f14522p.invalidate();
                return;
            case 3:
                jg.k1 k1Var = (jg.k1) this.f11850b;
                k1Var.f17562e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var.invalidate();
                for (int i7 = 0; i7 < 2; i7++) {
                    k1Var.f17561c[i7].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17562e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    k1Var.f17561c[i7].setVisibility(0);
                    TextView textView = k1Var.f17561c[i7];
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
                    textView.setAlpha(org.telegram.messenger.g0.T1(f10, f11, k1Var.f17562e));
                    k1Var.d[i7].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17562e, 0, -org.telegram.messenger.g0.L(62.0f)));
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
                    textView2.setAlpha(org.telegram.messenger.g0.T1(f12, f13, k1Var.f17562e));
                }
                return;
            case 4:
                lg.k kVar = (lg.k) this.f11850b;
                kVar.f19810k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.I = true;
                kVar.invalidate();
                return;
            case 5:
                lg.p pVar = (lg.p) this.f11850b;
                pVar.f19810k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.I = true;
                pVar.invalidate();
                return;
            case 6:
                MediaController mediaController = (MediaController) this.f11850b;
                mediaController.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.n0();
                return;
            case 7:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.f11850b;
                o7Var.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.invalidate();
                return;
            case 8:
                ((q9) this.f11850b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 9:
                di.b1 b1Var = ((i60) this.f11850b).f36066e.f37984o1;
                int i10 = b1Var.D1;
                if (i10 != -1 && (view = b1Var.E1) != null) {
                    b1Var.k1(i10, view);
                    b1Var.invalidate();
                    return;
                }
                return;
            case 10:
                g71 g71Var = (g71) this.f11850b;
                View[] viewArr = g71Var.f35378e;
                if (g71Var.f35385y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    g71Var.f35377c = abs;
                    w61 w61Var = g71Var.N;
                    if (w61Var != null) {
                        w61Var.f(abs, g71Var.d, g71Var.f35376b);
                    }
                }
                g71Var.t(false);
                return;
            case 11:
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.f11850b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.K = floatValue;
                org.telegram.ui.Components.voip.p1 p1Var = q1Var.f41153j0;
                if (p1Var != null) {
                    ((sb1) p1Var).f51966b.f48344e0.d(q1Var.Q, floatValue);
                }
                q1Var.invalidate();
                return;
            case 12:
                ug.s0 s0Var = (ug.s0) this.f11850b;
                s0Var.f58866s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s0Var.e();
                return;
            case 13:
                ((ug.q0) this.f11850b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((v4.v) this.f11850b).f59242y = valueAnimator.getAnimatedFraction();
                return;
        }
    }
}
