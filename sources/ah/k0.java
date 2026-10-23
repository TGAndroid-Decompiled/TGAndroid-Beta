package ah;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ci.u8;
import ei.c6;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.voip.t2;
import org.telegram.ui.Components.x8;
import org.telegram.ui.b41;
import org.telegram.ui.qi0;
import org.telegram.ui.z31;
public final class k0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f816a;
    public final boolean f817b;
    public final Object f818c;

    public k0(int i10, Object obj, boolean z10) {
        this.f816a = i10;
        this.f818c = obj;
        this.f817b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        z31 z31Var;
        bs bsVar;
        switch (this.f816a) {
            case 0:
                t0 t0Var = (t0) this.f818c;
                t0Var.f888x = null;
                t0Var.f875j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t0Var.k();
                t0Var.l();
                t0Var.f879n.setCustomEmojiEnterProgress(Utilities.clamp(t0Var.f875j, 1.0f, 0.0f));
                t0Var.f869a.invalidate();
                t0Var.f878m.invalidateOutline();
                if (t0Var.f887w) {
                    t0Var.j(t0Var.f875j, this.f817b);
                    return;
                }
                return;
            case 1:
                u8 u8Var = (u8) this.f818c;
                u8Var.getClass();
                u8Var.f6000y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u8Var.invalidate();
                if (this.f817b) {
                    u8Var.requestLayout();
                    return;
                }
                return;
            case 2:
                c6 c6Var = (c6) this.f818c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6Var.e = floatValue2;
                if (!this.f817b) {
                    c6Var.f8835c.setAlpha(1.0f - floatValue2);
                }
                c6Var.f8834b.invalidate();
                return;
            case 3:
                t1 t1Var = (t1) this.f818c;
                t1Var.f23447jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                if (this.f817b && t1Var.getParent() != null) {
                    ((View) t1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                p9 p9Var = (p9) this.f818c;
                p9Var.getClass();
                p9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa aaVar = p9Var.C;
                if (aaVar != null) {
                    aaVar.invalidate();
                }
                w9 w9Var = p9Var.W;
                if (w9Var != null && ((t1) w9Var).getCurrentMessagesGroup() == null && this.f817b) {
                    ((t1) p9Var.W).setSelectedBackgroundProgress(1.0f - p9Var.U);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) this.f818c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var2.setScaleX(floatValue3);
                w9Var2.setScaleY(floatValue3);
                if (!this.f817b) {
                    w9Var2.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                e9 e9Var = (e9) this.f818c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e9Var.i0(floatValue4, false);
                if (this.f817b) {
                    x8 x8Var = e9Var.f25925a;
                    x8Var.f25528w = floatValue4;
                    x8Var.invalidate();
                    return;
                }
                return;
            case 7:
                n60 n60Var = (n60) this.f818c;
                if (this.f817b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (n60Var.getMeasuredHeight() / 2.0f);
                }
                n60Var.E0 = floatValue;
                n60Var.w();
                return;
            case 8:
                pb0 pb0Var = (pb0) this.f818c;
                pb0Var.getClass();
                pb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pb0Var.invalidate();
                if (this.f817b) {
                    pb0Var.requestLayout();
                    return;
                }
                return;
            case 9:
                t2 t2Var = (t2) this.f818c;
                TextView[] textViewArr = t2Var.h;
                t2Var.f31944s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.invalidate();
                if (this.f817b) {
                    textViewArr[0].setAlpha(1.0f - t2Var.f31944s);
                    textViewArr[0].setScaleX(1.0f - t2Var.f31944s);
                    textViewArr[0].setScaleY(1.0f - t2Var.f31944s);
                    textViewArr[1].setAlpha(t2Var.f31944s);
                    textViewArr[1].setScaleX(t2Var.f31944s);
                    textViewArr[1].setScaleY(t2Var.f31944s);
                    return;
                }
                return;
            case 10:
                qi0 qi0Var = (qi0) this.f818c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qi0Var.f40850y = floatValue5;
                qi0Var.G.setAlpha(floatValue5);
                qi0Var.J.setAlpha(qi0Var.f40850y);
                if (!this.f817b && (viewGroup = qi0Var.Y) != null) {
                    viewGroup.setAlpha(qi0Var.f40850y);
                }
                qi0Var.E.invalidate();
                qi0Var.F.invalidate();
                return;
            case 11:
                b41 b41Var = (b41) this.f818c;
                b41Var.f35867s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b41Var.f35858b.invalidate();
                b41Var.f35860c.invalidate();
                if (b41Var.S) {
                    b41Var.N.invalidate();
                }
                b41Var.e();
                TextView textView = b41Var.f35870y;
                if (textView != null) {
                    textView.setAlpha(b41Var.f35867s);
                }
                if (!b41Var.S && (z31Var = b41Var.N) != null && z31Var.getSeekBarWaveform() != null) {
                    kp0 seekBarWaveform = b41Var.N.getSeekBarWaveform();
                    if (this.f817b) {
                        bsVar = bs.f25134g;
                    } else {
                        bsVar = bs.f25135i;
                    }
                    seekBarWaveform.L = bsVar.getInterpolation(Utilities.clamp(b41Var.f35867s * 1.25f, 1.0f, 0.0f));
                    t1 t1Var2 = seekBarWaveform.f28112n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                rg.l0 l0Var = (rg.l0) this.f818c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.e = floatValue6;
                if (!this.f817b) {
                    l0Var.f45858c.setAlpha(1.0f - floatValue6);
                }
                l0Var.f45857b.invalidate();
                return;
        }
    }
}
