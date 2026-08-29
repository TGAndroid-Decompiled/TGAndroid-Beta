package cg;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import lh.i4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.z71;
import org.telegram.ui.wg1;
public final class c1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3079a;
    public final Object f3080b;

    public c1(Object obj, int i10) {
        this.f3079a = i10;
        this.f3080b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        float f9;
        float f10;
        float f11;
        switch (this.f3079a) {
            case 0:
                d1 d1Var = (d1) this.f3080b;
                d1Var.f3094n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.e();
                return;
            case 1:
                ((a1) this.f3080b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                ((f2.z) this.f3080b).f6522x = valueAnimator.getAnimatedFraction();
                return;
            case 3:
                i4 i4Var = (i4) this.f3080b;
                i4Var.f15718e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var.invalidate();
                return;
            case 4:
                mh.r rVar = (mh.r) this.f3080b;
                rVar.f17043c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.f17045f.invalidate();
                return;
            case 5:
                nh.d0 d0Var = (nh.d0) this.f3080b;
                d0Var.f17513l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f17517p.invalidate();
                return;
            case 6:
                p7 p7Var = (p7) this.f3080b;
                p7Var.f25006x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.invalidate();
                return;
            case 7:
                ((t9) this.f3080b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 8:
                jh.e1 e1Var = ((w60) this.f3080b).f34335e.d;
                int i10 = e1Var.A1;
                if (i10 != -1 && (view = e1Var.B1) != null) {
                    e1Var.i1(i10, view);
                    e1Var.invalidate();
                    return;
                }
                return;
            case 9:
                z71 z71Var = (z71) this.f3080b;
                View[] viewArr = z71Var.f35261e;
                if (z71Var.f35267x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    z71Var.f35260c = abs;
                    o71 o71Var = z71Var.I;
                    if (o71Var != null) {
                        o71Var.e(abs, z71Var.d, z71Var.f35259b);
                    }
                }
                z71Var.w(false);
                return;
            case 10:
                org.telegram.ui.Components.voip.t1 t1Var = (org.telegram.ui.Components.voip.t1) this.f3080b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.F = floatValue;
                org.telegram.ui.Components.voip.s1 s1Var = t1Var.f34004e0;
                if (s1Var != null) {
                    ((wg1) s1Var).f44308b.Z.d(floatValue, t1Var.L);
                }
                t1Var.invalidate();
                return;
            case 11:
                rf.y0 y0Var = (rf.y0) this.f3080b;
                y0Var.f47406e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y0Var.invalidate();
                for (int i11 = 0; i11 < 2; i11++) {
                    y0Var.f47405c[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), y0Var.f47406e));
                    y0Var.f47405c[i11].setVisibility(0);
                    TextView textView = y0Var.f47405c[i11];
                    float f12 = 0.0f;
                    if (i11 == 0) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    if (i11 == 1) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    textView.setAlpha(AndroidUtilities.lerp(f9, f10, y0Var.f47406e));
                    y0Var.d[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), y0Var.f47406e));
                    y0Var.d[i11].setVisibility(0);
                    TextView textView2 = y0Var.d[i11];
                    if (i11 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    if (i11 == 1) {
                        f12 = 1.0f;
                    }
                    textView2.setAlpha(AndroidUtilities.lerp(f11, f12, y0Var.f47406e));
                }
                return;
            case 12:
                tf.k kVar = (tf.k) this.f3080b;
                kVar.f48267f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.D = true;
                kVar.invalidate();
                return;
            default:
                tf.p pVar = (tf.p) this.f3080b;
                pVar.f48267f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.D = true;
                pVar.invalidate();
                return;
        }
    }
}
