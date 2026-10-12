package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.ej0;
import org.telegram.ui.l51;
import org.telegram.ui.n51;
public final class cb implements ValueAnimator.AnimatorUpdateListener {
    public final int f789a;
    public final boolean f790b;
    public final Object f791c;

    public cb(int i10, Object obj, boolean z10) {
        this.f789a = i10;
        this.f791c = obj;
        this.f790b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        l51 l51Var;
        js jsVar;
        switch (this.f789a) {
            case 0:
                eb ebVar = (eb) this.f791c;
                ebVar.getClass();
                ebVar.f928y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ebVar.invalidate();
                if (this.f790b) {
                    ebVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ci.n6 n6Var = (ci.n6) this.f791c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.f5638e = floatValue2;
                if (!this.f790b) {
                    n6Var.f5637c.setAlpha(1.0f - floatValue2);
                }
                n6Var.f5636b.invalidate();
                return;
            case 2:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f791c;
                u1Var.f23019jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                if (this.f790b && u1Var.getParent() != null) {
                    ((View) u1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.p9 p9Var = (org.telegram.ui.Cells.p9) this.f791c;
                p9Var.getClass();
                p9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.aa aaVar = p9Var.C;
                if (aaVar != null) {
                    aaVar.invalidate();
                }
                org.telegram.ui.Cells.w9 w9Var = p9Var.W;
                if (w9Var != null && ((org.telegram.ui.Cells.u1) w9Var).getCurrentMessagesGroup() == null && this.f790b) {
                    ((org.telegram.ui.Cells.u1) p9Var.W).setSelectedBackgroundProgress(1.0f - p9Var.U);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.f791c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.setScaleX(floatValue3);
                y9Var.setScaleY(floatValue3);
                if (!this.f790b) {
                    y9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) this.f791c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g9Var.i0(floatValue4, false);
                if (this.f790b) {
                    org.telegram.ui.Components.z8 z8Var = g9Var.f26350a;
                    z8Var.f25979w = floatValue4;
                    z8Var.invalidate();
                    return;
                }
                return;
            case 6:
                w60 w60Var = (w60) this.f791c;
                if (this.f790b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (w60Var.getMeasuredHeight() / 2.0f);
                }
                w60Var.E0 = floatValue;
                w60Var.w();
                return;
            case 7:
                zb0 zb0Var = (zb0) this.f791c;
                zb0Var.getClass();
                zb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zb0Var.invalidate();
                if (this.f790b) {
                    zb0Var.requestLayout();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f791c;
                TextView[] textViewArr = w2Var.h;
                w2Var.f32092s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.invalidate();
                if (this.f790b) {
                    textViewArr[0].setAlpha(1.0f - w2Var.f32092s);
                    textViewArr[0].setScaleX(1.0f - w2Var.f32092s);
                    textViewArr[0].setScaleY(1.0f - w2Var.f32092s);
                    textViewArr[1].setAlpha(w2Var.f32092s);
                    textViewArr[1].setScaleX(w2Var.f32092s);
                    textViewArr[1].setScaleY(w2Var.f32092s);
                    return;
                }
                return;
            case 9:
                ej0 ej0Var = (ej0) this.f791c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0Var.E = floatValue5;
                ej0Var.H.setAlpha(floatValue5);
                ej0Var.K.setAlpha(ej0Var.E);
                if (!this.f790b && (viewGroup = ej0Var.Z) != null) {
                    viewGroup.setAlpha(ej0Var.E);
                }
                ej0Var.F.invalidate();
                ej0Var.G.invalidate();
                return;
            case 10:
                n51 n51Var = (n51) this.f791c;
                n51Var.f40228s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n51Var.f40218b.invalidate();
                n51Var.f40220c.invalidate();
                if (n51Var.S) {
                    n51Var.N.invalidate();
                }
                n51Var.e();
                TextView textView = n51Var.f40231y;
                if (textView != null) {
                    textView.setAlpha(n51Var.f40228s);
                }
                if (!n51Var.S && (l51Var = n51Var.N) != null && l51Var.getSeekBarWaveform() != null) {
                    tp0 seekBarWaveform = n51Var.N.getSeekBarWaveform();
                    if (this.f790b) {
                        jsVar = js.f27628g;
                    } else {
                        jsVar = js.f27629i;
                    }
                    seekBarWaveform.L = jsVar.getInterpolation(Utilities.clamp(n51Var.f40228s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f30932n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                qg.l0 l0Var = (qg.l0) this.f791c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f46270e = floatValue6;
                if (!this.f790b) {
                    l0Var.f46269c.setAlpha(1.0f - floatValue6);
                }
                l0Var.f46268b.invalidate();
                return;
            default:
                zg.a0 a0Var = (zg.a0) this.f791c;
                a0Var.f54693x = null;
                a0Var.f54680j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.k();
                a0Var.l();
                a0Var.f54684n.setCustomEmojiEnterProgress(Utilities.clamp(a0Var.f54680j, 1.0f, 0.0f));
                a0Var.f54673a.invalidate();
                a0Var.f54683m.invalidateOutline();
                if (a0Var.f54692w) {
                    a0Var.j(a0Var.f54680j, this.f790b);
                    return;
                }
                return;
        }
    }
}
