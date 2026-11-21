package fi;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.z61;
import org.telegram.ui.sb1;
public final class d4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11886a;
    public final Object f11887b;

    public d4(Object obj, int i7) {
        this.f11886a = i7;
        this.f11887b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        float f12;
        View view;
        switch (this.f11886a) {
            case 0:
                f4 f4Var = (f4) this.f11887b;
                f4Var.f11974e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f4Var.invalidate();
                return;
            case 1:
                gi.m mVar = (gi.m) this.f11887b;
                mVar.f13680c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mVar.f13682f.invalidate();
                return;
            case 2:
                hi.f0 f0Var = (hi.f0) this.f11887b;
                f0Var.f14621l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0Var.f14625p.invalidate();
                return;
            case 3:
                jg.k1 k1Var = (jg.k1) this.f11887b;
                k1Var.f17584e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var.invalidate();
                for (int i7 = 0; i7 < 2; i7++) {
                    k1Var.f17583c[i7].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17584e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    k1Var.f17583c[i7].setVisibility(0);
                    TextView textView = k1Var.f17583c[i7];
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
                    textView.setAlpha(org.telegram.messenger.g0.T1(f10, f11, k1Var.f17584e));
                    k1Var.d[i7].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17584e, 0, -org.telegram.messenger.g0.L(62.0f)));
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
                    textView2.setAlpha(org.telegram.messenger.g0.T1(f12, f13, k1Var.f17584e));
                }
                return;
            case 4:
                lg.k kVar = (lg.k) this.f11887b;
                kVar.f19835k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.I = true;
                kVar.invalidate();
                return;
            case 5:
                lg.p pVar = (lg.p) this.f11887b;
                pVar.f19835k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.I = true;
                pVar.invalidate();
                return;
            case 6:
                MediaController mediaController = (MediaController) this.f11887b;
                mediaController.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.n0();
                return;
            case 7:
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) this.f11887b;
                p7Var.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.invalidate();
                return;
            case 8:
                ((q9) this.f11887b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 9:
                di.b1 b1Var = ((k60) this.f11887b).f36816e.f39072o1;
                int i10 = b1Var.D1;
                if (i10 != -1 && (view = b1Var.E1) != null) {
                    b1Var.k1(i10, view);
                    b1Var.invalidate();
                    return;
                }
                return;
            case 10:
                j71 j71Var = (j71) this.f11887b;
                View[] viewArr = j71Var.f36440e;
                if (j71Var.f36447y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    j71Var.f36439c = abs;
                    z61 z61Var = j71Var.N;
                    if (z61Var != null) {
                        z61Var.f(abs, j71Var.d, j71Var.f36438b);
                    }
                }
                j71Var.t(false);
                return;
            case 11:
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.f11887b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.K = floatValue;
                org.telegram.ui.Components.voip.p1 p1Var = q1Var.f41288j0;
                if (p1Var != null) {
                    ((sb1) p1Var).f52002b.f48338e0.d(q1Var.Q, floatValue);
                }
                q1Var.invalidate();
                return;
            case 12:
                ug.r0 r0Var = (ug.r0) this.f11887b;
                r0Var.f58903s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.e();
                return;
            case 13:
                ((ug.p0) this.f11887b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((v4.v) this.f11887b).f59281y = valueAnimator.getAnimatedFraction();
                return;
        }
    }
}
