package bg;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import lh.d8;
import nh.r5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.d41;
import org.telegram.ui.f41;
import org.telegram.ui.ki0;
public final class c1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f2115a;
    public final boolean f2116b;
    public final Object f2117c;

    public c1(int i10, Object obj, boolean z10) {
        this.f2115a = i10;
        this.f2117c = obj;
        this.f2116b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        d41 d41Var;
        jr jrVar;
        switch (this.f2115a) {
            case 0:
                e1 e1Var = (e1) this.f2117c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.f2172e = floatValue2;
                if (!this.f2116b) {
                    e1Var.f2171c.setAlpha(1.0f - floatValue2);
                }
                e1Var.f2170b.invalidate();
                return;
            case 1:
                kg.d0 d0Var = (kg.d0) this.f2117c;
                d0Var.f13701x = null;
                d0Var.f13688j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.k();
                d0Var.l();
                d0Var.f13692n.setCustomEmojiEnterProgress(Utilities.clamp(d0Var.f13688j, 1.0f, 0.0f));
                d0Var.f13681a.invalidate();
                d0Var.f13691m.invalidateOutline();
                if (d0Var.f13700w) {
                    d0Var.j(d0Var.f13688j, this.f2116b);
                    return;
                }
                return;
            case 2:
                d8 d8Var = (d8) this.f2117c;
                d8Var.getClass();
                d8Var.f15569y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d8Var.invalidate();
                if (this.f2116b) {
                    d8Var.requestLayout();
                    return;
                }
                return;
            case 3:
                r5 r5Var = (r5) this.f2117c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r5Var.f18518e = floatValue3;
                if (!this.f2116b) {
                    r5Var.f18517c.setAlpha(1.0f - floatValue3);
                }
                r5Var.f18516b.invalidate();
                return;
            case 4:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f2117c;
                s1Var.f25349fd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                if (this.f2116b && s1Var.getParent() != null) {
                    ((View) s1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 5:
                l9 l9Var = (l9) this.f2117c;
                l9Var.getClass();
                l9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9 w9Var = l9Var.C;
                if (w9Var != null) {
                    w9Var.invalidate();
                }
                s9 s9Var = l9Var.W;
                if (s9Var != null && ((org.telegram.ui.Cells.s1) s9Var).getCurrentMessagesGroup() == null && this.f2116b) {
                    ((org.telegram.ui.Cells.s1) l9Var.W).setSelectedBackgroundProgress(1.0f - l9Var.U);
                    return;
                }
                return;
            case 6:
                t9 t9Var = (t9) this.f2117c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t9Var.setScaleX(floatValue4);
                t9Var.setScaleY(floatValue4);
                if (!this.f2116b) {
                    t9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 7:
                b9 b9Var = (b9) this.f2117c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b9Var.i0(floatValue5, false);
                if (this.f2116b) {
                    u8 u8Var = b9Var.f27003a;
                    u8Var.f26715w = floatValue5;
                    u8Var.invalidate();
                    return;
                }
                return;
            case 8:
                s50 s50Var = (s50) this.f2117c;
                if (this.f2116b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (s50Var.getMeasuredHeight() / 2.0f);
                }
                s50Var.f32514q0 = floatValue;
                s50Var.s();
                return;
            case 9:
                qa0 qa0Var = (qa0) this.f2117c;
                qa0Var.getClass();
                qa0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qa0Var.invalidate();
                if (this.f2116b) {
                    qa0Var.requestLayout();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.voip.x2 x2Var = (org.telegram.ui.Components.voip.x2) this.f2117c;
                TextView[] textViewArr = x2Var.h;
                x2Var.f34123s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.invalidate();
                if (this.f2116b) {
                    textViewArr[0].setAlpha(1.0f - x2Var.f34123s);
                    textViewArr[0].setScaleX(1.0f - x2Var.f34123s);
                    textViewArr[0].setScaleY(1.0f - x2Var.f34123s);
                    textViewArr[1].setAlpha(x2Var.f34123s);
                    textViewArr[1].setScaleX(x2Var.f34123s);
                    textViewArr[1].setScaleY(x2Var.f34123s);
                    return;
                }
                return;
            case 11:
                ki0 ki0Var = (ki0) this.f2117c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki0Var.A = floatValue6;
                ki0Var.D.setAlpha(floatValue6);
                ki0Var.G.setAlpha(ki0Var.A);
                if (!this.f2116b && (viewGroup = ki0Var.V) != null) {
                    viewGroup.setAlpha(ki0Var.A);
                }
                ki0Var.B.invalidate();
                ki0Var.C.invalidate();
                return;
            default:
                f41 f41Var = (f41) this.f2117c;
                f41Var.f37995s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f41Var.f37989b.invalidate();
                f41Var.f37990c.invalidate();
                if (f41Var.O) {
                    f41Var.J.invalidate();
                }
                f41Var.e();
                TextView textView = f41Var.f37998y;
                if (textView != null) {
                    textView.setAlpha(f41Var.f37995s);
                }
                if (!f41Var.O && (d41Var = f41Var.J) != null && d41Var.getSeekBarWaveform() != null) {
                    co0 seekBarWaveform = f41Var.J.getSeekBarWaveform();
                    if (this.f2116b) {
                        jrVar = jr.f29801g;
                    } else {
                        jrVar = jr.f29802i;
                    }
                    seekBarWaveform.L = jrVar.getInterpolation(Utilities.clamp(f41Var.f37995s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.s1 s1Var2 = seekBarWaveform.f27534n;
                    if (s1Var2 != null) {
                        s1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
