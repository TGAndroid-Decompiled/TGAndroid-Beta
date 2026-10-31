package jg;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.o8;
import org.telegram.ui.Components.qn0;
import org.telegram.ui.g11;
import org.telegram.ui.i11;
import org.telegram.ui.kh0;
import th.l6;
import vh.z3;
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10119a;
    public final boolean f10120b;
    public final Object f10121c;

    public o0(int i10, Object obj, boolean z10) {
        this.f10119a = i10;
        this.f10121c = obj;
        this.f10120b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        g11 g11Var;
        gr grVar;
        switch (this.f10119a) {
            case 0:
                p0 p0Var = (p0) this.f10121c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.e = floatValue2;
                if (!this.f10120b) {
                    p0Var.f10132c.setAlpha(1.0f - floatValue2);
                }
                p0Var.f10131b.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f10121c;
                q1Var.f22696qb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                if (this.f10120b && q1Var.getParent() != null) {
                    ((View) q1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 2:
                l9 l9Var = (l9) this.f10121c;
                l9Var.getClass();
                l9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9 v9Var = l9Var.C;
                if (v9Var != null) {
                    v9Var.invalidate();
                }
                r9 r9Var = l9Var.W;
                if (r9Var != null && ((org.telegram.ui.Cells.q1) r9Var).getCurrentMessagesGroup() == null && this.f10120b) {
                    ((org.telegram.ui.Cells.q1) l9Var.W).setSelectedBackgroundProgress(1.0f - l9Var.U);
                    return;
                }
                return;
            case 3:
                g9 g9Var = (g9) this.f10121c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g9Var.setScaleX(floatValue3);
                g9Var.setScaleY(floatValue3);
                if (!this.f10120b) {
                    g9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 4:
                o8 o8Var = (o8) this.f10121c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.m0(false, floatValue4);
                if (this.f10120b) {
                    h8 h8Var = o8Var.f28987a;
                    h8Var.f28712x = floatValue4;
                    h8Var.invalidate();
                    return;
                }
                return;
            case 5:
                e50 e50Var = (e50) this.f10121c;
                if (this.f10120b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (e50Var.getMeasuredHeight() / 2.0f);
                }
                e50Var.D0 = floatValue;
                e50Var.w();
                return;
            case 6:
                da0 da0Var = (da0) this.f10121c;
                da0Var.getClass();
                da0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                da0Var.invalidate();
                if (this.f10120b) {
                    da0Var.requestLayout();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.b2 b2Var = (org.telegram.ui.Components.voip.b2) this.f10121c;
                TextView[] textViewArr = b2Var.h;
                b2Var.f31348s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2Var.invalidate();
                if (this.f10120b) {
                    textViewArr[0].setAlpha(1.0f - b2Var.f31348s);
                    textViewArr[0].setScaleX(1.0f - b2Var.f31348s);
                    textViewArr[0].setScaleY(1.0f - b2Var.f31348s);
                    textViewArr[1].setAlpha(b2Var.f31348s);
                    textViewArr[1].setScaleX(b2Var.f31348s);
                    textViewArr[1].setScaleY(b2Var.f31348s);
                    return;
                }
                return;
            case 8:
                kh0 kh0Var = (kh0) this.f10121c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kh0Var.D = floatValue5;
                kh0Var.G.setAlpha(floatValue5);
                kh0Var.J.setAlpha(kh0Var.D);
                if (!this.f10120b && (viewGroup = kh0Var.Y) != null) {
                    viewGroup.setAlpha(kh0Var.D);
                }
                kh0Var.E.invalidate();
                kh0Var.F.invalidate();
                return;
            case 9:
                i11 i11Var = (i11) this.f10121c;
                i11Var.f38093s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i11Var.f38084b.invalidate();
                i11Var.f38086c.invalidate();
                if (i11Var.S) {
                    i11Var.N.invalidate();
                }
                i11Var.e();
                TextView textView = i11Var.D;
                if (textView != null) {
                    textView.setAlpha(i11Var.f38093s);
                }
                if (!i11Var.S && (g11Var = i11Var.N) != null && g11Var.getSeekBarWaveform() != null) {
                    qn0 seekBarWaveform = i11Var.N.getSeekBarWaveform();
                    if (this.f10120b) {
                        grVar = gr.f26496g;
                    } else {
                        grVar = gr.f26497i;
                    }
                    seekBarWaveform.L = grVar.getInterpolation(Utilities.i(i11Var.f38093s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.q1 q1Var2 = seekBarWaveform.f29698n;
                    if (q1Var2 != null) {
                        q1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                sg.b0 b0Var = (sg.b0) this.f10121c;
                b0Var.f48294x = null;
                b0Var.f48281j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.k();
                b0Var.l();
                b0Var.f48285n.setCustomEmojiEnterProgress(Utilities.i(b0Var.f48281j, 1.0f, 0.0f));
                b0Var.f48275a.invalidate();
                b0Var.f48284m.invalidateOutline();
                if (b0Var.f48293w) {
                    b0Var.j(this.f10120b, b0Var.f48281j);
                    return;
                }
                return;
            case 11:
                l6 l6Var = (l6) this.f10121c;
                l6Var.getClass();
                l6Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var.invalidate();
                if (this.f10120b) {
                    l6Var.requestLayout();
                    return;
                }
                return;
            default:
                z3 z3Var = (z3) this.f10121c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var.e = floatValue6;
                if (!this.f10120b) {
                    z3Var.f52247c.setAlpha(1.0f - floatValue6);
                }
                z3Var.f52246b.invalidate();
                return;
        }
    }
}
