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
import org.telegram.ui.Components.rn0;
import org.telegram.ui.f11;
import org.telegram.ui.h11;
import org.telegram.ui.ih0;
import th.l6;
import vh.z3;
public final class o0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10120a;
    public final boolean f10121b;
    public final Object f10122c;

    public o0(int i10, Object obj, boolean z10) {
        this.f10120a = i10;
        this.f10122c = obj;
        this.f10121b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        f11 f11Var;
        gr grVar;
        switch (this.f10120a) {
            case 0:
                p0 p0Var = (p0) this.f10122c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.e = floatValue2;
                if (!this.f10121b) {
                    p0Var.f10133c.setAlpha(1.0f - floatValue2);
                }
                p0Var.f10132b.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f10122c;
                q1Var.f22697qb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                if (this.f10121b && q1Var.getParent() != null) {
                    ((View) q1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 2:
                l9 l9Var = (l9) this.f10122c;
                l9Var.getClass();
                l9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9 v9Var = l9Var.C;
                if (v9Var != null) {
                    v9Var.invalidate();
                }
                r9 r9Var = l9Var.W;
                if (r9Var != null && ((org.telegram.ui.Cells.q1) r9Var).getCurrentMessagesGroup() == null && this.f10121b) {
                    ((org.telegram.ui.Cells.q1) l9Var.W).setSelectedBackgroundProgress(1.0f - l9Var.U);
                    return;
                }
                return;
            case 3:
                g9 g9Var = (g9) this.f10122c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g9Var.setScaleX(floatValue3);
                g9Var.setScaleY(floatValue3);
                if (!this.f10121b) {
                    g9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 4:
                o8 o8Var = (o8) this.f10122c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.n0(false, floatValue4);
                if (this.f10121b) {
                    h8 h8Var = o8Var.f29044a;
                    h8Var.f28709x = floatValue4;
                    h8Var.invalidate();
                    return;
                }
                return;
            case 5:
                e50 e50Var = (e50) this.f10122c;
                if (this.f10121b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (e50Var.getMeasuredHeight() / 2.0f);
                }
                e50Var.D0 = floatValue;
                e50Var.w();
                return;
            case 6:
                da0 da0Var = (da0) this.f10122c;
                da0Var.getClass();
                da0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                da0Var.invalidate();
                if (this.f10121b) {
                    da0Var.requestLayout();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.c2 c2Var = (org.telegram.ui.Components.voip.c2) this.f10122c;
                TextView[] textViewArr = c2Var.h;
                c2Var.f31428s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var.invalidate();
                if (this.f10121b) {
                    textViewArr[0].setAlpha(1.0f - c2Var.f31428s);
                    textViewArr[0].setScaleX(1.0f - c2Var.f31428s);
                    textViewArr[0].setScaleY(1.0f - c2Var.f31428s);
                    textViewArr[1].setAlpha(c2Var.f31428s);
                    textViewArr[1].setScaleX(c2Var.f31428s);
                    textViewArr[1].setScaleY(c2Var.f31428s);
                    return;
                }
                return;
            case 8:
                ih0 ih0Var = (ih0) this.f10122c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ih0Var.D = floatValue5;
                ih0Var.G.setAlpha(floatValue5);
                ih0Var.J.setAlpha(ih0Var.D);
                if (!this.f10121b && (viewGroup = ih0Var.Y) != null) {
                    viewGroup.setAlpha(ih0Var.D);
                }
                ih0Var.E.invalidate();
                ih0Var.F.invalidate();
                return;
            case 9:
                h11 h11Var = (h11) this.f10122c;
                h11Var.f37626s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h11Var.f37617b.invalidate();
                h11Var.f37619c.invalidate();
                if (h11Var.S) {
                    h11Var.N.invalidate();
                }
                h11Var.e();
                TextView textView = h11Var.D;
                if (textView != null) {
                    textView.setAlpha(h11Var.f37626s);
                }
                if (!h11Var.S && (f11Var = h11Var.N) != null && f11Var.getSeekBarWaveform() != null) {
                    rn0 seekBarWaveform = h11Var.N.getSeekBarWaveform();
                    if (this.f10121b) {
                        grVar = gr.f26524g;
                    } else {
                        grVar = gr.f26525i;
                    }
                    seekBarWaveform.L = grVar.getInterpolation(Utilities.i(h11Var.f37626s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.q1 q1Var2 = seekBarWaveform.f30037n;
                    if (q1Var2 != null) {
                        q1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                sg.b0 b0Var = (sg.b0) this.f10122c;
                b0Var.f48305x = null;
                b0Var.f48292j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.k();
                b0Var.l();
                b0Var.f48296n.setCustomEmojiEnterProgress(Utilities.i(b0Var.f48292j, 1.0f, 0.0f));
                b0Var.f48286a.invalidate();
                b0Var.f48295m.invalidateOutline();
                if (b0Var.f48304w) {
                    b0Var.j(this.f10121b, b0Var.f48292j);
                    return;
                }
                return;
            case 11:
                l6 l6Var = (l6) this.f10122c;
                l6Var.getClass();
                l6Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var.invalidate();
                if (this.f10121b) {
                    l6Var.requestLayout();
                    return;
                }
                return;
            default:
                z3 z3Var = (z3) this.f10122c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3Var.e = floatValue6;
                if (!this.f10121b) {
                    z3Var.f52265c.setAlpha(1.0f - floatValue6);
                }
                z3Var.f52264b.invalidate();
                return;
        }
    }
}
