package ah;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.ja;
import di.n6;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.voip.t2;
import org.telegram.ui.Components.w50;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.y8;
import org.telegram.ui.cj0;
import org.telegram.ui.i51;
import org.telegram.ui.k51;
public final class l0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f643a;
    public final boolean f644b;
    public final Object f645c;

    public l0(int i10, Object obj, boolean z10) {
        this.f643a = i10;
        this.f645c = obj;
        this.f644b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        i51 i51Var;
        pr prVar;
        switch (this.f643a) {
            case 0:
                u0 u0Var = (u0) this.f645c;
                u0Var.f717x = null;
                u0Var.f704j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u0Var.k();
                u0Var.l();
                u0Var.f708n.setCustomEmojiEnterProgress(Utilities.clamp(u0Var.f704j, 1.0f, 0.0f));
                u0Var.f697a.invalidate();
                u0Var.f707m.invalidateOutline();
                if (u0Var.f716w) {
                    u0Var.j(u0Var.f704j, this.f644b);
                    return;
                }
                return;
            case 1:
                ja jaVar = (ja) this.f645c;
                jaVar.getClass();
                jaVar.f3207y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jaVar.invalidate();
                if (this.f644b) {
                    jaVar.requestLayout();
                    return;
                }
                return;
            case 2:
                n6 n6Var = (n6) this.f645c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.f7713e = floatValue2;
                if (!this.f644b) {
                    n6Var.f7712c.setAlpha(1.0f - floatValue2);
                }
                n6Var.f7711b.invalidate();
                return;
            case 3:
                t1 t1Var = (t1) this.f645c;
                t1Var.f23021jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                if (this.f644b && t1Var.getParent() != null) {
                    ((View) t1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                r9 r9Var = (r9) this.f645c;
                r9Var.getClass();
                r9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ca caVar = r9Var.C;
                if (caVar != null) {
                    caVar.invalidate();
                }
                y9 y9Var = r9Var.W;
                if (y9Var != null && ((t1) y9Var).getCurrentMessagesGroup() == null && this.f644b) {
                    ((t1) r9Var.W).setSelectedBackgroundProgress(1.0f - r9Var.U);
                    return;
                }
                return;
            case 5:
                x9 x9Var = (x9) this.f645c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x9Var.setScaleX(floatValue3);
                x9Var.setScaleY(floatValue3);
                if (!this.f644b) {
                    x9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                f9 f9Var = (f9) this.f645c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9Var.i0(floatValue4, false);
                if (this.f644b) {
                    y8 y8Var = f9Var.f25991a;
                    y8Var.f25640w = floatValue4;
                    y8Var.invalidate();
                    return;
                }
                return;
            case 7:
                w50 w50Var = (w50) this.f645c;
                if (this.f644b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (w50Var.getMeasuredHeight() / 2.0f);
                }
                w50Var.f32180u0 = floatValue;
                w50Var.s();
                return;
            case 8:
                ua0 ua0Var = (ua0) this.f645c;
                ua0Var.getClass();
                ua0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ua0Var.invalidate();
                if (this.f644b) {
                    ua0Var.requestLayout();
                    return;
                }
                return;
            case 9:
                t2 t2Var = (t2) this.f645c;
                TextView[] textViewArr = t2Var.h;
                t2Var.f31885s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.invalidate();
                if (this.f644b) {
                    textViewArr[0].setAlpha(1.0f - t2Var.f31885s);
                    textViewArr[0].setScaleX(1.0f - t2Var.f31885s);
                    textViewArr[0].setScaleY(1.0f - t2Var.f31885s);
                    textViewArr[1].setAlpha(t2Var.f31885s);
                    textViewArr[1].setScaleX(t2Var.f31885s);
                    textViewArr[1].setScaleY(t2Var.f31885s);
                    return;
                }
                return;
            case 10:
                cj0 cj0Var = (cj0) this.f645c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cj0Var.E = floatValue5;
                cj0Var.H.setAlpha(floatValue5);
                cj0Var.K.setAlpha(cj0Var.E);
                if (!this.f644b && (viewGroup = cj0Var.Z) != null) {
                    viewGroup.setAlpha(cj0Var.E);
                }
                cj0Var.F.invalidate();
                cj0Var.G.invalidate();
                return;
            case 11:
                k51 k51Var = (k51) this.f645c;
                k51Var.f37956s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51Var.f37946b.invalidate();
                k51Var.f37948c.invalidate();
                if (k51Var.S) {
                    k51Var.N.invalidate();
                }
                k51Var.e();
                TextView textView = k51Var.f37959y;
                if (textView != null) {
                    textView.setAlpha(k51Var.f37956s);
                }
                if (!k51Var.S && (i51Var = k51Var.N) != null && i51Var.getSeekBarWaveform() != null) {
                    io0 seekBarWaveform = k51Var.N.getSeekBarWaveform();
                    if (this.f644b) {
                        prVar = pr.f29494g;
                    } else {
                        prVar = pr.f29495i;
                    }
                    seekBarWaveform.L = prVar.getInterpolation(Utilities.clamp(k51Var.f37956s * 1.25f, 1.0f, 0.0f));
                    t1 t1Var2 = seekBarWaveform.f27246n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                rg.n0 n0Var = (rg.n0) this.f645c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.f45353e = floatValue6;
                if (!this.f644b) {
                    n0Var.f45352c.setAlpha(1.0f - floatValue6);
                }
                n0Var.f45351b.invalidate();
                return;
        }
    }
}
