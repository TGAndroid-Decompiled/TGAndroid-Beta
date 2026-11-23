package ch;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.a8;
import hi.s5;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.q8;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.z40;
import org.telegram.ui.dg0;
import org.telegram.ui.qz0;
import org.telegram.ui.sz0;
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
        qz0 qz0Var;
        kr krVar;
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
                s5 s5Var = (s5) this.f5518c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s5Var.f15382e = floatValue2;
                if (!this.f5517b) {
                    s5Var.f15381c.setAlpha(1.0f - floatValue2);
                }
                s5Var.f15380b.invalidate();
                return;
            case 3:
                r1 r1Var = (r1) this.f5518c;
                r1Var.f31654sb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                if (this.f5517b && r1Var.getParent() != null) {
                    ((View) r1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                j9 j9Var = (j9) this.f5518c;
                j9Var.getClass();
                j9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9 u9Var = j9Var.C;
                if (u9Var != null) {
                    u9Var.invalidate();
                }
                q9 q9Var = j9Var.W;
                if (q9Var != null && ((r1) q9Var).getCurrentMessagesGroup() == null && this.f5517b) {
                    ((r1) j9Var.W).setSelectedBackgroundProgress(1.0f - j9Var.U);
                    return;
                }
                return;
            case 5:
                p9 p9Var = (p9) this.f5518c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9Var.setScaleX(floatValue3);
                p9Var.setScaleY(floatValue3);
                if (!this.f5517b) {
                    p9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                x8 x8Var = (x8) this.f5518c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x8Var.n0(false, floatValue4);
                if (this.f5517b) {
                    q8 q8Var = x8Var.f41918a;
                    q8Var.f41544x = floatValue4;
                    q8Var.invalidate();
                    return;
                }
                return;
            case 7:
                z40 z40Var = (z40) this.f5518c;
                if (this.f5517b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (z40Var.getMeasuredHeight() / 2.0f);
                }
                z40Var.E0 = floatValue;
                z40Var.x();
                return;
            case 8:
                x90 x90Var = (x90) this.f5518c;
                x90Var.getClass();
                x90Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x90Var.invalidate();
                if (this.f5517b) {
                    x90Var.requestLayout();
                    return;
                }
                return;
            case 9:
                r2 r2Var = (r2) this.f5518c;
                TextView[] textViewArr = r2Var.h;
                r2Var.f41201s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.invalidate();
                if (this.f5517b) {
                    textViewArr[0].setAlpha(1.0f - r2Var.f41201s);
                    textViewArr[0].setScaleX(1.0f - r2Var.f41201s);
                    textViewArr[0].setScaleY(1.0f - r2Var.f41201s);
                    textViewArr[1].setAlpha(r2Var.f41201s);
                    textViewArr[1].setScaleX(r2Var.f41201s);
                    textViewArr[1].setScaleY(r2Var.f41201s);
                    return;
                }
                return;
            case 10:
                dg0 dg0Var = (dg0) this.f5518c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg0Var.E = floatValue5;
                dg0Var.H.setAlpha(floatValue5);
                dg0Var.K.setAlpha(dg0Var.E);
                if (!this.f5517b && (viewGroup = dg0Var.Z) != null) {
                    viewGroup.setAlpha(dg0Var.E);
                }
                dg0Var.F.invalidate();
                dg0Var.G.invalidate();
                return;
            case 11:
                sz0 sz0Var = (sz0) this.f5518c;
                sz0Var.f52189s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sz0Var.f52178b.invalidate();
                sz0Var.f52180c.invalidate();
                if (sz0Var.T) {
                    sz0Var.O.invalidate();
                }
                sz0Var.e();
                TextView textView = sz0Var.E;
                if (textView != null) {
                    textView.setAlpha(sz0Var.f52189s);
                }
                if (!sz0Var.T && (qz0Var = sz0Var.O) != null && qz0Var.getSeekBarWaveform() != null) {
                    dn0 seekBarWaveform = sz0Var.O.getSeekBarWaveform();
                    if (this.f5517b) {
                        krVar = kr.f36859g;
                    } else {
                        krVar = kr.f36860i;
                    }
                    seekBarWaveform.L = krVar.getInterpolation(Utilities.i(sz0Var.f52189s * 1.25f, 1.0f, 0.0f));
                    r1 r1Var2 = seekBarWaveform.f34406n;
                    if (r1Var2 != null) {
                        r1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                tg.k0 k0Var = (tg.k0) this.f5518c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f58014e = floatValue6;
                if (!this.f5517b) {
                    k0Var.f58013c.setAlpha(1.0f - floatValue6);
                }
                k0Var.f58012b.invalidate();
                return;
        }
    }
}
