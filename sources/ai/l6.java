package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.o81;
import org.telegram.ui.Components.z81;
import org.telegram.ui.bi1;
public final class l6 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1181a;
    public final Object f1182b;

    public l6(Object obj, int i10) {
        this.f1181a = i10;
        this.f1182b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        float f11;
        View view;
        switch (this.f1181a) {
            case 0:
                n6 n6Var = (n6) this.f1182b;
                n6Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidate();
                return;
            case 1:
                bi.u uVar = (bi.u) this.f1182b;
                uVar.f3592c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.f3593f.invalidate();
                return;
            case 2:
                ci.d0 d0Var = (ci.d0) this.f1182b;
                d0Var.f4471l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f4475p.invalidate();
                return;
            case 3:
                gg.n1 n1Var = (gg.n1) this.f1182b;
                n1Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.invalidate();
                for (int i10 = 0; i10 < 2; i10++) {
                    n1Var.f9870c[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.e));
                    n1Var.f9870c[i10].setVisibility(0);
                    TextView textView = n1Var.f9870c[i10];
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
                ig.k kVar = (ig.k) this.f1182b;
                kVar.f11153j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.H = true;
                kVar.invalidate();
                return;
            case 5:
                ig.p pVar = (ig.p) this.f1182b;
                pVar.f11153j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.H = true;
                pVar.invalidate();
                return;
            case 6:
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) this.f1182b;
                u7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7Var.invalidate();
                return;
            case 7:
                ((org.telegram.ui.Components.v9) this.f1182b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 8:
                w0 w0Var = ((l70) this.f1182b).e.d;
                int i11 = w0Var.E1;
                if (i11 != -1 && (view = w0Var.F1) != null) {
                    w0Var.j1(i11, view);
                    w0Var.invalidate();
                    return;
                }
                return;
            case 9:
                z81 z81Var = (z81) this.f1182b;
                View[] viewArr = z81Var.e;
                if (z81Var.f30856x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    z81Var.f30850c = abs;
                    o81 o81Var = z81Var.M;
                    if (o81Var != null) {
                        o81Var.e(abs, z81Var.d, z81Var.f30849b);
                    }
                }
                z81Var.x(false);
                return;
            case 10:
                org.telegram.ui.Components.voip.u1 u1Var = (org.telegram.ui.Components.voip.u1) this.f1182b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.J = floatValue;
                org.telegram.ui.Components.voip.t1 t1Var = u1Var.f29655i0;
                if (t1Var != null) {
                    ((bi1) t1Var).f32489b.f37801d0.d(floatValue, u1Var.P);
                }
                u1Var.invalidate();
                return;
            case 11:
                rg.p0 p0Var = (rg.p0) this.f1182b;
                p0Var.f42744n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.e();
                return;
            case 12:
                ((rg.n0) this.f1182b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((s4.u) this.f1182b).f43120x = valueAnimator.getAnimatedFraction();
                return;
        }
    }
}
