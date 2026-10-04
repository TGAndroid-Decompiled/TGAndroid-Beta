package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.c51;
import org.telegram.ui.e51;
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
        c51 c51Var;
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
                u1Var.f23263jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                    org.telegram.ui.Components.x8 x8Var = e9Var.f26008a;
                    x8Var.f25666w = floatValue4;
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
                f60Var.f26338z0 = floatValue;
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
                w2Var.f32270s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.invalidate();
                if (this.f669b) {
                    textViewArr[0].setAlpha(1.0f - w2Var.f32270s);
                    textViewArr[0].setScaleX(1.0f - w2Var.f32270s);
                    textViewArr[0].setScaleY(1.0f - w2Var.f32270s);
                    textViewArr[1].setAlpha(w2Var.f32270s);
                    textViewArr[1].setScaleX(w2Var.f32270s);
                    textViewArr[1].setScaleY(w2Var.f32270s);
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
                e51 e51Var = (e51) this.f670c;
                e51Var.f35930s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e51Var.f35920b.invalidate();
                e51Var.f35922c.invalidate();
                if (e51Var.S) {
                    e51Var.N.invalidate();
                }
                e51Var.e();
                TextView textView = e51Var.f35933y;
                if (textView != null) {
                    textView.setAlpha(e51Var.f35930s);
                }
                if (!e51Var.S && (c51Var = e51Var.N) != null && c51Var.getSeekBarWaveform() != null) {
                    bp0 seekBarWaveform = e51Var.N.getSeekBarWaveform();
                    if (this.f669b) {
                        trVar = tr.f31148g;
                    } else {
                        trVar = tr.f31149i;
                    }
                    seekBarWaveform.L = trVar.getInterpolation(Utilities.clamp(e51Var.f35930s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f25034n;
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
                l0Var.f45135e = floatValue6;
                if (!this.f669b) {
                    l0Var.f45134c.setAlpha(1.0f - floatValue6);
                }
                l0Var.f45133b.invalidate();
                return;
            default:
                zg.b0 b0Var = (zg.b0) this.f670c;
                b0Var.f53342x = null;
                b0Var.f53329j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.k();
                b0Var.l();
                b0Var.f53333n.setCustomEmojiEnterProgress(Utilities.clamp(b0Var.f53329j, 1.0f, 0.0f));
                b0Var.f53322a.invalidate();
                b0Var.f53332m.invalidateOutline();
                if (b0Var.f53341w) {
                    b0Var.j(b0Var.f53329j, this.f669b);
                    return;
                }
                return;
        }
    }
}
