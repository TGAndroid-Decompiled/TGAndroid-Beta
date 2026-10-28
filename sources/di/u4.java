package di;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Components.y70;
import org.telegram.ui.xg1;
public final class u4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9230a;
    public final Object f9231b;

    public u4(Object obj, int i10) {
        this.f9230a = i10;
        this.f9231b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        float f11;
        View view;
        switch (this.f9230a) {
            case 0:
                w4 w4Var = (w4) this.f9231b;
                w4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w4Var.invalidate();
                return;
            case 1:
                ei.r rVar = (ei.r) this.f9231b;
                rVar.f10002c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.f10003f.invalidate();
                return;
            case 2:
                fi.d0 d0Var = (fi.d0) this.f9231b;
                d0Var.f10709l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f10713p.invalidate();
                return;
            case 3:
                ig.m1 m1Var = (ig.m1) this.f9231b;
                m1Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var.invalidate();
                for (int i10 = 0; i10 < 2; i10++) {
                    m1Var.f14164c[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.e));
                    m1Var.f14164c[i10].setVisibility(0);
                    TextView textView = m1Var.f14164c[i10];
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
                kg.l lVar = (kg.l) this.f9231b;
                lVar.f16604j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar.H = true;
                lVar.invalidate();
                return;
            case 5:
                kg.q qVar = (kg.q) this.f9231b;
                qVar.f16604j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qVar.H = true;
                qVar.invalidate();
                return;
            case 6:
                org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) this.f9231b;
                w7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w7Var.invalidate();
                return;
            case 7:
                ((org.telegram.ui.Components.y9) this.f9231b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 8:
                bi.r1 r1Var = ((y70) this.f9231b).e.d;
                int i11 = r1Var.C1;
                if (i11 != -1 && (view = r1Var.D1) != null) {
                    r1Var.l1(i11, view);
                    r1Var.invalidate();
                    return;
                }
                return;
            case 9:
                v91 v91Var = (v91) this.f9231b;
                View[] viewArr = v91Var.e;
                if (v91Var.f33639x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    v91Var.f33633c = abs;
                    l91 l91Var = v91Var.M;
                    if (l91Var != null) {
                        l91Var.e(abs, v91Var.d, v91Var.f33632b);
                    }
                }
                v91Var.x(false);
                return;
            case 10:
                org.telegram.ui.Components.voip.v1 v1Var = (org.telegram.ui.Components.voip.v1) this.f9231b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.J = floatValue;
                org.telegram.ui.Components.voip.u1 u1Var = v1Var.f34267i0;
                if (u1Var != null) {
                    ((xg1) u1Var).f45683b.f43009d0.d(floatValue, v1Var.P);
                }
                v1Var.invalidate();
                return;
            case 11:
                ((s4.v) this.f9231b).f47883x = valueAnimator.getAnimatedFraction();
                return;
            case 12:
                tg.p0 p0Var = (tg.p0) this.f9231b;
                p0Var.f49019s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.e();
                return;
            default:
                ((tg.n0) this.f9231b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
