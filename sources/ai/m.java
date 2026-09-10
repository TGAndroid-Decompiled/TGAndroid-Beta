package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import bi.i0;
import bi.y1;
import fg.o1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.voip.s1;
import org.telegram.ui.Components.voip.t1;
import org.telegram.ui.Components.w9;
import org.telegram.ui.hi1;
import qg.p0;
import qg.s0;
import zh.g3;
public final class m implements ValueAnimator.AnimatorUpdateListener {
    public final int f459a;
    public final Object f460b;

    public m(Object obj, int i10) {
        this.f459a = i10;
        this.f460b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        float f11;
        View view;
        switch (this.f459a) {
            case 0:
                a0 a0Var = (a0) this.f460b;
                a0Var.f413c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.f414f.invalidate();
                return;
            case 1:
                i0 i0Var = (i0) this.f460b;
                i0Var.f2833l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i0Var.f2837p.invalidate();
                return;
            case 2:
                o1 o1Var = (o1) this.f460b;
                o1Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.invalidate();
                for (int i10 = 0; i10 < 2; i10++) {
                    o1Var.f8160c[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), o1Var.e));
                    o1Var.f8160c[i10].setVisibility(0);
                    TextView textView = o1Var.f8160c[i10];
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
                    textView.setAlpha(AndroidUtilities.lerp(f7, f10, o1Var.e));
                    o1Var.d[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), o1Var.e));
                    o1Var.d[i10].setVisibility(0);
                    TextView textView2 = o1Var.d[i10];
                    if (i10 == 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    if (i10 == 1) {
                        f12 = 1.0f;
                    }
                    textView2.setAlpha(AndroidUtilities.lerp(f11, f12, o1Var.e));
                }
                return;
            case 3:
                hg.k kVar = (hg.k) this.f460b;
                kVar.f9369j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.H = true;
                kVar.invalidate();
                return;
            case 4:
                hg.p pVar = (hg.p) this.f460b;
                pVar.f9369j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.H = true;
                pVar.invalidate();
                return;
            case 5:
                u7 u7Var = (u7) this.f460b;
                u7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7Var.invalidate();
                return;
            case 6:
                ((w9) this.f460b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                y1 y1Var = ((j70) this.f460b).e.d;
                int i11 = y1Var.E1;
                if (i11 != -1 && (view = y1Var.F1) != null) {
                    y1Var.h1(i11, view);
                    y1Var.invalidate();
                    return;
                }
                return;
            case 8:
                v81 v81Var = (v81) this.f460b;
                View[] viewArr = v81Var.e;
                if (v81Var.f27893x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    v81Var.f27887c = abs;
                    l81 l81Var = v81Var.M;
                    if (l81Var != null) {
                        l81Var.e(abs, v81Var.d, v81Var.f27886b);
                    }
                }
                v81Var.w(false);
                return;
            case 9:
                t1 t1Var = (t1) this.f460b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.J = floatValue;
                s1 s1Var = t1Var.f28459i0;
                if (s1Var != null) {
                    ((hi1) s1Var).f33401b.f39365d0.d(floatValue, t1Var.P);
                }
                t1Var.invalidate();
                return;
            case 10:
                s0 s0Var = (s0) this.f460b;
                s0Var.f40903n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s0Var.e();
                return;
            case 11:
                ((p0) this.f460b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 12:
                ((s4.u) this.f460b).f41735x = valueAnimator.getAnimatedFraction();
                return;
            default:
                g3 g3Var = (g3) this.f460b;
                g3Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g3Var.invalidate();
                return;
        }
    }
}
