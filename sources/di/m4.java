package di;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.w50;
import org.telegram.ui.qb1;
public final class m4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9349a;
    public final Object f9350b;

    public m4(Object obj, int i7) {
        this.f9349a = i7;
        this.f9350b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        float f12;
        View view;
        switch (this.f9349a) {
            case 0:
                o4 o4Var = (o4) this.f9350b;
                o4Var.f9457e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o4Var.invalidate();
                return;
            case 1:
                ei.n nVar = (ei.n) this.f9350b;
                nVar.f10831c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.f10833f.invalidate();
                return;
            case 2:
                fi.d0 d0Var = (fi.d0) this.f9350b;
                d0Var.f11777l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f11781p.invalidate();
                return;
            case 3:
                jg.l1 l1Var = (jg.l1) this.f9350b;
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
                lg.k kVar = (lg.k) this.f9350b;
                kVar.f18309j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.H = true;
                kVar.invalidate();
                return;
            case 5:
                lg.p pVar = (lg.p) this.f9350b;
                pVar.f18309j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.H = true;
                pVar.invalidate();
                return;
            case 6:
                MediaController mediaController = (MediaController) this.f9350b;
                mediaController.P1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.n0();
                return;
            case 7:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.f9350b;
                o7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.invalidate();
                return;
            case 8:
                ((org.telegram.ui.Components.l9) this.f9350b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 9:
                bi.q1 q1Var = ((w50) this.f9350b).f39815e.f32043k1;
                int i10 = q1Var.C1;
                if (i10 != -1 && (view = q1Var.D1) != null) {
                    q1Var.k1(i10, view);
                    q1Var.invalidate();
                    return;
                }
                return;
            case 10:
                v61 v61Var = (v61) this.f9350b;
                View[] viewArr = v61Var.f38925e;
                if (v61Var.f38932y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    v61Var.f38924c = abs;
                    k61 k61Var = v61Var.M;
                    if (k61Var != null) {
                        k61Var.e(abs, v61Var.d, v61Var.f38923b);
                    }
                }
                v61Var.x(false);
                return;
            case 11:
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.f9350b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.J = floatValue;
                org.telegram.ui.Components.voip.m1 m1Var = n1Var.f39408i0;
                if (m1Var != null) {
                    ((qb1) m1Var).f49187b.f45548d0.d(n1Var.P, floatValue);
                }
                n1Var.invalidate();
                return;
            case 12:
                ug.p0 p0Var = (ug.p0) this.f9350b;
                p0Var.f56760s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.e();
                return;
            case 13:
                ((ug.n0) this.f9350b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((v4.u) this.f9350b).f57171y = valueAnimator.getAnimatedFraction();
                return;
        }
    }
}
