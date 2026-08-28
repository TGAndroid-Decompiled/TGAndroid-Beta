package hg;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ih.h8;
import kh.d6;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p8;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.Components.w8;
import org.telegram.ui.b41;
import org.telegram.ui.d41;
import org.telegram.ui.li0;
public final class y implements ValueAnimator.AnimatorUpdateListener {
    public final int f10776a;
    public final boolean f10777b;
    public final Object f10778c;

    public y(int i9, Object obj, boolean z10) {
        this.f10776a = i9;
        this.f10778c = obj;
        this.f10777b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        b41 b41Var;
        gr grVar;
        switch (this.f10776a) {
            case 0:
                e0 e0Var = (e0) this.f10778c;
                e0Var.f10594x = null;
                e0Var.f10581j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0Var.k();
                e0Var.l();
                e0Var.f10585n.setCustomEmojiEnterProgress(Utilities.clamp(e0Var.f10581j, 1.0f, 0.0f));
                e0Var.f10574a.invalidate();
                e0Var.f10584m.invalidateOutline();
                if (e0Var.f10593w) {
                    e0Var.j(e0Var.f10581j, this.f10777b);
                    return;
                }
                return;
            case 1:
                h8 h8Var = (h8) this.f10778c;
                h8Var.getClass();
                h8Var.f11523y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h8Var.invalidate();
                if (this.f10777b) {
                    h8Var.requestLayout();
                    return;
                }
                return;
            case 2:
                d6 d6Var = (d6) this.f10778c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d6Var.f15109e = floatValue2;
                if (!this.f10777b) {
                    d6Var.f15108c.setAlpha(1.0f - floatValue2);
                }
                d6Var.f15107b.invalidate();
                return;
            case 3:
                t1 t1Var = (t1) this.f10778c;
                t1Var.f25384fd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                if (this.f10777b && t1Var.getParent() != null) {
                    ((View) t1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                o9 o9Var = (o9) this.f10778c;
                o9Var.getClass();
                o9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9 z9Var = o9Var.C;
                if (z9Var != null) {
                    z9Var.invalidate();
                }
                v9 v9Var = o9Var.W;
                if (v9Var != null && ((t1) v9Var).getCurrentMessagesGroup() == null && this.f10777b) {
                    ((t1) o9Var.W).setSelectedBackgroundProgress(1.0f - o9Var.U);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.o9 o9Var2 = (org.telegram.ui.Components.o9) this.f10778c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o9Var2.setScaleX(floatValue3);
                o9Var2.setScaleY(floatValue3);
                if (!this.f10777b) {
                    o9Var2.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                w8 w8Var = (w8) this.f10778c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w8Var.h0(floatValue4, false);
                if (this.f10777b) {
                    p8 p8Var = w8Var.f34138a;
                    p8Var.f33319w = floatValue4;
                    p8Var.invalidate();
                    return;
                }
                return;
            case 7:
                f50 f50Var = (f50) this.f10778c;
                if (this.f10777b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (f50Var.getMeasuredHeight() / 2.0f);
                }
                f50Var.f28293q0 = floatValue;
                f50Var.s();
                return;
            case 8:
                ca0 ca0Var = (ca0) this.f10778c;
                ca0Var.getClass();
                ca0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ca0Var.invalidate();
                if (this.f10777b) {
                    ca0Var.requestLayout();
                    return;
                }
                return;
            case 9:
                u2 u2Var = (u2) this.f10778c;
                TextView[] textViewArr = u2Var.h;
                u2Var.f33892s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.invalidate();
                if (this.f10777b) {
                    textViewArr[0].setAlpha(1.0f - u2Var.f33892s);
                    textViewArr[0].setScaleX(1.0f - u2Var.f33892s);
                    textViewArr[0].setScaleY(1.0f - u2Var.f33892s);
                    textViewArr[1].setAlpha(u2Var.f33892s);
                    textViewArr[1].setScaleX(u2Var.f33892s);
                    textViewArr[1].setScaleY(u2Var.f33892s);
                    return;
                }
                return;
            case 10:
                li0 li0Var = (li0) this.f10778c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                li0Var.A = floatValue5;
                li0Var.D.setAlpha(floatValue5);
                li0Var.G.setAlpha(li0Var.A);
                if (!this.f10777b && (viewGroup = li0Var.V) != null) {
                    viewGroup.setAlpha(li0Var.A);
                }
                li0Var.B.invalidate();
                li0Var.C.invalidate();
                return;
            case 11:
                d41 d41Var = (d41) this.f10778c;
                d41Var.f37411s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d41Var.f37405b.invalidate();
                d41Var.f37406c.invalidate();
                if (d41Var.O) {
                    d41Var.J.invalidate();
                }
                d41Var.e();
                TextView textView = d41Var.f37414y;
                if (textView != null) {
                    textView.setAlpha(d41Var.f37411s);
                }
                if (!d41Var.O && (b41Var = d41Var.J) != null && b41Var.getSeekBarWaveform() != null) {
                    rn0 seekBarWaveform = d41Var.J.getSeekBarWaveform();
                    if (this.f10777b) {
                        grVar = gr.f28845g;
                    } else {
                        grVar = gr.f28846i;
                    }
                    seekBarWaveform.L = grVar.getInterpolation(Utilities.clamp(d41Var.f37411s * 1.25f, 1.0f, 0.0f));
                    t1 t1Var2 = seekBarWaveform.f32220n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                yf.k0 k0Var = (yf.k0) this.f10778c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f49900e = floatValue6;
                if (!this.f10777b) {
                    k0Var.f49899c.setAlpha(1.0f - floatValue6);
                }
                k0Var.f49898b.invalidate();
                return;
        }
    }
}
