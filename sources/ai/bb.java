package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.w50;
import org.telegram.ui.bj0;
import org.telegram.ui.f51;
import org.telegram.ui.h51;
public final class bb implements ValueAnimator.AnimatorUpdateListener {
    public final int f596a;
    public final boolean f597b;
    public final Object f598c;

    public bb(int i10, Object obj, boolean z10) {
        this.f596a = i10;
        this.f598c = obj;
        this.f597b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        f51 f51Var;
        qr qrVar;
        switch (this.f596a) {
            case 0:
                db dbVar = (db) this.f598c;
                dbVar.getClass();
                dbVar.f745y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dbVar.invalidate();
                if (this.f597b) {
                    dbVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ci.o6 o6Var = (ci.o6) this.f598c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.e = floatValue2;
                if (!this.f597b) {
                    o6Var.f5129c.setAlpha(1.0f - floatValue2);
                }
                o6Var.f5128b.invalidate();
                return;
            case 2:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f598c;
                t1Var.f21111jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                if (this.f597b && t1Var.getParent() != null) {
                    ((View) t1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.r9 r9Var = (org.telegram.ui.Cells.r9) this.f598c;
                r9Var.getClass();
                r9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.ca caVar = r9Var.C;
                if (caVar != null) {
                    caVar.invalidate();
                }
                org.telegram.ui.Cells.y9 y9Var = r9Var.W;
                if (y9Var != null && ((org.telegram.ui.Cells.t1) y9Var).getCurrentMessagesGroup() == null && this.f597b) {
                    ((org.telegram.ui.Cells.t1) r9Var.W).setSelectedBackgroundProgress(1.0f - r9Var.U);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.u9 u9Var = (org.telegram.ui.Components.u9) this.f598c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9Var.setScaleX(floatValue3);
                u9Var.setScaleY(floatValue3);
                if (!this.f597b) {
                    u9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.c9 c9Var = (org.telegram.ui.Components.c9) this.f598c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c9Var.i0(floatValue4, false);
                if (this.f597b) {
                    org.telegram.ui.Components.v8 v8Var = c9Var.f22981a;
                    v8Var.f22718w = floatValue4;
                    v8Var.invalidate();
                    return;
                }
                return;
            case 6:
                w50 w50Var = (w50) this.f598c;
                if (this.f597b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (w50Var.getMeasuredHeight() / 2.0f);
                }
                w50Var.f29602u0 = floatValue;
                w50Var.s();
                return;
            case 7:
                ta0 ta0Var = (ta0) this.f598c;
                ta0Var.getClass();
                ta0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ta0Var.invalidate();
                if (this.f597b) {
                    ta0Var.requestLayout();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f598c;
                TextView[] textViewArr = v2Var.h;
                v2Var.f29318s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.invalidate();
                if (this.f597b) {
                    textViewArr[0].setAlpha(1.0f - v2Var.f29318s);
                    textViewArr[0].setScaleX(1.0f - v2Var.f29318s);
                    textViewArr[0].setScaleY(1.0f - v2Var.f29318s);
                    textViewArr[1].setAlpha(v2Var.f29318s);
                    textViewArr[1].setScaleX(v2Var.f29318s);
                    textViewArr[1].setScaleY(v2Var.f29318s);
                    return;
                }
                return;
            case 9:
                bj0 bj0Var = (bj0) this.f598c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bj0Var.E = floatValue5;
                bj0Var.H.setAlpha(floatValue5);
                bj0Var.K.setAlpha(bj0Var.E);
                if (!this.f597b && (viewGroup = bj0Var.Z) != null) {
                    viewGroup.setAlpha(bj0Var.E);
                }
                bj0Var.F.invalidate();
                bj0Var.G.invalidate();
                return;
            case 10:
                h51 h51Var = (h51) this.f598c;
                h51Var.f34170s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h51Var.f34161b.invalidate();
                h51Var.f34163c.invalidate();
                if (h51Var.S) {
                    h51Var.N.invalidate();
                }
                h51Var.e();
                TextView textView = h51Var.f34173y;
                if (textView != null) {
                    textView.setAlpha(h51Var.f34170s);
                }
                if (!h51Var.S && (f51Var = h51Var.N) != null && f51Var.getSeekBarWaveform() != null) {
                    io0 seekBarWaveform = h51Var.N.getSeekBarWaveform();
                    if (this.f597b) {
                        qrVar = qr.f27424g;
                    } else {
                        qrVar = qr.f27425i;
                    }
                    seekBarWaveform.L = qrVar.getInterpolation(Utilities.clamp(h51Var.f34170s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.f25103n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                qg.o0 o0Var = (qg.o0) this.f598c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.e = floatValue6;
                if (!this.f597b) {
                    o0Var.f41502c.setAlpha(1.0f - floatValue6);
                }
                o0Var.f41501b.invalidate();
                return;
            default:
                zg.c0 c0Var = (zg.c0) this.f598c;
                c0Var.f49002x = null;
                c0Var.f48989j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0Var.k();
                c0Var.l();
                c0Var.f48993n.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.f48989j, 1.0f, 0.0f));
                c0Var.f48983a.invalidate();
                c0Var.f48992m.invalidateOutline();
                if (c0Var.f49001w) {
                    c0Var.j(c0Var.f48989j, this.f597b);
                    return;
                }
                return;
        }
    }
}
