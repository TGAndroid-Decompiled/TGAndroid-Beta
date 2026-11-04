package dh;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ei.k8;
import gi.j5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.voip.c2;
import org.telegram.ui.Components.xq;
import org.telegram.ui.gz0;
import org.telegram.ui.iz0;
import org.telegram.ui.vf0;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f9155a;
    public final boolean f9156b;
    public final Object f9157c;

    public u(int i3, Object obj, boolean z10) {
        this.f9155a = i3;
        this.f9157c = obj;
        this.f9156b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        gz0 gz0Var;
        xq xqVar;
        switch (this.f9155a) {
            case 0:
                a0 a0Var = (a0) this.f9157c;
                a0Var.f8951x = null;
                a0Var.f8938j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.k();
                a0Var.l();
                a0Var.f8942n.setCustomEmojiEnterProgress(Utilities.i(a0Var.f8938j, 1.0f, 0.0f));
                a0Var.f8931a.invalidate();
                a0Var.f8941m.invalidateOutline();
                if (a0Var.f8950w) {
                    a0Var.j(this.f9156b, a0Var.f8938j);
                    return;
                }
                return;
            case 1:
                k8 k8Var = (k8) this.f9157c;
                k8Var.getClass();
                k8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k8Var.invalidate();
                if (this.f9156b) {
                    k8Var.requestLayout();
                    return;
                }
                return;
            case 2:
                j5 j5Var = (j5) this.f9157c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j5Var.f13011e = floatValue2;
                if (!this.f9156b) {
                    j5Var.f13010c.setAlpha(1.0f - floatValue2);
                }
                j5Var.f13009b.invalidate();
                return;
            case 3:
                q1 q1Var = (q1) this.f9157c;
                q1Var.f30067rb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                if (this.f9156b && q1Var.getParent() != null) {
                    ((View) q1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                i9 i9Var = (i9) this.f9157c;
                i9Var.getClass();
                i9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t9 t9Var = i9Var.C;
                if (t9Var != null) {
                    t9Var.invalidate();
                }
                p9 p9Var = i9Var.W;
                if (p9Var != null && ((q1) p9Var).getCurrentMessagesGroup() == null && this.f9156b) {
                    ((q1) i9Var.W).setSelectedBackgroundProgress(1.0f - i9Var.U);
                    return;
                }
                return;
            case 5:
                k9 k9Var = (k9) this.f9157c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k9Var.setScaleX(floatValue3);
                k9Var.setScaleY(floatValue3);
                if (!this.f9156b) {
                    k9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                r8 r8Var = (r8) this.f9157c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var.n0(false, floatValue4);
                if (this.f9156b) {
                    org.telegram.ui.Components.k8 k8Var2 = r8Var.f37667a;
                    k8Var2.f37378x = floatValue4;
                    k8Var2.invalidate();
                    return;
                }
                return;
            case 7:
                k40 k40Var = (k40) this.f9157c;
                if (this.f9156b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (k40Var.getMeasuredHeight() / 2.0f);
                }
                k40Var.E0 = floatValue;
                k40Var.w();
                return;
            case 8:
                h90 h90Var = (h90) this.f9157c;
                h90Var.getClass();
                h90Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h90Var.invalidate();
                if (this.f9156b) {
                    h90Var.requestLayout();
                    return;
                }
                return;
            case 9:
                c2 c2Var = (c2) this.f9157c;
                TextView[] textViewArr = c2Var.h;
                c2Var.f39280s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var.invalidate();
                if (this.f9156b) {
                    textViewArr[0].setAlpha(1.0f - c2Var.f39280s);
                    textViewArr[0].setScaleX(1.0f - c2Var.f39280s);
                    textViewArr[0].setScaleY(1.0f - c2Var.f39280s);
                    textViewArr[1].setAlpha(c2Var.f39280s);
                    textViewArr[1].setScaleX(c2Var.f39280s);
                    textViewArr[1].setScaleY(c2Var.f39280s);
                    return;
                }
                return;
            case 10:
                vf0 vf0Var = (vf0) this.f9157c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf0Var.E = floatValue5;
                vf0Var.H.setAlpha(floatValue5);
                vf0Var.K.setAlpha(vf0Var.E);
                if (!this.f9156b && (viewGroup = vf0Var.Z) != null) {
                    viewGroup.setAlpha(vf0Var.E);
                }
                vf0Var.F.invalidate();
                vf0Var.G.invalidate();
                return;
            case 11:
                iz0 iz0Var = (iz0) this.f9157c;
                iz0Var.f46469s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iz0Var.f46458b.invalidate();
                iz0Var.f46460c.invalidate();
                if (iz0Var.T) {
                    iz0Var.O.invalidate();
                }
                iz0Var.e();
                TextView textView = iz0Var.E;
                if (textView != null) {
                    textView.setAlpha(iz0Var.f46469s);
                }
                if (!iz0Var.T && (gz0Var = iz0Var.O) != null && gz0Var.getSeekBarWaveform() != null) {
                    sm0 seekBarWaveform = iz0Var.O.getSeekBarWaveform();
                    if (this.f9156b) {
                        xqVar = xq.f40453g;
                    } else {
                        xqVar = xq.f40454i;
                    }
                    seekBarWaveform.L = xqVar.getInterpolation(Utilities.i(iz0Var.f46469s * 1.25f, 1.0f, 0.0f));
                    q1 q1Var2 = seekBarWaveform.f38076n;
                    if (q1Var2 != null) {
                        q1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                ug.e0 e0Var = (ug.e0) this.f9157c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.f55954e = floatValue6;
                if (!this.f9156b) {
                    e0Var.f55953c.setAlpha(1.0f - floatValue6);
                }
                e0Var.f55952b.invalidate();
                return;
        }
    }
}
