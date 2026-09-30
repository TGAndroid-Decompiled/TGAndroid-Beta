package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.b51;
import org.telegram.ui.vi0;
import org.telegram.ui.z41;
public final class bb implements ValueAnimator.AnimatorUpdateListener {
    public final int f616a;
    public final boolean f617b;
    public final Object f618c;

    public bb(int i10, Object obj, boolean z10) {
        this.f616a = i10;
        this.f618c = obj;
        this.f617b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        z41 z41Var;
        sr srVar;
        switch (this.f616a) {
            case 0:
                db dbVar = (db) this.f618c;
                dbVar.getClass();
                dbVar.f754y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dbVar.invalidate();
                if (this.f617b) {
                    dbVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ci.n6 n6Var = (ci.n6) this.f618c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.e = floatValue2;
                if (!this.f617b) {
                    n6Var.f5209c.setAlpha(1.0f - floatValue2);
                }
                n6Var.f5208b.invalidate();
                return;
            case 2:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f618c;
                u1Var.f21398jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                if (this.f617b && u1Var.getParent() != null) {
                    ((View) u1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.r9 r9Var = (org.telegram.ui.Cells.r9) this.f618c;
                r9Var.getClass();
                r9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.ca caVar = r9Var.C;
                if (caVar != null) {
                    caVar.invalidate();
                }
                org.telegram.ui.Cells.y9 y9Var = r9Var.W;
                if (y9Var != null && ((org.telegram.ui.Cells.u1) y9Var).getCurrentMessagesGroup() == null && this.f617b) {
                    ((org.telegram.ui.Cells.u1) r9Var.W).setSelectedBackgroundProgress(1.0f - r9Var.U);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f618c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue3);
                w9Var.setScaleY(floatValue3);
                if (!this.f617b) {
                    w9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) this.f618c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e9Var.i0(floatValue4, false);
                if (this.f617b) {
                    org.telegram.ui.Components.x8 x8Var = e9Var.f23941a;
                    x8Var.f23598w = floatValue4;
                    x8Var.invalidate();
                    return;
                }
                return;
            case 6:
                e60 e60Var = (e60) this.f618c;
                if (this.f617b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (e60Var.getMeasuredHeight() / 2.0f);
                }
                e60Var.f23907z0 = floatValue;
                e60Var.v();
                return;
            case 7:
                hb0 hb0Var = (hb0) this.f618c;
                hb0Var.getClass();
                hb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hb0Var.invalidate();
                if (this.f617b) {
                    hb0Var.requestLayout();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f618c;
                TextView[] textViewArr = w2Var.h;
                w2Var.f29642s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.invalidate();
                if (this.f617b) {
                    textViewArr[0].setAlpha(1.0f - w2Var.f29642s);
                    textViewArr[0].setScaleX(1.0f - w2Var.f29642s);
                    textViewArr[0].setScaleY(1.0f - w2Var.f29642s);
                    textViewArr[1].setAlpha(w2Var.f29642s);
                    textViewArr[1].setScaleX(w2Var.f29642s);
                    textViewArr[1].setScaleY(w2Var.f29642s);
                    return;
                }
                return;
            case 9:
                vi0 vi0Var = (vi0) this.f618c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi0Var.E = floatValue5;
                vi0Var.H.setAlpha(floatValue5);
                vi0Var.K.setAlpha(vi0Var.E);
                if (!this.f617b && (viewGroup = vi0Var.Z) != null) {
                    viewGroup.setAlpha(vi0Var.E);
                }
                vi0Var.F.invalidate();
                vi0Var.G.invalidate();
                return;
            case 10:
                b51 b51Var = (b51) this.f618c;
                b51Var.f32335s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b51Var.f32326b.invalidate();
                b51Var.f32328c.invalidate();
                if (b51Var.S) {
                    b51Var.N.invalidate();
                }
                b51Var.e();
                TextView textView = b51Var.f32338y;
                if (textView != null) {
                    textView.setAlpha(b51Var.f32335s);
                }
                if (!b51Var.S && (z41Var = b51Var.N) != null && z41Var.getSeekBarWaveform() != null) {
                    xo0 seekBarWaveform = b51Var.N.getSeekBarWaveform();
                    if (this.f617b) {
                        srVar = sr.f28347g;
                    } else {
                        srVar = sr.f28348i;
                    }
                    seekBarWaveform.L = srVar.getInterpolation(Utilities.clamp(b51Var.f32335s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f30425n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                qg.m0 m0Var = (qg.m0) this.f618c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.e = floatValue6;
                if (!this.f617b) {
                    m0Var.f41760c.setAlpha(1.0f - floatValue6);
                }
                m0Var.f41759b.invalidate();
                return;
            default:
                zg.b0 b0Var = (zg.b0) this.f618c;
                b0Var.f49266x = null;
                b0Var.f49253j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.k();
                b0Var.l();
                b0Var.f49257n.setCustomEmojiEnterProgress(Utilities.clamp(b0Var.f49253j, 1.0f, 0.0f));
                b0Var.f49247a.invalidate();
                b0Var.f49256m.invalidateOutline();
                if (b0Var.f49265w) {
                    b0Var.j(b0Var.f49253j, this.f617b);
                    return;
                }
                return;
        }
    }
}
