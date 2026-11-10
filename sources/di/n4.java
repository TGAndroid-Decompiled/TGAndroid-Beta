package di;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.w50;
import org.telegram.ui.ub1;
public final class n4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9395a;
    public final Object f9396b;

    public n4(Object obj, int i7) {
        this.f9395a = i7;
        this.f9396b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        float f12;
        View view;
        switch (this.f9395a) {
            case 0:
                p4 p4Var = (p4) this.f9396b;
                p4Var.f9506e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p4Var.invalidate();
                return;
            case 1:
                ei.n nVar = (ei.n) this.f9396b;
                nVar.f10836c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.f10838f.invalidate();
                return;
            case 2:
                fi.d0 d0Var = (fi.d0) this.f9396b;
                d0Var.f11781l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f11785p.invalidate();
                return;
            case 3:
                jg.l1 l1Var = (jg.l1) this.f9396b;
                l1Var.f16834e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l1Var.invalidate();
                for (int i7 = 0; i7 < 2; i7++) {
                    l1Var.f16833c[i7].setTranslationX(org.telegram.messenger.g0.W1(l1Var.f16834e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    l1Var.f16833c[i7].setVisibility(0);
                    TextView textView = l1Var.f16833c[i7];
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
                    textView.setAlpha(org.telegram.messenger.g0.T1(f10, f11, l1Var.f16834e));
                    l1Var.d[i7].setTranslationX(org.telegram.messenger.g0.W1(l1Var.f16834e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    l1Var.d[i7].setVisibility(0);
                    TextView textView2 = l1Var.d[i7];
                    if (i7 == 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    if (i7 == 1) {
                        f13 = 1.0f;
                    }
                    textView2.setAlpha(org.telegram.messenger.g0.T1(f12, f13, l1Var.f16834e));
                }
                return;
            case 4:
                lg.k kVar = (lg.k) this.f9396b;
                kVar.f18312j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.H = true;
                kVar.invalidate();
                return;
            case 5:
                lg.p pVar = (lg.p) this.f9396b;
                pVar.f18312j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.H = true;
                pVar.invalidate();
                return;
            case 6:
                MediaController mediaController = (MediaController) this.f9396b;
                mediaController.P1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.n0();
                return;
            case 7:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.f9396b;
                o7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.invalidate();
                return;
            case 8:
                ((org.telegram.ui.Components.k9) this.f9396b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 9:
                bi.q1 q1Var = ((w50) this.f9396b).f39888e.n1;
                int i10 = q1Var.C1;
                if (i10 != -1 && (view = q1Var.D1) != null) {
                    q1Var.k1(i10, view);
                    q1Var.invalidate();
                    return;
                }
                return;
            case 10:
                v61 v61Var = (v61) this.f9396b;
                View[] viewArr = v61Var.f38893e;
                if (v61Var.f38900y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    v61Var.f38892c = abs;
                    k61 k61Var = v61Var.M;
                    if (k61Var != null) {
                        k61Var.e(abs, v61Var.d, v61Var.f38891b);
                    }
                }
                v61Var.x(false);
                return;
            case 11:
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.f9396b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.J = floatValue;
                org.telegram.ui.Components.voip.m1 m1Var = n1Var.f39417i0;
                if (m1Var != null) {
                    ((ub1) m1Var).f50456b.f46916d0.d(n1Var.P, floatValue);
                }
                n1Var.invalidate();
                return;
            case 12:
                ug.p0 p0Var = (ug.p0) this.f9396b;
                p0Var.f56771s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.e();
                return;
            case 13:
                ((ug.n0) this.f9396b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((v4.u) this.f9396b).f57179y = valueAnimator.getAnimatedFraction();
                return;
        }
    }
}
