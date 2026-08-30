package dg;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import nh.d8;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p8;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.x50;
import org.telegram.ui.n41;
import org.telegram.ui.p41;
import org.telegram.ui.si0;
import ph.a5;
public final class b1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4388a;
    public final boolean f4389b;
    public final Object f4390c;

    public b1(int i10, Object obj, boolean z4) {
        this.f4388a = i10;
        this.f4390c = obj;
        this.f4389b = z4;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        n41 n41Var;
        nr nrVar;
        switch (this.f4388a) {
            case 0:
                c1 c1Var = (c1) this.f4390c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.e = floatValue2;
                if (!this.f4389b) {
                    c1Var.f4422c.setAlpha(1.0f - floatValue2);
                }
                c1Var.f4421b.invalidate();
                return;
            case 1:
                mg.d0 d0Var = (mg.d0) this.f4390c;
                d0Var.f13991x = null;
                d0Var.f13978j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.k();
                d0Var.l();
                d0Var.f13982n.setCustomEmojiEnterProgress(Utilities.clamp(d0Var.f13978j, 1.0f, 0.0f));
                d0Var.f13972a.invalidate();
                d0Var.f13981m.invalidateOutline();
                if (d0Var.f13990w) {
                    d0Var.j(d0Var.f13978j, this.f4389b);
                    return;
                }
                return;
            case 2:
                d8 d8Var = (d8) this.f4390c;
                d8Var.getClass();
                d8Var.f15287y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d8Var.invalidate();
                if (this.f4389b) {
                    d8Var.requestLayout();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f4390c;
                t1Var.f22067gd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                if (this.f4389b && t1Var.getParent() != null) {
                    ((View) t1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                n9 n9Var = (n9) this.f4390c;
                n9Var.getClass();
                n9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9 y9Var = n9Var.C;
                if (y9Var != null) {
                    y9Var.invalidate();
                }
                u9 u9Var = n9Var.W;
                if (u9Var != null && ((org.telegram.ui.Cells.t1) u9Var).getCurrentMessagesGroup() == null && this.f4389b) {
                    ((org.telegram.ui.Cells.t1) n9Var.W).setSelectedBackgroundProgress(1.0f - n9Var.U);
                    return;
                }
                return;
            case 5:
                p9 p9Var = (p9) this.f4390c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9Var.setScaleX(floatValue3);
                p9Var.setScaleY(floatValue3);
                if (!this.f4389b) {
                    p9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                w8 w8Var = (w8) this.f4390c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w8Var.i0(floatValue4, false);
                if (this.f4389b) {
                    p8 p8Var = w8Var.f30265a;
                    p8Var.f29386w = floatValue4;
                    p8Var.invalidate();
                    return;
                }
                return;
            case 7:
                x50 x50Var = (x50) this.f4390c;
                if (this.f4389b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (x50Var.getMeasuredHeight() / 2.0f);
                }
                x50Var.f30568r0 = floatValue;
                x50Var.s();
                return;
            case 8:
                va0 va0Var = (va0) this.f4390c;
                va0Var.getClass();
                va0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                va0Var.invalidate();
                if (this.f4389b) {
                    va0Var.requestLayout();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f4390c;
                TextView[] textViewArr = v2Var.h;
                v2Var.f30003s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.invalidate();
                if (this.f4389b) {
                    textViewArr[0].setAlpha(1.0f - v2Var.f30003s);
                    textViewArr[0].setScaleX(1.0f - v2Var.f30003s);
                    textViewArr[0].setScaleY(1.0f - v2Var.f30003s);
                    textViewArr[1].setAlpha(v2Var.f30003s);
                    textViewArr[1].setScaleX(v2Var.f30003s);
                    textViewArr[1].setScaleY(v2Var.f30003s);
                    return;
                }
                return;
            case 10:
                si0 si0Var = (si0) this.f4390c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                si0Var.B = floatValue5;
                si0Var.E.setAlpha(floatValue5);
                si0Var.H.setAlpha(si0Var.B);
                if (!this.f4389b && (viewGroup = si0Var.W) != null) {
                    viewGroup.setAlpha(si0Var.B);
                }
                si0Var.C.invalidate();
                si0Var.D.invalidate();
                return;
            case 11:
                p41 p41Var = (p41) this.f4390c;
                p41Var.f37179s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p41Var.f37173b.invalidate();
                p41Var.f37175c.invalidate();
                if (p41Var.P) {
                    p41Var.K.invalidate();
                }
                p41Var.e();
                TextView textView = p41Var.f37182y;
                if (textView != null) {
                    textView.setAlpha(p41Var.f37179s);
                }
                if (!p41Var.P && (n41Var = p41Var.K) != null && n41Var.getSeekBarWaveform() != null) {
                    mo0 seekBarWaveform = p41Var.K.getSeekBarWaveform();
                    if (this.f4389b) {
                        nrVar = nr.f27347g;
                    } else {
                        nrVar = nr.f27348i;
                    }
                    seekBarWaveform.L = nrVar.getInterpolation(Utilities.clamp(p41Var.f37179s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.f27093n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                a5 a5Var = (a5) this.f4390c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a5Var.e = floatValue6;
                if (!this.f4389b) {
                    a5Var.f41274c.setAlpha(1.0f - floatValue6);
                }
                a5Var.f41273b.invalidate();
                return;
        }
    }
}
