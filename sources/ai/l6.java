package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.p91;
import org.telegram.ui.ci1;
public final class l6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1332a;
    public final Object f1333b;

    public l6(Object obj, int i10) {
        this.f1332a = i10;
        this.f1333b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        float f11;
        View view;
        switch (this.f1332a) {
            case 0:
                n6 n6Var = (n6) this.f1333b;
                n6Var.f1469e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidate();
                return;
            case 1:
                bi.u uVar = (bi.u) this.f1333b;
                uVar.f3925c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.f3927f.invalidate();
                return;
            case 2:
                ci.d0 d0Var = (ci.d0) this.f1333b;
                d0Var.f4887l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f4891p.invalidate();
                return;
            case 3:
                gg.m1 m1Var = (gg.m1) this.f1333b;
                m1Var.f10730e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var.invalidate();
                for (int i10 = 0; i10 < 2; i10++) {
                    m1Var.f10729c[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.f10730e));
                    m1Var.f10729c[i10].setVisibility(0);
                    TextView textView = m1Var.f10729c[i10];
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
                    textView.setAlpha(AndroidUtilities.lerp(f7, f10, m1Var.f10730e));
                    m1Var.d[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.f10730e));
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
                    textView2.setAlpha(AndroidUtilities.lerp(f11, f12, m1Var.f10730e));
                }
                return;
            case 4:
                ig.k kVar = (ig.k) this.f1333b;
                kVar.f12178j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.H = true;
                kVar.invalidate();
                return;
            case 5:
                ig.p pVar = (ig.p) this.f1333b;
                pVar.f12178j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.H = true;
                pVar.invalidate();
                return;
            case 6:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f1333b;
                t7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.invalidate();
                return;
            case 7:
                ((org.telegram.ui.Components.y9) this.f1333b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 8:
                w0 w0Var = ((c80) this.f1333b).f25261e.d;
                int i11 = w0Var.C1;
                if (i11 != -1 && (view = w0Var.D1) != null) {
                    w0Var.i1(i11, view);
                    w0Var.invalidate();
                    return;
                }
                return;
            case 9:
                p91 p91Var = (p91) this.f1333b;
                View[] viewArr = p91Var.f29798e;
                if (p91Var.f29804x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    p91Var.f29797c = abs;
                    e91 e91Var = p91Var.M;
                    if (e91Var != null) {
                        e91Var.e(abs, p91Var.d, p91Var.f29796b);
                    }
                }
                p91Var.w(false);
                return;
            case 10:
                org.telegram.ui.Components.voip.v1 v1Var = (org.telegram.ui.Components.voip.v1) this.f1333b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.J = floatValue;
                org.telegram.ui.Components.voip.u1 u1Var = v1Var.f32426i0;
                if (u1Var != null) {
                    ((ci1) u1Var).f36754b.f42620d0.d(floatValue, v1Var.P);
                }
                v1Var.invalidate();
                return;
            case 11:
                rg.p0 p0Var = (rg.p0) this.f1333b;
                p0Var.f47508n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.e();
                return;
            case 12:
                ((rg.n0) this.f1333b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((s4.u) this.f1333b).f47918x = valueAnimator.getAnimatedFraction();
                return;
        }
    }
}
