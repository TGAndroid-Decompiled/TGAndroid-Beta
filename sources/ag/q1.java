package ag;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import jh.i4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.p71;
import org.telegram.ui.tg1;

public final class q1 implements ValueAnimator.AnimatorUpdateListener {

    public final int f623a;

    public final Object f624b;

    public q1(Object obj, int i10) {
        this.f623a = i10;
        this.f624b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.f623a) {
            case 0:
                s1 s1Var = (s1) this.f624b;
                s1Var.f646n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.e();
                break;
            case 1:
                ((n1) this.f624b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                ((f2.a0) this.f624b).f5623x = valueAnimator.getAnimatedFraction();
                break;
            case 3:
                i4 i4Var = (i4) this.f624b;
                i4Var.f13440e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var.invalidate();
                break;
            case 4:
                kh.r rVar = (kh.r) this.f624b;
                rVar.f15216c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.f15218f.invalidate();
                break;
            case 5:
                lh.d0 d0Var = (lh.d0) this.f624b;
                d0Var.f15844l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f15848p.invalidate();
                break;
            case 6:
                o7 o7Var = (o7) this.f624b;
                o7Var.f24814x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.invalidate();
                break;
            case 7:
                ((n9) this.f624b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 8:
                hh.f1 f1Var = ((o60) this.f624b).f31176e.d;
                int i10 = f1Var.A1;
                if (i10 != -1 && (view = f1Var.B1) != null) {
                    f1Var.i1(i10, view);
                    f1Var.invalidate();
                    break;
                }
                break;
            case 9:
                p71 p71Var = (p71) this.f624b;
                View[] viewArr = p71Var.f31545e;
                if (p71Var.f31551x) {
                    float fAbs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    p71Var.f31544c = fAbs;
                    e71 e71Var = p71Var.I;
                    if (e71Var != null) {
                        e71Var.e(fAbs, p71Var.d, p71Var.f31543b);
                    }
                }
                p71Var.w(false);
                break;
            case 10:
                org.telegram.ui.Components.voip.s1 s1Var2 = (org.telegram.ui.Components.voip.s1) this.f624b;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var2.F = fFloatValue;
                org.telegram.ui.Components.voip.r1 r1Var = s1Var2.f33854e0;
                if (r1Var != null) {
                    ((tg1) r1Var).f42940b.Z.d(fFloatValue, s1Var2.L);
                }
                s1Var2.invalidate();
                break;
            case 11:
                pf.x0 x0Var = (pf.x0) this.f624b;
                x0Var.f45965e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x0Var.invalidate();
                int i11 = 0;
                while (i11 < 2) {
                    x0Var.f45964c[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.f45965e));
                    x0Var.f45964c[i11].setVisibility(0);
                    float f10 = 0.0f;
                    x0Var.f45964c[i11].setAlpha(AndroidUtilities.lerp(i11 == 0 ? 1.0f : 0.0f, i11 == 1 ? 1.0f : 0.0f, x0Var.f45965e));
                    x0Var.d[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.f45965e));
                    x0Var.d[i11].setVisibility(0);
                    TextView textView = x0Var.d[i11];
                    float f11 = i11 == 0 ? 1.0f : 0.0f;
                    if (i11 == 1) {
                        f10 = 1.0f;
                    }
                    textView.setAlpha(AndroidUtilities.lerp(f11, f10, x0Var.f45965e));
                    i11++;
                }
                break;
            case 12:
                rf.k kVar = (rf.k) this.f624b;
                kVar.f46967f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.D = true;
                kVar.invalidate();
                break;
            default:
                rf.p pVar = (rf.p) this.f624b;
                pVar.f46967f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.D = true;
                pVar.invalidate();
                break;
        }
    }
}
