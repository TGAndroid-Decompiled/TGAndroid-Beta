package ch;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.d8;
import hi.j5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.q8;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.bg0;
import org.telegram.ui.nz0;
import org.telegram.ui.pz0;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f5233a;
    public final boolean f5234b;
    public final Object f5235c;

    public u(int i7, Object obj, boolean z10) {
        this.f5233a = i7;
        this.f5235c = obj;
        this.f5234b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        nz0 nz0Var;
        er erVar;
        switch (this.f5233a) {
            case 0:
                b0 b0Var = (b0) this.f5235c;
                b0Var.f5028x = null;
                b0Var.f5015j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.k();
                b0Var.l();
                b0Var.f5019n.setCustomEmojiEnterProgress(Utilities.i(b0Var.f5015j, 1.0f, 0.0f));
                b0Var.f5008a.invalidate();
                b0Var.f5018m.invalidateOutline();
                if (b0Var.f5027w) {
                    b0Var.j(this.f5234b, b0Var.f5015j);
                    return;
                }
                return;
            case 1:
                d8 d8Var = (d8) this.f5235c;
                d8Var.getClass();
                d8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d8Var.invalidate();
                if (this.f5234b) {
                    d8Var.requestLayout();
                    return;
                }
                return;
            case 2:
                j5 j5Var = (j5) this.f5235c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j5Var.f14465e = floatValue2;
                if (!this.f5234b) {
                    j5Var.f14464c.setAlpha(1.0f - floatValue2);
                }
                j5Var.f14463b.invalidate();
                return;
            case 3:
                q1 q1Var = (q1) this.f5235c;
                q1Var.f31151sb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                if (this.f5234b && q1Var.getParent() != null) {
                    ((View) q1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                i9 i9Var = (i9) this.f5235c;
                i9Var.getClass();
                i9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t9 t9Var = i9Var.C;
                if (t9Var != null) {
                    t9Var.invalidate();
                }
                p9 p9Var = i9Var.W;
                if (p9Var != null && ((q1) p9Var).getCurrentMessagesGroup() == null && this.f5234b) {
                    ((q1) i9Var.W).setSelectedBackgroundProgress(1.0f - i9Var.U);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.i9 i9Var2 = (org.telegram.ui.Components.i9) this.f5235c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9Var2.setScaleX(floatValue3);
                i9Var2.setScaleY(floatValue3);
                if (!this.f5234b) {
                    i9Var2.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                q8 q8Var = (q8) this.f5235c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.n0(false, floatValue4);
                if (this.f5234b) {
                    j8 j8Var = q8Var.f38562a;
                    j8Var.f38247x = floatValue4;
                    j8Var.invalidate();
                    return;
                }
                return;
            case 7:
                r40 r40Var = (r40) this.f5235c;
                if (this.f5234b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (r40Var.getMeasuredHeight() / 2.0f);
                }
                r40Var.E0 = floatValue;
                r40Var.x();
                return;
            case 8:
                n90 n90Var = (n90) this.f5235c;
                n90Var.getClass();
                n90Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n90Var.invalidate();
                if (this.f5234b) {
                    n90Var.requestLayout();
                    return;
                }
                return;
            case 9:
                r2 r2Var = (r2) this.f5235c;
                TextView[] textViewArr = r2Var.h;
                r2Var.f40924s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.invalidate();
                if (this.f5234b) {
                    textViewArr[0].setAlpha(1.0f - r2Var.f40924s);
                    textViewArr[0].setScaleX(1.0f - r2Var.f40924s);
                    textViewArr[0].setScaleY(1.0f - r2Var.f40924s);
                    textViewArr[1].setAlpha(r2Var.f40924s);
                    textViewArr[1].setScaleX(r2Var.f40924s);
                    textViewArr[1].setScaleY(r2Var.f40924s);
                    return;
                }
                return;
            case 10:
                bg0 bg0Var = (bg0) this.f5235c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg0Var.E = floatValue5;
                bg0Var.H.setAlpha(floatValue5);
                bg0Var.K.setAlpha(bg0Var.E);
                if (!this.f5234b && (viewGroup = bg0Var.Z) != null) {
                    viewGroup.setAlpha(bg0Var.E);
                }
                bg0Var.F.invalidate();
                bg0Var.G.invalidate();
                return;
            case 11:
                pz0 pz0Var = (pz0) this.f5235c;
                pz0Var.f50412s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pz0Var.f50401b.invalidate();
                pz0Var.f50403c.invalidate();
                if (pz0Var.T) {
                    pz0Var.O.invalidate();
                }
                pz0Var.e();
                TextView textView = pz0Var.E;
                if (textView != null) {
                    textView.setAlpha(pz0Var.f50412s);
                }
                if (!pz0Var.T && (nz0Var = pz0Var.O) != null && nz0Var.getSeekBarWaveform() != null) {
                    tm0 seekBarWaveform = pz0Var.O.getSeekBarWaveform();
                    if (this.f5234b) {
                        erVar = er.f34421g;
                    } else {
                        erVar = er.f34422i;
                    }
                    seekBarWaveform.L = erVar.getInterpolation(Utilities.i(pz0Var.f50412s * 1.25f, 1.0f, 0.0f));
                    q1 q1Var2 = seekBarWaveform.f39736n;
                    if (q1Var2 != null) {
                        q1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                tg.f0 f0Var = (tg.f0) this.f5235c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0Var.f57231e = floatValue6;
                if (!this.f5234b) {
                    f0Var.f57230c.setAlpha(1.0f - floatValue6);
                }
                f0Var.f57229b.invalidate();
                return;
        }
    }
}
