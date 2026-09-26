package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.w81;
import org.telegram.ui.uh1;
public final class k6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1126a;
    public final Object f1127b;

    public k6(Object obj, int i10) {
        this.f1126a = i10;
        this.f1127b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        float f11;
        View view;
        switch (this.f1126a) {
            case 0:
                m6 m6Var = (m6) this.f1127b;
                m6Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.invalidate();
                return;
            case 1:
                bi.u uVar = (bi.u) this.f1127b;
                uVar.f3585c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.f3586f.invalidate();
                return;
            case 2:
                ci.d0 d0Var = (ci.d0) this.f1127b;
                d0Var.f4486l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f4490p.invalidate();
                return;
            case 3:
                gg.n1 n1Var = (gg.n1) this.f1127b;
                n1Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.invalidate();
                for (int i10 = 0; i10 < 2; i10++) {
                    n1Var.f9851c[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.e));
                    n1Var.f9851c[i10].setVisibility(0);
                    TextView textView = n1Var.f9851c[i10];
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
                    textView.setAlpha(AndroidUtilities.lerp(f7, f10, n1Var.e));
                    n1Var.d[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.e));
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
                    textView2.setAlpha(AndroidUtilities.lerp(f11, f12, n1Var.e));
                }
                return;
            case 4:
                ig.k kVar = (ig.k) this.f1127b;
                kVar.f11139j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.H = true;
                kVar.invalidate();
                return;
            case 5:
                ig.p pVar = (ig.p) this.f1127b;
                pVar.f11139j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.H = true;
                pVar.invalidate();
                return;
            case 6:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f1127b;
                t7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.invalidate();
                return;
            case 7:
                ((org.telegram.ui.Components.w9) this.f1127b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 8:
                w0 w0Var = ((l70) this.f1127b).e.d;
                int i11 = w0Var.E1;
                if (i11 != -1 && (view = w0Var.F1) != null) {
                    w0Var.i1(i11, view);
                    w0Var.invalidate();
                    return;
                }
                return;
            case 9:
                w81 w81Var = (w81) this.f1127b;
                View[] viewArr = w81Var.e;
                if (w81Var.f29940x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    w81Var.f29934c = abs;
                    l81 l81Var = w81Var.M;
                    if (l81Var != null) {
                        l81Var.e(abs, w81Var.d, w81Var.f29933b);
                    }
                }
                w81Var.w(false);
                return;
            case 10:
                org.telegram.ui.Components.voip.v1 v1Var = (org.telegram.ui.Components.voip.v1) this.f1127b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.J = floatValue;
                org.telegram.ui.Components.voip.u1 u1Var = v1Var.f29701i0;
                if (u1Var != null) {
                    ((uh1) u1Var).f38484b.f35576d0.d(floatValue, v1Var.P);
                }
                v1Var.invalidate();
                return;
            case 11:
                rg.p0 p0Var = (rg.p0) this.f1127b;
                p0Var.f42709n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.e();
                return;
            case 12:
                ((rg.n0) this.f1127b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((s4.u) this.f1127b).f43085x = valueAnimator.getAnimatedFraction();
                return;
        }
    }
}
