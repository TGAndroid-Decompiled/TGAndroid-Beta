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
import org.telegram.ui.oi0;
import org.telegram.ui.x31;
import org.telegram.ui.z31;
public final class k0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f817a;
    public final boolean f818b;
    public final Object f819c;

    public k0(int i10, Object obj, boolean z10) {
        this.f817a = i10;
        this.f819c = obj;
        this.f818b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        x31 x31Var;
        bs bsVar;
        switch (this.f817a) {
            case 0:
                t0 t0Var = (t0) this.f819c;
                t0Var.f889x = null;
                t0Var.f876j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t0Var.k();
                t0Var.l();
                t0Var.f880n.setCustomEmojiEnterProgress(Utilities.clamp(t0Var.f876j, 1.0f, 0.0f));
                t0Var.f870a.invalidate();
                t0Var.f879m.invalidateOutline();
                if (t0Var.f888w) {
                    t0Var.j(t0Var.f876j, this.f818b);
                    return;
                }
                return;
            case 1:
                v8 v8Var = (v8) this.f819c;
                v8Var.getClass();
                v8Var.f6095y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v8Var.invalidate();
                if (this.f818b) {
                    v8Var.requestLayout();
                    return;
                }
                return;
            case 2:
                c6 c6Var = (c6) this.f819c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6Var.e = floatValue2;
                if (!this.f818b) {
                    c6Var.f8828c.setAlpha(1.0f - floatValue2);
                }
                c6Var.f8827b.invalidate();
                return;
            case 3:
                u1 u1Var = (u1) this.f819c;
                u1Var.f23349jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                if (this.f818b && u1Var.getParent() != null) {
                    ((View) u1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                o9 o9Var = (o9) this.f819c;
                o9Var.getClass();
                o9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9 z9Var = o9Var.C;
                if (z9Var != null) {
                    z9Var.invalidate();
                }
                v9 v9Var = o9Var.W;
                if (v9Var != null && ((u1) v9Var).getCurrentMessagesGroup() == null && this.f818b) {
                    ((u1) o9Var.W).setSelectedBackgroundProgress(1.0f - o9Var.U);
                    return;
                }
                return;
            case 5:
                w9 w9Var = (w9) this.f819c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue3);
                w9Var.setScaleY(floatValue3);
                if (!this.f818b) {
                    w9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                e9 e9Var = (e9) this.f819c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e9Var.i0(floatValue4, false);
                if (this.f818b) {
                    x8 x8Var = e9Var.f25874a;
                    x8Var.f25521w = floatValue4;
                    x8Var.invalidate();
                    return;
                }
                return;
            case 7:
                m60 m60Var = (m60) this.f819c;
                if (this.f818b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (m60Var.getMeasuredHeight() / 2.0f);
                }
                m60Var.E0 = floatValue;
                m60Var.w();
                return;
            case 8:
                ob0 ob0Var = (ob0) this.f819c;
                ob0Var.getClass();
                ob0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ob0Var.invalidate();
                if (this.f818b) {
                    ob0Var.requestLayout();
                    return;
                }
                return;
            case 9:
                t2 t2Var = (t2) this.f819c;
                TextView[] textViewArr = t2Var.h;
                t2Var.f31798s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.invalidate();
                if (this.f818b) {
                    textViewArr[0].setAlpha(1.0f - t2Var.f31798s);
                    textViewArr[0].setScaleX(1.0f - t2Var.f31798s);
                    textViewArr[0].setScaleY(1.0f - t2Var.f31798s);
                    textViewArr[1].setAlpha(t2Var.f31798s);
                    textViewArr[1].setScaleX(t2Var.f31798s);
                    textViewArr[1].setScaleY(t2Var.f31798s);
                    return;
                }
                return;
            case 10:
                oi0 oi0Var = (oi0) this.f819c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oi0Var.E = floatValue5;
                oi0Var.H.setAlpha(floatValue5);
                oi0Var.K.setAlpha(oi0Var.E);
                if (!this.f818b && (viewGroup = oi0Var.Z) != null) {
                    viewGroup.setAlpha(oi0Var.E);
                }
                oi0Var.F.invalidate();
                oi0Var.G.invalidate();
                return;
            case 11:
                z31 z31Var = (z31) this.f819c;
                z31Var.f43551s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z31Var.f43542b.invalidate();
                z31Var.f43544c.invalidate();
                if (z31Var.S) {
                    z31Var.N.invalidate();
                }
                z31Var.e();
                TextView textView = z31Var.f43554y;
                if (textView != null) {
                    textView.setAlpha(z31Var.f43551s);
                }
                if (!z31Var.S && (x31Var = z31Var.N) != null && x31Var.getSeekBarWaveform() != null) {
                    fp0 seekBarWaveform = z31Var.N.getSeekBarWaveform();
                    if (this.f818b) {
                        bsVar = bs.f25031g;
                    } else {
                        bsVar = bs.f25032i;
                    }
                    seekBarWaveform.L = bsVar.getInterpolation(Utilities.clamp(z31Var.f43551s * 1.25f, 1.0f, 0.0f));
                    u1 u1Var2 = seekBarWaveform.f26342n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                rg.l0 l0Var = (rg.l0) this.f819c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.e = floatValue6;
                if (!this.f818b) {
                    l0Var.f45480c.setAlpha(1.0f - floatValue6);
                }
                l0Var.f45479b.invalidate();
                return;
        }
    }
}
