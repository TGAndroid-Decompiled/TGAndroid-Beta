package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.cj0;
import org.telegram.ui.h51;
import org.telegram.ui.j51;
public final class cb implements ValueAnimator.AnimatorUpdateListener {
    public final int f791a;
    public final boolean f792b;
    public final Object f793c;

    public cb(int i10, Object obj, boolean z10) {
        this.f791a = i10;
        this.f793c = obj;
        this.f792b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        h51 h51Var;
        is isVar;
        switch (this.f791a) {
            case 0:
                eb ebVar = (eb) this.f793c;
                ebVar.getClass();
                ebVar.f930y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ebVar.invalidate();
                if (this.f792b) {
                    ebVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ci.n6 n6Var = (ci.n6) this.f793c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.f5639e = floatValue2;
                if (!this.f792b) {
                    n6Var.f5638c.setAlpha(1.0f - floatValue2);
                }
                n6Var.f5637b.invalidate();
                return;
            case 2:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f793c;
                u1Var.f23239jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                if (this.f792b && u1Var.getParent() != null) {
                    ((View) u1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.p9 p9Var = (org.telegram.ui.Cells.p9) this.f793c;
                p9Var.getClass();
                p9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.aa aaVar = p9Var.C;
                if (aaVar != null) {
                    aaVar.invalidate();
                }
                org.telegram.ui.Cells.w9 w9Var = p9Var.W;
                if (w9Var != null && ((org.telegram.ui.Cells.u1) w9Var).getCurrentMessagesGroup() == null && this.f792b) {
                    ((org.telegram.ui.Cells.u1) p9Var.W).setSelectedBackgroundProgress(1.0f - p9Var.U);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.f793c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.setScaleX(floatValue3);
                y9Var.setScaleY(floatValue3);
                if (!this.f792b) {
                    y9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) this.f793c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g9Var.i0(floatValue4, false);
                if (this.f792b) {
                    org.telegram.ui.Components.z8 z8Var = g9Var.f26633a;
                    z8Var.f26300w = floatValue4;
                    z8Var.invalidate();
                    return;
                }
                return;
            case 6:
                u60 u60Var = (u60) this.f793c;
                if (this.f792b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (u60Var.getMeasuredHeight() / 2.0f);
                }
                u60Var.E0 = floatValue;
                u60Var.w();
                return;
            case 7:
                wb0 wb0Var = (wb0) this.f793c;
                wb0Var.getClass();
                wb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wb0Var.invalidate();
                if (this.f792b) {
                    wb0Var.requestLayout();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f793c;
                TextView[] textViewArr = w2Var.h;
                w2Var.f32392s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.invalidate();
                if (this.f792b) {
                    textViewArr[0].setAlpha(1.0f - w2Var.f32392s);
                    textViewArr[0].setScaleX(1.0f - w2Var.f32392s);
                    textViewArr[0].setScaleY(1.0f - w2Var.f32392s);
                    textViewArr[1].setAlpha(w2Var.f32392s);
                    textViewArr[1].setScaleX(w2Var.f32392s);
                    textViewArr[1].setScaleY(w2Var.f32392s);
                    return;
                }
                return;
            case 9:
                cj0 cj0Var = (cj0) this.f793c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cj0Var.E = floatValue5;
                cj0Var.H.setAlpha(floatValue5);
                cj0Var.K.setAlpha(cj0Var.E);
                if (!this.f792b && (viewGroup = cj0Var.Z) != null) {
                    viewGroup.setAlpha(cj0Var.E);
                }
                cj0Var.F.invalidate();
                cj0Var.G.invalidate();
                return;
            case 10:
                j51 j51Var = (j51) this.f793c;
                j51Var.f38853s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j51Var.f38843b.invalidate();
                j51Var.f38845c.invalidate();
                if (j51Var.S) {
                    j51Var.N.invalidate();
                }
                j51Var.e();
                TextView textView = j51Var.f38856y;
                if (textView != null) {
                    textView.setAlpha(j51Var.f38853s);
                }
                if (!j51Var.S && (h51Var = j51Var.N) != null && h51Var.getSeekBarWaveform() != null) {
                    pp0 seekBarWaveform = j51Var.N.getSeekBarWaveform();
                    if (this.f792b) {
                        isVar = is.f27452g;
                    } else {
                        isVar = is.f27453i;
                    }
                    seekBarWaveform.L = isVar.getInterpolation(Utilities.clamp(j51Var.f38853s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f29805n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                qg.l0 l0Var = (qg.l0) this.f793c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.f46427e = floatValue6;
                if (!this.f792b) {
                    l0Var.f46426c.setAlpha(1.0f - floatValue6);
                }
                l0Var.f46425b.invalidate();
                return;
            default:
                zg.a0 a0Var = (zg.a0) this.f793c;
                a0Var.f54556x = null;
                a0Var.f54543j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.k();
                a0Var.l();
                a0Var.f54547n.setCustomEmojiEnterProgress(Utilities.clamp(a0Var.f54543j, 1.0f, 0.0f));
                a0Var.f54536a.invalidate();
                a0Var.f54546m.invalidateOutline();
                if (a0Var.f54555w) {
                    a0Var.j(a0Var.f54543j, this.f792b);
                    return;
                }
                return;
        }
    }
}
