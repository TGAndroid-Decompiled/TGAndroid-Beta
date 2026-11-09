package ch;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import di.l8;
import fi.l5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.xq;
import org.telegram.ui.dg0;
import org.telegram.ui.sz0;
import org.telegram.ui.uz0;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f6398a;
    public final boolean f6399b;
    public final Object f6400c;

    public u(int i7, Object obj, boolean z9) {
        this.f6398a = i7;
        this.f6400c = obj;
        this.f6399b = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        sz0 sz0Var;
        xq xqVar;
        switch (this.f6398a) {
            case 0:
                b0 b0Var = (b0) this.f6400c;
                b0Var.f6201x = null;
                b0Var.f6188j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.k();
                b0Var.l();
                b0Var.f6192n.setCustomEmojiEnterProgress(Utilities.i(b0Var.f6188j, 1.0f, 0.0f));
                b0Var.f6181a.invalidate();
                b0Var.f6191m.invalidateOutline();
                if (b0Var.f6200w) {
                    b0Var.j(this.f6399b, b0Var.f6188j);
                    return;
                }
                return;
            case 1:
                l8 l8Var = (l8) this.f6400c;
                l8Var.getClass();
                l8Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l8Var.invalidate();
                if (this.f6399b) {
                    l8Var.requestLayout();
                    return;
                }
                return;
            case 2:
                l5 l5Var = (l5) this.f6400c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var.f12323e = floatValue2;
                if (!this.f6399b) {
                    l5Var.f12322c.setAlpha(1.0f - floatValue2);
                }
                l5Var.f12321b.invalidate();
                return;
            case 3:
                q1 q1Var = (q1) this.f6400c;
                q1Var.f30000rb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                if (this.f6399b && q1Var.getParent() != null) {
                    ((View) q1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                j9 j9Var = (j9) this.f6400c;
                j9Var.getClass();
                j9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = j9Var.C;
                if (u9Var != null) {
                    u9Var.invalidate();
                }
                q9 q9Var = j9Var.W;
                if (q9Var != null && ((q1) q9Var).getCurrentMessagesGroup() == null && this.f6399b) {
                    ((q1) j9Var.W).setSelectedBackgroundProgress(1.0f - j9Var.U);
                    return;
                }
                return;
            case 5:
                l9 l9Var = (l9) this.f6400c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l9Var.setScaleX(floatValue3);
                l9Var.setScaleY(floatValue3);
                if (!this.f6399b) {
                    l9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                t8 t8Var = (t8) this.f6400c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t8Var.n0(false, floatValue4);
                if (this.f6399b) {
                    m8 m8Var = t8Var.f38314a;
                    m8Var.f37980x = floatValue4;
                    m8Var.invalidate();
                    return;
                }
                return;
            case 7:
                p40 p40Var = (p40) this.f6400c;
                if (this.f6399b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (p40Var.getMeasuredHeight() / 2.0f);
                }
                p40Var.D0 = floatValue;
                p40Var.x();
                return;
            case 8:
                m90 m90Var = (m90) this.f6400c;
                m90Var.getClass();
                m90Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m90Var.invalidate();
                if (this.f6399b) {
                    m90Var.requestLayout();
                    return;
                }
                return;
            case 9:
                n2 n2Var = (n2) this.f6400c;
                TextView[] textViewArr = n2Var.h;
                n2Var.f39512s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.invalidate();
                if (this.f6399b) {
                    textViewArr[0].setAlpha(1.0f - n2Var.f39512s);
                    textViewArr[0].setScaleX(1.0f - n2Var.f39512s);
                    textViewArr[0].setScaleY(1.0f - n2Var.f39512s);
                    textViewArr[1].setAlpha(n2Var.f39512s);
                    textViewArr[1].setScaleX(n2Var.f39512s);
                    textViewArr[1].setScaleY(n2Var.f39512s);
                    return;
                }
                return;
            case 10:
                dg0 dg0Var = (dg0) this.f6400c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg0Var.D = floatValue5;
                dg0Var.G.setAlpha(floatValue5);
                dg0Var.J.setAlpha(dg0Var.D);
                if (!this.f6399b && (viewGroup = dg0Var.Y) != null) {
                    viewGroup.setAlpha(dg0Var.D);
                }
                dg0Var.E.invalidate();
                dg0Var.F.invalidate();
                return;
            case 11:
                uz0 uz0Var = (uz0) this.f6400c;
                uz0Var.f50512s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uz0Var.f50502b.invalidate();
                uz0Var.f50504c.invalidate();
                if (uz0Var.S) {
                    uz0Var.N.invalidate();
                }
                uz0Var.e();
                TextView textView = uz0Var.D;
                if (textView != null) {
                    textView.setAlpha(uz0Var.f50512s);
                }
                if (!uz0Var.S && (sz0Var = uz0Var.N) != null && sz0Var.getSeekBarWaveform() != null) {
                    qm0 seekBarWaveform = uz0Var.N.getSeekBarWaveform();
                    if (this.f6399b) {
                        xqVar = xq.f40459g;
                    } else {
                        xqVar = xq.f40460i;
                    }
                    seekBarWaveform.L = xqVar.getInterpolation(Utilities.i(uz0Var.f50512s * 1.25f, 1.0f, 0.0f));
                    q1 q1Var2 = seekBarWaveform.f37429n;
                    if (q1Var2 != null) {
                        q1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                tg.f0 f0Var = (tg.f0) this.f6400c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0Var.f55667e = floatValue6;
                if (!this.f6399b) {
                    f0Var.f55666c.setAlpha(1.0f - floatValue6);
                }
                f0Var.f55665b.invalidate();
                return;
        }
    }
}
