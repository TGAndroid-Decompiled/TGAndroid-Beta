package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.v81;
import org.telegram.ui.uh1;
public final class k6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1213a;
    public final Object f1214b;

    public k6(Object obj, int i10) {
        this.f1213a = i10;
        this.f1214b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        float f11;
        View view;
        switch (this.f1213a) {
            case 0:
                m6 m6Var = (m6) this.f1214b;
                m6Var.f1354e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.invalidate();
                return;
            case 1:
                bi.u uVar = (bi.u) this.f1214b;
                uVar.f3875c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.f3877f.invalidate();
                return;
            case 2:
                ci.d0 d0Var = (ci.d0) this.f1214b;
                d0Var.f4877l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f4881p.invalidate();
                return;
            case 3:
                gg.n1 n1Var = (gg.n1) this.f1214b;
                n1Var.f10725e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.invalidate();
                for (int i10 = 0; i10 < 2; i10++) {
                    n1Var.f10724c[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.f10725e));
                    n1Var.f10724c[i10].setVisibility(0);
                    TextView textView = n1Var.f10724c[i10];
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
                    textView.setAlpha(AndroidUtilities.lerp(f7, f10, n1Var.f10725e));
                    n1Var.d[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.f10725e));
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
                    textView2.setAlpha(AndroidUtilities.lerp(f11, f12, n1Var.f10725e));
                }
                return;
            case 4:
                ig.k kVar = (ig.k) this.f1214b;
                kVar.f12131j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.H = true;
                kVar.invalidate();
                return;
            case 5:
                ig.p pVar = (ig.p) this.f1214b;
                pVar.f12131j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.H = true;
                pVar.invalidate();
                return;
            case 6:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f1214b;
                t7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.invalidate();
                return;
            case 7:
                ((org.telegram.ui.Components.w9) this.f1214b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 8:
                w0 w0Var = ((o70) this.f1214b).f29273e.d;
                int i11 = w0Var.E1;
                if (i11 != -1 && (view = w0Var.F1) != null) {
                    w0Var.l1(i11, view);
                    w0Var.invalidate();
                    return;
                }
                return;
            case 9:
                g91 g91Var = (g91) this.f1214b;
                View[] viewArr = g91Var.f26733e;
                if (g91Var.f26739x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    g91Var.f26732c = abs;
                    v81 v81Var = g91Var.M;
                    if (v81Var != null) {
                        v81Var.e(abs, g91Var.d, g91Var.f26731b);
                    }
                }
                g91Var.x(false);
                return;
            case 10:
                org.telegram.ui.Components.voip.v1 v1Var = (org.telegram.ui.Components.voip.v1) this.f1214b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.J = floatValue;
                org.telegram.ui.Components.voip.u1 u1Var = v1Var.f32233i0;
                if (u1Var != null) {
                    ((uh1) u1Var).f41231b.f38613d0.d(floatValue, v1Var.P);
                }
                v1Var.invalidate();
                return;
            case 11:
                rg.q0 q0Var = (rg.q0) this.f1214b;
                q0Var.f46251n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var.e();
                return;
            case 12:
                ((rg.o0) this.f1214b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((s4.u) this.f1214b).f46665x = valueAnimator.getAnimatedFraction();
                return;
        }
    }
}
