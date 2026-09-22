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
import org.telegram.ui.g51;
import org.telegram.ui.i51;
public final class bb implements ValueAnimator.AnimatorUpdateListener {
    public final int f598a;
    public final boolean f599b;
    public final Object f600c;

    public bb(int i10, Object obj, boolean z10) {
        this.f598a = i10;
        this.f600c = obj;
        this.f599b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        g51 g51Var;
        qr qrVar;
        switch (this.f598a) {
            case 0:
                db dbVar = (db) this.f600c;
                dbVar.getClass();
                dbVar.f747y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dbVar.invalidate();
                if (this.f599b) {
                    dbVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ci.o6 o6Var = (ci.o6) this.f600c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.e = floatValue2;
                if (!this.f599b) {
                    o6Var.f5131c.setAlpha(1.0f - floatValue2);
                }
                o6Var.f5130b.invalidate();
                return;
            case 2:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f600c;
                t1Var.f21094jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                if (this.f599b && t1Var.getParent() != null) {
                    ((View) t1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.r9 r9Var = (org.telegram.ui.Cells.r9) this.f600c;
                r9Var.getClass();
                r9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.ca caVar = r9Var.C;
                if (caVar != null) {
                    caVar.invalidate();
                }
                org.telegram.ui.Cells.y9 y9Var = r9Var.W;
                if (y9Var != null && ((org.telegram.ui.Cells.t1) y9Var).getCurrentMessagesGroup() == null && this.f599b) {
                    ((org.telegram.ui.Cells.t1) r9Var.W).setSelectedBackgroundProgress(1.0f - r9Var.U);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.u9 u9Var = (org.telegram.ui.Components.u9) this.f600c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9Var.setScaleX(floatValue3);
                u9Var.setScaleY(floatValue3);
                if (!this.f599b) {
                    u9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.c9 c9Var = (org.telegram.ui.Components.c9) this.f600c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c9Var.i0(floatValue4, false);
                if (this.f599b) {
                    org.telegram.ui.Components.v8 v8Var = c9Var.f22979a;
                    v8Var.f22714w = floatValue4;
                    v8Var.invalidate();
                    return;
                }
                return;
            case 6:
                w50 w50Var = (w50) this.f600c;
                if (this.f599b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (w50Var.getMeasuredHeight() / 2.0f);
                }
                w50Var.f29599u0 = floatValue;
                w50Var.s();
                return;
            case 7:
                ta0 ta0Var = (ta0) this.f600c;
                ta0Var.getClass();
                ta0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ta0Var.invalidate();
                if (this.f599b) {
                    ta0Var.requestLayout();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f600c;
                TextView[] textViewArr = v2Var.h;
                v2Var.f29315s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.invalidate();
                if (this.f599b) {
                    textViewArr[0].setAlpha(1.0f - v2Var.f29315s);
                    textViewArr[0].setScaleX(1.0f - v2Var.f29315s);
                    textViewArr[0].setScaleY(1.0f - v2Var.f29315s);
                    textViewArr[1].setAlpha(v2Var.f29315s);
                    textViewArr[1].setScaleX(v2Var.f29315s);
                    textViewArr[1].setScaleY(v2Var.f29315s);
                    return;
                }
                return;
            case 9:
                bj0 bj0Var = (bj0) this.f600c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bj0Var.E = floatValue5;
                bj0Var.H.setAlpha(floatValue5);
                bj0Var.K.setAlpha(bj0Var.E);
                if (!this.f599b && (viewGroup = bj0Var.Z) != null) {
                    viewGroup.setAlpha(bj0Var.E);
                }
                bj0Var.F.invalidate();
                bj0Var.G.invalidate();
                return;
            case 10:
                i51 i51Var = (i51) this.f600c;
                i51Var.f34423s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i51Var.f34414b.invalidate();
                i51Var.f34416c.invalidate();
                if (i51Var.S) {
                    i51Var.N.invalidate();
                }
                i51Var.e();
                TextView textView = i51Var.f34426y;
                if (textView != null) {
                    textView.setAlpha(i51Var.f34423s);
                }
                if (!i51Var.S && (g51Var = i51Var.N) != null && g51Var.getSeekBarWaveform() != null) {
                    io0 seekBarWaveform = i51Var.N.getSeekBarWaveform();
                    if (this.f599b) {
                        qrVar = qr.f27421g;
                    } else {
                        qrVar = qr.f27422i;
                    }
                    seekBarWaveform.L = qrVar.getInterpolation(Utilities.clamp(i51Var.f34423s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.f25100n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                qg.o0 o0Var = (qg.o0) this.f600c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.e = floatValue6;
                if (!this.f599b) {
                    o0Var.f41498c.setAlpha(1.0f - floatValue6);
                }
                o0Var.f41497b.invalidate();
                return;
            default:
                zg.c0 c0Var = (zg.c0) this.f600c;
                c0Var.f48995x = null;
                c0Var.f48982j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0Var.k();
                c0Var.l();
                c0Var.f48986n.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.f48982j, 1.0f, 0.0f));
                c0Var.f48976a.invalidate();
                c0Var.f48985m.invalidateOutline();
                if (c0Var.f48994w) {
                    c0Var.j(c0Var.f48982j, this.f599b);
                    return;
                }
                return;
        }
    }
}
