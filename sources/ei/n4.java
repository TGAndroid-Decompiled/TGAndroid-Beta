package ei;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.s50;
import org.telegram.ui.ib1;
public final class n4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10665a;
    public final Object f10666b;

    public n4(Object obj, int i3) {
        this.f10665a = i3;
        this.f10666b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        float f12;
        View view;
        switch (this.f10665a) {
            case 0:
                p4 p4Var = (p4) this.f10666b;
                p4Var.f10761e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p4Var.invalidate();
                return;
            case 1:
                fi.m mVar = (fi.m) this.f10666b;
                mVar.f11618c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mVar.f11620f.invalidate();
                return;
            case 2:
                gi.d0 d0Var = (gi.d0) this.f10666b;
                d0Var.f12542l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.f12546p.invalidate();
                return;
            case 3:
                kg.h1 h1Var = (kg.h1) this.f10666b;
                h1Var.f17038e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1Var.invalidate();
                for (int i3 = 0; i3 < 2; i3++) {
                    h1Var.f17037c[i3].setTranslationX(org.telegram.messenger.g0.W1(h1Var.f17038e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    h1Var.f17037c[i3].setVisibility(0);
                    TextView textView = h1Var.f17037c[i3];
                    float f13 = 0.0f;
                    if (i3 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    if (i3 == 1) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    textView.setAlpha(org.telegram.messenger.g0.T1(f10, f11, h1Var.f17038e));
                    h1Var.d[i3].setTranslationX(org.telegram.messenger.g0.W1(h1Var.f17038e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    h1Var.d[i3].setVisibility(0);
                    TextView textView2 = h1Var.d[i3];
                    if (i3 == 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    if (i3 == 1) {
                        f13 = 1.0f;
                    }
                    textView2.setAlpha(org.telegram.messenger.g0.T1(f12, f13, h1Var.f17038e));
                }
                return;
            case 4:
                mg.k kVar = (mg.k) this.f10666b;
                kVar.f19350k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.I = true;
                kVar.invalidate();
                return;
            case 5:
                mg.p pVar = (mg.p) this.f10666b;
                pVar.f19350k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.I = true;
                pVar.invalidate();
                return;
            case 6:
                MediaController mediaController = (MediaController) this.f10666b;
                mediaController.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.n0();
                return;
            case 7:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.f10666b;
                n7Var.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7Var.invalidate();
                return;
            case 8:
                ((org.telegram.ui.Components.k9) this.f10666b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 9:
                ci.j1 j1Var = ((s50) this.f10666b).f37912e.f38994l1;
                int i10 = j1Var.D1;
                if (i10 != -1 && (view = j1Var.E1) != null) {
                    j1Var.k1(i10, view);
                    j1Var.invalidate();
                    return;
                }
                return;
            case 10:
                n61 n61Var = (n61) this.f10666b;
                View[] viewArr = n61Var.f36386e;
                if (n61Var.f36393y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    n61Var.f36385c = abs;
                    d61 d61Var = n61Var.N;
                    if (d61Var != null) {
                        d61Var.e(abs, n61Var.d, n61Var.f36384b);
                    }
                }
                n61Var.v(false);
                return;
            case 11:
                org.telegram.ui.Components.voip.c1 c1Var = (org.telegram.ui.Components.voip.c1) this.f10666b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.K = floatValue;
                org.telegram.ui.Components.voip.b1 b1Var = c1Var.f39264j0;
                if (b1Var != null) {
                    ((ib1) b1Var).f46232b.f52616e0.d(c1Var.Q, floatValue);
                }
                c1Var.invalidate();
                return;
            case 12:
                ((u4.u) this.f10666b).f55665y = valueAnimator.getAnimatedFraction();
                return;
            case 13:
                vg.o0 o0Var = (vg.o0) this.f10666b;
                o0Var.f56766s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.e();
                return;
            default:
                ((vg.m0) this.f10666b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
