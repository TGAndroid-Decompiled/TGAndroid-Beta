package ci;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.u70;
import org.telegram.ui.ug1;
public final class u4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5985a;
    public final Object f5986b;

    public u4(Object obj, int i10) {
        this.f5985a = i10;
        this.f5986b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        float f11;
        View view;
        switch (this.f5985a) {
            case 0:
                w4 w4Var = (w4) this.f5986b;
                w4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w4Var.invalidate();
                return;
            case 1:
                di.r rVar = (di.r) this.f5986b;
                rVar.f8063c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.f8064f.invalidate();
                return;
            case 2:
                ei.d0 d0Var = (ei.d0) this.f5986b;
                d0Var.f8885l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f8889p.invalidate();
                return;
            case 3:
                hg.m1 m1Var = (hg.m1) this.f5986b;
                m1Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var.invalidate();
                for (int i10 = 0; i10 < 2; i10++) {
                    m1Var.f12010c[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.e));
                    m1Var.f12010c[i10].setVisibility(0);
                    TextView textView = m1Var.f12010c[i10];
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
                jg.k kVar = (jg.k) this.f5986b;
                kVar.f14512j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.H = true;
                kVar.invalidate();
                return;
            case 5:
                jg.p pVar = (jg.p) this.f5986b;
                pVar.f14512j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.H = true;
                pVar.invalidate();
                return;
            case 6:
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) this.f5986b;
                s7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s7Var.invalidate();
                return;
            case 7:
                ((org.telegram.ui.Components.u9) this.f5986b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 8:
                ai.u1 u1Var = ((u70) this.f5986b).e.d;
                int i11 = u1Var.C1;
                if (i11 != -1 && (view = u1Var.D1) != null) {
                    u1Var.k1(i11, view);
                    u1Var.invalidate();
                    return;
                }
                return;
            case 9:
                l91 l91Var = (l91) this.f5986b;
                View[] viewArr = l91Var.e;
                if (l91Var.f28288x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    l91Var.f28282c = abs;
                    b91 b91Var = l91Var.M;
                    if (b91Var != null) {
                        b91Var.e(abs, l91Var.d, l91Var.f28281b);
                    }
                }
                l91Var.w(false);
                return;
            case 10:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.f5986b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.J = floatValue;
                org.telegram.ui.Components.voip.r1 r1Var = s1Var.f31853i0;
                if (r1Var != null) {
                    ((ug1) r1Var).f42429b.f39835d0.d(floatValue, s1Var.P);
                }
                s1Var.invalidate();
                return;
            case 11:
                ((s4.u) this.f5986b).f46470x = valueAnimator.getAnimatedFraction();
                return;
            case 12:
                sg.p0 p0Var = (sg.p0) this.f5986b;
                p0Var.f46805s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.e();
                return;
            default:
                ((sg.n0) this.f5986b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
