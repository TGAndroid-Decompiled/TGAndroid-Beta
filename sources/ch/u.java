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
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.s8;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.wq;
import org.telegram.ui.eg0;
import org.telegram.ui.tz0;
import org.telegram.ui.vz0;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f6403a;
    public final boolean f6404b;
    public final Object f6405c;

    public u(int i7, Object obj, boolean z9) {
        this.f6403a = i7;
        this.f6405c = obj;
        this.f6404b = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        tz0 tz0Var;
        wq wqVar;
        switch (this.f6403a) {
            case 0:
                b0 b0Var = (b0) this.f6405c;
                b0Var.f6206x = null;
                b0Var.f6193j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.k();
                b0Var.l();
                b0Var.f6197n.setCustomEmojiEnterProgress(Utilities.i(b0Var.f6193j, 1.0f, 0.0f));
                b0Var.f6186a.invalidate();
                b0Var.f6196m.invalidateOutline();
                if (b0Var.f6205w) {
                    b0Var.j(this.f6404b, b0Var.f6193j);
                    return;
                }
                return;
            case 1:
                l8 l8Var = (l8) this.f6405c;
                l8Var.getClass();
                l8Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l8Var.invalidate();
                if (this.f6404b) {
                    l8Var.requestLayout();
                    return;
                }
                return;
            case 2:
                l5 l5Var = (l5) this.f6405c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var.f12324e = floatValue2;
                if (!this.f6404b) {
                    l5Var.f12323c.setAlpha(1.0f - floatValue2);
                }
                l5Var.f12322b.invalidate();
                return;
            case 3:
                q1 q1Var = (q1) this.f6405c;
                q1Var.f30011rb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                if (this.f6404b && q1Var.getParent() != null) {
                    ((View) q1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                j9 j9Var = (j9) this.f6405c;
                j9Var.getClass();
                j9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = j9Var.C;
                if (u9Var != null) {
                    u9Var.invalidate();
                }
                q9 q9Var = j9Var.W;
                if (q9Var != null && ((q1) q9Var).getCurrentMessagesGroup() == null && this.f6404b) {
                    ((q1) j9Var.W).setSelectedBackgroundProgress(1.0f - j9Var.U);
                    return;
                }
                return;
            case 5:
                k9 k9Var = (k9) this.f6405c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k9Var.setScaleX(floatValue3);
                k9Var.setScaleY(floatValue3);
                if (!this.f6404b) {
                    k9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                s8 s8Var = (s8) this.f6405c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s8Var.n0(false, floatValue4);
                if (this.f6404b) {
                    org.telegram.ui.Components.l8 l8Var2 = s8Var.f37887a;
                    l8Var2.f37565x = floatValue4;
                    l8Var2.invalidate();
                    return;
                }
                return;
            case 7:
                o40 o40Var = (o40) this.f6405c;
                if (this.f6404b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (o40Var.getMeasuredHeight() / 2.0f);
                }
                o40Var.D0 = floatValue;
                o40Var.x();
                return;
            case 8:
                l90 l90Var = (l90) this.f6405c;
                l90Var.getClass();
                l90Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l90Var.invalidate();
                if (this.f6404b) {
                    l90Var.requestLayout();
                    return;
                }
                return;
            case 9:
                n2 n2Var = (n2) this.f6405c;
                TextView[] textViewArr = n2Var.h;
                n2Var.f39432s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.invalidate();
                if (this.f6404b) {
                    textViewArr[0].setAlpha(1.0f - n2Var.f39432s);
                    textViewArr[0].setScaleX(1.0f - n2Var.f39432s);
                    textViewArr[0].setScaleY(1.0f - n2Var.f39432s);
                    textViewArr[1].setAlpha(n2Var.f39432s);
                    textViewArr[1].setScaleX(n2Var.f39432s);
                    textViewArr[1].setScaleY(n2Var.f39432s);
                    return;
                }
                return;
            case 10:
                eg0 eg0Var = (eg0) this.f6405c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var.D = floatValue5;
                eg0Var.G.setAlpha(floatValue5);
                eg0Var.J.setAlpha(eg0Var.D);
                if (!this.f6404b && (viewGroup = eg0Var.Y) != null) {
                    viewGroup.setAlpha(eg0Var.D);
                }
                eg0Var.E.invalidate();
                eg0Var.F.invalidate();
                return;
            case 11:
                vz0 vz0Var = (vz0) this.f6405c;
                vz0Var.f50841s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vz0Var.f50831b.invalidate();
                vz0Var.f50833c.invalidate();
                if (vz0Var.S) {
                    vz0Var.N.invalidate();
                }
                vz0Var.e();
                TextView textView = vz0Var.D;
                if (textView != null) {
                    textView.setAlpha(vz0Var.f50841s);
                }
                if (!vz0Var.S && (tz0Var = vz0Var.N) != null && tz0Var.getSeekBarWaveform() != null) {
                    pm0 seekBarWaveform = vz0Var.N.getSeekBarWaveform();
                    if (this.f6404b) {
                        wqVar = wq.f40047g;
                    } else {
                        wqVar = wq.f40048i;
                    }
                    seekBarWaveform.L = wqVar.getInterpolation(Utilities.i(vz0Var.f50841s * 1.25f, 1.0f, 0.0f));
                    q1 q1Var2 = seekBarWaveform.f37028n;
                    if (q1Var2 != null) {
                        q1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                tg.f0 f0Var = (tg.f0) this.f6405c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0Var.f55666e = floatValue6;
                if (!this.f6404b) {
                    f0Var.f55665c.setAlpha(1.0f - floatValue6);
                }
                f0Var.f55664b.invalidate();
                return;
        }
    }
}
