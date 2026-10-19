package ah;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ci.v8;
import ei.c6;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.voip.t2;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x8;
import org.telegram.ui.li0;
import org.telegram.ui.v31;
import org.telegram.ui.x31;
public final class k0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f815a;
    public final boolean f816b;
    public final Object f817c;

    public k0(int i10, Object obj, boolean z10) {
        this.f815a = i10;
        this.f817c = obj;
        this.f816b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        v31 v31Var;
        bs bsVar;
        switch (this.f815a) {
            case 0:
                t0 t0Var = (t0) this.f817c;
                t0Var.f887x = null;
                t0Var.f874j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t0Var.k();
                t0Var.l();
                t0Var.f878n.setCustomEmojiEnterProgress(Utilities.clamp(t0Var.f874j, 1.0f, 0.0f));
                t0Var.f868a.invalidate();
                t0Var.f877m.invalidateOutline();
                if (t0Var.f886w) {
                    t0Var.j(t0Var.f874j, this.f816b);
                    return;
                }
                return;
            case 1:
                v8 v8Var = (v8) this.f817c;
                v8Var.getClass();
                v8Var.f6095y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v8Var.invalidate();
                if (this.f816b) {
                    v8Var.requestLayout();
                    return;
                }
                return;
            case 2:
                c6 c6Var = (c6) this.f817c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6Var.e = floatValue2;
                if (!this.f816b) {
                    c6Var.f8828c.setAlpha(1.0f - floatValue2);
                }
                c6Var.f8827b.invalidate();
                return;
            case 3:
                u1 u1Var = (u1) this.f817c;
                u1Var.f23355jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                if (this.f816b && u1Var.getParent() != null) {
                    ((View) u1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                o9 o9Var = (o9) this.f817c;
                o9Var.getClass();
                o9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9 z9Var = o9Var.C;
                if (z9Var != null) {
                    z9Var.invalidate();
                }
                v9 v9Var = o9Var.W;
                if (v9Var != null && ((u1) v9Var).getCurrentMessagesGroup() == null && this.f816b) {
                    ((u1) o9Var.W).setSelectedBackgroundProgress(1.0f - o9Var.U);
                    return;
                }
                return;
            case 5:
                w9 w9Var = (w9) this.f817c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue3);
                w9Var.setScaleY(floatValue3);
                if (!this.f816b) {
                    w9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                e9 e9Var = (e9) this.f817c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e9Var.i0(floatValue4, false);
                if (this.f816b) {
                    x8 x8Var = e9Var.f25855a;
                    x8Var.f25494w = floatValue4;
                    x8Var.invalidate();
                    return;
                }
                return;
            case 7:
                m60 m60Var = (m60) this.f817c;
                if (this.f816b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (m60Var.getMeasuredHeight() / 2.0f);
                }
                m60Var.E0 = floatValue;
                m60Var.w();
                return;
            case 8:
                ob0 ob0Var = (ob0) this.f817c;
                ob0Var.getClass();
                ob0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ob0Var.invalidate();
                if (this.f816b) {
                    ob0Var.requestLayout();
                    return;
                }
                return;
            case 9:
                t2 t2Var = (t2) this.f817c;
                TextView[] textViewArr = t2Var.h;
                t2Var.f31809s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.invalidate();
                if (this.f816b) {
                    textViewArr[0].setAlpha(1.0f - t2Var.f31809s);
                    textViewArr[0].setScaleX(1.0f - t2Var.f31809s);
                    textViewArr[0].setScaleY(1.0f - t2Var.f31809s);
                    textViewArr[1].setAlpha(t2Var.f31809s);
                    textViewArr[1].setScaleX(t2Var.f31809s);
                    textViewArr[1].setScaleY(t2Var.f31809s);
                    return;
                }
                return;
            case 10:
                li0 li0Var = (li0) this.f817c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                li0Var.E = floatValue5;
                li0Var.H.setAlpha(floatValue5);
                li0Var.K.setAlpha(li0Var.E);
                if (!this.f816b && (viewGroup = li0Var.Z) != null) {
                    viewGroup.setAlpha(li0Var.E);
                }
                li0Var.F.invalidate();
                li0Var.G.invalidate();
                return;
            case 11:
                x31 x31Var = (x31) this.f817c;
                x31Var.f43026s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x31Var.f43017b.invalidate();
                x31Var.f43019c.invalidate();
                if (x31Var.S) {
                    x31Var.N.invalidate();
                }
                x31Var.e();
                TextView textView = x31Var.f43029y;
                if (textView != null) {
                    textView.setAlpha(x31Var.f43026s);
                }
                if (!x31Var.S && (v31Var = x31Var.N) != null && v31Var.getSeekBarWaveform() != null) {
                    fp0 seekBarWaveform = x31Var.N.getSeekBarWaveform();
                    if (this.f816b) {
                        bsVar = bs.f25015g;
                    } else {
                        bsVar = bs.f25016i;
                    }
                    seekBarWaveform.L = bsVar.getInterpolation(Utilities.clamp(x31Var.f43026s * 1.25f, 1.0f, 0.0f));
                    u1 u1Var2 = seekBarWaveform.f26329n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                rg.l0 l0Var = (rg.l0) this.f817c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.e = floatValue6;
                if (!this.f816b) {
                    l0Var.f45436c.setAlpha(1.0f - floatValue6);
                }
                l0Var.f45435b.invalidate();
                return;
        }
    }
}
