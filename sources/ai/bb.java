package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.dj0;
import org.telegram.ui.j51;
import org.telegram.ui.l51;
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
        j51 j51Var;
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
                    o6Var.f5133c.setAlpha(1.0f - floatValue2);
                }
                o6Var.f5132b.invalidate();
                return;
            case 2:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f600c;
                u1Var.f21379jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                if (this.f599b && u1Var.getParent() != null) {
                    ((View) u1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) this.f600c;
                s9Var.getClass();
                s9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.da daVar = s9Var.C;
                if (daVar != null) {
                    daVar.invalidate();
                }
                org.telegram.ui.Cells.z9 z9Var = s9Var.W;
                if (z9Var != null && ((org.telegram.ui.Cells.u1) z9Var).getCurrentMessagesGroup() == null && this.f599b) {
                    ((org.telegram.ui.Cells.u1) s9Var.W).setSelectedBackgroundProgress(1.0f - s9Var.U);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.f600c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9Var.setScaleX(floatValue3);
                v9Var.setScaleY(floatValue3);
                if (!this.f599b) {
                    v9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) this.f600c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d9Var.i0(floatValue4, false);
                if (this.f599b) {
                    org.telegram.ui.Components.w8 w8Var = d9Var.f23604a;
                    w8Var.f23311w = floatValue4;
                    w8Var.invalidate();
                    return;
                }
                return;
            case 6:
                c60 c60Var = (c60) this.f600c;
                if (this.f599b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (c60Var.getMeasuredHeight() / 2.0f);
                }
                c60Var.f23260z0 = floatValue;
                c60Var.v();
                return;
            case 7:
                eb0 eb0Var = (eb0) this.f600c;
                eb0Var.getClass();
                eb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eb0Var.invalidate();
                if (this.f599b) {
                    eb0Var.requestLayout();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f600c;
                TextView[] textViewArr = v2Var.h;
                v2Var.f29683s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.invalidate();
                if (this.f599b) {
                    textViewArr[0].setAlpha(1.0f - v2Var.f29683s);
                    textViewArr[0].setScaleX(1.0f - v2Var.f29683s);
                    textViewArr[0].setScaleY(1.0f - v2Var.f29683s);
                    textViewArr[1].setAlpha(v2Var.f29683s);
                    textViewArr[1].setScaleX(v2Var.f29683s);
                    textViewArr[1].setScaleY(v2Var.f29683s);
                    return;
                }
                return;
            case 9:
                dj0 dj0Var = (dj0) this.f600c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dj0Var.E = floatValue5;
                dj0Var.H.setAlpha(floatValue5);
                dj0Var.K.setAlpha(dj0Var.E);
                if (!this.f599b && (viewGroup = dj0Var.Z) != null) {
                    viewGroup.setAlpha(dj0Var.E);
                }
                dj0Var.F.invalidate();
                dj0Var.G.invalidate();
                return;
            case 10:
                l51 l51Var = (l51) this.f600c;
                l51Var.f35336s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l51Var.f35327b.invalidate();
                l51Var.f35329c.invalidate();
                if (l51Var.S) {
                    l51Var.N.invalidate();
                }
                l51Var.e();
                TextView textView = l51Var.f35339y;
                if (textView != null) {
                    textView.setAlpha(l51Var.f35336s);
                }
                if (!l51Var.S && (j51Var = l51Var.N) != null && j51Var.getSeekBarWaveform() != null) {
                    xo0 seekBarWaveform = l51Var.N.getSeekBarWaveform();
                    if (this.f599b) {
                        qrVar = qr.f27654g;
                    } else {
                        qrVar = qr.f27655i;
                    }
                    seekBarWaveform.L = qrVar.getInterpolation(Utilities.clamp(l51Var.f35336s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f30370n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                qg.m0 m0Var = (qg.m0) this.f600c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.e = floatValue6;
                if (!this.f599b) {
                    m0Var.f41793c.setAlpha(1.0f - floatValue6);
                }
                m0Var.f41792b.invalidate();
                return;
            default:
                zg.c0 c0Var = (zg.c0) this.f600c;
                c0Var.f49322x = null;
                c0Var.f49309j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0Var.k();
                c0Var.l();
                c0Var.f49313n.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.f49309j, 1.0f, 0.0f));
                c0Var.f49303a.invalidate();
                c0Var.f49312m.invalidateOutline();
                if (c0Var.f49321w) {
                    c0Var.j(c0Var.f49309j, this.f599b);
                    return;
                }
                return;
        }
    }
}
