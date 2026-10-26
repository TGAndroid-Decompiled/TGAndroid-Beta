package di;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.x70;
import org.telegram.ui.vg1;
public final class u4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9231a;
    public final Object f9232b;

    public u4(Object obj, int i10) {
        this.f9231a = i10;
        this.f9232b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        float f11;
        View view;
        switch (this.f9231a) {
            case 0:
                w4 w4Var = (w4) this.f9232b;
                w4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w4Var.invalidate();
                return;
            case 1:
                ei.r rVar = (ei.r) this.f9232b;
                rVar.f10003c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.f10004f.invalidate();
                return;
            case 2:
                fi.d0 d0Var = (fi.d0) this.f9232b;
                d0Var.f10710l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f10714p.invalidate();
                return;
            case 3:
                ig.m1 m1Var = (ig.m1) this.f9232b;
                m1Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var.invalidate();
                for (int i10 = 0; i10 < 2; i10++) {
                    m1Var.f14165c[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.e));
                    m1Var.f14165c[i10].setVisibility(0);
                    TextView textView = m1Var.f14165c[i10];
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
                kg.l lVar = (kg.l) this.f9232b;
                lVar.f16605j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar.H = true;
                lVar.invalidate();
                return;
            case 5:
                kg.q qVar = (kg.q) this.f9232b;
                qVar.f16605j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qVar.H = true;
                qVar.invalidate();
                return;
            case 6:
                org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) this.f9232b;
                w7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w7Var.invalidate();
                return;
            case 7:
                ((org.telegram.ui.Components.y9) this.f9232b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 8:
                bi.r1 r1Var = ((x70) this.f9232b).e.d;
                int i11 = r1Var.C1;
                if (i11 != -1 && (view = r1Var.D1) != null) {
                    r1Var.l1(i11, view);
                    r1Var.invalidate();
                    return;
                }
                return;
            case 9:
                u91 u91Var = (u91) this.f9232b;
                View[] viewArr = u91Var.e;
                if (u91Var.f33324x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    u91Var.f33318c = abs;
                    k91 k91Var = u91Var.M;
                    if (k91Var != null) {
                        k91Var.e(abs, u91Var.d, u91Var.f33317b);
                    }
                }
                u91Var.x(false);
                return;
            case 10:
                org.telegram.ui.Components.voip.v1 v1Var = (org.telegram.ui.Components.voip.v1) this.f9232b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.J = floatValue;
                org.telegram.ui.Components.voip.u1 u1Var = v1Var.f34162i0;
                if (u1Var != null) {
                    ((vg1) u1Var).f44808b.f42519d0.d(floatValue, v1Var.P);
                }
                v1Var.invalidate();
                return;
            case 11:
                ((s4.v) this.f9232b).f47848x = valueAnimator.getAnimatedFraction();
                return;
            case 12:
                tg.p0 p0Var = (tg.p0) this.f9232b;
                p0Var.f48984s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.e();
                return;
            default:
                ((tg.n0) this.f9232b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
