package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.dj0;
import org.telegram.ui.j51;
import org.telegram.ui.l51;
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
        j51 j51Var;
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
                    o6Var.f5135c.setAlpha(1.0f - floatValue2);
                }
                o6Var.f5134b.invalidate();
                return;
            case 2:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f603c;
                u1Var.f21364jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                if (this.f602b && u1Var.getParent() != null) {
                    ((View) u1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) this.f603c;
                s9Var.getClass();
                s9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.da daVar = s9Var.C;
                if (daVar != null) {
                    daVar.invalidate();
                }
                org.telegram.ui.Cells.z9 z9Var = s9Var.W;
                if (z9Var != null && ((org.telegram.ui.Cells.u1) z9Var).getCurrentMessagesGroup() == null && this.f602b) {
                    ((org.telegram.ui.Cells.u1) s9Var.W).setSelectedBackgroundProgress(1.0f - s9Var.U);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.f603c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9Var.setScaleX(floatValue3);
                v9Var.setScaleY(floatValue3);
                if (!this.f602b) {
                    v9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) this.f603c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d9Var.i0(floatValue4, false);
                if (this.f602b) {
                    org.telegram.ui.Components.w8 w8Var = d9Var.f23520a;
                    w8Var.f23212w = floatValue4;
                    w8Var.invalidate();
                    return;
                }
                return;
            case 6:
                a60 a60Var = (a60) this.f603c;
                if (this.f602b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (a60Var.getMeasuredHeight() / 2.0f);
                }
                a60Var.f22566x0 = floatValue;
                a60Var.v();
                return;
            case 7:
                bb0 bb0Var = (bb0) this.f603c;
                bb0Var.getClass();
                bb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bb0Var.invalidate();
                if (this.f602b) {
                    bb0Var.requestLayout();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f603c;
                TextView[] textViewArr = v2Var.h;
                v2Var.f29721s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.invalidate();
                if (this.f602b) {
                    textViewArr[0].setAlpha(1.0f - v2Var.f29721s);
                    textViewArr[0].setScaleX(1.0f - v2Var.f29721s);
                    textViewArr[0].setScaleY(1.0f - v2Var.f29721s);
                    textViewArr[1].setAlpha(v2Var.f29721s);
                    textViewArr[1].setScaleX(v2Var.f29721s);
                    textViewArr[1].setScaleY(v2Var.f29721s);
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
                l51 l51Var = (l51) this.f603c;
                l51Var.f35318s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l51Var.f35309b.invalidate();
                l51Var.f35311c.invalidate();
                if (l51Var.S) {
                    l51Var.N.invalidate();
                }
                l51Var.e();
                TextView textView = l51Var.f35321y;
                if (textView != null) {
                    textView.setAlpha(l51Var.f35318s);
                }
                if (!l51Var.S && (j51Var = l51Var.N) != null && j51Var.getSeekBarWaveform() != null) {
                    vo0 seekBarWaveform = l51Var.N.getSeekBarWaveform();
                    if (this.f602b) {
                        qrVar = qr.f27643g;
                    } else {
                        qrVar = qr.f27644i;
                    }
                    seekBarWaveform.L = qrVar.getInterpolation(Utilities.clamp(l51Var.f35318s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f29252n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                qg.m0 m0Var = (qg.m0) this.f603c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.e = floatValue6;
                if (!this.f602b) {
                    m0Var.f41772c.setAlpha(1.0f - floatValue6);
                }
                m0Var.f41771b.invalidate();
                return;
            default:
                zg.b0 b0Var = (zg.b0) this.f603c;
                b0Var.f49291x = null;
                b0Var.f49278j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.k();
                b0Var.l();
                b0Var.f49282n.setCustomEmojiEnterProgress(Utilities.clamp(b0Var.f49278j, 1.0f, 0.0f));
                b0Var.f49272a.invalidate();
                b0Var.f49281m.invalidateOutline();
                if (b0Var.f49290w) {
                    b0Var.j(b0Var.f49278j, this.f602b);
                    return;
                }
                return;
        }
    }
}
