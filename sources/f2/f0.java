package f2;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import ih.m4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.o9;
import org.telegram.ui.ug1;
public final class f0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5352a;
    public final Object f5353b;

    public f0(Object obj, int i9) {
        this.f5352a = i9;
        this.f5353b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        float f12;
        View view;
        switch (this.f5352a) {
            case 0:
                ((b0) this.f5353b).f5330x = valueAnimator.getAnimatedFraction();
                return;
            case 1:
                m4 m4Var = (m4) this.f5353b;
                m4Var.f11759e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m4Var.invalidate();
                return;
            case 2:
                jh.q qVar = (jh.q) this.f5353b;
                qVar.f14365c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qVar.f14367f.invalidate();
                return;
            case 3:
                kh.e0 e0Var = (kh.e0) this.f5353b;
                e0Var.f15138l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f15142p.invalidate();
                return;
            case 4:
                of.i1 i1Var = (of.i1) this.f5353b;
                i1Var.f19369e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i1Var.invalidate();
                for (int i9 = 0; i9 < 2; i9++) {
                    i1Var.f19368c[i9].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), i1Var.f19369e));
                    i1Var.f19368c[i9].setVisibility(0);
                    TextView textView = i1Var.f19368c[i9];
                    float f13 = 0.0f;
                    if (i9 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    if (i9 == 1) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    textView.setAlpha(AndroidUtilities.lerp(f10, f11, i1Var.f19369e));
                    i1Var.d[i9].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), i1Var.f19369e));
                    i1Var.d[i9].setVisibility(0);
                    TextView textView2 = i1Var.d[i9];
                    if (i9 == 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    if (i9 == 1) {
                        f13 = 1.0f;
                    }
                    textView2.setAlpha(AndroidUtilities.lerp(f12, f13, i1Var.f19369e));
                }
                return;
            case 5:
                r7 r7Var = (r7) this.f5353b;
                r7Var.f25122x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var.invalidate();
                return;
            case 6:
                ((o9) this.f5353b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                gh.f1 f1Var = ((j60) this.f5353b).f29655e.d;
                int i10 = f1Var.A1;
                if (i10 != -1 && (view = f1Var.B1) != null) {
                    f1Var.i1(i10, view);
                    f1Var.invalidate();
                    return;
                }
                return;
            case 8:
                n71 n71Var = (n71) this.f5353b;
                View[] viewArr = n71Var.f31035e;
                if (n71Var.f31041x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    n71Var.f31034c = abs;
                    c71 c71Var = n71Var.I;
                    if (c71Var != null) {
                        c71Var.e(abs, n71Var.d, n71Var.f31033b);
                    }
                }
                n71Var.w(false);
                return;
            case 9:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.f5353b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.F = floatValue;
                org.telegram.ui.Components.voip.r1 r1Var = s1Var.f33804e0;
                if (r1Var != null) {
                    ((ug1) r1Var).f43258b.Z.d(floatValue, s1Var.L);
                }
                s1Var.invalidate();
                return;
            case 10:
                qf.k kVar = (qf.k) this.f5353b;
                kVar.f46208f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.D = true;
                kVar.invalidate();
                return;
            case 11:
                qf.p pVar = (qf.p) this.f5353b;
                pVar.f46208f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.D = true;
                pVar.invalidate();
                return;
            case 12:
                zf.p0 p0Var = (zf.p0) this.f5353b;
                p0Var.f50650n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.e();
                return;
            default:
                ((zf.n0) this.f5353b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
