package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.cj0;
import org.telegram.ui.g51;
import org.telegram.ui.i51;
public final class bb implements ValueAnimator.AnimatorUpdateListener {
    public final int f601a;
    public final boolean f602b;
    public final Object f603c;

    public bb(int i10, Object obj, boolean z10) {
        this.f601a = i10;
        this.f603c = obj;
        this.f602b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        g51 g51Var;
        qr qrVar;
        switch (this.f601a) {
            case 0:
                db dbVar = (db) this.f603c;
                dbVar.getClass();
                dbVar.f750y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dbVar.invalidate();
                if (this.f602b) {
                    dbVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ci.o6 o6Var = (ci.o6) this.f603c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.e = floatValue2;
                if (!this.f602b) {
                    o6Var.f5134c.setAlpha(1.0f - floatValue2);
                }
                o6Var.f5133b.invalidate();
                return;
            case 2:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f603c;
                u1Var.f21361jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                if (this.f602b && u1Var.getParent() != null) {
                    ((View) u1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.r9 r9Var = (org.telegram.ui.Cells.r9) this.f603c;
                r9Var.getClass();
                r9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.ca caVar = r9Var.C;
                if (caVar != null) {
                    caVar.invalidate();
                }
                org.telegram.ui.Cells.y9 y9Var = r9Var.W;
                if (y9Var != null && ((org.telegram.ui.Cells.u1) y9Var).getCurrentMessagesGroup() == null && this.f602b) {
                    ((org.telegram.ui.Cells.u1) r9Var.W).setSelectedBackgroundProgress(1.0f - r9Var.U);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f603c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue3);
                w9Var.setScaleY(floatValue3);
                if (!this.f602b) {
                    w9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) this.f603c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e9Var.i0(floatValue4, false);
                if (this.f602b) {
                    org.telegram.ui.Components.x8 x8Var = e9Var.f23811a;
                    x8Var.f23496w = floatValue4;
                    x8Var.invalidate();
                    return;
                }
                return;
            case 6:
                b60 b60Var = (b60) this.f603c;
                if (this.f602b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (b60Var.getMeasuredHeight() / 2.0f);
                }
                b60Var.f22861x0 = floatValue;
                b60Var.w();
                return;
            case 7:
                cb0 cb0Var = (cb0) this.f603c;
                cb0Var.getClass();
                cb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cb0Var.invalidate();
                if (this.f602b) {
                    cb0Var.requestLayout();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f603c;
                TextView[] textViewArr = v2Var.h;
                v2Var.f29614s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.invalidate();
                if (this.f602b) {
                    textViewArr[0].setAlpha(1.0f - v2Var.f29614s);
                    textViewArr[0].setScaleX(1.0f - v2Var.f29614s);
                    textViewArr[0].setScaleY(1.0f - v2Var.f29614s);
                    textViewArr[1].setAlpha(v2Var.f29614s);
                    textViewArr[1].setScaleX(v2Var.f29614s);
                    textViewArr[1].setScaleY(v2Var.f29614s);
                    return;
                }
                return;
            case 9:
                cj0 cj0Var = (cj0) this.f603c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cj0Var.E = floatValue5;
                cj0Var.H.setAlpha(floatValue5);
                cj0Var.K.setAlpha(cj0Var.E);
                if (!this.f602b && (viewGroup = cj0Var.Z) != null) {
                    viewGroup.setAlpha(cj0Var.E);
                }
                cj0Var.F.invalidate();
                cj0Var.G.invalidate();
                return;
            case 10:
                i51 i51Var = (i51) this.f603c;
                i51Var.f34324s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i51Var.f34315b.invalidate();
                i51Var.f34317c.invalidate();
                if (i51Var.S) {
                    i51Var.N.invalidate();
                }
                i51Var.e();
                TextView textView = i51Var.f34327y;
                if (textView != null) {
                    textView.setAlpha(i51Var.f34324s);
                }
                if (!i51Var.S && (g51Var = i51Var.N) != null && g51Var.getSeekBarWaveform() != null) {
                    wo0 seekBarWaveform = i51Var.N.getSeekBarWaveform();
                    if (this.f602b) {
                        qrVar = qr.f27716g;
                    } else {
                        qrVar = qr.f27717i;
                    }
                    seekBarWaveform.L = qrVar.getInterpolation(Utilities.clamp(i51Var.f34324s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f30133n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                qg.l0 l0Var = (qg.l0) this.f603c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.e = floatValue6;
                if (!this.f602b) {
                    l0Var.f41725c.setAlpha(1.0f - floatValue6);
                }
                l0Var.f41724b.invalidate();
                return;
            default:
                zg.b0 b0Var = (zg.b0) this.f603c;
                b0Var.f49245x = null;
                b0Var.f49232j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.k();
                b0Var.l();
                b0Var.f49236n.setCustomEmojiEnterProgress(Utilities.clamp(b0Var.f49232j, 1.0f, 0.0f));
                b0Var.f49226a.invalidate();
                b0Var.f49235m.invalidateOutline();
                if (b0Var.f49244w) {
                    b0Var.j(b0Var.f49232j, this.f602b);
                    return;
                }
                return;
        }
    }
}
