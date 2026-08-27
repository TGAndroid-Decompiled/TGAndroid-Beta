package ig;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import jh.d8;
import lh.c6;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.o8;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.a41;
import org.telegram.ui.c41;
import org.telegram.ui.ni0;

public final class y implements ValueAnimator.AnimatorUpdateListener {

    public final int f11472a;

    public final boolean f11473b;

    public final Object f11474c;

    public y(int i10, Object obj, boolean z10) {
        this.f11472a = i10;
        this.f11474c = obj;
        this.f11473b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        a41 a41Var;
        switch (this.f11472a) {
            case 0:
                d0 d0Var = (d0) this.f11474c;
                d0Var.f11288x = null;
                d0Var.f11275j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.k();
                d0Var.l();
                d0Var.f11279n.setCustomEmojiEnterProgress(Utilities.clamp(d0Var.f11275j, 1.0f, 0.0f));
                d0Var.f11268a.invalidate();
                d0Var.f11278m.invalidateOutline();
                if (d0Var.f11287w) {
                    d0Var.j(d0Var.f11275j, this.f11473b);
                }
                break;
            case 1:
                d8 d8Var = (d8) this.f11474c;
                d8Var.getClass();
                d8Var.f13210y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d8Var.invalidate();
                if (this.f11473b) {
                    d8Var.requestLayout();
                }
                break;
            case 2:
                c6 c6Var = (c6) this.f11474c;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6Var.f15750e = fFloatValue;
                if (!this.f11473b) {
                    c6Var.f15749c.setAlpha(1.0f - fFloatValue);
                }
                c6Var.f15748b.invalidate();
                break;
            case 3:
                s1 s1Var = (s1) this.f11474c;
                s1Var.f25337fd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                if (this.f11473b && s1Var.getParent() != null) {
                    ((View) s1Var.getParent()).invalidate();
                    break;
                }
                break;
            case 4:
                k9 k9Var = (k9) this.f11474c;
                k9Var.getClass();
                k9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9 v9Var = k9Var.C;
                if (v9Var != null) {
                    v9Var.invalidate();
                }
                r9 r9Var = k9Var.W;
                if (r9Var != null && ((s1) r9Var).getCurrentMessagesGroup() == null && this.f11473b) {
                    ((s1) k9Var.W).setSelectedBackgroundProgress(1.0f - k9Var.U);
                    break;
                }
                break;
            case 5:
                n9 n9Var = (n9) this.f11474c;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n9Var.setScaleX(fFloatValue2);
                n9Var.setScaleY(fFloatValue2);
                if (!this.f11473b) {
                    n9Var.setAlpha(valueAnimator.getAnimatedFraction());
                }
                break;
            case 6:
                v8 v8Var = (v8) this.f11474c;
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v8Var.i0(fFloatValue3, false);
                if (this.f11473b) {
                    o8 o8Var = v8Var.f33295a;
                    o8Var.f33010w = fFloatValue3;
                    o8Var.invalidate();
                }
                break;
            case 7:
                k50 k50Var = (k50) this.f11474c;
                k50Var.f29988q0 = this.f11473b ? 0.0f : ((Float) valueAnimator.getAnimatedValue()).floatValue() * (k50Var.getMeasuredHeight() / 2.0f);
                k50Var.s();
                break;
            case 8:
                ga0 ga0Var = (ga0) this.f11474c;
                ga0Var.getClass();
                ga0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ga0Var.invalidate();
                if (this.f11473b) {
                    ga0Var.requestLayout();
                }
                break;
            case 9:
                u2 u2Var = (u2) this.f11474c;
                TextView[] textViewArr = u2Var.h;
                u2Var.f33942s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.invalidate();
                if (this.f11473b) {
                    textViewArr[0].setAlpha(1.0f - u2Var.f33942s);
                    textViewArr[0].setScaleX(1.0f - u2Var.f33942s);
                    textViewArr[0].setScaleY(1.0f - u2Var.f33942s);
                    textViewArr[1].setAlpha(u2Var.f33942s);
                    textViewArr[1].setScaleX(u2Var.f33942s);
                    textViewArr[1].setScaleY(u2Var.f33942s);
                }
                break;
            case 10:
                ni0 ni0Var = (ni0) this.f11474c;
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ni0Var.A = fFloatValue4;
                ni0Var.D.setAlpha(fFloatValue4);
                ni0Var.G.setAlpha(ni0Var.A);
                if (!this.f11473b && (viewGroup = ni0Var.V) != null) {
                    viewGroup.setAlpha(ni0Var.A);
                }
                ni0Var.B.invalidate();
                ni0Var.C.invalidate();
                break;
            case 11:
                c41 c41Var = (c41) this.f11474c;
                c41Var.f36944s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c41Var.f36938b.invalidate();
                c41Var.f36939c.invalidate();
                if (c41Var.O) {
                    c41Var.J.invalidate();
                }
                c41Var.e();
                TextView textView = c41Var.f36947y;
                if (textView != null) {
                    textView.setAlpha(c41Var.f36944s);
                }
                if (!c41Var.O && (a41Var = c41Var.J) != null && a41Var.getSeekBarWaveform() != null) {
                    sn0 seekBarWaveform = c41Var.J.getSeekBarWaveform();
                    seekBarWaveform.L = (this.f11473b ? er.f28123g : er.f28124i).getInterpolation(Utilities.clamp(c41Var.f36944s * 1.25f, 1.0f, 0.0f));
                    s1 s1Var2 = seekBarWaveform.f32501n;
                    if (s1Var2 != null) {
                        s1Var2.invalidate();
                    }
                    break;
                }
                break;
            default:
                zf.k0 k0Var = (zf.k0) this.f11474c;
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k0Var.f50479e = fFloatValue5;
                if (!this.f11473b) {
                    k0Var.f50478c.setAlpha(1.0f - fFloatValue5);
                }
                k0Var.f50477b.invalidate();
                break;
        }
    }
}
