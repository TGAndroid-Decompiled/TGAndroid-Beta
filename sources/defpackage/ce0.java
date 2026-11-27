package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;
public final class ce0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public ce0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        float f;
        float f2;
        float f3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((mb0) obj).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 1:
                gr0 gr0Var = (gr0) obj;
                gr0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gr0Var.f.invalidate();
                return;
            case 2:
                zu1 zu1Var = (zu1) obj;
                zu1Var.Ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1Var.m1.invalidate();
                return;
            case 3:
                jl2 jl2Var = (jl2) obj;
                jl2Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jl2Var.p.invalidate();
                return;
            case 4:
                uj3 uj3Var = (uj3) obj;
                uj3Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = uj3Var.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 5:
                tp3 tp3Var = (tp3) obj;
                tp3Var.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tp3Var.I = true;
                tp3Var.invalidate();
                return;
            case 6:
                gw9 gw9Var = ((kt5) obj).e.n1;
                int i = gw9Var.D1;
                if (i != -1 && (view = gw9Var.E1) != null) {
                    gw9Var.m1(i, view);
                    gw9Var.invalidate();
                    return;
                }
                return;
            case 7:
                ((hu5) obj).y = valueAnimator.getAnimatedFraction();
                return;
            case 8:
                MediaController mediaController = (MediaController) obj;
                mediaController.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.p0();
                return;
            case 9:
                xc7 xc7Var = (xc7) obj;
                xc7Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xc7Var.invalidate();
                for (int i2 = 0; i2 < 2; i2++) {
                    xc7Var.c[i2].setTranslationX(hl.U1(xc7Var.e, 0, -hl.L(62.0f)));
                    xc7Var.c[i2].setVisibility(0);
                    TextView textView = xc7Var.c[i2];
                    float f4 = 0.0f;
                    if (i2 == 0) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    if (i2 == 1) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    textView.setAlpha(hl.R1(f, f2, xc7Var.e));
                    xc7Var.d[i2].setTranslationX(hl.U1(xc7Var.e, 0, -hl.L(62.0f)));
                    xc7Var.d[i2].setVisibility(0);
                    TextView textView2 = xc7Var.d[i2];
                    if (i2 == 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    if (i2 == 1) {
                        f4 = 1.0f;
                    }
                    textView2.setAlpha(hl.R1(f3, f4, xc7Var.e));
                }
                return;
            case 10:
                ok8 ok8Var = (ok8) obj;
                ok8Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ok8Var.e();
                return;
            case 11:
                ((lk8) obj).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                h3a h3aVar = (h3a) obj;
                h3aVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3aVar.invalidate();
                return;
            case 13:
                jja jjaVar = (jja) obj;
                jjaVar.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jjaVar.invalidate();
                return;
            case 14:
                fqa fqaVar = (fqa) obj;
                fqaVar.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fqaVar.I = true;
                fqaVar.invalidate();
                return;
            case 15:
                ((pqb) obj).z0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                vic vicVar = (vic) obj;
                View[] viewArr = vicVar.e;
                if (vicVar.y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    vicVar.c = abs;
                    lic licVar = vicVar.N;
                    if (licVar != null) {
                        licVar.f(abs, vicVar.d, vicVar.b);
                    }
                }
                vicVar.y(false);
                return;
            default:
                ujc ujcVar = (ujc) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ujcVar.K = floatValue;
                tjc tjcVar = ujcVar.j0;
                if (tjcVar != null) {
                    ((wjc) tjcVar).b.e0.d(ujcVar.Q, floatValue);
                }
                ujcVar.invalidate();
                return;
        }
    }
}
