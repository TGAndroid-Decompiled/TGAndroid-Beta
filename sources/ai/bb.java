package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.a51;
import org.telegram.ui.c51;
import org.telegram.ui.zi0;
public final class bb implements ValueAnimator.AnimatorUpdateListener {
    public final int f668a;
    public final boolean f669b;
    public final Object f670c;

    public bb(int i10, Object obj, boolean z10) {
        this.f668a = i10;
        this.f670c = obj;
        this.f669b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        a51 a51Var;
        tr trVar;
        switch (this.f668a) {
            case 0:
                db dbVar = (db) this.f670c;
                dbVar.getClass();
                dbVar.f820y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dbVar.invalidate();
                if (this.f669b) {
                    dbVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ci.n6 n6Var = (ci.n6) this.f670c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.f5609e = floatValue2;
                if (!this.f669b) {
                    n6Var.f5608c.setAlpha(1.0f - floatValue2);
                }
                n6Var.f5607b.invalidate();
                return;
            case 2:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f670c;
                u1Var.f23266jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                if (this.f669b && u1Var.getParent() != null) {
                    ((View) u1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.r9 r9Var = (org.telegram.ui.Cells.r9) this.f670c;
                r9Var.getClass();
                r9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.ca caVar = r9Var.C;
                if (caVar != null) {
                    caVar.invalidate();
                }
                org.telegram.ui.Cells.y9 y9Var = r9Var.W;
                if (y9Var != null && ((org.telegram.ui.Cells.u1) y9Var).getCurrentMessagesGroup() == null && this.f669b) {
                    ((org.telegram.ui.Cells.u1) r9Var.W).setSelectedBackgroundProgress(1.0f - r9Var.U);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f670c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue3);
                w9Var.setScaleY(floatValue3);
                if (!this.f669b) {
                    w9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) this.f670c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e9Var.i0(floatValue4, false);
                if (this.f669b) {
                    org.telegram.ui.Components.x8 x8Var = e9Var.f26070a;
                    x8Var.f25725w = floatValue4;
                    x8Var.invalidate();
                    return;
                }
                return;
            case 6:
                f60 f60Var = (f60) this.f670c;
                if (this.f669b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (f60Var.getMeasuredHeight() / 2.0f);
                }
                f60Var.f26389z0 = floatValue;
                f60Var.v();
                return;
            case 7:
                hb0 hb0Var = (hb0) this.f670c;
                hb0Var.getClass();
                hb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hb0Var.invalidate();
                if (this.f669b) {
                    hb0Var.requestLayout();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f670c;
                TextView[] textViewArr = w2Var.h;
                w2Var.f32337s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.invalidate();
                if (this.f669b) {
                    textViewArr[0].setAlpha(1.0f - w2Var.f32337s);
                    textViewArr[0].setScaleX(1.0f - w2Var.f32337s);
                    textViewArr[0].setScaleY(1.0f - w2Var.f32337s);
                    textViewArr[1].setAlpha(w2Var.f32337s);
                    textViewArr[1].setScaleX(w2Var.f32337s);
                    textViewArr[1].setScaleY(w2Var.f32337s);
                    return;
                }
                return;
            case 9:
                zi0 zi0Var = (zi0) this.f670c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zi0Var.E = floatValue5;
                zi0Var.H.setAlpha(floatValue5);
                zi0Var.K.setAlpha(zi0Var.E);
                if (!this.f669b && (viewGroup = zi0Var.Z) != null) {
                    viewGroup.setAlpha(zi0Var.E);
                }
                zi0Var.F.invalidate();
                zi0Var.G.invalidate();
                return;
            case 10:
                c51 c51Var = (c51) this.f670c;
                c51Var.f35322s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c51Var.f35312b.invalidate();
                c51Var.f35314c.invalidate();
                if (c51Var.S) {
                    c51Var.N.invalidate();
                }
                c51Var.e();
                TextView textView = c51Var.f35325y;
                if (textView != null) {
                    textView.setAlpha(c51Var.f35322s);
                }
                if (!c51Var.S && (a51Var = c51Var.N) != null && a51Var.getSeekBarWaveform() != null) {
                    cp0 seekBarWaveform = c51Var.N.getSeekBarWaveform();
                    if (this.f669b) {
                        trVar = tr.f31216g;
                    } else {
                        trVar = tr.f31217i;
                    }
                    seekBarWaveform.L = trVar.getInterpolation(Utilities.clamp(c51Var.f35322s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f25489n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                qg.l0 l0Var = (qg.l0) this.f670c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f45142e = floatValue6;
                if (!this.f669b) {
                    l0Var.f45141c.setAlpha(1.0f - floatValue6);
                }
                l0Var.f45140b.invalidate();
                return;
            default:
                zg.z zVar = (zg.z) this.f670c;
                zVar.f53570x = null;
                zVar.f53557j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.k();
                zVar.l();
                zVar.f53561n.setCustomEmojiEnterProgress(Utilities.clamp(zVar.f53557j, 1.0f, 0.0f));
                zVar.f53550a.invalidate();
                zVar.f53560m.invalidateOutline();
                if (zVar.f53569w) {
                    zVar.j(zVar.f53557j, this.f669b);
                    return;
                }
                return;
        }
    }
}
