package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.w50;
import org.telegram.ui.dj0;
import org.telegram.ui.i51;
import org.telegram.ui.k51;
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
        i51 i51Var;
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
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f603c;
                t1Var.f21122jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                if (this.f602b && t1Var.getParent() != null) {
                    ((View) t1Var.getParent()).invalidate();
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
                if (y9Var != null && ((org.telegram.ui.Cells.t1) y9Var).getCurrentMessagesGroup() == null && this.f602b) {
                    ((org.telegram.ui.Cells.t1) r9Var.W).setSelectedBackgroundProgress(1.0f - r9Var.U);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.u9 u9Var = (org.telegram.ui.Components.u9) this.f603c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9Var.setScaleX(floatValue3);
                u9Var.setScaleY(floatValue3);
                if (!this.f602b) {
                    u9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.c9 c9Var = (org.telegram.ui.Components.c9) this.f603c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c9Var.i0(floatValue4, false);
                if (this.f602b) {
                    org.telegram.ui.Components.v8 v8Var = c9Var.f22966a;
                    v8Var.f22669w = floatValue4;
                    v8Var.invalidate();
                    return;
                }
                return;
            case 6:
                w50 w50Var = (w50) this.f603c;
                if (this.f602b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (w50Var.getMeasuredHeight() / 2.0f);
                }
                w50Var.f29560u0 = floatValue;
                w50Var.s();
                return;
            case 7:
                ta0 ta0Var = (ta0) this.f603c;
                ta0Var.getClass();
                ta0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ta0Var.invalidate();
                if (this.f602b) {
                    ta0Var.requestLayout();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f603c;
                TextView[] textViewArr = v2Var.h;
                v2Var.f29298s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.invalidate();
                if (this.f602b) {
                    textViewArr[0].setAlpha(1.0f - v2Var.f29298s);
                    textViewArr[0].setScaleX(1.0f - v2Var.f29298s);
                    textViewArr[0].setScaleY(1.0f - v2Var.f29298s);
                    textViewArr[1].setAlpha(v2Var.f29298s);
                    textViewArr[1].setScaleX(v2Var.f29298s);
                    textViewArr[1].setScaleY(v2Var.f29298s);
                    return;
                }
                return;
            case 9:
                dj0 dj0Var = (dj0) this.f603c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dj0Var.E = floatValue5;
                dj0Var.H.setAlpha(floatValue5);
                dj0Var.K.setAlpha(dj0Var.E);
                if (!this.f602b && (viewGroup = dj0Var.Z) != null) {
                    viewGroup.setAlpha(dj0Var.E);
                }
                dj0Var.F.invalidate();
                dj0Var.G.invalidate();
                return;
            case 10:
                k51 k51Var = (k51) this.f603c;
                k51Var.f35010s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k51Var.f35001b.invalidate();
                k51Var.f35003c.invalidate();
                if (k51Var.S) {
                    k51Var.N.invalidate();
                }
                k51Var.e();
                TextView textView = k51Var.f35013y;
                if (textView != null) {
                    textView.setAlpha(k51Var.f35010s);
                }
                if (!k51Var.S && (i51Var = k51Var.N) != null && i51Var.getSeekBarWaveform() != null) {
                    jo0 seekBarWaveform = k51Var.N.getSeekBarWaveform();
                    if (this.f602b) {
                        qrVar = qr.f27384g;
                    } else {
                        qrVar = qr.f27385i;
                    }
                    seekBarWaveform.L = qrVar.getInterpolation(Utilities.clamp(k51Var.f35010s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.f25388n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                qg.o0 o0Var = (qg.o0) this.f603c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.e = floatValue6;
                if (!this.f602b) {
                    o0Var.f41529c.setAlpha(1.0f - floatValue6);
                }
                o0Var.f41528b.invalidate();
                return;
            default:
                zg.c0 c0Var = (zg.c0) this.f603c;
                c0Var.f49030x = null;
                c0Var.f49017j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0Var.k();
                c0Var.l();
                c0Var.f49021n.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.f49017j, 1.0f, 0.0f));
                c0Var.f49011a.invalidate();
                c0Var.f49020m.invalidateOutline();
                if (c0Var.f49029w) {
                    c0Var.j(c0Var.f49017j, this.f602b);
                    return;
                }
                return;
        }
    }
}
