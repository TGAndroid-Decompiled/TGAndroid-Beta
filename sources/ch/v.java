package ch;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.a8;
import hi.i5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.z40;
import org.telegram.ui.fg0;
import org.telegram.ui.rz0;
import org.telegram.ui.tz0;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f5521a;
    public final boolean f5522b;
    public final Object f5523c;

    public v(int i7, Object obj, boolean z10) {
        this.f5521a = i7;
        this.f5523c = obj;
        this.f5522b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        rz0 rz0Var;
        lr lrVar;
        switch (this.f5521a) {
            case 0:
                b0 b0Var = (b0) this.f5523c;
                b0Var.f5314x = null;
                b0Var.f5301j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.k();
                b0Var.l();
                b0Var.f5305n.setCustomEmojiEnterProgress(Utilities.i(b0Var.f5301j, 1.0f, 0.0f));
                b0Var.f5294a.invalidate();
                b0Var.f5304m.invalidateOutline();
                if (b0Var.f5313w) {
                    b0Var.j(this.f5522b, b0Var.f5301j);
                    return;
                }
                return;
            case 1:
                a8 a8Var = (a8) this.f5523c;
                a8Var.getClass();
                a8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.invalidate();
                if (this.f5522b) {
                    a8Var.requestLayout();
                    return;
                }
                return;
            case 2:
                i5 i5Var = (i5) this.f5523c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i5Var.f14763e = floatValue2;
                if (!this.f5522b) {
                    i5Var.f14762c.setAlpha(1.0f - floatValue2);
                }
                i5Var.f14761b.invalidate();
                return;
            case 3:
                r1 r1Var = (r1) this.f5523c;
                r1Var.f31573sb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                if (this.f5522b && r1Var.getParent() != null) {
                    ((View) r1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                k9 k9Var = (k9) this.f5523c;
                k9Var.getClass();
                k9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9 v9Var = k9Var.C;
                if (v9Var != null) {
                    v9Var.invalidate();
                }
                r9 r9Var = k9Var.W;
                if (r9Var != null && ((r1) r9Var).getCurrentMessagesGroup() == null && this.f5522b) {
                    ((r1) k9Var.W).setSelectedBackgroundProgress(1.0f - k9Var.U);
                    return;
                }
                return;
            case 5:
                q9 q9Var = (q9) this.f5523c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9Var.setScaleX(floatValue3);
                q9Var.setScaleY(floatValue3);
                if (!this.f5522b) {
                    q9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                y8 y8Var = (y8) this.f5523c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y8Var.n0(false, floatValue4);
                if (this.f5522b) {
                    r8 r8Var = y8Var.f42394a;
                    r8Var.f41946x = floatValue4;
                    r8Var.invalidate();
                    return;
                }
                return;
            case 7:
                z40 z40Var = (z40) this.f5523c;
                if (this.f5522b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (z40Var.getMeasuredHeight() / 2.0f);
                }
                z40Var.E0 = floatValue;
                z40Var.x();
                return;
            case 8:
                y90 y90Var = (y90) this.f5523c;
                y90Var.getClass();
                y90Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y90Var.invalidate();
                if (this.f5522b) {
                    y90Var.requestLayout();
                    return;
                }
                return;
            case 9:
                q2 q2Var = (q2) this.f5523c;
                TextView[] textViewArr = q2Var.h;
                q2Var.f41169s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.invalidate();
                if (this.f5522b) {
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
                fg0 fg0Var = (fg0) this.f5523c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var.E = floatValue5;
                fg0Var.H.setAlpha(floatValue5);
                fg0Var.K.setAlpha(fg0Var.E);
                if (!this.f5522b && (viewGroup = fg0Var.Z) != null) {
                    viewGroup.setAlpha(fg0Var.E);
                }
                fg0Var.F.invalidate();
                fg0Var.G.invalidate();
                return;
            case 11:
                tz0 tz0Var = (tz0) this.f5523c;
                tz0Var.f52390s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tz0Var.f52379b.invalidate();
                tz0Var.f52381c.invalidate();
                if (tz0Var.T) {
                    tz0Var.O.invalidate();
                }
                tz0Var.e();
                TextView textView = tz0Var.E;
                if (textView != null) {
                    textView.setAlpha(tz0Var.f52390s);
                }
                if (!tz0Var.T && (rz0Var = tz0Var.O) != null && rz0Var.getSeekBarWaveform() != null) {
                    bn0 seekBarWaveform = tz0Var.O.getSeekBarWaveform();
                    if (this.f5522b) {
                        lrVar = lr.f37209g;
                    } else {
                        lrVar = lr.f37210i;
                    }
                    seekBarWaveform.L = lrVar.getInterpolation(Utilities.i(tz0Var.f52390s * 1.25f, 1.0f, 0.0f));
                    r1 r1Var2 = seekBarWaveform.f33737n;
                    if (r1Var2 != null) {
                        r1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                tg.f0 f0Var = (tg.f0) this.f5523c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0Var.f57834e = floatValue6;
                if (!this.f5522b) {
                    f0Var.f57833c.setAlpha(1.0f - floatValue6);
                }
                f0Var.f57832b.invalidate();
                return;
        }
    }
}
