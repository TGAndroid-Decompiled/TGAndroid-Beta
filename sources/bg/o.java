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
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.voip.c1;
import org.telegram.ui.Components.x71;
import org.telegram.ui.id1;
import th.f3;
import vh.w;
import zf.a1;
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
                x0Var.f11331s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                b1 b1Var = ((l60) this.f2772b).e.f26088k1;
                int i10 = b1Var.C1;
                if (i10 != -1 && (view = b1Var.D1) != null) {
                    b1Var.k1(i10, view);
                    b1Var.invalidate();
                    return;
                }
                return;
            case 8:
                x71 x71Var = (x71) this.f2772b;
                View[] viewArr = x71Var.e;
                if (x71Var.f32501y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    x71Var.f32494c = abs;
                    n71 n71Var = x71Var.M;
                    if (n71Var != null) {
                        n71Var.e(abs, x71Var.d, x71Var.f32493b);
                    }
                }
                x71Var.x(false);
                return;
            case 9:
                c1 c1Var = (c1) this.f2772b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.J = floatValue;
                org.telegram.ui.Components.voip.b1 b1Var2 = c1Var.f31414i0;
                if (b1Var2 != null) {
                    ((id1) b1Var2).f38008b.f43944d0.d(c1Var.P, floatValue);
                }
                c1Var.invalidate();
                return;
            case 10:
                ((s4.t) this.f2772b).f48020y = valueAnimator.getAnimatedFraction();
                return;
            case 11:
                f3 f3Var = (f3) this.f2772b;
                f3Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var.invalidate();
                return;
            case 12:
                uh.i iVar = (uh.i) this.f2772b;
                iVar.f50261c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.f50262f.invalidate();
                return;
            case 13:
                w wVar = (w) this.f2772b;
                wVar.f52095l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar.f52099p.invalidate();
                return;
            default:
                a1 a1Var = (a1) this.f2772b;
                a1Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1Var.invalidate();
                for (int i11 = 0; i11 < 2; i11++) {
                    a1Var.f55459c[i11].setTranslationX(i0.W1(a1Var.e, 0, -i0.L(62.0f)));
                    a1Var.f55459c[i11].setVisibility(0);
                    TextView textView = a1Var.f55459c[i11];
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
                    textView.setAlpha(i0.T1(f7, f10, a1Var.e));
                    a1Var.d[i11].setTranslationX(i0.W1(a1Var.e, 0, -i0.L(62.0f)));
                    a1Var.d[i11].setVisibility(0);
                    TextView textView2 = a1Var.d[i11];
                    if (i11 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    if (i11 == 1) {
                        f12 = 1.0f;
                    }
                    textView2.setAlpha(i0.T1(f11, f12, a1Var.e));
                }
                return;
        }
    }
}
