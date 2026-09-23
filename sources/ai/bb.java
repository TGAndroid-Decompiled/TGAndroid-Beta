package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.x50;
import org.telegram.ui.a51;
import org.telegram.ui.wi0;
import org.telegram.ui.y41;
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
        y41 y41Var;
        rr rrVar;
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
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f618c;
                t1Var.f21081jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                if (this.f617b && t1Var.getParent() != null) {
                    ((View) t1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) this.f618c;
                s9Var.getClass();
                s9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.da daVar = s9Var.C;
                if (daVar != null) {
                    daVar.invalidate();
                }
                org.telegram.ui.Cells.z9 z9Var = s9Var.W;
                if (z9Var != null && ((org.telegram.ui.Cells.t1) z9Var).getCurrentMessagesGroup() == null && this.f617b) {
                    ((org.telegram.ui.Cells.t1) s9Var.W).setSelectedBackgroundProgress(1.0f - s9Var.U);
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
                    org.telegram.ui.Components.x8 x8Var = e9Var.f23607a;
                    x8Var.f23332w = floatValue4;
                    x8Var.invalidate();
                    return;
                }
                return;
            case 6:
                x50 x50Var = (x50) this.f618c;
                if (this.f617b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (x50Var.getMeasuredHeight() / 2.0f);
                }
                x50Var.f29916u0 = floatValue;
                x50Var.s();
                return;
            case 7:
                ua0 ua0Var = (ua0) this.f618c;
                ua0Var.getClass();
                ua0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ua0Var.invalidate();
                if (this.f617b) {
                    ua0Var.requestLayout();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f618c;
                TextView[] textViewArr = v2Var.h;
                v2Var.f29289s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.invalidate();
                if (this.f617b) {
                    textViewArr[0].setAlpha(1.0f - v2Var.f29289s);
                    textViewArr[0].setScaleX(1.0f - v2Var.f29289s);
                    textViewArr[0].setScaleY(1.0f - v2Var.f29289s);
                    textViewArr[1].setAlpha(v2Var.f29289s);
                    textViewArr[1].setScaleX(v2Var.f29289s);
                    textViewArr[1].setScaleY(v2Var.f29289s);
                    return;
                }
                return;
            case 9:
                wi0 wi0Var = (wi0) this.f618c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi0Var.E = floatValue5;
                wi0Var.H.setAlpha(floatValue5);
                wi0Var.K.setAlpha(wi0Var.E);
                if (!this.f617b && (viewGroup = wi0Var.Z) != null) {
                    viewGroup.setAlpha(wi0Var.E);
                }
                wi0Var.F.invalidate();
                wi0Var.G.invalidate();
                return;
            case 10:
                a51 a51Var = (a51) this.f618c;
                a51Var.f31677s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a51Var.f31668b.invalidate();
                a51Var.f31670c.invalidate();
                if (a51Var.S) {
                    a51Var.N.invalidate();
                }
                a51Var.e();
                TextView textView = a51Var.f31680y;
                if (textView != null) {
                    textView.setAlpha(a51Var.f31677s);
                }
                if (!a51Var.S && (y41Var = a51Var.N) != null && y41Var.getSeekBarWaveform() != null) {
                    io0 seekBarWaveform = a51Var.N.getSeekBarWaveform();
                    if (this.f617b) {
                        rrVar = rr.f27702g;
                    } else {
                        rrVar = rr.f27703i;
                    }
                    seekBarWaveform.L = rrVar.getInterpolation(Utilities.clamp(a51Var.f31677s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.f25027n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                qg.o0 o0Var = (qg.o0) this.f618c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.e = floatValue6;
                if (!this.f617b) {
                    o0Var.f41454c.setAlpha(1.0f - floatValue6);
                }
                o0Var.f41453b.invalidate();
                return;
            default:
                zg.c0 c0Var = (zg.c0) this.f618c;
                c0Var.f48946x = null;
                c0Var.f48933j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0Var.k();
                c0Var.l();
                c0Var.f48937n.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.f48933j, 1.0f, 0.0f));
                c0Var.f48927a.invalidate();
                c0Var.f48936m.invalidateOutline();
                if (c0Var.f48945w) {
                    c0Var.j(c0Var.f48933j, this.f617b);
                    return;
                }
                return;
        }
    }
}
