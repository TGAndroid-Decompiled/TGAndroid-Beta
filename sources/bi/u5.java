package bi;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.y71;
import org.telegram.ui.ci1;
public final class u5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3795a;
    public final Object f3796b;

    public u5(Object obj, int i10) {
        this.f3795a = i10;
        this.f3796b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        float f11;
        View view;
        switch (this.f3795a) {
            case 0:
                w5 w5Var = (w5) this.f3796b;
                w5Var.f3949e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.invalidate();
                return;
            case 1:
                ci.t tVar = (ci.t) this.f3796b;
                tVar.f4833c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.f4835f.invalidate();
                return;
            case 2:
                di.d0 d0Var = (di.d0) this.f3796b;
                d0Var.f7034l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f7038p.invalidate();
                return;
            case 3:
                hg.n1 n1Var = (hg.n1) this.f3796b;
                n1Var.f11186e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.invalidate();
                for (int i10 = 0; i10 < 2; i10++) {
                    n1Var.f11185c[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.f11186e));
                    n1Var.f11185c[i10].setVisibility(0);
                    TextView textView = n1Var.f11185c[i10];
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
                    textView.setAlpha(AndroidUtilities.lerp(f7, f10, n1Var.f11186e));
                    n1Var.d[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.f11186e));
                    n1Var.d[i10].setVisibility(0);
                    TextView textView2 = n1Var.d[i10];
                    if (i10 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    if (i10 == 1) {
                        f12 = 1.0f;
                    }
                    textView2.setAlpha(AndroidUtilities.lerp(f11, f12, n1Var.f11186e));
                }
                return;
            case 4:
                jg.k kVar = (jg.k) this.f3796b;
                kVar.f13677j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.H = true;
                kVar.invalidate();
                return;
            case 5:
                jg.p pVar = (jg.p) this.f3796b;
                pVar.f13677j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.H = true;
                pVar.invalidate();
                return;
            case 6:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f3796b;
                t7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.invalidate();
                return;
            case 7:
                ((org.telegram.ui.Components.x9) this.f3796b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 8:
                o0 o0Var = ((a70) this.f3796b).f24299e.d;
                int i11 = o0Var.E1;
                if (i11 != -1 && (view = o0Var.F1) != null) {
                    o0Var.h1(i11, view);
                    o0Var.invalidate();
                    return;
                }
                return;
            case 9:
                i81 i81Var = (i81) this.f3796b;
                View[] viewArr = i81Var.f27017e;
                if (i81Var.f27023x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    i81Var.f27016c = abs;
                    y71 y71Var = i81Var.M;
                    if (y71Var != null) {
                        y71Var.e(abs, i81Var.d, i81Var.f27015b);
                    }
                }
                i81Var.w(false);
                return;
            case 10:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.f3796b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.J = floatValue;
                org.telegram.ui.Components.voip.r1 r1Var = s1Var.f31794i0;
                if (r1Var != null) {
                    ((ci1) r1Var).f35124b.f41116d0.d(floatValue, s1Var.P);
                }
                s1Var.invalidate();
                return;
            case 11:
                ((s4.u) this.f3796b).f45879x = valueAnimator.getAnimatedFraction();
                return;
            case 12:
                sg.r0 r0Var = (sg.r0) this.f3796b;
                r0Var.f46240n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.e();
                return;
            default:
                ((sg.o0) this.f3796b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
