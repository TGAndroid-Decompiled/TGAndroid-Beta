package ch;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.a8;
import hi.i5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.z40;
import org.telegram.ui.eg0;
import org.telegram.ui.rz0;
import org.telegram.ui.tz0;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f5524a;
    public final boolean f5525b;
    public final Object f5526c;

    public v(int i7, Object obj, boolean z10) {
        this.f5524a = i7;
        this.f5526c = obj;
        this.f5525b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        rz0 rz0Var;
        lr lrVar;
        switch (this.f5524a) {
            case 0:
                b0 b0Var = (b0) this.f5526c;
                b0Var.f5317x = null;
                b0Var.f5304j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.k();
                b0Var.l();
                b0Var.f5308n.setCustomEmojiEnterProgress(Utilities.i(b0Var.f5304j, 1.0f, 0.0f));
                b0Var.f5297a.invalidate();
                b0Var.f5307m.invalidateOutline();
                if (b0Var.f5316w) {
                    b0Var.j(this.f5525b, b0Var.f5304j);
                    return;
                }
                return;
            case 1:
                a8 a8Var = (a8) this.f5526c;
                a8Var.getClass();
                a8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.invalidate();
                if (this.f5525b) {
                    a8Var.requestLayout();
                    return;
                }
                return;
            case 2:
                i5 i5Var = (i5) this.f5526c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i5Var.f14766e = floatValue2;
                if (!this.f5525b) {
                    i5Var.f14765c.setAlpha(1.0f - floatValue2);
                }
                i5Var.f14764b.invalidate();
                return;
            case 3:
                q1 q1Var = (q1) this.f5526c;
                q1Var.f31523sb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                if (this.f5525b && q1Var.getParent() != null) {
                    ((View) q1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                j9 j9Var = (j9) this.f5526c;
                j9Var.getClass();
                j9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = j9Var.C;
                if (u9Var != null) {
                    u9Var.invalidate();
                }
                q9 q9Var = j9Var.W;
                if (q9Var != null && ((q1) q9Var).getCurrentMessagesGroup() == null && this.f5525b) {
                    ((q1) j9Var.W).setSelectedBackgroundProgress(1.0f - j9Var.U);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.q9 q9Var2 = (org.telegram.ui.Components.q9) this.f5526c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9Var2.setScaleX(floatValue3);
                q9Var2.setScaleY(floatValue3);
                if (!this.f5525b) {
                    q9Var2.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                y8 y8Var = (y8) this.f5526c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y8Var.n0(false, floatValue4);
                if (this.f5525b) {
                    r8 r8Var = y8Var.f42394a;
                    r8Var.f41946x = floatValue4;
                    r8Var.invalidate();
                    return;
                }
                return;
            case 7:
                z40 z40Var = (z40) this.f5526c;
                if (this.f5525b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (z40Var.getMeasuredHeight() / 2.0f);
                }
                z40Var.E0 = floatValue;
                z40Var.x();
                return;
            case 8:
                y90 y90Var = (y90) this.f5526c;
                y90Var.getClass();
                y90Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y90Var.invalidate();
                if (this.f5525b) {
                    y90Var.requestLayout();
                    return;
                }
                return;
            case 9:
                q2 q2Var = (q2) this.f5526c;
                TextView[] textViewArr = q2Var.h;
                q2Var.f41169s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.invalidate();
                if (this.f5525b) {
                    textViewArr[0].setAlpha(1.0f - q2Var.f41169s);
                    textViewArr[0].setScaleX(1.0f - q2Var.f41169s);
                    textViewArr[0].setScaleY(1.0f - q2Var.f41169s);
                    textViewArr[1].setAlpha(q2Var.f41169s);
                    textViewArr[1].setScaleX(q2Var.f41169s);
                    textViewArr[1].setScaleY(q2Var.f41169s);
                    return;
                }
                return;
            case 10:
                eg0 eg0Var = (eg0) this.f5526c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var.E = floatValue5;
                eg0Var.H.setAlpha(floatValue5);
                eg0Var.K.setAlpha(eg0Var.E);
                if (!this.f5525b && (viewGroup = eg0Var.Z) != null) {
                    viewGroup.setAlpha(eg0Var.E);
                }
                eg0Var.F.invalidate();
                eg0Var.G.invalidate();
                return;
            case 11:
                tz0 tz0Var = (tz0) this.f5526c;
                tz0Var.f52395s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tz0Var.f52384b.invalidate();
                tz0Var.f52386c.invalidate();
                if (tz0Var.T) {
                    tz0Var.O.invalidate();
                }
                tz0Var.e();
                TextView textView = tz0Var.E;
                if (textView != null) {
                    textView.setAlpha(tz0Var.f52395s);
                }
                if (!tz0Var.T && (rz0Var = tz0Var.O) != null && rz0Var.getSeekBarWaveform() != null) {
                    bn0 seekBarWaveform = tz0Var.O.getSeekBarWaveform();
                    if (this.f5525b) {
                        lrVar = lr.f37209g;
                    } else {
                        lrVar = lr.f37210i;
                    }
                    seekBarWaveform.L = lrVar.getInterpolation(Utilities.i(tz0Var.f52395s * 1.25f, 1.0f, 0.0f));
                    q1 q1Var2 = seekBarWaveform.f33737n;
                    if (q1Var2 != null) {
                        q1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                tg.f0 f0Var = (tg.f0) this.f5526c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0Var.f57834e = floatValue6;
                if (!this.f5525b) {
                    f0Var.f57833c.setAlpha(1.0f - floatValue6);
                }
                f0Var.f57832b.invalidate();
                return;
        }
    }
}
