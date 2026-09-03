package eg;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import oh.d8;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.p8;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.z50;
import org.telegram.ui.ti0;
import org.telegram.ui.u41;
import org.telegram.ui.w41;
import qh.y4;
public final class z0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5581a;
    public final boolean f5582b;
    public final Object f5583c;

    public z0(int i10, Object obj, boolean z4) {
        this.f5581a = i10;
        this.f5583c = obj;
        this.f5582b = z4;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        u41 u41Var;
        pr prVar;
        switch (this.f5581a) {
            case 0:
                a1 a1Var = (a1) this.f5583c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1Var.f5060e = floatValue2;
                if (!this.f5582b) {
                    a1Var.f5059c.setAlpha(1.0f - floatValue2);
                }
                a1Var.f5058b.invalidate();
                return;
            case 1:
                ng.d0 d0Var = (ng.d0) this.f5583c;
                d0Var.f16055x = null;
                d0Var.f16042j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.k();
                d0Var.l();
                d0Var.f16046n.setCustomEmojiEnterProgress(Utilities.clamp(d0Var.f16042j, 1.0f, 0.0f));
                d0Var.f16035a.invalidate();
                d0Var.f16045m.invalidateOutline();
                if (d0Var.f16054w) {
                    d0Var.j(d0Var.f16042j, this.f5582b);
                    return;
                }
                return;
            case 2:
                d8 d8Var = (d8) this.f5583c;
                d8Var.getClass();
                d8Var.f17002y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d8Var.invalidate();
                if (this.f5582b) {
                    d8Var.requestLayout();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f5583c;
                t1Var.f23869gd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                if (this.f5582b && t1Var.getParent() != null) {
                    ((View) t1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                n9 n9Var = (n9) this.f5583c;
                n9Var.getClass();
                n9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var = n9Var.C;
                if (y9Var != null) {
                    y9Var.invalidate();
                }
                u9 u9Var = n9Var.W;
                if (u9Var != null && ((org.telegram.ui.Cells.t1) u9Var).getCurrentMessagesGroup() == null && this.f5582b) {
                    ((org.telegram.ui.Cells.t1) n9Var.W).setSelectedBackgroundProgress(1.0f - n9Var.U);
                    return;
                }
                return;
            case 5:
                p9 p9Var = (p9) this.f5583c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9Var.setScaleX(floatValue3);
                p9Var.setScaleY(floatValue3);
                if (!this.f5582b) {
                    p9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                w8 w8Var = (w8) this.f5583c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w8Var.i0(floatValue4, false);
                if (this.f5582b) {
                    p8 p8Var = w8Var.f32675a;
                    p8Var.f31826w = floatValue4;
                    p8Var.invalidate();
                    return;
                }
                return;
            case 7:
                z50 z50Var = (z50) this.f5583c;
                if (this.f5582b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (z50Var.getMeasuredHeight() / 2.0f);
                }
                z50Var.f33793r0 = floatValue;
                z50Var.s();
                return;
            case 8:
                xa0 xa0Var = (xa0) this.f5583c;
                xa0Var.getClass();
                xa0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xa0Var.invalidate();
                if (this.f5582b) {
                    xa0Var.requestLayout();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f5583c;
                TextView[] textViewArr = w2Var.h;
                w2Var.f32455s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.invalidate();
                if (this.f5582b) {
                    textViewArr[0].setAlpha(1.0f - w2Var.f32455s);
                    textViewArr[0].setScaleX(1.0f - w2Var.f32455s);
                    textViewArr[0].setScaleY(1.0f - w2Var.f32455s);
                    textViewArr[1].setAlpha(w2Var.f32455s);
                    textViewArr[1].setScaleX(w2Var.f32455s);
                    textViewArr[1].setScaleY(w2Var.f32455s);
                    return;
                }
                return;
            case 10:
                ti0 ti0Var = (ti0) this.f5583c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti0Var.B = floatValue5;
                ti0Var.E.setAlpha(floatValue5);
                ti0Var.H.setAlpha(ti0Var.B);
                if (!this.f5582b && (viewGroup = ti0Var.W) != null) {
                    viewGroup.setAlpha(ti0Var.B);
                }
                ti0Var.C.invalidate();
                ti0Var.D.invalidate();
                return;
            case 11:
                w41 w41Var = (w41) this.f5583c;
                w41Var.f42288s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w41Var.f42281b.invalidate();
                w41Var.f42283c.invalidate();
                if (w41Var.P) {
                    w41Var.K.invalidate();
                }
                w41Var.e();
                TextView textView = w41Var.f42291y;
                if (textView != null) {
                    textView.setAlpha(w41Var.f42288s);
                }
                if (!w41Var.P && (u41Var = w41Var.K) != null && u41Var.getSeekBarWaveform() != null) {
                    mo0 seekBarWaveform = w41Var.K.getSeekBarWaveform();
                    if (this.f5582b) {
                        prVar = pr.f30169g;
                    } else {
                        prVar = pr.f30170i;
                    }
                    seekBarWaveform.L = prVar.getInterpolation(Utilities.clamp(w41Var.f42288s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.f29196n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                y4 y4Var = (y4) this.f5583c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y4Var.f46368e = floatValue6;
                if (!this.f5582b) {
                    y4Var.f46367c.setAlpha(1.0f - floatValue6);
                }
                y4Var.f46366b.invalidate();
                return;
        }
    }
}
