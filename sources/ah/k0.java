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
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.voip.t2;
import org.telegram.ui.Components.zr;
import org.telegram.ui.a41;
import org.telegram.ui.pi0;
import org.telegram.ui.y31;
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
        y31 y31Var;
        zr zrVar;
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
                t1Var.f23448jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                u9 u9Var = (u9) this.f818c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u9Var.setScaleX(floatValue3);
                u9Var.setScaleY(floatValue3);
                if (!this.f817b) {
                    u9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                c9 c9Var = (c9) this.f818c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c9Var.i0(floatValue4, false);
                if (this.f817b) {
                    v8 v8Var = c9Var.f25256a;
                    v8Var.f24935w = floatValue4;
                    v8Var.invalidate();
                    return;
                }
                return;
            case 7:
                l60 l60Var = (l60) this.f818c;
                if (this.f817b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (l60Var.getMeasuredHeight() / 2.0f);
                }
                l60Var.E0 = floatValue;
                l60Var.w();
                return;
            case 8:
                nb0 nb0Var = (nb0) this.f818c;
                nb0Var.getClass();
                nb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nb0Var.invalidate();
                if (this.f817b) {
                    nb0Var.requestLayout();
                    return;
                }
                return;
            case 9:
                t2 t2Var = (t2) this.f818c;
                TextView[] textViewArr = t2Var.h;
                t2Var.f31914s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.invalidate();
                if (this.f817b) {
                    textViewArr[0].setAlpha(1.0f - t2Var.f31914s);
                    textViewArr[0].setScaleX(1.0f - t2Var.f31914s);
                    textViewArr[0].setScaleY(1.0f - t2Var.f31914s);
                    textViewArr[1].setAlpha(t2Var.f31914s);
                    textViewArr[1].setScaleX(t2Var.f31914s);
                    textViewArr[1].setScaleY(t2Var.f31914s);
                    return;
                }
                return;
            case 10:
                pi0 pi0Var = (pi0) this.f818c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pi0Var.f40581y = floatValue5;
                pi0Var.G.setAlpha(floatValue5);
                pi0Var.J.setAlpha(pi0Var.f40581y);
                if (!this.f817b && (viewGroup = pi0Var.Y) != null) {
                    viewGroup.setAlpha(pi0Var.f40581y);
                }
                pi0Var.E.invalidate();
                pi0Var.F.invalidate();
                return;
            case 11:
                a41 a41Var = (a41) this.f818c;
                a41Var.f35587s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a41Var.f35578b.invalidate();
                a41Var.f35580c.invalidate();
                if (a41Var.S) {
                    a41Var.N.invalidate();
                }
                a41Var.e();
                TextView textView = a41Var.f35590y;
                if (textView != null) {
                    textView.setAlpha(a41Var.f35587s);
                }
                if (!a41Var.S && (y31Var = a41Var.N) != null && y31Var.getSeekBarWaveform() != null) {
                    jp0 seekBarWaveform = a41Var.N.getSeekBarWaveform();
                    if (this.f817b) {
                        zrVar = zr.f33338g;
                    } else {
                        zrVar = zr.f33339i;
                    }
                    seekBarWaveform.L = zrVar.getInterpolation(Utilities.clamp(a41Var.f35587s * 1.25f, 1.0f, 0.0f));
                    t1 t1Var2 = seekBarWaveform.f27773n;
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
                    l0Var.f45857c.setAlpha(1.0f - floatValue6);
                }
                l0Var.f45856b.invalidate();
                return;
        }
    }
}
