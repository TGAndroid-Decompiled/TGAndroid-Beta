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
    public final int f11841a;
    public final Object f11842b;

    public d4(Object obj, int i7) {
        this.f11841a = i7;
        this.f11842b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        float f12;
        View view;
        switch (this.f11841a) {
            case 0:
                f4 f4Var = (f4) this.f11842b;
                f4Var.f11927e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f4Var.invalidate();
                return;
            case 1:
                gi.m mVar = (gi.m) this.f11842b;
                mVar.f13646c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mVar.f13648f.invalidate();
                return;
            case 2:
                hi.e0 e0Var = (hi.e0) this.f11842b;
                e0Var.f14492l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f14496p.invalidate();
                return;
            case 3:
                jg.k1 k1Var = (jg.k1) this.f11842b;
                k1Var.f17553e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var.invalidate();
                for (int i7 = 0; i7 < 2; i7++) {
                    k1Var.f17552c[i7].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17553e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    k1Var.f17552c[i7].setVisibility(0);
                    TextView textView = k1Var.f17552c[i7];
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
                    textView.setAlpha(org.telegram.messenger.g0.T1(f10, f11, k1Var.f17553e));
                    k1Var.d[i7].setTranslationX(org.telegram.messenger.g0.W1(k1Var.f17553e, 0, -org.telegram.messenger.g0.L(62.0f)));
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
                    textView2.setAlpha(org.telegram.messenger.g0.T1(f12, f13, k1Var.f17553e));
                }
                return;
            case 4:
                lg.k kVar = (lg.k) this.f11842b;
                kVar.f19804k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.I = true;
                kVar.invalidate();
                return;
            case 5:
                lg.p pVar = (lg.p) this.f11842b;
                pVar.f19804k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.I = true;
                pVar.invalidate();
                return;
            case 6:
                MediaController mediaController = (MediaController) this.f11842b;
                mediaController.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.n0();
                return;
            case 7:
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) this.f11842b;
                p7Var.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.invalidate();
                return;
            case 8:
                ((q9) this.f11842b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 9:
                di.b1 b1Var = ((k60) this.f11842b).f36784e.f39036o1;
                int i10 = b1Var.D1;
                if (i10 != -1 && (view = b1Var.E1) != null) {
                    b1Var.k1(i10, view);
                    b1Var.invalidate();
                    return;
                }
                return;
            case 10:
                j71 j71Var = (j71) this.f11842b;
                View[] viewArr = j71Var.f36393e;
                if (j71Var.f36400y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    j71Var.f36392c = abs;
                    z61 z61Var = j71Var.N;
                    if (z61Var != null) {
                        z61Var.f(abs, j71Var.d, j71Var.f36391b);
                    }
                }
                j71Var.t(false);
                return;
            case 11:
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.f11842b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.K = floatValue;
                org.telegram.ui.Components.voip.p1 p1Var = q1Var.f41251j0;
                if (p1Var != null) {
                    ((sb1) p1Var).f51975b.f48307e0.d(q1Var.Q, floatValue);
                }
                q1Var.invalidate();
                return;
            case 12:
                ug.r0 r0Var = (ug.r0) this.f11842b;
                r0Var.f58872s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.e();
                return;
            case 13:
                ((ug.p0) this.f11842b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((v4.u) this.f11842b).f59232y = valueAnimator.getAnimatedFraction();
                return;
        }
    }
}
