package ch;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.a8;
import hi.i5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.y8;
import org.telegram.ui.eg0;
import org.telegram.ui.rz0;
import org.telegram.ui.tz0;
public final class v implements ValueAnimator.AnimatorUpdateListener {
    public final int f5516a;
    public final boolean f5517b;
    public final Object f5518c;

    public v(int i7, Object obj, boolean z10) {
        this.f5516a = i7;
        this.f5518c = obj;
        this.f5517b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        rz0 rz0Var;
        nr nrVar;
        switch (this.f5516a) {
            case 0:
                b0 b0Var = (b0) this.f5518c;
                b0Var.f5309x = null;
                b0Var.f5296j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.k();
                b0Var.l();
                b0Var.f5300n.setCustomEmojiEnterProgress(Utilities.i(b0Var.f5296j, 1.0f, 0.0f));
                b0Var.f5289a.invalidate();
                b0Var.f5299m.invalidateOutline();
                if (b0Var.f5308w) {
                    b0Var.j(this.f5517b, b0Var.f5296j);
                    return;
                }
                return;
            case 1:
                a8 a8Var = (a8) this.f5518c;
                a8Var.getClass();
                a8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.invalidate();
                if (this.f5517b) {
                    a8Var.requestLayout();
                    return;
                }
                return;
            case 2:
                i5 i5Var = (i5) this.f5518c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i5Var.f14723e = floatValue2;
                if (!this.f5517b) {
                    i5Var.f14722c.setAlpha(1.0f - floatValue2);
                }
                i5Var.f14721b.invalidate();
                return;
            case 3:
                r1 r1Var = (r1) this.f5518c;
                r1Var.f31570sb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                if (this.f5517b && r1Var.getParent() != null) {
                    ((View) r1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                k9 k9Var = (k9) this.f5518c;
                k9Var.getClass();
                k9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9 v9Var = k9Var.C;
                if (v9Var != null) {
                    v9Var.invalidate();
                }
                r9 r9Var = k9Var.W;
                if (r9Var != null && ((r1) r9Var).getCurrentMessagesGroup() == null && this.f5517b) {
                    ((r1) k9Var.W).setSelectedBackgroundProgress(1.0f - k9Var.U);
                    return;
                }
                return;
            case 5:
                q9 q9Var = (q9) this.f5518c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q9Var.setScaleX(floatValue3);
                q9Var.setScaleY(floatValue3);
                if (!this.f5517b) {
                    q9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                y8 y8Var = (y8) this.f5518c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y8Var.n0(false, floatValue4);
                if (this.f5517b) {
                    r8 r8Var = y8Var.f42320a;
                    r8Var.f41965x = floatValue4;
                    r8Var.invalidate();
                    return;
                }
                return;
            case 7:
                c50 c50Var = (c50) this.f5518c;
                if (this.f5517b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (c50Var.getMeasuredHeight() / 2.0f);
                }
                c50Var.E0 = floatValue;
                c50Var.x();
                return;
            case 8:
                aa0 aa0Var = (aa0) this.f5518c;
                aa0Var.getClass();
                aa0Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa0Var.invalidate();
                if (this.f5517b) {
                    aa0Var.requestLayout();
                    return;
                }
                return;
            case 9:
                q2 q2Var = (q2) this.f5518c;
                TextView[] textViewArr = q2Var.h;
                q2Var.f41267s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.invalidate();
                if (this.f5517b) {
                    textViewArr[0].setAlpha(1.0f - q2Var.f41267s);
                    textViewArr[0].setScaleX(1.0f - q2Var.f41267s);
                    textViewArr[0].setScaleY(1.0f - q2Var.f41267s);
                    textViewArr[1].setAlpha(q2Var.f41267s);
                    textViewArr[1].setScaleX(q2Var.f41267s);
                    textViewArr[1].setScaleY(q2Var.f41267s);
                    return;
                }
                return;
            case 10:
                eg0 eg0Var = (eg0) this.f5518c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg0Var.E = floatValue5;
                eg0Var.H.setAlpha(floatValue5);
                eg0Var.K.setAlpha(eg0Var.E);
                if (!this.f5517b && (viewGroup = eg0Var.Z) != null) {
                    viewGroup.setAlpha(eg0Var.E);
                }
                eg0Var.F.invalidate();
                eg0Var.G.invalidate();
                return;
            case 11:
                tz0 tz0Var = (tz0) this.f5518c;
                tz0Var.f52396s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tz0Var.f52385b.invalidate();
                tz0Var.f52387c.invalidate();
                if (tz0Var.T) {
                    tz0Var.O.invalidate();
                }
                tz0Var.e();
                TextView textView = tz0Var.E;
                if (textView != null) {
                    textView.setAlpha(tz0Var.f52396s);
                }
                if (!tz0Var.T && (rz0Var = tz0Var.O) != null && rz0Var.getSeekBarWaveform() != null) {
                    dn0 seekBarWaveform = tz0Var.O.getSeekBarWaveform();
                    if (this.f5517b) {
                        nrVar = nr.f37918g;
                    } else {
                        nrVar = nr.f37919i;
                    }
                    seekBarWaveform.L = nrVar.getInterpolation(Utilities.i(tz0Var.f52396s * 1.25f, 1.0f, 0.0f));
                    r1 r1Var2 = seekBarWaveform.f34509n;
                    if (r1Var2 != null) {
                        r1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f5518c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g0Var.f57859e = floatValue6;
                if (!this.f5517b) {
                    g0Var.f57858c.setAlpha(1.0f - floatValue6);
                }
                g0Var.f57857b.invalidate();
                return;
        }
    }
}
