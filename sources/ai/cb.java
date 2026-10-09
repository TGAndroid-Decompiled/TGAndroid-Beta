package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.np0;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.dj0;
import org.telegram.ui.i51;
import org.telegram.ui.k51;
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
        i51 i51Var;
        hs hsVar;
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
                n6Var.f5640e = floatValue2;
                if (!this.f792b) {
                    n6Var.f5639c.setAlpha(1.0f - floatValue2);
                }
                n6Var.f5638b.invalidate();
                return;
            case 2:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f793c;
                u1Var.f23247jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                    org.telegram.ui.Components.z8 z8Var = g9Var.f26623a;
                    z8Var.f26314w = floatValue4;
                    z8Var.invalidate();
                    return;
                }
                return;
            case 6:
                t60 t60Var = (t60) this.f793c;
                if (this.f792b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (t60Var.getMeasuredHeight() / 2.0f);
                }
                t60Var.E0 = floatValue;
                t60Var.w();
                return;
            case 7:
                vb0 vb0Var = (vb0) this.f793c;
                vb0Var.getClass();
                vb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vb0Var.invalidate();
                if (this.f792b) {
                    vb0Var.requestLayout();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f793c;
                TextView[] textViewArr = v2Var.h;
                v2Var.f32333s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.invalidate();
                if (this.f792b) {
                    textViewArr[0].setAlpha(1.0f - v2Var.f32333s);
                    textViewArr[0].setScaleX(1.0f - v2Var.f32333s);
                    textViewArr[0].setScaleY(1.0f - v2Var.f32333s);
                    textViewArr[1].setAlpha(v2Var.f32333s);
                    textViewArr[1].setScaleX(v2Var.f32333s);
                    textViewArr[1].setScaleY(v2Var.f32333s);
                    return;
                }
                return;
            case 9:
                dj0 dj0Var = (dj0) this.f793c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dj0Var.E = floatValue5;
                dj0Var.H.setAlpha(floatValue5);
                dj0Var.K.setAlpha(dj0Var.E);
                if (!this.f792b && (viewGroup = dj0Var.Z) != null) {
                    viewGroup.setAlpha(dj0Var.E);
                }
                dj0Var.F.invalidate();
                dj0Var.G.invalidate();
                return;
            case 10:
                k51 k51Var = (k51) this.f793c;
                k51Var.f39099s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51Var.f39089b.invalidate();
                k51Var.f39091c.invalidate();
                if (k51Var.S) {
                    k51Var.N.invalidate();
                }
                k51Var.e();
                TextView textView = k51Var.f39102y;
                if (textView != null) {
                    textView.setAlpha(k51Var.f39099s);
                }
                if (!k51Var.S && (i51Var = k51Var.N) != null && i51Var.getSeekBarWaveform() != null) {
                    np0 seekBarWaveform = k51Var.N.getSeekBarWaveform();
                    if (this.f792b) {
                        hsVar = hs.f27119g;
                    } else {
                        hsVar = hs.f27120i;
                    }
                    seekBarWaveform.L = hsVar.getInterpolation(Utilities.clamp(k51Var.f39099s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f29243n;
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
                l0Var.f46333e = floatValue6;
                if (!this.f792b) {
                    l0Var.f46332c.setAlpha(1.0f - floatValue6);
                }
                l0Var.f46331b.invalidate();
                return;
            default:
                zg.a0 a0Var = (zg.a0) this.f793c;
                a0Var.f54469x = null;
                a0Var.f54456j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.k();
                a0Var.l();
                a0Var.f54460n.setCustomEmojiEnterProgress(Utilities.clamp(a0Var.f54456j, 1.0f, 0.0f));
                a0Var.f54449a.invalidate();
                a0Var.f54459m.invalidateOutline();
                if (a0Var.f54468w) {
                    a0Var.j(a0Var.f54456j, this.f792b);
                    return;
                }
                return;
        }
    }
}
