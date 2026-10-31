package bg;

import ag.b1;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import kg.v0;
import kg.x0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.i0;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.voip.a1;
import org.telegram.ui.Components.w71;
import org.telegram.ui.kd1;
import th.f3;
import vh.w;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f2771a;
    public final Object f2772b;

    public o(Object obj, int i10) {
        this.f2771a = i10;
        this.f2772b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        float f7;
        float f10;
        float f11;
        switch (this.f2771a) {
            case 0:
                p pVar = (p) this.f2772b;
                pVar.f2726j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.H = true;
                pVar.invalidate();
                return;
            case 1:
                u uVar = (u) this.f2772b;
                uVar.f2726j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.H = true;
                uVar.invalidate();
                return;
            case 2:
                x0 x0Var = (x0) this.f2772b;
                x0Var.f11330s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x0Var.e();
                return;
            case 3:
                ((v0) this.f2772b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                MediaController mediaController = (MediaController) this.f2772b;
                mediaController.O1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.n0();
                return;
            case 5:
                s7 s7Var = (s7) this.f2772b;
                s7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s7Var.invalidate();
                return;
            case 6:
                ((g9) this.f2772b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                b1 b1Var = ((l60) this.f2772b).e.f25719k1;
                int i10 = b1Var.C1;
                if (i10 != -1 && (view = b1Var.D1) != null) {
                    b1Var.k1(i10, view);
                    b1Var.invalidate();
                    return;
                }
                return;
            case 8:
                w71 w71Var = (w71) this.f2772b;
                View[] viewArr = w71Var.e;
                if (w71Var.f32098y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    w71Var.f32091c = abs;
                    m71 m71Var = w71Var.M;
                    if (m71Var != null) {
                        m71Var.e(abs, w71Var.d, w71Var.f32090b);
                    }
                }
                w71Var.x(false);
                return;
            case 9:
                org.telegram.ui.Components.voip.b1 b1Var2 = (org.telegram.ui.Components.voip.b1) this.f2772b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var2.J = floatValue;
                a1 a1Var = b1Var2.f31334i0;
                if (a1Var != null) {
                    ((kd1) a1Var).f38780b.f36205d0.d(b1Var2.P, floatValue);
                }
                b1Var2.invalidate();
                return;
            case 10:
                ((s4.t) this.f2772b).f48009y = valueAnimator.getAnimatedFraction();
                return;
            case 11:
                f3 f3Var = (f3) this.f2772b;
                f3Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var.invalidate();
                return;
            case 12:
                uh.i iVar = (uh.i) this.f2772b;
                iVar.f50247c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.f50248f.invalidate();
                return;
            case 13:
                w wVar = (w) this.f2772b;
                wVar.f52079l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar.f52083p.invalidate();
                return;
            default:
                zf.a1 a1Var2 = (zf.a1) this.f2772b;
                a1Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1Var2.invalidate();
                for (int i11 = 0; i11 < 2; i11++) {
                    a1Var2.f55441c[i11].setTranslationX(i0.W1(a1Var2.e, 0, -i0.L(62.0f)));
                    a1Var2.f55441c[i11].setVisibility(0);
                    TextView textView = a1Var2.f55441c[i11];
                    float f12 = 0.0f;
                    if (i11 == 0) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    if (i11 == 1) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    textView.setAlpha(i0.T1(f7, f10, a1Var2.e));
                    a1Var2.d[i11].setTranslationX(i0.W1(a1Var2.e, 0, -i0.L(62.0f)));
                    a1Var2.d[i11].setVisibility(0);
                    TextView textView2 = a1Var2.d[i11];
                    if (i11 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    if (i11 == 1) {
                        f12 = 1.0f;
                    }
                    textView2.setAlpha(i0.T1(f11, f12, a1Var2.e));
                }
                return;
        }
    }
}
