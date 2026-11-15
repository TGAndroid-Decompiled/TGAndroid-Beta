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
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.q8;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.bg0;
import org.telegram.ui.nz0;
import org.telegram.ui.pz0;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f5236a;
    public final boolean f5237b;
    public final Object f5238c;

    public u(int i7, Object obj, boolean z10) {
        this.f5236a = i7;
        this.f5238c = obj;
        this.f5237b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        nz0 nz0Var;
        er erVar;
        switch (this.f5236a) {
            case 0:
                b0 b0Var = (b0) this.f5238c;
                b0Var.f5031x = null;
                b0Var.f5018j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.k();
                b0Var.l();
                b0Var.f5022n.setCustomEmojiEnterProgress(Utilities.i(b0Var.f5018j, 1.0f, 0.0f));
                b0Var.f5011a.invalidate();
                b0Var.f5021m.invalidateOutline();
                if (b0Var.f5030w) {
                    b0Var.j(this.f5237b, b0Var.f5018j);
                    return;
                }
                return;
            case 1:
                d8 d8Var = (d8) this.f5238c;
                d8Var.getClass();
                d8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d8Var.invalidate();
                if (this.f5237b) {
                    d8Var.requestLayout();
                    return;
                }
                return;
            case 2:
                j5 j5Var = (j5) this.f5238c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j5Var.f14465e = floatValue2;
                if (!this.f5237b) {
                    j5Var.f14464c.setAlpha(1.0f - floatValue2);
                }
                j5Var.f14463b.invalidate();
                return;
            case 3:
                q1 q1Var = (q1) this.f5238c;
                q1Var.f31151sb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                if (this.f5237b && q1Var.getParent() != null) {
                    ((View) q1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                i9 i9Var = (i9) this.f5238c;
                i9Var.getClass();
                i9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t9 t9Var = i9Var.C;
                if (t9Var != null) {
                    t9Var.invalidate();
                }
                p9 p9Var = i9Var.W;
                if (p9Var != null && ((q1) p9Var).getCurrentMessagesGroup() == null && this.f5237b) {
                    ((q1) i9Var.W).setSelectedBackgroundProgress(1.0f - i9Var.U);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.i9 i9Var2 = (org.telegram.ui.Components.i9) this.f5238c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9Var2.setScaleX(floatValue3);
                i9Var2.setScaleY(floatValue3);
                if (!this.f5237b) {
                    i9Var2.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                q8 q8Var = (q8) this.f5238c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.n0(false, floatValue4);
                if (this.f5237b) {
                    j8 j8Var = q8Var.f38562a;
                    j8Var.f38245x = floatValue4;
                    j8Var.invalidate();
                    return;
                }
                return;
            case 7:
                r40 r40Var = (r40) this.f5238c;
                if (this.f5237b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (r40Var.getMeasuredHeight() / 2.0f);
                }
                r40Var.E0 = floatValue;
                r40Var.x();
                return;
            case 8:
                o90 o90Var = (o90) this.f5238c;
                o90Var.getClass();
                o90Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o90Var.invalidate();
                if (this.f5237b) {
                    o90Var.requestLayout();
                    return;
                }
                return;
            case 9:
                r2 r2Var = (r2) this.f5238c;
                TextView[] textViewArr = r2Var.h;
                r2Var.f40927s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.invalidate();
                if (this.f5237b) {
                    textViewArr[0].setAlpha(1.0f - r2Var.f40927s);
                    textViewArr[0].setScaleX(1.0f - r2Var.f40927s);
                    textViewArr[0].setScaleY(1.0f - r2Var.f40927s);
                    textViewArr[1].setAlpha(r2Var.f40927s);
                    textViewArr[1].setScaleX(r2Var.f40927s);
                    textViewArr[1].setScaleY(r2Var.f40927s);
                    return;
                }
                return;
            case 10:
                bg0 bg0Var = (bg0) this.f5238c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg0Var.E = floatValue5;
                bg0Var.H.setAlpha(floatValue5);
                bg0Var.K.setAlpha(bg0Var.E);
                if (!this.f5237b && (viewGroup = bg0Var.Z) != null) {
                    viewGroup.setAlpha(bg0Var.E);
                }
                bg0Var.F.invalidate();
                bg0Var.G.invalidate();
                return;
            case 11:
                pz0 pz0Var = (pz0) this.f5238c;
                pz0Var.f50403s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pz0Var.f50392b.invalidate();
                pz0Var.f50394c.invalidate();
                if (pz0Var.T) {
                    pz0Var.O.invalidate();
                }
                pz0Var.e();
                TextView textView = pz0Var.E;
                if (textView != null) {
                    textView.setAlpha(pz0Var.f50403s);
                }
                if (!pz0Var.T && (nz0Var = pz0Var.O) != null && nz0Var.getSeekBarWaveform() != null) {
                    tm0 seekBarWaveform = pz0Var.O.getSeekBarWaveform();
                    if (this.f5237b) {
                        erVar = er.f34420g;
                    } else {
                        erVar = er.f34421i;
                    }
                    seekBarWaveform.L = erVar.getInterpolation(Utilities.i(pz0Var.f50403s * 1.25f, 1.0f, 0.0f));
                    q1 q1Var2 = seekBarWaveform.f39733n;
                    if (q1Var2 != null) {
                        q1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                tg.f0 f0Var = (tg.f0) this.f5238c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0Var.f57262e = floatValue6;
                if (!this.f5237b) {
                    f0Var.f57261c.setAlpha(1.0f - floatValue6);
                }
                f0Var.f57260b.invalidate();
                return;
        }
    }
}
