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
    public final int f11889a;
    public final Object f11890b;

    public d4(Object obj, int i7) {
        this.f11889a = i7;
        this.f11890b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        float f12;
        View view;
        switch (this.f11889a) {
            case 0:
                f4 f4Var = (f4) this.f11890b;
                f4Var.f11977e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f4Var.invalidate();
                return;
            case 1:
                gi.m mVar = (gi.m) this.f11890b;
                mVar.f13683c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mVar.f13685f.invalidate();
                return;
            case 2:
                hi.f0 f0Var = (hi.f0) this.f11890b;
                f0Var.f14624l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0Var.f14628p.invalidate();
                return;
            case 3:
                jg.k1 k1Var = (jg.k1) this.f11890b;
                k1Var.f17587e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var.invalidate();
                for (int i7 = 0; i7 < 2; i7++) {
                    k1Var.f17586c[i7].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17587e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    k1Var.f17586c[i7].setVisibility(0);
                    TextView textView = k1Var.f17586c[i7];
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
                    textView.setAlpha(org.telegram.messenger.g0.T1(f10, f11, k1Var.f17587e));
                    k1Var.d[i7].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17587e, 0, -org.telegram.messenger.g0.L(62.0f)));
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
                    textView2.setAlpha(org.telegram.messenger.g0.T1(f12, f13, k1Var.f17587e));
                }
                return;
            case 4:
                lg.k kVar = (lg.k) this.f11890b;
                kVar.f19838k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.I = true;
                kVar.invalidate();
                return;
            case 5:
                lg.p pVar = (lg.p) this.f11890b;
                pVar.f19838k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.I = true;
                pVar.invalidate();
                return;
            case 6:
                MediaController mediaController = (MediaController) this.f11890b;
                mediaController.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.n0();
                return;
            case 7:
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) this.f11890b;
                p7Var.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.invalidate();
                return;
            case 8:
                ((q9) this.f11890b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 9:
                di.b1 b1Var = ((k60) this.f11890b).f36818e.f39081o1;
                int i10 = b1Var.D1;
                if (i10 != -1 && (view = b1Var.E1) != null) {
                    b1Var.k1(i10, view);
                    b1Var.invalidate();
                    return;
                }
                return;
            case 10:
                j71 j71Var = (j71) this.f11890b;
                View[] viewArr = j71Var.f36434e;
                if (j71Var.f36441y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    j71Var.f36433c = abs;
                    z61 z61Var = j71Var.N;
                    if (z61Var != null) {
                        z61Var.f(abs, j71Var.d, j71Var.f36432b);
                    }
                }
                j71Var.t(false);
                return;
            case 11:
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.f11890b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.K = floatValue;
                org.telegram.ui.Components.voip.p1 p1Var = q1Var.f41289j0;
                if (p1Var != null) {
                    ((sb1) p1Var).f52006b.f48342e0.d(q1Var.Q, floatValue);
                }
                q1Var.invalidate();
                return;
            case 12:
                ug.r0 r0Var = (ug.r0) this.f11890b;
                r0Var.f58907s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.e();
                return;
            case 13:
                ((ug.p0) this.f11890b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((v4.v) this.f11890b).f59285y = valueAnimator.getAnimatedFraction();
                return;
        }
    }
}
