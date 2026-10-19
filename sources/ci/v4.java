package ci;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.u70;
import org.telegram.ui.pg1;
public final class v4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6080a;
    public final Object f6081b;

    public v4(Object obj, int i10) {
        this.f6080a = i10;
        this.f6081b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        float f11;
        View view;
        switch (this.f6080a) {
            case 0:
                x4 x4Var = (x4) this.f6081b;
                x4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x4Var.invalidate();
                return;
            case 1:
                di.r rVar = (di.r) this.f6081b;
                rVar.f8058c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.f8059f.invalidate();
                return;
            case 2:
                ei.d0 d0Var = (ei.d0) this.f6081b;
                d0Var.f8875l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f8879p.invalidate();
                return;
            case 3:
                hg.m1 m1Var = (hg.m1) this.f6081b;
                m1Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var.invalidate();
                for (int i10 = 0; i10 < 2; i10++) {
                    m1Var.f11984c[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.e));
                    m1Var.f11984c[i10].setVisibility(0);
                    TextView textView = m1Var.f11984c[i10];
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
                jg.k kVar = (jg.k) this.f6081b;
                kVar.f14469j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.H = true;
                kVar.invalidate();
                return;
            case 5:
                jg.p pVar = (jg.p) this.f6081b;
                pVar.f14469j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.H = true;
                pVar.invalidate();
                return;
            case 6:
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) this.f6081b;
                s7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s7Var.invalidate();
                return;
            case 7:
                ((org.telegram.ui.Components.w9) this.f6081b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 8:
                ai.u1 u1Var = ((u70) this.f6081b).e.d;
                int i11 = u1Var.C1;
                if (i11 != -1 && (view = u1Var.D1) != null) {
                    u1Var.i1(i11, view);
                    u1Var.invalidate();
                    return;
                }
                return;
            case 9:
                d91 d91Var = (d91) this.f6081b;
                View[] viewArr = d91Var.e;
                if (d91Var.f25508x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    d91Var.f25502c = abs;
                    t81 t81Var = d91Var.M;
                    if (t81Var != null) {
                        t81Var.e(abs, d91Var.d, d91Var.f25501b);
                    }
                }
                d91Var.w(false);
                return;
            case 10:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.f6081b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.J = floatValue;
                org.telegram.ui.Components.voip.r1 r1Var = s1Var.f31748i0;
                if (r1Var != null) {
                    ((pg1) r1Var).f40228b.f37661d0.d(floatValue, s1Var.P);
                }
                s1Var.invalidate();
                return;
            case 11:
                ((s4.u) this.f6081b).f46038x = valueAnimator.getAnimatedFraction();
                return;
            case 12:
                sg.q0 q0Var = (sg.q0) this.f6081b;
                q0Var.f46380n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var.e();
                return;
            default:
                ((sg.o0) this.f6081b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
