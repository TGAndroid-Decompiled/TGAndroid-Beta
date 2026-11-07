package ch;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import di.k8;
import fi.l5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.m8;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.xq;
import org.telegram.ui.bg0;
import org.telegram.ui.pz0;
import org.telegram.ui.rz0;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f6400a;
    public final boolean f6401b;
    public final Object f6402c;

    public u(int i7, Object obj, boolean z9) {
        this.f6400a = i7;
        this.f6402c = obj;
        this.f6401b = z9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        pz0 pz0Var;
        xq xqVar;
        switch (this.f6400a) {
            case 0:
                b0 b0Var = (b0) this.f6402c;
                b0Var.f6203x = null;
                b0Var.f6190j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.k();
                b0Var.l();
                b0Var.f6194n.setCustomEmojiEnterProgress(Utilities.i(b0Var.f6190j, 1.0f, 0.0f));
                b0Var.f6183a.invalidate();
                b0Var.f6193m.invalidateOutline();
                if (b0Var.f6202w) {
                    b0Var.j(this.f6401b, b0Var.f6190j);
                    return;
                }
                return;
            case 1:
                k8 k8Var = (k8) this.f6402c;
                k8Var.getClass();
                k8Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k8Var.invalidate();
                if (this.f6401b) {
                    k8Var.requestLayout();
                    return;
                }
                return;
            case 2:
                l5 l5Var = (l5) this.f6402c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var.f12322e = floatValue2;
                if (!this.f6401b) {
                    l5Var.f12321c.setAlpha(1.0f - floatValue2);
                }
                l5Var.f12320b.invalidate();
                return;
            case 3:
                q1 q1Var = (q1) this.f6402c;
                q1Var.f29992rb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                if (this.f6401b && q1Var.getParent() != null) {
                    ((View) q1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                j9 j9Var = (j9) this.f6402c;
                j9Var.getClass();
                j9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = j9Var.C;
                if (u9Var != null) {
                    u9Var.invalidate();
                }
                q9 q9Var = j9Var.W;
                if (q9Var != null && ((q1) q9Var).getCurrentMessagesGroup() == null && this.f6401b) {
                    ((q1) j9Var.W).setSelectedBackgroundProgress(1.0f - j9Var.U);
                    return;
                }
                return;
            case 5:
                l9 l9Var = (l9) this.f6402c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l9Var.setScaleX(floatValue3);
                l9Var.setScaleY(floatValue3);
                if (!this.f6401b) {
                    l9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                t8 t8Var = (t8) this.f6402c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t8Var.n0(false, floatValue4);
                if (this.f6401b) {
                    m8 m8Var = t8Var.f38264a;
                    m8Var.f37939x = floatValue4;
                    m8Var.invalidate();
                    return;
                }
                return;
            case 7:
                o40 o40Var = (o40) this.f6402c;
                if (this.f6401b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (o40Var.getMeasuredHeight() / 2.0f);
                }
                o40Var.D0 = floatValue;
                o40Var.x();
                return;
            case 8:
                l90 l90Var = (l90) this.f6402c;
                l90Var.getClass();
                l90Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l90Var.invalidate();
                if (this.f6401b) {
                    l90Var.requestLayout();
                    return;
                }
                return;
            case 9:
                n2 n2Var = (n2) this.f6402c;
                TextView[] textViewArr = n2Var.h;
                n2Var.f39388s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.invalidate();
                if (this.f6401b) {
                    textViewArr[0].setAlpha(1.0f - n2Var.f39388s);
                    textViewArr[0].setScaleX(1.0f - n2Var.f39388s);
                    textViewArr[0].setScaleY(1.0f - n2Var.f39388s);
                    textViewArr[1].setAlpha(n2Var.f39388s);
                    textViewArr[1].setScaleX(n2Var.f39388s);
                    textViewArr[1].setScaleY(n2Var.f39388s);
                    return;
                }
                return;
            case 10:
                bg0 bg0Var = (bg0) this.f6402c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg0Var.D = floatValue5;
                bg0Var.G.setAlpha(floatValue5);
                bg0Var.J.setAlpha(bg0Var.D);
                if (!this.f6401b && (viewGroup = bg0Var.Y) != null) {
                    viewGroup.setAlpha(bg0Var.D);
                }
                bg0Var.E.invalidate();
                bg0Var.F.invalidate();
                return;
            case 11:
                rz0 rz0Var = (rz0) this.f6402c;
                rz0Var.f49603s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rz0Var.f49593b.invalidate();
                rz0Var.f49595c.invalidate();
                if (rz0Var.S) {
                    rz0Var.N.invalidate();
                }
                rz0Var.e();
                TextView textView = rz0Var.D;
                if (textView != null) {
                    textView.setAlpha(rz0Var.f49603s);
                }
                if (!rz0Var.S && (pz0Var = rz0Var.N) != null && pz0Var.getSeekBarWaveform() != null) {
                    pm0 seekBarWaveform = rz0Var.N.getSeekBarWaveform();
                    if (this.f6401b) {
                        xqVar = xq.f40346g;
                    } else {
                        xqVar = xq.f40347i;
                    }
                    seekBarWaveform.L = xqVar.getInterpolation(Utilities.i(rz0Var.f49603s * 1.25f, 1.0f, 0.0f));
                    q1 q1Var2 = seekBarWaveform.f37005n;
                    if (q1Var2 != null) {
                        q1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                tg.f0 f0Var = (tg.f0) this.f6402c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0Var.f55562e = floatValue6;
                if (!this.f6401b) {
                    f0Var.f55561c.setAlpha(1.0f - floatValue6);
                }
                f0Var.f55560b.invalidate();
                return;
        }
    }
}
